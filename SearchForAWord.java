import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SearchForAWord extends SearchForADoc{
  private word;
  private title;
  public SearchForAWord(String word){
    word1 = word;
  }
  public SearchForAWord(String word,String title){
    word1 = word;
    title1 = title;
  }
  public void search(){
     BufferedReader objReader = null;
    String strCurrentLine;
    
  try {
   BufferedReader objReader = new BufferedReader(new FileReader(Title));
  } catch (IOException e) {
   e.printStackTrace();
  } 

    objReader.close();
}


/*
puplic class LinearSearch(){    
public static int linearSearch(Title, String word){    
        for(String i=0;i<Title.length;i++){    
            if(Title[i] == word){    
                return i;
            }
          for(String j=0;j){
          }
                
        }    
        return -1;    
    }    

}
  */

  

  
}
