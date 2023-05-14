package org.system;

public class Desktop extends Computer
{

	public void desktopSize()
	{
		System.out.println("desktopSize - Desktopsize Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();

	}

}
/* Package   :org.system
Class        :Computer
Methods   :computerModel()

Class        :Desktop
Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.
*/