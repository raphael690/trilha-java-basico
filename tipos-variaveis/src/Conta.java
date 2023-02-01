public class Conta {
    //Variavel da classe
    double saldo = 10.0;

    public void sacar(Double valor){
            //variavel local de método
            double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        // disponivel em toda classe
        System.out.println(saldo);
        // somente o método sacar conhece está variavel
        //System.out.println(novoSaldo);

    }
    public double calcularDividaExponencial(){
            // variável local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0; // começando a variável com valor zero
            for(int x = 1; x <= 5; x++){// x variável de escopo de fluxo
                        //esta variável será reiniciada a cada execução for
                        double valorCalculado = valorParcela * x;
                        valorMontante = valorMontante + valorCalculado;
            }
            //escopo de fluxo
            // x é valorCalculado nunca estarão disponivel fora do for

            return valorMontante;
    }
}
