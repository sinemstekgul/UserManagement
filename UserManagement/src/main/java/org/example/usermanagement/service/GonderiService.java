package org.example.usermanagement.service;

import org.example.usermanagement.model.Gonderi;

import java.util.List;

public interface GonderiService {

    List<Gonderi> getGonderilerByKullanici(Long kullaniciId);

    void saveGonderiForKullanici(Long kullaniciId, String baslik, String aciklama);

    void deleteGonderi(Long gonderiId);

    Gonderi getGonderi(Long gonderiId);
}
