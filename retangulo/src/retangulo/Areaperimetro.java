package retangulo;

public class Areaperimetro {
	
   public static void main(String[] args) {
		
		float lmaior;
		float lmenor;
		float area;
		float perimetro;
			
		lmaior = 8;
		lmenor = 6;
		area = lmaior * lmenor;
		perimetro = lmaior + lmenor + lmaior + lmenor;
		
		System.out.print("�rea do ret�ngulo: ");
		System.out.println(area + " metros.");
		System.out.print("Per�metro do ret�ngulo: ");
		System.out.println(perimetro + " metros.");
		
   }

}