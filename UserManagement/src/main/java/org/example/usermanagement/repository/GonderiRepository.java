package org.example.usermanagement.repository;

import org.example.usermanagement.model.Gonderi;
import org.example.usermanagement.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GonderiRepository extends JpaRepository<Gonderi, Long>  {
    List<Gonderi> findByKullanici(Kullanici kullanici);
}
