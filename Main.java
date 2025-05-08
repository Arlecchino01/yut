
public class Main {
    public static void main(String[] args) {
        Board a = new Board(4);
        Tile tileA;
        tileA = a.edges.get(0).tiles.get(0);
        System.out.println(tileA.id);
        System.out.println();
        Tile tileB = a.diagonalsFromCenter.get(0).tiles.get(0);
        System.out.println(tileB.id);
    }
}
