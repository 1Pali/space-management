package com.my.spacemanagement.model.Repository;

import com.my.spacemanagement.model.entity.Space;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends CrudRepository<Space, Long> {
}
