package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class DatabaseWord extends StorageSystem implements infGame {
    private String fileStorge;

    public void setFileStorge(String fileStorge) {
        this.fileStorge = fileStorge;
    }
    
    @Override
    public void writeToFile(ArrayList<StorageWord> data) {
        try {
            FileWriter wf = new FileWriter(new File(this.fileStorge));
            BufferedWriter bw = new BufferedWriter(wf);
            for(StorageWord row : data){
                bw.write(String.format("%s;%s", row.Vocabulary,row.Translate));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error "+e);
            e.printStackTrace();
        }
    }
    @Override
    public ArrayList<StorageWord> getFromFile(){
        File file = new File(this.fileStorge);
        ArrayList<StorageWord> arsw = new ArrayList<>();
        if(file.exists()){
            try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line != null && !line.equals("")){
                    String[] row = line.split(";");
                    arsw.add(new StorageWord(row[0],row[1]));
                }
            }return arsw;
        } catch (Exception e) {
            System.out.println("Error "+e);
            e.printStackTrace();
            }
        }
        return null;
    } 
    
    @Override
    public StorageWord dataGame(){
        ArrayList<StorageWord> getDa = new ArrayList<>();
        getDa=getFromFile();
        Random rand = new Random();
        int n1 = rand.nextInt(getDa.size()); 
        StorageWord ran = getDa.get(n1);
        return ran;
    }
    
}
