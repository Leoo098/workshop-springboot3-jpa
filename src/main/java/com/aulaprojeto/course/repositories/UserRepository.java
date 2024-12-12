package com.aulaprojeto.course.repositories;

import com.aulaprojeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
