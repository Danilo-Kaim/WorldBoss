package ataques;

import interfaces.IAtaques;

public class AtaqueUltimate implements IAtaques{
    private int dano;
    public AtaqueUltimate(){}
    @Override
    public void atacar(int fis,int mag) {
        this.dano = fis+mag;
    }
    public int mostrarDano() {
        return dano;
    }
}