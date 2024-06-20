package org.example.usermanagement.service.impl;

import jakarta.transaction.Transactional;
import org.example.usermanagement.model.Gonderi;
import org.example.usermanagement.model.Kullanici;
import org.example.usermanagement.service.GonderiService;
import org.example.usermanagement.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.usermanagement.repository.GonderiRepository;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class GonderiServiceImpl implements GonderiService {
    @Autowired
    private GonderiRepository gonderiRepository;

    @Autowired
    private KullaniciService kullaniciService;


    @Override
    public List<Gonderi> getGonderilerByKullanici(Long kullaniciId){

        Kullanici kullanici = kullaniciService.getKullanici(kullaniciId);
        if(Objects.isNull(kullanici))
            return Collections.emptyList();
        return gonderiRepository.findByKullanici(kullanici);
    }

    @Override
    public void saveGonderiForKullanici(Long kullaniciId, String baslik, String aciklama){

        Kullanici kullanici = kullaniciService.getKullanici(kullaniciId);
        if(Objects.isNull(kullanici))
            return ;
        Gonderi gonderi = Gonderi.builder().baslik(baslik).aciklama(aciklama).kullanici(kullanici).build();
        gonderiRepository.save(gonderi);

    }

    @Override
    public void deleteGonderi(Long gonderiId) {
        gonderiRepository.deleteById(gonderiId);
    }

    @Override
    public Gonderi getGonderi(Long gonderiId){
        Optional<Gonderi> gonderiOpt = gonderiRepository.findById(gonderiId);
        return gonderiOpt.orElse(null);
    }

}
