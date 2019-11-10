package DecoratorCar;

/**
 * @author =====> BACHIR ELMEHDI
 * Project =====> DesignPattern
 * Package =====> DecoratorCar
 * Date    =====> 22 oct. 2019 
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Care R = new Renaut("Renaut Megane","essnece","6 eme" , new BasicCar("voiture ", "type", "vitesse"));
Care A = new BM("BM_Seire1","8 eme","diesel", new BasicCar("voiture ", "type", "vitesse"));
System.out.println(A.getName());
	}

}
