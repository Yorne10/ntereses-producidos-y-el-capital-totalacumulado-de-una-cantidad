package interesesproducidosyelcapitaltotal;

public class CalculandoInteresesYCapital {

	int x = 360, y = 100;
	
	public void calculo(){
        int c = 5000, r = 30 , t = 120;
        float interes = (c*r*t)/(x*y);
        System.out.println("Total de intereses producidos = " +  interes);
    }

    public static void main(String[] args) {
    	CalculandoInteresesYCapital interesProducido = new CalculandoInteresesYCapital();
    	interesProducido.calculo();
    }
   
}

