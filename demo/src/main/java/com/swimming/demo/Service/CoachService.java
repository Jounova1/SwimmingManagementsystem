package com.swimming.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swimming.demo.Repo.CoachRepo;
import com.swimming.demo.entity.Coach;
import com.swimming.demo.entity.Swimmer;

@Service
public class CoachService implements CoachServiceInterface {

    private CoachRepo coachrepo;

    public CoachService(CoachRepo coachrepo)
    {
        this.coachrepo=coachrepo;
    }

    @Override
    public void delete(int id)
    {
        coachrepo.deleteById(id);
    }

    public Coach update(Coach coach) {

        Coach coach1 = findbyId(coach.getId());

        coach.setFirstname(coach1.getFirstname());
        coach.setLastname(coach1.getLastname());
        coach.setAge(coach1.getAge());
        coach.setTeam(coach1.getTeam());

        return coachrepo.save(coach);
    }

    @Override
    public Coach create(Coach coach)
    {
        return coachrepo.save(coach);
    }
    @Override
    public Coach findbyId(int id)
    {
        return coachrepo.findById(id).orElse(null);
    }
    @Override
    public List<Coach> findAll()
    {
        return coachrepo.findAll();
    }

   

}
