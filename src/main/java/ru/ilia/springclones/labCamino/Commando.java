package ru.ilia.springclones.labCamino;

import ru.ilia.springclones.model.Clone;

public class Commando extends Clone {
    public Commando(Integer number) {
        super(number);
    }

    @Override
    public void cloneArrived()
    {
        System.out.println("pereopredelenie");
    }

    public void cloneArrived(String str)
    {
        System.out.println("peregryz pereopredelenia " + str + " ");
    }
}