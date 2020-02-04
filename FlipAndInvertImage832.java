
public class FlipAndInvertImage832 {
  public static void main(String[] args) {
    int[][] data = new int[4][];
    data[0] = new int[5];
    data[0][0] = 1;
    data[0][1] = 1;
    data[0][2] = 0;
    data[0][3] = 0;
    data[0][4] = 0;
    data[1] = new int[5];
    data[1][0] = 0;
    data[1][1] = 1;
    data[1][2] = 1;
    data[1][3] = 1;
    data[1][4] = 0;
    data[2] = new int[] {0,0,1,1,1};
    data[3] = new int[] {0,0,0,0,1};
    int[][] ret = flipAndInvertImage(data);
  }

  public static int[][] flipAndInvertImage(int[][] A) {
    for(int i = 0; i < A.length; i++) {
      int[] row = A[i];
      String rowStr = "";
      for(int j = 0; j < row.length; j++) {
        rowStr += "".equals(rowStr) ? "" : ",";
        rowStr += row[j];
      }
      System.out.println("[" + i + "], length:" + row.length + "   " + rowStr);
      for(int j = 0; j < row.length / 2; j++) {
        int swap = row[row.length - j - 1];
        row[row.length - j - 1] = row[j] == 0 ? 1 : 0;
        row[j] = swap == 0 ? 1 : 0;
        System.out.println("(" + j + "-th) " + row[j] + "  -th from last: " + row[row.length - j - 1] );
      }
      if(row.length % 2 == 1) {
        row[row.length / 2] = row[row.length / 2] == 0 ? 1 : 0;
      }
    }
    System.out.println();
    for(int i = 0; i < A.length; i++) {
      int[] row = A[i];
      String rowStr = "";
      for(int j = 0; j < row.length; j++) {
        rowStr += "".equals(rowStr) ? "" : ",";
        rowStr += row[j];
      }
      System.out.println("[" + i + "], length:" + row.length + "   " + rowStr);
    }
    return null;
  }
}

