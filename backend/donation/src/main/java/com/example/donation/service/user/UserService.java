package com.example.donation.service.user;

import com.example.donation.domain.user.User;
import com.example.donation.domain.user.UserRepository;
import com.example.donation.dto.user.request.UserCreateRequest;
import com.example.donation.dto.user.request.UserUpdateRequest;
import com.example.donation.dto.user.response.UserResponse;
import com.example.donation.repository.user.UserJdbcRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 아래 있는 함수가 시작될 떄, start transaction을 해준다 (트랜잭션 시작)
    // 점수가 예외 없이 잘 끝냈다면 commit
    // 혹시라도 문제가 있다면 rollback
    @Transactional
    public void saveUser(UserCreateRequest request) {
        userRepository.save(new User(request.getLoginId(), request.getPassword(), request.getName()));
    }

    @Transactional(readOnly = true)
    public List<UserResponse> getUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void updateUser(UserUpdateRequest request) {
        User user = userRepository.findById(request.getId()).orElseThrow(IllegalArgumentException::new);

        user.updateName(request.getName());

        // 영속성 컨텍스트의 변경 감지 기능으로 save 자동 실행
        // userRepository.save(user);
    }

    @Transactional
    public void deleteUser(String name) {
        User user = userRepository.findByName(name)
                .orElseThrow(IllegalArgumentException::new);

        userRepository.delete(user);
    }
}