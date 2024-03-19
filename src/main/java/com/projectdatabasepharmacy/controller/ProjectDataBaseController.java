package com.projectdatabasepharmacy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProjectDataBaseController {
    @PostMapping
    public String addProjectDataBase(@RequestBody ProjectDataBaseController projectDataBaseController){

        return null;
    }

    public List<ProjectDataBaseController> getAllProjectsDataBaseControllers() {

        return null;
    }
}

