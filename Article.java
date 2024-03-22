public class Article{

  private String AName = "";
  private String AContents = "";
  private int APriority;
  public Article(String name, String contents){
    AName = name;
    AContents = contents;
  }

  public String getName(){
    return AName;
  }

  public String getContents(){
    return AContents;
  }

  public int getPriority(){
    return APriority;
  }

  public void setPriority(int prio){
    APriority = prio;
  }
}
