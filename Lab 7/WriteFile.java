import java.io.FileWriter;
import java.io.IOException; 

public class WriteFile 
{
    public static void main(String[] args)
    {
        // Writing Text File       
        try {

            FileWriter Writer = new FileWriter("myfile.txt");

            // Writing File
            Writer.write("Hello! This is Nirmal Patil!");
            Writer.close();
            
            System.out.println("Successfully written.");
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

//Write to a File
//We use the FileWriter class along with its write() method in order to write some text to the file.