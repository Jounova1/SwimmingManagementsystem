package com.swimming.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swimming.demo.Repo.SwimmerRepo;
import com.swimming.demo.entity.Swimmer;

@Service
public class SwimmerService implements SwimmerServiceInterafce  {
    
    private SwimmerRepo swimmerrepo;

    public SwimmerService( SwimmerRepo swimmerrepo)
    {
        this.swimmerrepo=swimmerrepo;
    }

    public Swimmer create(Swimmer swimmer)
    {
        return swimmerrepo.save(swimmer);
    }

    public List<Swimmer>  findAll()
    {
        return swimmerrepo.findAll();
    }
    
    public Swimmer findbyId(int id)
    {
        return swimmerrepo.findById(id).orElse(null);
    }
  
    public void delete(int id)
    {
     swimmerrepo.deleteById(id);
    }

    public Swimmer update(Swimmer swimmer) 
    {
      return swimmerrepo.save(swimmer);
    }
}
