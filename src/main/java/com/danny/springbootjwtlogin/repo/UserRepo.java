package com.danny.springbootjwtlogin.repo;

import com.danny.springbootjwtlogin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
