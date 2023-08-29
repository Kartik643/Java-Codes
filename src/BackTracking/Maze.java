package BackTracking;

public class Maze {

    public static void main(String[] args) {
//        System.out.println(Dcount(3, 3));
//        path("",3,3);

        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        pathResriction("",board,0,0);
    }

    static int Dcount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int up = Dcount(r - 1, c); // Move up (decreasing row)
        int left = Dcount(r, c - 1); // Move left (decreasing column)

        return up + left;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+'D', r-1,c);
        }

        if(c>1){
            path(p+'R', r, c-1);
        }
    }

    static void pathResriction(String p,boolean[][]maze, int r, int c){
        if(r == maze.length-1 && c== maze[0].length - 1 ){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathResriction(p+'D',maze, r+1,c);
        }

        if(c<maze.length-1){
            pathResriction(p+'R',maze, r, c+1);
        }
    }

}

