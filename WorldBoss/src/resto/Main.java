package resto;

import java.util.Random;
import java.util.Scanner;

import ataques.AtaqueFisico;
import ataques.AtaqueMagico;
import ataques.AtaqueUltimate;
import bosses.LadinoBoss;
import bosses.PaladinBoss;
import bosses.SageBoss;
import interfaces.IBoss;


public class Main {

    public static void batalhaBoss(Player player, IBoss boss){
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        AtaqueFisico fis = new AtaqueFisico();
        AtaqueMagico mag = new AtaqueMagico();
        AtaqueUltimate ult = new AtaqueUltimate();
        boolean i = true;
        while(i){
            menu.menuTipoAtaque();
            System.out.println("Energia: " + player.getEnergy());
            int atk = scan.nextInt();
            switch (atk) {
                case 1:
                    double danoFis = boss.apanhar(player.atacar(fis));
                    System.out.println(danoFis);
                    IABoss(boss);
                    break;
                case 2:
                    double danoMag = boss.apanhar(player.atacar(mag));
                    System.out.println(danoMag);
                    IABoss(boss);
                    break;
                case 3:
                    double danoUlt = boss.apanhar(player.atacar(ult));
                    System.out.println(danoUlt);
                    IABoss(boss);
                    break;
                case 4:
                    System.out.println(boss.mostrarVida());
                    break;
                case 5:
                    player.trocar();
                    System.out.println("atkFísico: "+ player.getAtkFis());
                    System.out.println("atkMágico: "+ player.getAtkMag());
                    break;    
                case 6:
                    i = false;
                    break;
                    
            }
            if(boss.mostrarVida()<=0){
                System.out.println("BOSS DERROTADO!");
                break;
            }
        }
    }

    public static void IABoss(IBoss boss){
        Random r = new Random();
        int i = r.nextInt(100);
        if(i%2 == 0) {
            boss.trocar();
            System.out.println("As Defesas do BOSS foram realinhadas");
        }           
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
                            batalhaBoss(p, paladino);
                            break;                   
                        case 2:
                            SageBoss sage = new SageBoss();
                            batalhaBoss(p,sage);
                            break;
                        case 3:
                            LadinoBoss ladino = new LadinoBoss();
                            batalhaBoss(p,ladino);
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