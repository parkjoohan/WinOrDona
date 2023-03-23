import React, { useEffect, useState } from 'react';
import { connect } from 'react-redux';
import Footer from '../common/Footer';
import Header from '../common/Header';
import ToDo from '../components/ToDo';
import { actionCreators } from '../store';
import "./Home.css";
import axios from "axios"

function Home({ toDos, addToDo }) {
    const [dummy, setDummy] = useState([]);

    useEffect(() => {
        axios({
            method: 'get',
            url: `http://localhost:8080/board`
        }).then((res) => setDummy(res.data));
    }, [])

    console.log(dummy)

    return (
        <>
            <Header />
            <div className='home_body' >
                {
                    dummy.map((element, index) => {
                        return (
                            <div key={index}>
                                <h5>{element.board_id}</h5>
                                <h5>{element.content}</h5>
                                <h5>{element.create_time}</h5>
                                <h5>{element.title}</h5>
                                <h5>{element.update_time}</h5>
                                <h5>{element.user_uid}</h5>
                            </div>
                        )
                    })
                }
            </div>
            <Footer />
        </>
    )
}

function mapStateToProps(state) {
    return { toDos: state };
}

function mapDispatchToProps(dispatch) {
    return {
        addToDo: (text) => dispatch(actionCreators.addToDo(text))
    };
}

export default connect(mapStateToProps, mapDispatchToProps) (Home);