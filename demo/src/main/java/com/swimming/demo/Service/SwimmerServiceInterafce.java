package com.swimming.demo.Service;

import java.util.List;

import com.swimming.demo.entity.Swimmer;

public interface SwimmerServiceInterafce {
    
    public Swimmer create (Swimmer swimmer);

    public List<Swimmer> findAll();

    public Swimmer findbyId(int id);

    public Swimmer update(Swimmer swimmer);

    public void delete(int id);
    
}

