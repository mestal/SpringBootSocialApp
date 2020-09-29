package com.mestal.socialapp.repositories;

import com.mestal.socialapp.models.Point;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PointRepository extends JpaRepository<Point, UUID> {

}
