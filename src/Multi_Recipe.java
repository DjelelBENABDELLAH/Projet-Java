import java.util.ArrayList;

public class Multi_Recipe
{
  private int time;
  ArrayList<Resource> tab_out;
  ArrayListe<int> qt_out;
  
  public Multi_Recipe(String name, Building prod, int time)
  {
    super(name,prod);
    this.time = time;
    tab_out = new ArrayList<Resource>();
    qt_out = new ArrayList<int>();
  }
  public void add_Resource_out(Resource r,int qt)
  {
    tab_out.add(r);
    qt_out.add(qt);
  }
  pubic String toString()
  {
    String s=super.toString()+"Pour produire :\n";
    for(int i=0;i<tab_out.size();i++)
    {
      s += "- "+tab_out.get(i)+" "+qt_out.get(i)+"\n";
    }
  }
}
