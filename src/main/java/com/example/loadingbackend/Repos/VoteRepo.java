package com.example.loadingbackend.Repos;

import com.example.loadingbackend.Models.VoteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepo  extends JpaRepository<VoteModel, Integer> {
    //This shit is basically magic
}
