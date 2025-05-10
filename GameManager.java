import java.util.*;

public class GameManager {
    int playerNum;
    List<Player> players;
    int sides;
    List<Board> boards;
    Scanner sc = new Scanner(System.in);
    int turn = 0;
    
    public GameManager(){
        System.out.println("게임을 시작합니다.");
        
        this.players = new ArrayList<>();
        this.boards = new ArrayList<>();

        addPlayer();
        createBoard();


        sc.close();
    }




    public void addPlayer(){
        System.out.println("플레이어의 수를 입력하세요: ");        

        playerNum = sc.nextInt();
        sc.nextLine(); 

        for(int i = 0; i<playerNum; i++){
            Player player = createPlayer();
            System.out.println("이름을 입력하세요: ");
            String thisName = sc.nextLine();
            player.name = thisName;
            System.out.println("플레이어: " + thisName + "추가 완료");
            players.add(player);
        }
    }
    
    public Player createPlayer(){
        Player p = new Player();
        return p;
    }

    
    public void createBoard(){
        System.out.println("보드의 변의 수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        sides = sc.nextInt();
        sc.nextLine();
        Board board1 = new Board(sides);
        sc.close();
        boards.add(board1);
    }

    public void updateGame(){
        
    }


}
