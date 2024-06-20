package org.example.usermanagement.service;

import org.example.usermanagement.model.Kullanici;

import java.util.List;

public interface KullaniciService {
    List<Kullanici> getKullanicilar();

    void updateKullanici(Long kullaniciId, String isim, String mail, String meslek);

    Kullanici getKullanici(Long kullaniciId);
}
