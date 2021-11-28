package homeWork12;

import java.time.Year;
import java.util.Iterator;

public class Soldier {
	private String manu;
	private String model;
	private int year;
	private int kelom;
	
	
	public Soldier () { 
		manu = "honda";
		model = "sivic";
		year = 1999;
		kelom = 30000;
	}
	public Soldier (String manu,String model,int year, int kelom) {
		this.manu= manu;
		this.model= model;
		this.year= year;
		this.kelom = kelom; 
	}
	public Soldier(Soldier other) {
		this.manu= other.manu;
		this.model= other.model;
		this.year= other.year;
		this.kelom = other.kelom;
		
		
		
	}
	public int avergeYear() {
	int avereg = 0;
	int curentYear=Year.now().getValue();
	int ageOfCar=curentYear-this.year;	
	avereg = kelom / ageOfCar;
	 
	return avereg;
		
	}
	public String getManu() {
		return manu;
	}
	public void setManu(String manu) {
		this.manu = manu;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getKelom() {
		return kelom;
	}
	public void setKelom(int kelom) {
		this.kelom = kelom;
	}
	public String toString () {
		 
		return  manu +" "+ kelom +" "+model+" "+year;
		
		
	}
	
	
	}


