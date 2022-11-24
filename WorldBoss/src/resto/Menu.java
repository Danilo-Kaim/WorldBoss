package resto;

import interfaces.IMenu;

public class Menu implements IMenu{

    public Menu(){}
    @Override
    public void menuInicial() {
        System.out.println("----------Menu----------");
        System.out.println("1- escolher boss");
        System.out.println("2- editar perfil");
        System.out.println("3- sair");        
    }
    
    @Override
    public void menuTipoAtaque(){
        System.out.println("1- atkFis");
        System.out.println("2- atkMag");
        System.out.println("3- Ultimate");
        System.out.println("4- Ver vida do boss");
        System.out.println("5- Troca de Status");
        System.out.println("6- Sair da Batalha");            
    }
    @Override
    public void menuEscolhaBoss() {
        System.out.println("1- paladin");
        System.out.println("2- sage");
        System.out.println("3- ladino");
        System.out.println("4- Voltar");
        
    }
    
    
}