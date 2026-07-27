package com.swimming.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swimming.demo.entity.Coach;

public interface CoachRepo extends JpaRepository<Coach,Integer> {
    
}
