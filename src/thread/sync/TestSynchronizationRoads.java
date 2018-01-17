package threads.sync;

 class Junction {
	
	synchronized public void crossJunction(String roadName, int noMotorists){
		for(int i=1;i<=5;i++){  
			System.out.println(noMotorists*i+" motorists crossed "+roadName);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		} 
	}
}
	class OrangeRoad extends Thread{  
		Junction t;  
		OrangeRoad(Junction t){  
			this.t=t;  
		}  
		public void run(){  
			t.crossJunction("orange road", 5);  
		}  

	}  
	class RedRoad extends Thread{  
		Junction t;  
		RedRoad(Junction t){  
			this.t=t;  
		}  
		public void run(){  
			t.crossJunction("redroad road", 100);  
		}  
	} 
	

	public class TestSynchronizationRoads{  
		public static void main(String args[]){  
			Junction obj = new Junction();//only one object  
			OrangeRoad t1=new OrangeRoad(obj);  
			RedRoad t2=new RedRoad(obj);  
			t1.start();  
			t2.start();  
		}  
	}

