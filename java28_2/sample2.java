class fractional{
    int x=0;
    int y=0;
    int z=0;
    public static void main(String args[]){
        fractional a = new fractional();
        a.x=18;
        a.y=12;
        if(a.returnFractional(a)==true){
        	System.out.println(a.toString(a));
        	System.out.println("In Double format:"+inDouble(a));
		}
	else{
		System.out.println(a.toString(a));
		System.out.println("In Double format:"+inDouble(a));
		}
    }
    
    public static double inDouble(fractional c){
    	double a = c.x;
    	double b = c.y;
    	return (a/b);
    }
    
    public static boolean returnFractional(fractional c){ 
       	if(c.findLCM(c)>0){
		int m = c.findLCM(c);
		int a =0;
		int b =0;
		//if(c.x % m == 0 && c.y % m == 0){
			//c.x = c.x / m;
			//c.y = c.y / m;
			//c.z = c.x / c.y;
			//c.x = c.x % c.y;
		//}
		if(c.x % m == 0 && c.y % m == 0){
			c.x = c.x / m;
			int u = c.x;
			int i=0;
			c.y = c.y / m;
			c.z = c.x / c.y;
			while(u!= i + (c.z*c.y)){
				i++;
			}
		}
		}
		if(c.z==0){
		return false;
		}
		else{
		return true;
		}
	}
    
    public static int findLCM(fractional c){
    int mod = 0;
    int a = c.x;
    int b = c.y;
   	while(a%b != 0 ){
	 	mod = (a)%(b);
	 	a = b;
	 	b = mod;
	}
	 
    	return mod;
    }
    
    public String toString(fractional a){
	return a.z+"_"+a.x+"_"+a.y;
    }
}


