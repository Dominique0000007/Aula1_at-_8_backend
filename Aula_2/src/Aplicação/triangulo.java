package Aplicação;

public class triangulo {

	public static void main(String[] args) {
		
		double x1Beta=0,y1Beta=0,x2Beta=0,y2Beta=0,x3Beta=0,y3Beta=0;
		double x1Alfa=0, y1Alfa=0, x2Alfa=0, y2Alfa = 0, x3Alfa = 0, y3Alfa = 0;
		double areaAlfa1 = calcularArea(x1Alfa, y1Alfa, x2Alfa, y2Alfa, x3Alfa, y3Alfa);
		double areaBeta1 = calcularArea(x1Beta, y1Beta, x2Beta, y2Beta, x3Beta, y3Beta);

		    System.out.println("Área do triângulo alfa: " + areaAlfa1);
		    System.out.println("Área do triângulo beta: " + areaBeta1);

		    if (areaAlfa1 > areaBeta1) {
		      System.out.println("O triângulo alfa é maior.");
		    } else if (areaBeta1 > areaAlfa1) {
		      System.out.println("O triângulo beta é maior.");
		    } else {
		      System.out.println("Os triângulos têm a mesma área.");
		    }
		  }

	private static double calcularArea(double x1Alfa, double y1Alfa, double x2Alfa, double y2Alfa, double x3Alfa,
			double y3Alfa) {
		// TODO Auto-generated method stub
		return 0;
	}			  
	}