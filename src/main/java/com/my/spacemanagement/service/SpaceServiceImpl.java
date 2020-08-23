package com.my.spacemanagement.service;

import com.google.common.collect.ImmutableList;
import com.my.spacemanagement.model.Repository.SpaceRepository;
import com.my.spacemanagement.model.entity.Space;
import lombok.var;
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
         List<Space> list = ImmutableList.copyOf(spaceRepository.findAll());
        return list;
    }

    @Override
    public Space addSpace(Space space) {
        return spaceRepository.save(space);
    }
}
