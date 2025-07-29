package Polymorphism_overirde;

public class OverrideDemo {

	public static void main(String[] args) {
		
		Pltraining p1=new Pltraining();
		p1.session("Full Stack developer");
		
		p1=new JFS();
		p1.session("method overiding");
		
		p1=new Python();
		p1.session("Method overriding");
				
		// TODO Auto-generated method stub

	}

}
