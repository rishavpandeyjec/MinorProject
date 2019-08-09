package com.minor.rishav.SpringDatajpa.repository;

import com.minor.rishav.SpringDatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
}
