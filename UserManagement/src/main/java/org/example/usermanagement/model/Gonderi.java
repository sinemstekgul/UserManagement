package org.example.usermanagement.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Getter
@Setter
@Builder
@Entity
@Table(  name="Gonderi")
@AllArgsConstructor
@NoArgsConstructor
public class Gonderi {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    @Column(name = "baslik", nullable = false)
    private String baslik;

    @Column(name = "aciklama", nullable = false)
    private String aciklama;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kullanici_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Kullanici kullanici;

    @OneToMany (mappedBy = "gonderi")
    private List<Yorum> yorumlar;

}
