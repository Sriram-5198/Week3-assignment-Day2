package assignment_abstract;

public class Automation  extends MultipleLanguage implements Language,TestTool  {

	public void Selenium() {
		System.out.println("Learn Selenium");
		
	}

	public void Java() {
		System.out.println("Learn Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Learn Ruby");
		
	}

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Selenium();
		auto.Java();
		auto.ruby();
		auto.python();
	}
}
