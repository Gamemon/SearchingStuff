import java.io.BufferedReader;
import java.io.FileReader;
public class SearchForADoc{
  private String docName = "";
  public SearchForADoc(String doc){
    docName = doc;
  }
  public setTxtName(String doc){
    docName = doc;
  }
  
  /*
  public void search(String specificDoc){
    ArrayList<Article> art = createArt();
    
    boolean checker = true;
    while(checker){
      
    }
  }
  */


  //Word that is searched for = goodWord
  //loop through lines till you find matching initial word (indexOf != -1)
  //USE THAT LINE - word,synonym,etc = lineSpecific
  
  //Check all contents of every article - match word, match synonyms (count!)
  //Loop all articles
  // Loop all words - count which word you're on
  // if count = 1 (of lineSpecific) - that's matching word
  // other is synonym
  // using contentsofarticle.indexOf(wordofline)
  // Mark priority level of given articles!!!

  public ArrayList<Article> createArt(){
    try{
      BufferedReader br = new BufferedReader(new FileReader(docName));
    } catch(FileNotFoundException e){
      e.printStackTrace();
    }

    //Line by line
    //Find # (indexOf)
    //if none go to next line, if some see if matching, if not go to next line
    //Finish if none left

    ArrayList<Article> artsy = new ArrayList<Article>();
    String tempTitle = "";
    String tempContents = "";
    
    String line = "";
    int index = -1;
    boolean checker = true;
    while(checker){
      tempTitle = "";
      if ((line = br.readLine()) != null){
        if ((index = line.indexOf("#")) != -1){
          line = line.substring(index+2);
          index = line.indexOf("#");
          line = line.substring(0, index); //Create title line!
          tempTitle = line;
          tempContents = "";
          boolean checker2 = true; // get the contents of the article until next #'s are reached.
          while(checker2){
            if ((index = line.indexOf("#")) == -1){
              tempContents = tempContents + line;
            } else {
              checker2 = false;
              Article tempArt = new Article(tempTitle, tempContents);
              artsy.add(tempArt);
            }
          }
        }
      } else {
        checker = false;
        br.close();
        return artsy;
      }
    }
    
    
  }


}
