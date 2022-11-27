package ataques;

import interfaces.IAtaques;

public class AtaqueUltimate implements IAtaques{
    private int danoUlt;
    public AtaqueUltimate(){}
    @Override
    public void atacar(int fis,int mag) {
        this.danoUlt = fis+mag;
    }
    public int mostrarDano() {
        return danoUlt;
    }
}