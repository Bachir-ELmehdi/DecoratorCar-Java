package DecoratorCar;

import java.util.HashMap;
import java.util.Map;

/**
 * @author =====> BACHIR ELMEHDI
 * Project =====> DesignPattern
 * Package =====> DecoratorCar
 * Date    =====> 22 oct. 2019 
 */

public class BM  extends CareDecorator{

	/**
	 * @param r
	 */
	private Map<String,String> OP = new HashMap<>();
	public BM(String name,String diesel,String gearbox, Care care) {
		super(care);
		// TODO Auto-generated constructor stub
		OP.put("name", name);
		OP.put("diesel_type", diesel);
		OP.put("gearbox_type", gearbox);
	}
	@Override
	public double getAccelere() {
		// TODO Auto-generated method stub
		return super.getAccelere()+12;
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
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+OP.get("name");
	}

}
