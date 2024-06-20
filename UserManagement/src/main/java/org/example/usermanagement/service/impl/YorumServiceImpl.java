package org.example.usermanagement.service.impl;

import jakarta.transaction.Transactional;
import org.example.usermanagement.model.Gonderi;
import org.example.usermanagement.model.Yorum;
import org.example.usermanagement.service.GonderiService;
import org.example.usermanagement.service.YorumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.usermanagement.repository.YorumRepository;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class YorumServiceImpl implements YorumService {
    @Autowired
    private GonderiService gonderiService;

    @Autowired
    private YorumRepository yorumRepository;


    @Override
    public List<Yorum> getYorumlarByGonderi(Long gonderiId){

        Gonderi gonderi = gonderiService.getGonderi(gonderiId);
        if(Objects.isNull(gonderi))
            return Collections.emptyList();
        return gonderi.getYorumlar();
    }

    @Override
    public void saveYorumForGonderi(Long gonderiId, String icerik){

        Gonderi gonderi = gonderiService.getGonderi(gonderiId);
        if(Objects.isNull(gonderi))
            return ;
        Yorum yorum = Yorum.builder().icerik(icerik).gonderi(gonderi).build();
       yorumRepository.save(yorum);

    }



}
