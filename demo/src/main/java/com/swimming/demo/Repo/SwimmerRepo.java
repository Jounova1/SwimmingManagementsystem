package com.swimming.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swimming.demo.entity.Swimmer;

public interface SwimmerRepo extends JpaRepository <Swimmer,Integer> {
    
}
