
public class Main {
    public static void main(String[] args) {
        Board a = new Board(4);
        Tile tileA;
        tileA = a.edges.get(1).tiles.get(5);
        System.out.println(tileA.id);
        System.out.println();
    }
}
