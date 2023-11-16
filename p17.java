package hw3;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// TODO Auto-generated method stub
				Car car1;
				car1 = new Car();
				car1.setNumGas(1234,20.5);
				int number = car1.getNum();
				double gasoline = car1.getGas();
				System.out.println("調查樣品車時得知");
				System.out.println("車號是"+number+"，汽油輛設為"+gasoline);
				
				
			}

		}
		/*class Car{
			int num;
			double gas;
			
			int getNum(){
				System.out.println("調查車號");
				return num;
			}
			
			double getGas(){
				System.out.println("調查汽油量");
				return gas;
			}
			
			void setNumGas(int n,double g){
				num = n;
				gas = g;
				System.out.print("車號設為"+num);
				System.out.println("，將汽油設為" + gas);
			}
			
		}*/
