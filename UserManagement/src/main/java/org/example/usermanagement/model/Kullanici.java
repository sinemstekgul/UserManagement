package org.example.usermanagement.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Builder
@Entity
@Table(name="Kullanıcı")
@AllArgsConstructor
@NoArgsConstructor
public class Kullanici {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    @Column(name = "isim", nullable = false)
    private String isim;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "meslek", nullable = false)
    private String meslek;

}
