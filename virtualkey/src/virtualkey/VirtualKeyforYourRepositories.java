package virtualkey;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKeyforYourRepositories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="RAM MOHAN";
		String path="D:\\assignment-project(simplilearn)\\directoryproject";
		File f=new File(path);
		System.out.println();
		System.out.println("                                              ****************WELCOME TO MY WORLD*******************\n");
		System.out.println("                                          *************************HI,THIS IS "+s+" ********************\n");
		System.out.println("                                     **************************THIS APPLICATION IS DEVELOPED BY "+s+" **************\n");
		System.out.println();
		System.out.println();
		System.out.println();
		f.mkdirs();
		while(true){
            System.out.println("1.Display the files in ascending order\n");
            System.out.println("2.Below this  are some User Enabled Options to perform the operations  \n");
            System.out.println("3.Terminate Program\n");
            System.out.println("*****What option do you want to select and perform the operation*****  \n");
            System.out.println();

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:

                    File arr[] = f.listFiles();
                    Arrays.sort(arr);

                    for(int i=0;i<arr.length;i++)
                        System.out.println(arr[i]);
                        break;


                case 2:
                    Boolean temp = true;
                    while(temp) {
                        System.out.println(" 1 :- To Add a file in the existing Directory");
                        System.out.println(" 2 :- To Delete a file from the existing Directory. ");
                        System.out.println(" 3 :- To Search a user specified file from the Directory");
                        System.out.println(" 4 :- Back to the previous menu");
                        System.out.println(" 5 :- Terminate Program");
                        System.out.println();


                        int choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1:
                                System.out.println("Enter a file name");
                                String name = sc.next();
                                if(new File(f,name).exists()){
                                    System.out.println("file already exist");
                                }else {
                                    File folder1 = new File(f, name);
                                    folder1.mkdir();
                                    if (new File(f, name).exists()) {
                                        System.out.println("file added successfully");
                                    }
                                }

                                break;


                            case 2:
                                System.out.println("Enter a file name");
                                String name1 = sc.next();
                                boolean folder2 = new File(f, name1).exists();
                                System.out.println(folder2);
                                if (folder2 == true) {
                                    File folder3 = new File(f, name1);
                                    folder3.delete();
                                    System.out.println("File successfully deleted");
                                } else {
                                    System.out.println("file does not exist");
                                }
                                /*f2.delete();*/
                                break;


                            case 3:
                                System.out.println("Enter a keyword to search");
                                String search = sc.next();

                                File arr1[] = f.listFiles();
                                for(int a=0;a<arr1.length;a++){
                                    if(arr1[a].getName().startsWith(search)){
                                        System.out.println(arr1[a]);
                                    }else{
                                        System.out.println("No file found");
                                    }
                                }
                                break;

                            case 4:

                                temp = false;
                                break;

                            case 5:

                                System.out.println("*********Program Terminated Successfully***********");
                                System.exit(0);
                            default:
                                System.out.println("Input correct value and retry");

                        }

                    }
                    break;

                case 3:
                    System.out.println("*********Program Terminated Successfully***********");
                    System.exit(0);

                default:
                    System.out.println("Input correct value and retry");
                    break;

            }
        }
    }
		
}


