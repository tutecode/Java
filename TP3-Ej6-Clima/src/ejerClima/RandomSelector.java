package ejerClima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector<T> {
	private List<T> elements = new ArrayList<T>();
	private Random rnd = new Random();
	
    public void add(T element){
    	elements.add(element);
    }
    
    public T selectNext(){
        int randomInt = rnd.nextInt(elements.size());
        return elements.get(randomInt);
    }

    
}
