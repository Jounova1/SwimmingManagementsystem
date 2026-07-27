package com.swimming.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Swimmer {
    

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name ="id")
   private int id;

 @Column(name="first_name")
   private String firstname;

 @Column(name="last_name")
   private String lastname;

 @Column(name ="team")
   private String team;

 @Column(name="age")
   private int age;

   public Swimmer() {
   }

   public Swimmer(int id, String firstname, String lastname, String team, int age) {
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
      this.team = team;
      this.age = age;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public String getTeam() {
      return team;
   }

   public void setTeam(String team) {
      this.team = team;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}
