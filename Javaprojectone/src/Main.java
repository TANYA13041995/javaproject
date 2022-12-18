package Javaprojectone;
public class Main {
public static void main(String[]args) throws Exception {
	//Your code here!
	HrDepartment hrD = new HrDepartment();
	TechDepartment techD = new TechDepartment();
	AdminDepartment adminD = new AdminDepartment();
	System.out.println(hrD.departmentName());
	System.out.println(hrD.getTodaysWork());
	System.out.println(hrD.getWorkDeadline());
	System.out.println(hrD.doActivity());
	System.out.println(hrD.isTodayAHoliday());
	System.out.println();
	System.out.println(techD.departmentName());
	System.out.println(techD.getTodaysWork());
	System.out.println(techD.getWorkDeadline());
	System.out.println(techD.getTechStackInformation());
	System.out.println();
	System.out.println(adminD.departmentName());
	System.out.println(adminD.getTodaysWork());
	System.out.println(adminD.getWorkDeadline());
	}
}
