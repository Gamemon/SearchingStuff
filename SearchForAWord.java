import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SearchForAWord extends SearchForADoc{
  private word1;
  private titleSyn;
  public SearchForAWord(String word, String syn){
    word1 = word;
    titleSyn = syn;
  }
  public void search(ArrayList<Article> arts){
    String line = "";
    try{
      BufferedReader br = new BufferedReader(new FileReader(titleSyn));
    } catch(FileNotFoundException e){
      e.printStackTrace();
    }

    //Find synonym line
    while((line = br.readLine()) != null){
      String tempWord = line.substring(0, line.indexOf(","));
      if (tempWord.equals(word1)){
        break;
      }
    }
    br.close();

    //create priorities
    for (Article thingy : arts){
      if (thingy.indexOf(word1) != -1){
        thingy.setPriority(1);
      } else {
        boolean checker = true;
        while(checker){
          line = line.substring(line.indexOf(",")+1);
          String tempWord = "";
          if ((tempWord.equals(line.substring(0, line.indexOf(","))))){
            thingy.setPriority(2);
          }
          if (line.indexOf(",") == -1){
            checker = false;
          }
        }
      }
    }

    //String concatenation with Article toString method
   
   
   
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

