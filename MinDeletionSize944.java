

public class MinDeletionSize944 {

  public static void main(String[] args) {
//    System.out.println(minDeletionSize(new String[] {"a","b"}));
    System.out.println(minDeletionSize(new String[] {"xflbebb","fzqetdc","xktuxef","gfvxchu","goyyhiv"}));
    //System.out.println(minDeletionSize(new String[] {"cba","daf","ghi"}));
//    System.out.println(minDeletionSize(new String[] {"zyx","wvu","tsr"}));
  }

  public static int minDeletionSize(String[] A) {
    int ret = 0;
    if(A.length == 1) {
      return 0;
    }
    char[] line = A[0].toCharArray();
    for(char c : line) {
      System.out.println(c);
    }
    System.out.println();
    char[] now;
    for(String str : A) {
      now = str.toCharArray();
      for(int i = 0; i < line.length; i++) {
        if('-' == line[i]) {
          continue;
        }
        if(now[i] >= line[i]) {
          line[i] = now[i];
        }
        else {
          line[i] = '-';
          ret++;
        }
        System.out.println("line[" + i + "] is " + line[i] + "   " + now[i] + " <-- " + (now[i] >= line[i]));
      }
    System.out.println();
    }
    return ret;
  }
}

