package com.my.spacemanagement.model.Repository;

import com.my.spacemanagement.model.entity.Component;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentRepository extends CrudRepository<Component, Long> {
}
