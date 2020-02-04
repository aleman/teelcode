
public class ProjectionArea883 {

  public static void main(String[] args) {
    System.out.println(projectionArea(new int[][] { {2} }));
    //System.out.println(projectionArea(new int[][] { {1,2}, {3,4} }));
    //System.out.println(projectionArea(new int[][] { {1,0}, {0,2} }));
    //System.out.println(projectionArea(new int[][] { {1,1,1}, {1,0,1}, {1,1,1} }));
    //System.out.println(projectionArea(new int[][] { {2,2,2}, {2,1,2}, {2,2,2} }));
  }

  public static int projectionArea(int[][] grid) {
    int n = grid.length;
    int area = 0;
    for(int i = 0; i < n; i++) {
      int max = 0;
      for(int j = 0; j < n; j++) {
        if(grid[i][j] > 0) {
          area++;
          max = Math.max(max, grid[i][j]);
        }
      }
      area += max;
    }
    for(int j = 0; j < n; j++) {
      int max = 0;
      for(int i = 0; i < n; i++) {
          max = Math.max(max, grid[i][j]);
      }
      area += max;
    }
    return area;
  }
}

