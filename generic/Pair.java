package Lab12_5;

public class Pair<F,S> {

	public F obj1;
	public S obj2;
	
	public void set(F obj1, S obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void get()
	{
		System.out.printf("(%s, %s)",this.obj1,this.obj2);
	}	
}