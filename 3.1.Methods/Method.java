class Computer
{
	public void playMusic() //no return type method
	{
		System.out.println("Music Playing...");
	}

	public String getMeAPen(int cost) // return type method
	{
		if(cost>=10)
			return "Pen";
		else
			return "Nothing";
	}

}

public class Method {

	public static void main(String[] args) {

		Computer obj=new Computer();
		obj.playMusic();
    
		String src=obj.getMeAPen(10);
		System.out.println(src);
	}

}
