
public class RemoveOuterParentheses1021 {

  public static void main(String[] args) {
    String test = "()()";
    if(args.length > 0) {
      test = args[ 0 ];
    }
    System.out.println("__" + removeOuterParentheses(test) + "__");
  }

  public static String removeOuterParentheses(String S) {
    int open = 0;
    int openIndex = -1;
    int foundCount = 0;
    StringBuffer ret = new StringBuffer();
    for(int i = 0; i < S.length(); i++) {
      char each = S.charAt(i);
      if('(' == each) {
        if(0 == open) {
          openIndex = i;
        }
        open++;
        continue;
      }
      open--;
      if(open == 0) {
        foundCount++;
        System.out.println("["+openIndex+":"+i+"] " + S.substring(openIndex, i));
        ret.append(S.substring(openIndex + 1, i));
        openIndex = -1;
      }
    }
    return ret.toString();
  }
}

