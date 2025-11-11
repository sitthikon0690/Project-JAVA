/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author WTFTHE
 */
public class StorageWord {
    public String Vocabulary;
    public String Translate;

    public StorageWord(String Vocabulary, String Translate) {
        this.Vocabulary = Vocabulary;
        this.Translate = Translate;
    }

    public void setVocabulary(String Vocabulary) {
        this.Vocabulary = Vocabulary;
    }

    public void setTranslate(String Translate) {
        this.Translate = Translate;
    }

    public String getVocabulary() {
        return Vocabulary;
    }

    public String getTranslate() {
        return Translate;
    }
    
    
}
