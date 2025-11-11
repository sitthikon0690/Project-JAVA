/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WTFTHE
 */
public class Database_Login_Register {
    private final File file = new File("src/project/UserPassword.txt");
    
    public void appendFile(Person p) throws IOException{
        try (BufferedWriter buf = new BufferedWriter(new FileWriter(this.file, true))) {
            buf.newLine();
            buf.write(p.getDisplayName()+";"+p.getUserName()+";"+p.getPassword());
        }
    }
    public String checkUserPassword(Person us_pass){
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line != null && !line.equals("")){
                    String[] row = line.split(";");
                    if(row[1].equals(us_pass.getUserName().trim()) && row[2].equals(us_pass.getPassword().trim())){
                        return row[0];
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "NO";
    }
}
