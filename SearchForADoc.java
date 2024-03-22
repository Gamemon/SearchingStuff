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
  public void search(String specificDoc){
    ArrayList<Article> art = createArt();
    
    
    boolean checker = true;
    while(checker){
      
    }
  }

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
    String line = "";
    boolean checker = true;
    while(checker){
      if ((line = br.readLine()) != null){
        if (line.indexOf("##") != -1){
          
        } else {
          
        }
      }
    }
    
    
  }


}
