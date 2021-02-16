package com.EECS.CDL;

public class CDLDemo implements ManageComponent{
	private Dependency dependency;
	
	@Override
	public void performLookup(Container container)
	{
		this.dependency = (Dependency)container.getDependency("myDependency");
	}
}

class Dependency
{
	
}