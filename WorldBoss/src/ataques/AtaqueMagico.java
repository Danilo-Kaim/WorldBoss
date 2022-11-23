package ataques;

import interfaces.IAtaques;

public class AtaqueMagico implements IAtaques{
    private int dano;
    public AtaqueMagico(){}
    @Override
    public void atacar(int fis,int mag) {
        this.dano = mag;
    }
    @Override
    public int mostrarDano() {
        return this.dano;
    }
    
}