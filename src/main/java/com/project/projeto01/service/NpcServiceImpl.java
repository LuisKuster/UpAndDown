package com.project.projeto01.service;

import com.project.projeto01.models.NpcModel;
import com.project.projeto01.repository.NpcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NpcServiceImpl implements NpcService{

    @Autowired
    private NpcRepository npcRepository;


    @Override
    public NpcModel saveNpc(NpcModel npc) {
        return npcRepository.save(npc);
    }
}
