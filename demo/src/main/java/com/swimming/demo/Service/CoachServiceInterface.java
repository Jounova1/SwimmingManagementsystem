package com.swimming.demo.Service;

import java.util.List;

import com.swimming.demo.entity.Coach;
import com.swimming.demo.entity.Swimmer;

public interface CoachServiceInterface {
    
    public Coach create (Coach coach);

    public List<Coach> findAll();

    public Coach findbyId(int id);

    public Coach update(Coach coach);

    public void delete(int id);
    
}

