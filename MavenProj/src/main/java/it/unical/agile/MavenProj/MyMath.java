package it.unical.agile.MavenProj;

public class MyMath {
	
	public int fibonacci(int position) {
		
		if(position<0) {
			throw new IllegalArgumentException("Position lesser than zero");
		}
		
		if(position == 0) {
			return 1;
		}
		if(position == 1) {
			return 1;
		}
		
		return fibonacci(position-1) + fibonacci(position-2);
		
	}

}
