/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author PC14
 */
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



 
    try{
        File myObject = new File("C:/Users/PC14/Desktop/app.txt");
        if(myObject.createNewFile()){
           FileWriter myWriter = new FileWriter("C:/Users/PC14/Desktop/app.txt");
            System.out.println("File created: " + myObject.getName());
            myWriter.write("name = 'alexis';print(name)");
            Scanner myReader = new Scanner(myObject);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
             myWriter.close();
        }else{
            System.out.println("File already exists: ");
        }
    }catch(IOException e ){
        System.out.println("Error");
        e.printStackTrace();
    }
    
};
    }
    

