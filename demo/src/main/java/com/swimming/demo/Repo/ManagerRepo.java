package com.swimming.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swimming.demo.entity.Manager;

public interface ManagerRepo extends JpaRepository<Manager,Integer> {
    
}
