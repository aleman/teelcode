
import java.util.*;

public class RecentCounter933 {

  public final LinkedList<Integer> list;

    public RecentCounter933() {
      list = new LinkedList<>();
    }
    
    public int ping(int t) {
      int ret = 0;
      list.add(t);
      System.out.println("\n-ping: " + t + " \t" + list);
      List<Integer> removeList = new ArrayList<>();
      for(Integer each : list) {
        int diff = t - each ;
        System.out.println("\t" + each + "    (" + t + " - " + each + ") = " + (diff) + " ... " + (diff <= 3000));
        if(diff <= 3000) {
          ret++;
        }
        else {
          removeList.add(each);
        }
      }
      for(Integer each : removeList) {
        list.remove(each);
      }
     return ret;   
    }

  public static void main(String[] args) {
    RecentCounter933 obj = new RecentCounter933();
    System.out.println("ping 1 " + obj.ping(1));
    System.out.println("ping 100 " + obj.ping(100));
    System.out.println("ping 3001 " + obj.ping(3001));
    System.out.println("ping 3002 " + obj.ping(3002));
    System.out.println("ping 3003 " + obj.ping(3003));
    /*

    int count = 0;
    Random rand = new Random();
    int time = 4;
    do {
      time += rand.nextInt(50);
      try {
        Thread.sleep(rand.nextInt(200));
      }
      catch(Exception e) {
        e.printStackTrace();
      }
      obj.ping(time);
      count++;
    } while(count < 6);
    */
  }

}

