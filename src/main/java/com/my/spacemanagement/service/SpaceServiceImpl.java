package com.my.spacemanagement.service;

import com.google.common.collect.ImmutableList;
import com.my.spacemanagement.model.Repository.SpaceRepository;
import com.my.spacemanagement.model.entity.Space;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements SpaceService {
    private final SpaceRepository spaceRepository;

    public SpaceServiceImpl(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    @Override
    public List<Space> getAllSpaces() {
        return ImmutableList.copyOf(spaceRepository.findAll());
    }
}
