package com.luisdev.userdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisdev.userdep.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
