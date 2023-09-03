package keywordStatic;

import java.util.ArrayList;
import java.util.List;

public class Intervenants {
public static List<Intervention> interventions=new ArrayList<Intervention>();
public  static void showList()
{
	System.out.println("le premier intervenant est "+interventions.get(0));
	System.out.println("le dernier intervenant est "+interventions.get(interventions.size()-1));
for(Intervention inter: interventions)
{
	
System.out.println(inter.toString());	
}
}
}
