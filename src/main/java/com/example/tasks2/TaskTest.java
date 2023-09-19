package com.example.tasks2;

import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task;

    @BeforeEach
    void setUp() throws IllegalAccessException {
        User fred = new User("Rajajitsandhu23@gmail", "rajveer", "9982382300");
        task = new Task("Do quiz", "See quiz in week 2",
                LocalDate.of(2023,9,23),15,fred);
    }
}