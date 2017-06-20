package exercise2;

public class Boolean {

	public static void main(String[] args) {
		boolean x= true,z=true;
		int y= 20;
		x=(y!=10)^(z=false);
		System.out.println(x+","+y+","+z);
		for(int i=0;i<10;){
			i=i++;
			System.out.println("Helloworld");
		}
	}

}
