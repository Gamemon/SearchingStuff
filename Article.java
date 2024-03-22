public class Article{

  private String AName = "";
  private String AContents = "";
  private int APriority;
  public Article(String name, String contents, int priority){
    AName = name;
    AContents = contents;
    APriority = priority;
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
}
