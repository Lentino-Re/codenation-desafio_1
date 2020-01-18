package br.com.codenation.calculadora;

public class CalculadoraSalario {
	
	public static void main(String[] args) {
		
		double salarioBase = 1032.00;
		calcularSalarioLiquido(salarioBase);
		
	}

	public static long calcularSalarioLiquido(double salarioBase) {
		
		 if (salarioBase < 1032.00) {
			 return 0;
		 } 
		
		 double salarioDescontoInss = calcularInss(salarioBase);
		 double salarioLiquido = calcularIrrf(salarioDescontoInss);
		
		 System.out.println("O salário Liquido é: " + Math.round(salarioLiquido));
		 
		return Math.round(salarioLiquido);
		 
		
	}
	
	private static double calcularInss(double salarioBase) {
		
		double descontoInss;
		double calculoInss;
		
		if (salarioBase <= 1500.00) {
			calculoInss = (salarioBase * 0.08);
			descontoInss = (salarioBase - calculoInss);
			
		} else if (salarioBase > 1500.00 && salarioBase <= 4000.00) {
			calculoInss = (salarioBase * 0.09); 
			descontoInss = (salarioBase - calculoInss);
		
		} else {
			calculoInss = (salarioBase * 0.11); 
			descontoInss = (salarioBase - calculoInss);
			
		}
		
		return(descontoInss);
	}
	
	private static double calcularIrrf(double descontoInss) {
		
		double calculoIrrf;
		double salarioDescontoIrrf;
		
		if (descontoInss <= 3000.00) {
			salarioDescontoIrrf = descontoInss;
			
		}else if (descontoInss > 3000.00 && descontoInss <= 6000.00) {
	        calculoIrrf = (descontoInss * 0.075);
	        salarioDescontoIrrf = (descontoInss - calculoIrrf);
			
		}else {
			calculoIrrf = (descontoInss * 0.15);
			salarioDescontoIrrf = (descontoInss - calculoIrrf);
			
		}
			
		return(salarioDescontoIrrf);
	}
	
}