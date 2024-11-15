package ru.ilia.springclones.labCamino;

import ru.ilia.springclones.model.Clone;

public class lab {
    public static void main(String[] args) {
        Clone ct1 = new Clone(12345);
        ct1.cloneArrived();
        Commando cct = new Commando(32221);
        cct.cloneArrived("Commando ");
        cct.cloneArrived();
    }
}
