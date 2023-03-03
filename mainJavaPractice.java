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
        
        		System.out.printf("\r\nSeu saldo reajustado é de R$%.2f.", reajuste);
        
      		}
  }

4. Escrever um algoritmo que leia:
- a porcentagem do IPI a ser acrescido no valor das peças;
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1;
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2;
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
	
import java.util.Scanner; 
public class Main
	{
		public static void main(String[] args) {
        
        		Scanner input = new Scanner(System.in);
	
			float ipi, valor1, valor2;
			int cod1, cod2, qnt1, qnt2;
		
			System.out.print("Usuário, por favor, informe a taxa de IPI: ");	
				ipi = input.nextFloat();
		
			System.out.print("Agora, informe o código, valor (em R$) e quantidade desejada do 1° item, respectivamente, por favor: ");	    
				cod1 = input.nextInt();
				valor1 = input.nextFloat();
				qnt1 = input.nextInt();
		
			System.out.print("Faça o mesmo referente ao 2° item: ");	    
				cod2 = input.nextInt();
				valor2 = input.nextFloat();
				qnt2 = input.nextInt();
		
			float total_compra = (valor1*qnt1 + valor2*qnt2)*(ipi/100 + 1);
		
			System.out.printf("\r\nO valor total de sua compra é de R$%.2f.", total_compra);
		
		}
}

5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$1.302,00)
	
	import java.util.Scanner; 
	public class Main
		{
		public static void main(String[] args) {
        
        		Scanner input = new Scanner(System.in);
		
			int salario_minimo = 1302;
			float salario_usuario;
		
			System.out.print("Usuário, por favor, informe seu salário atualmente: R$");	
				salario_usuario = input.nextFloat();
		
			float qtd_sm = salario_usuario/salario_minimo;
			
			System.out.printf("\r\nSeu salário equivale a %.1f salário(s) mínimo(s).", qtd_sm);
		}
	
}

6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
	
	import java.util.Scanner; 
	public class Main
		{
		
			public static void main(String[] args) {
        
        			Scanner input = new Scanner(System.in);
		
				int num;
		
				System.out.print("Usuário, por favor, informe um número inteiro: ");	
					num = input.nextInt();
		
				int ant = num - 1;
				int suc = num + 1;
		
				System.out.printf("\r\nO antecessor de %d é %d, enquanto seu sucessor é %d.", num, ant, suc);
		
		}
		
}		
