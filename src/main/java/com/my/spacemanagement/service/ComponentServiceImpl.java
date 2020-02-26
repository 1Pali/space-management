package com.my.spacemanagement.service;

import com.google.common.collect.ImmutableList;
import com.my.spacemanagement.model.Repository.ComponentRepository;
import com.my.spacemanagement.model.entity.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentServiceImpl implements ComponentService {
    private final ComponentRepository componentRepository;

    public ComponentServiceImpl(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    @Override
    public List<Component> getAllComponents() {
        return ImmutableList.copyOf(componentRepository.findAll());
    }
}
