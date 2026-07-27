package com.swimming.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swimming.demo.Repo.ManagerRepo;
import com.swimming.demo.entity.Manager;
    
@Service
public class ManagerService implements ManagerServiceInterface {
    
    private ManagerRepo managerrepo;

    public ManagerService(ManagerRepo managerrepo) {
        this.managerrepo = managerrepo;
    }

    @Override
    public Manager create(Manager manager) {
        return managerrepo.save(manager);
    }

    @Override
    public List<Manager> findAll() {
        return managerrepo.findAll();
    }

    @Override
    public Manager findbyId(int id) {
        return managerrepo.findById(id).orElse(null);
    }

    @Override
    public Manager update(Manager manager) {
        return managerrepo.save(manager);
    }

    @Override
    public void delete(int id) {
        managerrepo.deleteById(id);
    }
    
}
