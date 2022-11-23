package resto;

import java.util.Scanner;

import ataques.AtaqueFisico;
import ataques.AtaqueMagico;
import ataques.AtaqueUltimate;
import bosses.LadinoBoss;
import bosses.PaladinBoss;
import bosses.SageBoss;


public class Main {

    public static void batalhaBoss(Player p){
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        AtaqueFisico fis = new AtaqueFisico();
        AtaqueMagico mag = new AtaqueMagico();
        AtaqueUltimate ult = new AtaqueUltimate();
        boolean i = true;
        while(i){
            menu.menuTipoAtaque();
            int atk = scan.nextInt();
            switch (atk) {
                case 1:
                    double danoFis = p.getBoss().apanhar(p.atacar(fis));
                    System.out.println(danoFis);
                    break;
                case 2:
                    double danoMag = p.getBoss().apanhar(p.atacar(mag));
                    System.out.println(danoMag);
                    break;
                case 3:
                    double danoUlt = p.getBoss().apanhar(p.atacar(ult));
                    System.out.println(danoUlt);
                    break;
                case 4:
                    System.out.println(p.getBoss().mostrarVida());
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        Player p = new Player();
        Scanner scan = new Scanner(System.in);
        boolean i = true;
        

        while (i) {
            menu.menuInicial();
            int opt = scan.nextInt();
            switch (opt) {
                case 1:
                    menu.menuEscolhaBoss();
                    int boss = scan.nextInt();
                    switch (boss) {
                        case 1:
                        PaladinBoss paladino = new PaladinBoss();
                        p.setBoss(paladino);
                        batalhaBoss(p);
                            break;                   
                        case 2:
                        SageBoss sage = new SageBoss();
                        p.setBoss(sage);
                        batalhaBoss(p);
                            break;
                        case 3:
                        LadinoBoss ladino = new LadinoBoss();
                        p.setBoss(ladino);
                        batalhaBoss(p);
                            break;
                        case 4:
                            break;   
                    }
                    break;
                case 2:
                    System.out.println("Digite seu atkFísico:");
                    int s = scan.nextInt();
                    if(s>=0 && s<=1000){
                        p.setAtkFis(s);
                        p.setAtkMag(1000 - s);
                        System.out.println("atkFísico: "+ p.getAtkFis());
                        System.out.println("atkMágico: "+ p.getAtkMag());
                    }else System.out.println("Você é burro cara?");
                    break;
                case 3:
                    i = false;
                    break;
                default:
                    break;
            }
        }
    
        
        scan.close();
    }
}