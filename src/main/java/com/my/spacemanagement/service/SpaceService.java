package com.my.spacemanagement.service;

import com.my.spacemanagement.model.entity.Space;

import java.util.List;

public interface SpaceService {
    List<Space> getAllSpaces();
    Space addSpace(final Space space);
}
