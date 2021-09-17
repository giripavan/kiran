class Armstrongnumber{
	public static void main(String []args){
      int n= 371,x,y=0;
	  int original=371;
	  while(n>0){
		  x=n%10;
		  x=x*x*x;
		  y=y+x;
		  n=n/10;
	  }
	  if(y==original){
		  System.out.println("armstrongnumber");
	  }
	  else
	  {
		  
		  System.out.println("not armstrongnumber" );
	  }
	}
}

		  
		  
      	  