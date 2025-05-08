import java.util.*;

public class Board {
    List<BoardEdge> edges = new ArrayList<>();
    Tile origin;
    Tile center;
    List<BoardEdge> diagonalsToCenter = new ArrayList<>();
    List<BoardEdge> diagonalsFromCenter = new ArrayList<>();

    public Board(int sides) {
        origin = createTile();
        Tile prev = origin;
        
        

        for (int i = 0; i < sides-1; i++) {
            Tile end = createTile();
            BoardEdge edge = new BoardEdge(prev, end, 6);
            edges.add(edge);
            prev = end;
        }

        BoardEdge lastEdge = new BoardEdge(prev, origin, 6);
        edges.add(lastEdge);


        center = createTile();
        Tile centerTile = center;
        centerTile.id = 5;
        
        //center로 가는 길 (origin + 마지막 변의 출발점 제외 -> N-2)
        for (int i = 0; i < sides-2; i++){
            Tile endTile = edges.get(i).getEndTile();
            BoardEdge diagonalEdge = new BoardEdge(endTile, centerTile, 4);
            diagonalsToCenter.add(diagonalEdge);
        }

        //center에서 출발하는 길 (N/2)
        for (int i = 0; i < sides/2; i++){
            int index = (sides+1)/2 +1 ;
            Tile endTile = edges.get(index).getEndTile();            
            BoardEdge diagonalEdge = new BoardEdge(centerTile, endTile, 4);
            diagonalsFromCenter.add(diagonalEdge);
        }

    }

    private Tile createTile() {
        Tile t = new Tile();
        t.id = 0;
        return t;
    }
}
