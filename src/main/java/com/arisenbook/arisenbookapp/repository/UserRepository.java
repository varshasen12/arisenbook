package com.arisenbook.arisenbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arisenbook.arisenbookapp.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
