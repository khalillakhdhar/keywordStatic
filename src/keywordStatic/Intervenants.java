package keywordStatic;

import java.util.ArrayList;
import java.util.List;

public class Intervenants {
public static List<Intervention> interventions=new ArrayList<Intervention>();
public  static void showList()
{
for(Intervention inter: interventions)
{
System.out.println(inter.toString());	
}
}
}
