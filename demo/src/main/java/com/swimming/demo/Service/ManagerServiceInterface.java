package com.swimming.demo.Service;

import java.util.List;

import com.swimming.demo.entity.Manager;
import com.swimming.demo.entity.Swimmer;

public interface ManagerServiceInterface {

    public Manager create (Manager manager);

    public List<Manager> findAll();

    public Manager findbyId(int id);

    public Manager update(Manager manager);

    public void delete(int id);
}
