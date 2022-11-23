package bosses;

import ataques.AtaqueFisico;
import ataques.AtaqueMagico;
import interfaces.IAtaques;
import interfaces.IBoss;

public class SageBoss implements IBoss{
    private double defFis = 0.7;
    private double defMag = 0.3;
    private double hp = 10000;
    private int energy = 0;
    @Override
    public double apanhar(IAtaques dano) {
        double x = (double) dano.mostrarDano();
        if(dano instanceof AtaqueFisico){
            this.hp -= x*defFis;
            this.energy++;
            return x*defFis;
        }else if(dano instanceof AtaqueMagico){
            this.hp -= x*defMag;
            this.energy++;
            return x*defMag;
        }else{
            this.hp -= x;
            this.energy++;
            return x;
        }
    }
    @Override
    public void trocar() {
        if(energy > 0){
            double i = this.defMag;
            this.defMag = defFis;
            this.defFis = i;
        }
    }
    public double mostrarVida() {
        return hp;
    }
}