//import java.util.Date;

public class Operadores {
    public static void main(String[] args){
/*      String titulo ="\n operadores de Atribuição -> Representado pelo símbolo de igualdade = .\n";
        String nome = "TESTE";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();   

        System.out.println(titulo);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(doadorOrgao);
        System.out.println(dataNascimento);


        // Operadores Aritméticos -> é utilizado para realizar operações matemáticas, podendo se tornar ou não uma expressão mais complexa.
        // Os Operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
        
        String oparit ="\n Operadores aritméticos! \n"; System.out.println(oparit);
        double soma = 10.5 + 15.7;
        System.out.println(soma);
        int subtracao = 113 - 25;
        System.out.println(subtracao);
        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);
        int divisao = 15 / 3;
        System.out.println(divisao);
        int modulo = 18 % 3;
        System.out.println(modulo);
        double resultado = (10 * 7) + (20 / 4);
        System.out.println(resultado);

        // Atenção! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a concatenação de textos

        String conc = "\n (+) Quando utilizado em variaveis do tipo texto realizará a concatenação, qual o resultado das expressoes abaixo?"; 
        System.out.println(conc);

        //classe operadores.java
        String nomeCompleto = "LINGUAGEM " + " JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        // Operador Unários
        /*Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns 
         * trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.
         * 
         * (+) Operador unário de valor positivo - > números são positivos sem esse operador explicitamente;
         * (-) Operador unário de valor negativo - > nega um número ou expressão aritmética;
         * (++) Operador unário de incremento de valor - > incrementa o valor em 1 unidade;
         * (--) Operador unário de decremento de valor -> decrementa o valor em 1 unidade;
         * (!) Operador unário lógico de negação -> nega o valor de uma expressão booleana;
         * Exemplos abaixo:
         */
        
         /*

         String Unario = "Operador Unários";
         System.out.println(Unario);

         //classe Operador.java
         int numero = 5;

         //Imprimindo o numero negativo
         System.out.println(- numero);

         // Incrementando numero em mais 1 numero, imprime 6
         numero ++;
         System.out.println(numero);
         

         //incrementando número em mais 1 numero, imprime 7
         //System.out.println(numero ++); // ops algo deu errado não está certo
         System.out.println(++ numero); // agora sim, numero virou 7

         // Ordem de precedencia conta  aqui
         System.out.println(++ numero);

         boolean verdadeiro = true;
        // System.out.println("Inverteu " + !verdadeiro);
         verdadeiro = !verdadeiro;
         //System.out.println(!verdadeiro);
         System.out.println(verdadeiro); 
         
         */ 



         /* O operador ternário é representado pelos simbolos ?: utilizados na seguinte estrutura de sintaxe:
         * <Expressão Condicional> `` ? `` <Caso condição seja true>`` : ``<Caso condição seja false>         
         
        int a, b;  
               
        a = 5;
        b = 6;*/ 

        /*Exemplo de condicional utilizando umna estrutura IF/ELSE 

        String resultado = "" ;
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);   */
        
         
        /* Mesma condicional, mas dessa vez, utilizando o operador condicional Ternário */

       // String resultado = (a == b) ? "Verdadeiro" : "Falso";
      //  System.out.println(resultado);


        /* Relacionais
         * Os Operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se
         * o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um
         * valor booleano como resultado.
         * 
         *  == Quando desejamos verificar se uma variável é IGUAL A outra.
         *  != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         *  > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         *  >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         *  < Quando desejamos Verificar se uma variável é MENOR QUE a outra.
         *  <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         */

         //classe operadores.java 
         /* 
         int numero1 = 1;
         int numero2 = 2;

         if (numero1 == numero2)
                    System.out.println("Numero 1 igual ao numero 2");

         if(numero1 > numero2)
                    System.out.println("Numero 1 maior que numero 2");
        
         if (numero1 < numero2)
                    System.out.println("Numero 1 menor que numero 2");
                
         if (numero1 >= numero2)
                    System.out.println("Numero 1 maior ou igual que numero 2");

         if (numero1 <= numero2)
                    System.out.println("Numero1 menor ou igual que numero2");

         if (numero1 != numero2)
                    System.out.println("Numero1 é diferente de numero 2 \n"  );


        boolean simNao = numero1 == numero2;
                System.out.println("Numero 1 igual ao numero 2 " + simNao);
        
        simNao = numero1 > numero2;
                System.out.println("Numero 1 maior que numero 2 " + simNao);
        
        simNao = numero1 < numero2;
                System.out.println("Numero 1 menor que numero 2 " + simNao);
        
        simNao = numero1 >= numero2;
                System.out.println("Numero 1 maior ou igual que numero 2 " + simNao);

        simNao = numero1 <= numero2;
                System.out.println("Numero1 menor ou igual que numero2 " + simNao);

        simNao = numero1 != numero2;
                System.out.println("Numero1 é diferente de numero 2 " + simNao);
             */

            

        /*Comparações Avançadas 
        Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo dominio de como o java
        trata o armazenamento deste valores na memória.
        Quando estiver mais familiarizado com a linguagem, recomendamos se aprofundar no conceito de espaço em 
        memória Stack versus Heap
        Precisamos entender que em java tudo é objeto, logo objetos diferentes podem ter as mesmas caracteristicas,
        mas lembrando, são objetos diferentes
         */ 
/* 
         String nome1 = "JAVA";
         String nome2 = "JAVA";

         System.out.println(nome1 == nome2);

         String nome3 = new String("JAVA");

         System.out.println(nome1 == nome3);

         String nome4 = nome3;

         System.out.println(nome3 == nome4);

         //equals na parada
         //versus equals: (Faz a comparação entre conteudos)Existe uma relevância forte em realizar comparações com
         // == e equals na qual precisamos ter uma compreenção de quais as regras seguidas pela linguagem
         System.out.println(nome1.equals(nome2));
         System.out.println(nome2.equals(nome3));
         System.out.println(nome3.equals(nome4));

   */     
         //Comparação Avançada.java
  /*    int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2);

         Integer numero3 = 130;
         Integer numero4 = 130;
         System.out.println(numero3 == numero4);   
         
         // A razão pela qual o resultado é false, é devido o java tratar os valores
         // Como objetos a partir de agora
         // Qual a solução?
         // Quando queremos comparar objetos, usamos o método equals

         System.out.println(numero3.equals(numero4));
*/


        /*                     Lógicos

         * Os Operadores lógicos representam o recurso que nos permite criar expressões lógicas 
         * maiores a partir da junção de duas ou mais expressões.
         * && Operador Lógico "E"
         * || Operador Lógico "OU"
         */

/*      boolean condicao1 = true;

         boolean condicao2 = false;

        //* Aqui estamos utilizando o operadorlógico E para fazer a união de duas expressões.
        //* É como se estivess escrito:
        //  * " se condicao1 e condicao2 forem verdadeira , executar código"
          

        if (condicao1 && condicao2)
                System.out.println("Os dois valores precisam ser verdadeiros");

        // se condicao1 OU condicao2 for verdadeira. executar código.
        if (condicao1 || condicao2)
                System.out.println("Um dos valores precisa ser verdadeiro");
*/

        // Expressoes lógicas avançadas
        // A duplicidade nos operadores lógicos é um recurso conhecido Operador Abreviado,
        // isso quer que se a condicao1 atender aos criterios não será necessário validar a condicao2

        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 2 & numero2 ++ == 2)
                System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

    }    
}
