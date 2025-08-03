package com.example.todouknow.Repository;

import com.example.todouknow.Model.TagModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagModel, Integer> {



}
