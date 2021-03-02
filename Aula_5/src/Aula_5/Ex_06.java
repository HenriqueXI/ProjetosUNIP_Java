package Aula_5;

import java.util.*;

public class Ex_06 {
	
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String func1, func2, func3;
		float sal1, sal2, sal3, liq1, liq2, liq3, total;
		
		// primeira func
		System.out.println("Digite o nome 1 ");
		func1 = sc.next();
		System.out.println("Digite o salario 1 ");
		sal1 = sc.nextFloat();
		if(sal1 <= 500)
			liq1 = sal1 - sal1 * 0.86f;
		else
			liq1 = sal1 - sal1 * 0.095f;
		
		// segunda func
		System.out.println("Digite o nome 2 ");
		func2 = sc.next();
		System.out.println("Digite o salario 2 ");
		sal2 = sc.nextFloat();
		if(sal1 <= 500)
			liq2 = sal2 - sal2 * 0.86f;
		else
			liq2 = sal2 - sal2 * 0.095f;
		
		// terceira func
		System.out.println("Digite o nome 3 ");
		func3 = sc.next();
		System.out.println("Digite o salario 3 ");
		sal3 = sc.nextFloat();
		if(sal1 <= 500)
			liq3 = sal3 - sal1 * 0.86f;		
		else
			liq3 = sal3 - sal3 * 0.095f;
		
		total = liq1 + liq2 + liq3;
		System.out.println("Funcionario: " + func1 + "Liquido " + liq1);
		System.out.println("Funcionario: " + func2 + "Liquido " + liq2);
		System.out.println("Funcionario: " + func3 + "Liquido " + liq3);
		System.out.println("Total: " + total);
		sc.close();
	}

}
