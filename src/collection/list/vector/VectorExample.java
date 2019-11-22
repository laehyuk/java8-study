package collection.list.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main( String[] args ) {
        vectorRemove();
    }

    public static void vectorRemove(){
        List<Board> board = new Vector<>();

        board.add(new Board("봄","꽃","navyguy1"));
        board.add(new Board("여름","수박","navyguy2"));
        board.add(new Board("가을","단풍","navyguy3"));
        board.add(new Board("겨울","눈","navyguy4"));

        for (Board b : board){
            System.out.println(b);
        }

        board.remove(2);
        System.out.println();

        for (Board b : board){
            System.out.println(b);
        }
    }
}
