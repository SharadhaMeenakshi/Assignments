package week3.day1assignments;

public class Automation extends MultipleLangauge implements TestTool,Language {

	

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java method implementation");
    }



	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method implementation");
    
	}

	@Override
	public void ruby() {
		System.out.println("Ruby method implementation");
    }
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Automation automation = new Automation();
 automation.python();
 automation.Java();
 automation.ruby();
 automation.Selenium();
	}
}
/*on Abstraction
===========
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
 */
