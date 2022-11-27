package ataques;

import interfaces.IAtaques;

public class AtaqueMagico implements IAtaques{
    private int danoMagico;
    public AtaqueMagico(){}
    @Override
    public void atacar(int fis,int mag) {
        this.danoMagico = mag;
    }
    @Override
    public int mostrarDano() {
        return this.danoMagico;
    }
    
}