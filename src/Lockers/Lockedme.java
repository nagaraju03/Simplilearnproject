package Lockers;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Lockedme {
	
	public static void file() throws IOException
	{
		int choice = -1;
		Scanner s = new Scanner(System.in);
		String filename;
		Scanner s2=new Scanner(System.in);
		System.out.println("Application Name: LockedMe");
		System.out.println("Developer   Name: Nagaraju");
		while(true) {
		System.out.println("Please enter anyone option from below:");
		System.out.println("1.List all files");
		System.out.println("2.More options");
		System.out.println("3.Close the application");
		String folderpath = "C:\\temp";
		
		File folder = new File(folderpath);

		File[] file = folder.listFiles();
		
		try {
		
			choice=s.nextInt();
			switch(choice)
			{
				case 1 : 	
					System.out.println("List of all files:");
					
					Arrays.sort(file);
					for(File name :file)
						System.out.println(name.getName());
					break;
			
				case 2:
					System.out.println("enter anyone option from below:");
					System.out.println("1.Add file");
					System.out.println("2.Delete file");
					System.out.println("3.Search file");
					System.out.println("4.Main menu");
					int choice2 =s.nextInt();
					if(choice2==1)
					{
						System.out.println("Enter filename to add");
						filename = s2.nextLine();
						File file1 = new File(folder,filename);
						
						if(file1.exists())
						{
						System.out.println("file already present.");
						}
						else 
						{
							file1.createNewFile();
							System.out.println("file sucessfully created.");
						}
					}
					else if(choice2 ==2)
					{
						System.out.println("Enter filename to delete");
						filename = s2.nextLine();
						File file1 = new File(folder,filename);
						
						if(file1.exists()&& file1.getCanonicalFile().getName().equals(file1.getName()))
						{
							if(file1.delete()) 
							{
								
								System.out.println(file1.getName()+" file is deleted successfully");
							}
							else
							{
									System.out.println("File not deleted");
							}
						}
						else
						{
							System.out.println("file not present in the folder");
						}	
					}
					else if(choice2==3)
					{
						System.out.println("enter filename to search");
						filename = s2.nextLine();
						File file1 = new File(folder,filename);
						if(file1.exists()&& file1.getCanonicalFile().getName().equals(file1.getName()))
						{
							System.out.println(file1.getName()+" file is found ");
						}
						else
						{
							System.out.println(file1.getName()+" file is not found");
						}
					}
					else if(choice2==4)
					{
						break;
					}
					else {
						System.out.println("Enter correct value");
					}
					
					break;
				case 3:
					System.exit(0);	
					break;
				default: 
					System.out.println("enter value is not correct");
			 }
		   
		}
		
		catch (InputMismatchException e) {
	        System.out.println("Invalid input");
	        file();
	       
		}
	}
}
	
	public static void main(String[] args) throws IOException {
	
		file();
	
	}
		
}
	

