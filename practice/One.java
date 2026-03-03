public class One{
	String model;
	int year;
	public One(String model,int year){
		this.model=model;
		this.year=year;
	}

	public void displayinfo(){
		System.out.println("Model:"+model+"\nYear:"+year);
	}	

public static void main(String[] args){
		One c=new One("BMW",2025);
		c.displayinfo();
}
}