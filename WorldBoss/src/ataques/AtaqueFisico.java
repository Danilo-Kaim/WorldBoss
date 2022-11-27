package ataques;

import interfaces.IAtaques;

public class AtaqueFisico implements IAtaques{
    private int danoFisico;
    public AtaqueFisico(){}
    
    @Override
    public void atacar(int fis,int Mag) {
        this.danoFisico = fis;
    }
    @Override
    public int mostrarDano() {
        return this.danoFisico;
    }
}