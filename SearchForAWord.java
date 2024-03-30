import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SearchForAWord{
  private String word1;
  private String titleSyn;
  public SearchForAWord(String word, String syn){
    word1 = word;
    titleSyn = syn;
  }
  public void search(ArrayList<Article> arts){
	  //System.out.println("Search running...");
    String line = "";
    BufferedReader br = null;
    try{
      br = new BufferedReader(new FileReader(titleSyn));
    } catch(FileNotFoundException e){
      e.printStackTrace();
    }

    //Find synonym line
    
    
    while(line != null){
		try{
		  line = br.readLine();
	  } catch (IOException e) {
		e.printStackTrace();
	  }
      String tempWord = line.substring(0, line.indexOf(","));
      //System.out.println(tempWord);
      if (tempWord.equals(word1)){
		  //System.out.println("Found the word in synlist");
        break;
      }
    }
    try{
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}

    String concatPrint = "";
    //create priorities
    for (Article thingy : arts){
      if (thingy.getContents().indexOf(word1) != -1){
        thingy.setPriority(1);
        concatPrint = thingy.toString();
      } else {
        boolean checker = true;
        while(checker){
          
          //Assuming there is always at least one synonym in a line of the text file
			line = line.substring(line.indexOf(",") + 1);
			if (line.indexOf(",") == -1){
				if (thingy.getContents().indexOf(line) != -1){
					thingy.setPriority(2);
					checker = false;
				} else {
					checker = false;
				}
			} else {
				if ((thingy.getContents().indexOf(line.substring(0, line.indexOf(",")))) != -1){
					thingy.setPriority(2);
					checker = false;
				}
			}
          
        }
      }
    }

    //String concatenation with Article toString method
   for(Article thingy : arts){
     if (thingy.getPriority() == 2){
       concatPrint = concatPrint + thingy.toString();
     }
   }
   
   System.out.println(concatPrint);
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

