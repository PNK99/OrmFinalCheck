package com.cognizant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.models.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
