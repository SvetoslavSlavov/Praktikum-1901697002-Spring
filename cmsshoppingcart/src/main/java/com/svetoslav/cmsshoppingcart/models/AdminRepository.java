package com.svetoslav.cmsshoppingcart.models;

import com.svetoslav.cmsshoppingcart.models.data.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

  Admin findByUsername(String username);
}