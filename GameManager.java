import java.util.*;

public class GameManager {
    int playerNum;
    List<Player> players;


    
    
    public GameManager(){
        System.out.println("게임을 시작합니다.");
        System.out.println("플레이어의 수를 입력하세요: ");
        
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();
        sc.nextLine(); 

        for(int i = 0; i<playerNum; i++){

            Player player = createPlayer();

            System.out.println("이름을 입력하세요: ");
            String thisName = sc.nextLine();
            player.name = thisName;
            System.out.println("플레이어: " + thisName + "추가 완료");
            //players.add(player);
            //String checkName = players.get(i).name;
            //System.out.println("플레이어"+ (i+1) + checkName + "님이 추가되었습니다.");
            
        }



        sc.close();
    }

    
    
    public Player createPlayer(){
        Player p = new Player();
        return p;
    }



    

    


}
