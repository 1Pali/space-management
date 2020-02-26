package com.my.spacemanagement.controller;

import com.my.spacemanagement.model.entity.Space;
import com.my.spacemanagement.service.SpaceService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/space")
public class SpaceController {
    private final SpaceService spaceService;

    public SpaceController(final SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Space> getAllSpaces() {
        return spaceService.getAllSpaces();
    }
}
