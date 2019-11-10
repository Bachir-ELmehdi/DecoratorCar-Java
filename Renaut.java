package DecoratorCar;

import java.util.HashMap;
import java.util.Map;

/**
 * @author =====> BACHIR ELMEHDI
 * Project =====> DesignPattern
 * Package =====> DecoratorCar
 * Date    =====> 22 oct. 2019 
 */
public class Renaut extends CareDecorator{
	/**
	 * 
	 */
    private   Map<String,String> OP = new HashMap<>();
	public Renaut(String name,String diesel,String gearbox, Care care) {
		// TODO Auto-generated constructor stub
		super(care);
		OP.put("name", name);
		OP.put("diesel_type", diesel);
		OP.put("gearbox_type", gearbox);

	   

	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+OP.get("name");
	}
	@Override
	public double getAccelere() {
		// TODO Auto-generated method stub
		return super.getAccelere()+3;
	}
	@Override
	public String getDieselType() {
		// TODO Auto-generated method stub
		return super.getDieselType()+OP.get("diesel_type");
	}
	@Override
	public String getGearboxType() {
		// TODO Auto-generated method stub
		return super.getGearboxType()+OP.get("gearbox_type");
	}
	@Override
	public Map<String, String> getOptions() {
		// TODO Auto-generated method stub
		return super.getOptions();
	}
	/**
	 * @param oP the oP to set
	 */

}
