package javaPrograsm;

     class Box {
	int height;
	int width;
	int length;
	Box()
	{
		
	}
	Box(int h,int w,int l){
	height=h;
	width=w;
	length=l;
	}
	Box(int i){
	height=width=i;	
		
	}
	void printDimenson(){
	System.out.println("["+height+" ,"+width+" ,"+length+"]");	
	}
}
     class Run{
	public static void main(String[] args) {
		
		Box b1=new Box(2,4,9);
		Box b2=new Box(10);
		Box b3=new Box();
		Box b4=new Box();
		b1.printDimenson();
		b2.printDimenson();
		b3.printDimenson();
		b4.printDimenson();
		
		
		
		
		
		
		
	
		

	}

}
