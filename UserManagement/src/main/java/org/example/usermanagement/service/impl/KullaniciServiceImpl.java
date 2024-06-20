package org.example.usermanagement.service.impl;

import jakarta.transaction.Transactional;
import org.example.usermanagement.model.Kullanici;
import org.example.usermanagement.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.usermanagement.repository.KullaniciRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class KullaniciServiceImpl implements KullaniciService {
    @Autowired
    private KullaniciRepository kullaniciRepository;
    @Override
    public List<Kullanici> getKullanicilar(){
        return kullaniciRepository.findAll();
    }

    @Override
    public void updateKullanici(Long kullaniciId, String isim, String mail, String meslek){
        Optional<Kullanici> kullaniciOptional = kullaniciRepository.findById(kullaniciId);
        if(!kullaniciOptional.isPresent())
            return;
        Kullanici kullanici = kullaniciOptional.get();
        kullanici.setIsim(isim);
        kullanici.setMail(mail);
        kullanici.setMeslek(meslek);
    }

    @Override
    public Kullanici getKullanici(Long kullaniciId){
        Optional<Kullanici> kullaniciOpt = kullaniciRepository.findById(kullaniciId);
        return kullaniciOpt.orElse(null);
    }
}
