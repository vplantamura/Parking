package basic.Pojo;

import java.util.Comparator;
/**
 * 
 * @author user
 *
 */
public class LngCmrtr implements Comparator<Parking> {

	@Override
	public int compare(Parking p1, Parking p2) {
		if(p1.getLongitude()>p2.getLongitude()){
			return 1;			
		} else if (p1.getLongitude()<p2.getLongitude()) {
			return -1;			
		} else {
			return 0;			
		}
	}

}
