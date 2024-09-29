package com.project.projeto01.controller;


import com.project.projeto01.models.NpcModel;
import com.project.projeto01.models.UserModel;
import com.project.projeto01.service.NpcService;
import com.project.projeto01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NpcModel")
public class NpcController {

    @Autowired
    private NpcService npcService;


    @PostMapping("/addNpc")
    public String add(@RequestBody NpcModel npc){

        npcService.saveNpc(npc);
        return "Npc Salvo";


    }




}
