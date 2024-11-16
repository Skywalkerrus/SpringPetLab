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

    @Getter
    @Column(unique = true)
    private Integer number;
    private String nickname;
    private Integer battalion;

    public Clone(Integer number, String nickname, Integer battalion)
    {
        this.number = number;
        this.nickname = nickname;
        this.battalion = battalion;
    }

    public Clone(){

    }

    public void setNumber(Integer number) {
        if (number > 0)
            this.number=number;
    }
    public void setNickname(String nickname)
    {
        if (!nickname.isBlank())
            this.nickname = nickname;
    }

    public void setBattalion(Integer battalion)
    {
        if (battalion > 0)
            this.battalion = battalion;
    }
    public void cloneArrived() //метод для перегрузки
    {
        System.out.println("CT-" + getNumber() + " is arrived!");
    }
}