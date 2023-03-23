import React from 'react';
import './css/Header.css'

function Header() {
    return (
        <div className='header_wrapper'>
            <div></div>
            <div className='header_logo'>
                <img className='logo' src="img/logo.png" alt='logo' />
            </div>
            <div className='header_login'>
                <h2>로그인</h2>
            </div>
        </div>
    )
}

export default Header;