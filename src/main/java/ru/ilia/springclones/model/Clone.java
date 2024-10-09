package ru.ilia.springclones.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="clones")
public class Clone {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private Integer number;
    private String nickname;
    private Integer battalion;
}