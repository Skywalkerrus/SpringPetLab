package ru.ilia.springclones.labCamino;

import ru.ilia.springclones.model.Clone;

public class Commando extends Clone {
    public Commando(Integer number, String nickname, Integer battalion) {
        super(number, nickname, battalion);
    }

    public Commando() {

    }
    @Override
    public void cloneArrived() {
        System.out.println("Commando CT-" + getNumber() + " is arrived!");
    }
}