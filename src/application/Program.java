package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import static java.util.Comparator.comparing;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i < n ; i++) {
			
			System.out.print("Id:");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary =sc.nextDouble();
			sc.hasNextLine();

			list.add(new Employee(id, name, salary));
		}
	
		System.out.print("Enter the employee ID that will have salary increase:");
		int id = sc.nextInt();
		
		Optional<Employee> matchingObject = list.stream().filter(p -> p.getId().equals(id)).findFirst();
		Employee procurado = matchingObject.orElse(null);
		
		if (procurado == null) {
			System.out.println("Employee does not exist!");
		}else {
			System.out.print("Percentage of salary increase:");
			Double percentage = sc.nextDouble();
			procurado.salaryIncrease(percentage);
		}
		
		list.sort(comparing(Employee::getId));
		
		for(Employee fulano : list) {
			System.out.println(fulano);
		}
		
		sc.close();
	}

}
