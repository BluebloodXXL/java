		package debug_station;
		

		import java.io.*;
		import java.util.Scanner;

		public class fiel_promote {
		    public static void main(String[] args) throws Exception {

		        Scanner sin = new Scanner(System.in);
		        String fname, data;
		        int check = 1;
		        boolean appendORnot;
		        
		        System.out.printf("Enter the file name you want to edit or create with extension\n");
		        fname = sin.nextLine();

		        System.out.println("Taken" + fname);

		        //System.out.printf("To create a new a file press 0 and to edit press 1\n");
		        check = sin.nextInt();

		        if(check == 1)
		            appendORnot = true;
		        else
		            appendORnot = false;
		
		        System.out.printf("Enter the file name you want to edit or create with extension\n");
		        fname = sin.nextLine();

		        System.out.println("Taken" + fname);
		/*
		        File file = new File(fileName);
		        FileWriter fileWriter = new FileWriter(fileName, appendORnot);

		        BufferedWriter buffer = new BufferedWriter(fileWriter);
		        PrintWriter printWriter = new PrintWriter(buffer);

		        if(file.exists() == false){
		            file.createNewFile();
		            System.out.println("No such file is found and a new file has been created");
		        }
		        else
		            System.out.println("File exists and ready to append");


		        //the real magic happens now


		        while (!(data = sin.nextLine()).equals("--/"))
		            printWriter.println(data);

		        printWriter.close();
		*/
		    }
		}


	


