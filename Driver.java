import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Driver {

    public static void main(String args[]){
        Node station1 = new Node("Westminster", null, null);
        Node station2 = new Node("Waterloo", station1, null);
        Node station3 = new Node("Trafalgar Square", station1, station2);
        Node station4 = new Node("Canary Wharf", station2, station3);
        Node station5 = new Node("London Bridge", station4, station3);
        Node station6 = new Node("Tottenham Court Road", station5, station4);
        HashMap<Integer,String> a = new HashMap<>();
        a.put(1, "ss");
        a.put(2,"cc");
       
        Set b = a.entrySet();
        Iterator c = b.iterator();
        while(c.hasNext())
        {        Map.Entry d = (Map.Entry)c.next();
        d.getValue();
        }
        System.out.println("Read Input");
        Scanner scan = new Scanner(System.in);
        String abc = scan.nextLine();

        System.out.println("Output"+ abc);
        scan.close();
        BreadthFirstSearch bfs = new BreadthFirstSearch(station6, station1);
 
        DepthFirstSearch dfs = new DepthFirstSearch(station6, station1);
        
        if(bfs.compute())
            System.out.print("Path Found!");
        
        if(dfs.compute())
        	System.out.print("Path Found!");
    }
}