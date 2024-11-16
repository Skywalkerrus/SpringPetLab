package ru.ilia.springclones.labCamino;

import ru.ilia.springclones.model.Clone;

public class lab {
    public static void main(String[] args) {
        Clone ct1 = new Clone();
        ct1.setNumber(244);
        ct1.setNickname("Fit");
        ct1.setBattalion(56);
        ct1.cloneArrived();
        Commando cct = new Commando(98, "Kicker", 45);
        cct.cloneArrived();
    }
}
