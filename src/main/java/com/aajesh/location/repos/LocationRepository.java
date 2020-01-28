package com.aajesh.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aajesh.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
