/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author WTFTHE
 */
abstract public  class StorageSystem {
    abstract public void writeToFile(ArrayList<StorageWord> data);

    /**
     *
     * @return
     */
    abstract public ArrayList<StorageWord> getFromFile();
}
