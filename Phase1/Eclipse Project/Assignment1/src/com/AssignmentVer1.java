package com;

import java.io.File;
import java.util.*;

class AssignmentVer1 {
	
  public void display_menu() {
	  System.out.println("PLEASE SELECT AN OPTION FROM MENU :");
	  System.out.println();
	  System.out.println("1\t Add file.");
	  System.out.println("2\t Delete file.");
	  System.out.println("3\t Search file.");
	  System.out.println("4\t Exit Menu");
	  System.out.println();
	  System.out.println("Please enter your choice: ");
  }
  
  public void question()
  {
	System.out.println("Would you like to proceed or quit?");
	System.out.println("To proceed enter 9.");
	System.out.println("If you wish to quit enter 0.");

	Scanner q = new Scanner(System.in);
	
	switch (q.nextInt()) 
	{
	    case 0:
	    System.out.println ("Thank you and godbye.");
	    break;
  
	    case 9:
	    System.out.println ("Please proceed.");
	    new AssignmentVer1();
	    break;

	    default:
	    System.err.println ( "Unrecognized option" );
	    new AssignmentVer1();
	    break;
	}
    }
  public AssignmentVer1() {
	Scanner in = new Scanner ( System.in );
	    
	display_menu();
	switch ( in.nextInt() ) {
    case 1: System.out.println("1 selected");
		    {
				Scanner Sc = new Scanner(System.in);
				System.out.println("Please Enter Filename to add.");
				String Filename = Sc.next();
				File ffd = new File ("/home/mohamadazwardim/Desktop/MyRepository/" + Filename);

				try {
				    if (ffd.createNewFile()) { 
				      System.out.println("File created: " + Filename);
				    } else {
				      System.out.println("File creation failed.");
				    }		
				} catch (Exception e) {
					System.out.println("An error occurred.");
				}
			}
    		question();
            break;
    case 2: System.out.println("2 selected");
		    {
				Scanner Sc = new Scanner(System.in);
				System.out.println("Please Enter File to delete.");
				String Filename = Sc.next();
				File ffd = new File ("/home/mohamadazwardim/Desktop/MyRepository/" + Filename);
			
			    if (ffd.delete()) { 
			      System.out.println("File deleted: " + Filename);
			    } else {
			      System.out.println("Failed to delete the file.");
			    }
			}
            question(); 
            break;
    case 3: System.out.println("3 selected"); 
		    {
				Scanner Sc = new Scanner(System.in);
				System.out.println("Please Enter File to search.");
				String Filename = Sc.next();
				File ffd = new File ("/home/mohamadazwardim/Desktop/MyRepository/" + Filename);

			    if (ffd.exists()) { 
			      System.out.println("File found: " + Filename);
			    } else {
			      System.out.println("File not found.");
			    }
			}
            question(); 
            break;
    case 4: System.out.println("4 selected"); 
    		question(); 
            break;           
    default: System.out.println("Invalid choice");
    }//end of switch
  }
  
  public static void main ( String[] args ) {
	    System.out.println("WELCOME TO LOCKEDME.COM");
		System.out.println();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please Enter File Location");
		String FileLoc = Sc.next();
		System.out.println("File Location Entered = "+FileLoc);
		
		//File ff1 = new File("/home/mohamadazwardim/Desktop/MyRepository/");
		File ff1 = new File(FileLoc);
	  	    
	    Boolean Dir = ff1.isDirectory();
	    if (Dir == true) {
	      String listOfFiles[] = ff1.list();
	      System.out.println("No of files : "+listOfFiles.length);
	      Arrays.sort(listOfFiles);
	      System.out.println("List of Files in the location :");	  
		  for(String fname : listOfFiles) {
			System.out.println("File name is "+fname);
		    }
		  new AssignmentVer1();
	    }
	    else 
	    	System.out.println("Invalid Directory");
	    
   
  }
}




