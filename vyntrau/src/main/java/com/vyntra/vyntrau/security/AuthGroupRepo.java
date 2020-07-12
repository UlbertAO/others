package com.vyntra.vyntrau.security;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthGroupRepo extends JpaRepository<AuthGroup, Long> {
    List<AuthGroup> findByUsername(String username);
}
