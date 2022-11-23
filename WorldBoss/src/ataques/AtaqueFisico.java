package ataques;

import interfaces.IAtaques;

public class AtaqueFisico implements IAtaques{
    private int dano;
    public AtaqueFisico(){}
    
    @Override
    public void atacar(int fis,int Mag) {
        this.dano = fis;
    }
    @Override
    public int mostrarDano() {
        return this.dano;
    }
}