public class SmartTv {
    boolean ligada =  false;
    int canal = 1;
    int  volume = 25;

public void ligar(){
    //metodos que manipula o estado
    ligada =  true;
}
public void desligar(){
    //metodos que manipula o estado
    ligada = false;
}

public void aumentarVolume(){
    //volume = volume + 1; 
    volume ++;
    System.out.println("Aumentando o volume para: " + volume); // outro modo de fazer
}
public void diminuirVolume(){
   // volume = volume - 1;
    volume --;
    System.out.println("Diminuindo o volume para: " + volume); // outro modo de fazer
}

public void mudarCanal(int novoCanal){
    canal = novoCanal;
}
public void aumentarCanal(){
    canal ++;
}
public void diminuirCanal(){
    canal --;
}


}
