package resto;

import ataques.AtaqueUltimate;
import interfaces.IAtaques;

public class Player{
    private int atkFis = 500;
    private int atkMag = 500;
    private int energy = 0;

    public Player(){}
    
    public void setStatus(int atkFis,int atkMag){
        this.atkMag = atkMag;
        this.atkFis = atkFis;
    }
    public void setAtkMag(int atkMag) {
        this.atkMag = atkMag;
    }
    public void setAtkFis(int atkFis) {
        this.atkFis = atkFis;
    }
    public int getAtkFis() {
        return this.atkFis;
    }
    public int getAtkMag() {
        return this.atkMag;
    }
    public int getEnergy(){
        return this.energy;
    }
    public IAtaques atacar(IAtaques atk){
        if(atk instanceof AtaqueUltimate){
            if(this.energy >= 3){
                atk.atacar(atkFis,atkMag);
                this.energy -= 3;
            }
            else atk.atacar(0, 0); 
        }
        else{
            atk.atacar(atkFis, atkMag);
            this.energy += 1;
        }
        return atk;
    }
    public void trocar(){
        if(this.energy > 0){
            int i = this.atkMag;
            this.atkMag = this.atkFis;
            this.atkFis = i;
            this.energy -= 1;
        }
    }
}
