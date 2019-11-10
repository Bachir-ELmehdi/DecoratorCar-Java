package DecoratorCar;

import java.util.Map;

/**
 * @author =====> BACHIR ELMEHDI
 * Project =====> DesignPattern
 * Package =====> DecoratorCar
 * Date    =====> 22 oct. 2019 
 */
public interface Care {
 char[] name = null;
//public void BasicCar();
 String getName();
 double getAccelere();
 String getDieselType();
 String getGearboxType();
 Map<String,String> getOptions();
}
