package ejerReloj;

import java.util.Observable;

public class Sensor extends Observable {

	  private int temperatura;

	  public void setValue(int value){
	    temperatura = value;
	    notifyObservers(temperatura);
	  }
}
