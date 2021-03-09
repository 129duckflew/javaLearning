package cn.duckflew.LeetCode;

import org.jsoup.Jsoup;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IsValidSudoku
{
//    public boolean isValidSudoku(char[][] board) {
//        Map<Character,Integer> map=new HashMap<>();
//        for (int i = 0; i < 9; i++)
//        {
//            map.clear();
////            System.out.println("清空");
//            for (int j = 0; j < 9; j++)
//            {
//                if (board[i][j]=='.')continue;
//                if (map.get(board[i][j])!=null)
//                {
////                    System.out.println(board[i][j]+"已经存在!!!在检查一行数据的时候");
//                    return false;
//                }
//                map.put(board[i][j],1);
////                System.out.println("放入"+board[i][j]);
//            }
//            map.clear();
////            System.out.println("清空");
//            for (int j = 0; j < 9; j++)
//            {
//                if (board[j][i]=='.')continue;
//                if (map.get(board[j][i])!=null)
//                {
////                    System.out.println(board[i][j]+"已经存在!!!在检查一列数据的时候");
//                    Set<Character> characters = map.keySet();
//                    for (Character character : characters)
//                    {
//                        System.out.print(map.get(character)+" ");
//                    }
////                    System.out.println("坐标为"+i+" "+j);
//                    return false;
//                }
////                System.out.println("放入"+board[j][i]);
//                map.put(board[j][i],1);
//            }
//        }
////        System.out.println("开始检查子图");
//        for (int i = 0; i < 9; i+=3)
//        {
//            for (int j = 0; j < 9; j+=3)
//            {
//                boolean validSonGraph = isValidSonGraph(board, i, j, map);
//                if (!validSonGraph)return false;
//            }
//        }
//        return true;
//    }
    public boolean isValidSonGraph(char[][]sonBoard, int rowStart, int colStart, Map<Character,Integer>map)
    {
        map.clear();
//        System.out.println("清空");
//        System.out.println("开始行数" +rowStart+"开始列"+colStart  );
        for (int i  = rowStart; i <rowStart+3 ; i++)
        {
            for (int j = colStart; j <colStart+3 ; j++)
            {
                if (sonBoard[i][j]=='.')continue;
                if (map.get(sonBoard[i][j])!=null)
                {
//                    System.out.println(sonBoard[i][j]+"已经存在!!!在检查子方格数据的时候");
                    return false;
                }
                map.put(sonBoard[i][j],1);
//                System.out.println("放入"+sonBoard[i][j]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][]board)
    {
        HashMap<Character,Integer> [] rowMap=new HashMap[9];
        HashMap<Character,Integer> [] colMap=new HashMap[9];
        HashMap<Character,Integer> [] sonGraphMap=new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rowMap[i] = new HashMap<>();
            colMap[i] = new HashMap<>();
            sonGraphMap[i] = new HashMap<>();
        }
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                char cur=board[i][j];
                if (cur!='.')
                {
                    if (rowMap[i].get(cur)!=null)return false;
                    rowMap[i].put(cur,1);
                    if (colMap[j].get(cur)!=null)return false;
                    colMap[j].put(cur,1);
                    int sonGraphMapIndex=(i/3)*3+j/3;
                    if (sonGraphMap[sonGraphMapIndex].get(cur)!=null)return false;
                    sonGraphMap[sonGraphMapIndex].put(cur,1);
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        char[][]board=
        {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean validSudoku = new IsValidSudoku().isValidSudoku(board);
        System.out.println(validSudoku);
    }
}
