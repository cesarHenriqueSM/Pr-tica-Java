1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
  
  import java.util.Scanner; 
  public class Main
    {
	    public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
        
      int idade, mes, dia;
        
        System.out.print("Usuário, por favor, infome sua idade: ");
          idade = input.nextInt();
        
        System.out.print("Agora, infome os meses: ");
          mes = input.nextInt();
        
        System.out.print("Por último, infome quantos dias: ");
          dia = input.nextInt();
        
        int convertAgeIntoDays = (idade*365) + (mes*30) + dia;
        
        System.out.printf("Usuário, você possui %d ano(s), %d mês(es) e %d dias. Sua idade equivale a %d dias!", idade, mes, dia, convertAgeIntoDays);
        
      }
  }

2. Fazer um programa que imprima a média aritmética dos números 8, 9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
  
  import java.util.Scanner; 
  public class Main
    {
	    public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
        
        float media1 = (8+9+7)/3, media2 = (4+5+6)/3;
        
        System.out.printf("A média dos números 8, 9 e 7 equivale a %.1f, e dos números 4, 5 e 6 é igual a %.1f.\r\n", media1, media2);
        
        float media3 = (media1 + media2)/2;
        
        System.out.printf("A média entre as duas médias é %.1f.", media3);
        
      }
  }

3. Informar um saldo e imprimir o saldo com reajuste de 1%.
  
  import java.util.Scanner; 
  public class Main
    {
	    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float saldo;
        
        System.out.print("Usuário, por favor, informe seu saldo atual: R$");
        
        saldo = input.nextFloat();
        
        float reajuste = saldo + (saldo/100);
        
        System.out.printf("\r\nSeu saldo reajustado em 1% é de R$%.2f.", reajuste);
        
      }
  }
