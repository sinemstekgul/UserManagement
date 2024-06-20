package org.example.usermanagement.repository;

import org.example.usermanagement.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository  extends JpaRepository<Kullanici, Long>  {

}
