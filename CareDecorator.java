package DecoratorCar;
import java.util.Map;
/**
 * @author =====> BACHIR ELMEHDI
 * Project =====> DesignPattern
 * Package =====> DecoratorCar
 * Date    =====> 22 oct. 2019 
 */
public abstract class CareDecorator implements Care {
    private Care care;
    
    /**
	 * 
	 */
	public CareDecorator(Care r) {
		// TODO Auto-generated constructor stub
		 this.care =r;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return care.getName();
	}

	@Override
	public double  getAccelere() {
		// TODO Auto-generated method stub
		return care.getAccelere();
	}
	public Map<String,String> getOptions(){
		return care.getOptions();
	}
	@Override
		public String getDieselType() {
			// TODO Auto-generated method stub
			return null;
		}
	@Override
		public String getGearboxType() {
			// TODO Auto-generated method stub
			return null;
		}
	/**
	 * @return the care
	 */
	
	
	


}
