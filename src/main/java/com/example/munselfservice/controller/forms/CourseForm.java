package com.example.munselfservice.controller.forms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseForm {

    //根据前段
    // mounted() {
    //    //每次页面更新 从后端取出数据放到前段
    //    axios.post('http://localhost:8080/course',{
    //      studentNumber: localStorage.getItem("student_number"),
    //      sessionId: localStorage.getItem("session"),
    Integer studentNumber;
    String sessionId;



}