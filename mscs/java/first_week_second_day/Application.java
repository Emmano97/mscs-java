package mscs.java.first_week_second_day;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		/* Creation of company */
		Company company = new Company("google llc");
		
		/* Creation of departments */
		Department googleCloud = new Department("google cloud", "MontainView, CA");
		
		Department googleAssistant = new Department("google assistant", "MontainView, CA");
		
		/* Creation of positions */
		Position pythonDeveloper = new Position("Python developer", "Oriented problem solving python developer");
		
		Position dataAnalyst = new Position("data analyst", "Junior data analyst with or no degree");
		
		Position uxDesignerIntern = new Position("UX designer", "Internship position for beginner ux designers");
		
		Position dataEngineer = new Position("data engineer", "Oriented problem solving data engineer");
		
		Position SoftwareEngineer = new Position("Software Engineer", "Algorithms and data structure researcher");
		
		/* Add position to department */		
		googleCloud.addPosition(SoftwareEngineer);
		
		googleCloud.addPosition(pythonDeveloper);
		
		googleCloud.addPosition(uxDesignerIntern);
		
		googleAssistant.addPosition(dataAnalyst);
		
		googleAssistant.addPosition(dataEngineer);
		
		googleAssistant.addPosition(pythonDeveloper);
		
		/* Creation of Employees */
		Employee emmanuelEdorh = new Employee(1, "Emmanuel", "", "Edorh",
				(new Date(1997, 11, 18)), "9999-999-99", 95000, dataAnalyst);
		
		Employee JackieAnderson = new Employee(1, "Jacckie", "", "Anderson",
				(new Date(1980, 10, 12)), "9999-999-90", 70000, pythonDeveloper);
		
		Employee RobAndy = new Employee(1, "Rob", "", "Andy",
				(new Date(1997, 11, 18)), "0999-999-99", 84000, dataAnalyst);
		
		Employee TheoDim = new Employee(1, "Theo", "", "Dim",
				(new Date(1997, 11, 18)), "7999-999-99", 80000, SoftwareEngineer);
		
		Employee AnabelleRockader = new Employee(1, "Anabelle", "", "Rockader",
				(new Date(1997, 11, 18)), "9499-999-99", 60000, uxDesignerIntern);
		
		Employee FanyStuard = new Employee(1, "Fany", "", "Stuard",
				(new Date(1997, 11, 18)), "9997-999-99", 91000, dataAnalyst);
		
		Employee TimPocktman = new Employee(1, "Tim", "", "Pocktman",
				(new Date(1997, 11, 18)), "9919-999-99", 73000, pythonDeveloper);
		
	}

}
