package com.example.mds.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mds.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
