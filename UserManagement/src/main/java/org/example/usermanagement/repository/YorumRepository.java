package org.example.usermanagement.repository;

import org.example.usermanagement.model.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YorumRepository extends JpaRepository<Yorum, Long>  {
}
