package javaConcepts;

import org.testng.annotations.Test;

public class EncapsPractice {
	
	private String name;
	private int age;
	private int orderID;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int newAge)
	{
		this.age=newAge;
	}
	
	public int getOrderID()
	{
		return orderID;
	}
	
	public void setOrderID(int newOrderID)
	{
		this.orderID= newOrderID;
	}

}
