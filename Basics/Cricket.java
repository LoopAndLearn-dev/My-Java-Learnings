//CONSTRUCTOR OVERLOADING
package c_overloading;
public class CricketTeam {
	String name;
	int age;
	float runrate;

	public CricketTeam(String name, int age, float runrate) {
		this.name = name;
		this.age = age;
		this.runrate = runrate;
	}

	public CricketTeam(String name, float runrate) {
		this.name = name;
		this.runrate = runrate;
	}

	public CricketTeam(String name) {
		this.name = name;
	}
}
package c_overloading;

public class CricketTeamApp {
	public static void main(String[] args) {

		CricketTeam ct1 = new CricketTeam("Virat Kohli", 34, 5.4f);
		System.out.println("Name : " + ct1.name + " " + "Age :" + ct1.age + " " + "RunRate :" + ct1.runrate);
		System.out.println();

		CricketTeam ct2 = new CricketTeam("MS Dhoni", 9.2f);
		System.out.println("Name : " + ct2.name + " " + "RunRate :" + ct2.runrate);
		System.out.println();

		CricketTeam ct3 = new CricketTeam("Tim David");
		System.out.println("Name: " + ct3.name);
	}
}

