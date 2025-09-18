package com.tnsif.interfacee;
public interface phone {
	String  Call="Calling..";
	String  Sms="Sending SMS..";
	void show();
}
class Jio implements phone{
	public void show()
	{
		System.out.println("This is Jio phone");
		System.out.println(Call);
		System.out.println(Sms);

	}
}
class Samsung implements phone{
	public void show()
	{
		System.out.println("This is Samsung phone");
		System.out.println(Call);
		System.out.println(Sms);

	}
}