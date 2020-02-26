package com.my.spacemanagement.controller;

import com.my.spacemanagement.model.entity.Component;
import com.my.spacemanagement.service.ComponentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/component")
public class ComponentController {
    private final ComponentService componentService;

    public ComponentController(final ComponentService componentService) {
        this.componentService = componentService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Component> getAllComponents() {
        return componentService.getAllComponents();
    }
}
