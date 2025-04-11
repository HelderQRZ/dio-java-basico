public class Operadores {
    public static void main(String[] args) throws Exception {
        // Operadores Aritméticos
        int a = 10;
        int b = 20;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores Relacionais
        System.out.println("Igualdade: " + (a == b));
        System.out.println("Diferença: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Maior ou igual a: " + (a >= b));
        System.out.println("Menor ou igual a: " + (a <= b));

        // Operadores Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        System.out.println("E lógico: " + (condicao1 && condicao2));
        System.out.println("Ou lógico: " + (condicao1 || condicao2));
        System.out.println("Não lógico: " + (!condicao1));
        System.out.println("Não lógico: " + (!condicao2));

        // Operação Ternária
        int decisao = (a == b) ? 1 : 0;
        System.out.println("Decisão: " + decisao);

        int x = 5;
        int y = 5;
        String resultado = "";
        if (x==y) 
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println("Resultado: " + resultado);

        String ternario = x==y ? "verdadeiro" : "falso";
        System.out.println("Resultado Ternário: " + ternario);

        
    }
}
 