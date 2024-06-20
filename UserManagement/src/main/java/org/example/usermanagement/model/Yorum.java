package org.example.usermanagement.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@Table( name="Yorum")
@AllArgsConstructor
@NoArgsConstructor
public class Yorum {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    @Column(name = "icerik", nullable = false)
    private String icerik;

    @ManyToOne
    @JoinColumn(name="gonderi_id", nullable=false)
    @JsonBackReference
    private Gonderi gonderi;
}
