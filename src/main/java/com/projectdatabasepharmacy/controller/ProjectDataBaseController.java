package com.projectdatabasepharmacy.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/projectDataBaseController")
@RequestMapping
public class ProjectDataBaseController {
    @PostMapping("/add")
    public String addProjectDataBase(@RequestBody ProjectDataBaseController projectDataBaseController){

        return null;
    }
@GetMapping
    public List<ProjectDataBaseController> getAllProjectsDataBaseControllers() {

        return null;
    }
}

