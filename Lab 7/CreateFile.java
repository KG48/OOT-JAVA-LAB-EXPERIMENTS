import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args)
    {

        try {
            File Obj = new File("myfile.txt");
            
          	// Creating File
          	if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
      
      	// Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

// Create a File
//In order to create a file in Java, you can use the createNewFile() method.
//If the file is successfully created, it will return a Boolean value true and false if the file already exists.