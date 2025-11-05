package org.tnsif.springdi.IOC;

public class Samsung implements Phone{
	public void calling()
	{
		System.out.println("Calling from samsung..");
	}
	public void internet()
	{
		System.out.println("Data from samsung..");
	}
}