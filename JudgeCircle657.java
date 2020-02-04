
public class JudgeCircle657 {

  public static void main(String[] args) {
    System.out.println(judgeCircle(args[0]));
  }

  public static boolean judgeCircle(String moves) {
    int x = 0;
    int y = 0;
    for(int i = 0; i < moves.length(); i++) {
      char pos = moves.charAt(i);
      if('L' == pos) {
        x--;
      }
      if('R' == pos) {
        x++;
      }
      y = 'U' == pos ? y + 1 : y;
      y = 'D' == pos ? y - 1 : y;
    }
    return x == 0 && y == 0;
  }
}

