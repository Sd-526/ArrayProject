package project1;

import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		Service s1=new Service();
		System.out.println("======Product Management System======");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Database...!!!");
		int size=sc.nextInt();
		s1.createDatabse(size);
		while(true)
		{
			System.out.println("======Menu======");
			System.out.println("1. Add Product\n2. Find By ID");
			System.out.println("3. Find By Company\n4. Update by ID");
			System.out.println("5. All Details\n6. Exit");
			System.out.println("7. Delete");
			System.out.println("Enter the Option: - ");
			int op=sc.nextInt();
			
			switch (op) {
			case 1:s1.addProduct();
				    break;
			case 2:s1.findByID();
		            break;
			case 3:s1.findByBrand();
		            break;
			case 4:s1.update();
		            break;
			case 5:s1.details();
		            break;
			case 6:System.out.println("Thank you.....!!!");
			        System.exit(0);
		            break;
			case 7:s1.delete();
                    break;
		    default:System.out.println("InValid Option.....!!");
				    break;
			}
					
		}
	}

}
