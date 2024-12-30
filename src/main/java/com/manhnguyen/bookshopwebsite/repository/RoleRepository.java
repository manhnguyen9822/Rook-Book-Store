package com.manhnguyen.bookshopwebsite.repository;

import com.manhnguyen.bookshopwebsite.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
