package DecoratorCar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



/**
 * @author =====> BACHIR ELMEHDI
 * Project =====> DesignPattern
 * Package =====> DecoratorCar
 * Date    =====> 22 oct. 2019 
 */
public class BasicCar  implements  Care{
	private double accelere;
	Map<String , String> options= new HashMap<>();
   
	public BasicCar(String name, String diesel, String gearbox) {
		// TODO Auto-generated constructor stub
        options.put("name", name);
        options.put("diesel_type", diesel);	
        options.put("gearbox_type", gearbox);
        }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
//        Set set = options.entrySet();
//		Iterator It = set.iterator();
//		Map.Entry  recuperer= (Map.Entry)It;

	  return options.get("name");
		
	}
	@Override
	public double getAccelere() {
		// TODO Auto-generated method stub
		return  accelere;
	}
  /**
 * @return the options
 */
	public Map<String, String> getOptions() {
		return options;
	}
	@Override
	public String getDieselType() {
		// TODO Auto-generated method stub
		return options.get("diesel_type");
	}
	@Override
	public String getGearboxType() {
		// TODO Auto-generated method stub
		return options.get("gearbox_type");
	}
	
}
