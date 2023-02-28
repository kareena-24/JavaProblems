import java.util.Random;
import java.util.*;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class headstails {
    public static void main(String args[]) throws FileNotFoundException{
        PrintWriter w = new PrintWriter(new File("rounds.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<Integer> random=new ArrayList<>();
        ArrayList<Integer> random2=new ArrayList<>();
        Random r = new Random();
        int p1=0,p2=0;
        for (int j = 0; j < 3; j++){
            for(int i=0;i<=3;i++){
                sb.append(",");
            }
            sb.append("Heads");
            sb.append(",");
            sb.append("and");
            sb.append(",");
            sb.append("tails");
            sb.append(",");
            sb.append("game");
            sb.append("\r\n");
            sb.append("Rounds");
            sb.append(",");
            sb.append("Player1");
            sb.append(",");
            sb.append("Player2");
            sb.append("\r\n");


        for(int i=0;i<10;i++){
            int result=r.nextInt(2);
            random.add(result);
        }
        for(int i=0;i<10;i++){
            if(random.get(i)==0){
                player1.add("Head");
            }
            else{
                player1.add("Tail");
            }
            
        }
        for(int i=0;i<10;i++){
            int result2=r.nextInt(2);
            random2.add(result2);
        }
        for(int i=0;i<10;i++){
            if(random2.get(i)==0){
                player2.add("Head");
            }
            else{
                player2.add("Tail");
            }
            
        }
        
        int count1=random.stream().filter(res ->res==1).collect(Collectors.toList()).size();
        int count2=random2.stream().filter(res ->res==1).collect(Collectors.toList()).size();
         for (int i = 0; i <= 9; i++) {
                sb.append("Round " + (i + 1));
                sb.append(",");
                sb.append(player1.get(i));
                sb.append(",");
                sb.append(player2.get(i));
                sb.append("\r\n");

            }
        
        String winner=" ";
        if(count1>count2){
            winner="player1";
            p1++;
        }
        else if(count2>count1){
            winner="player2";
            p2++;
        }
        else{
            winner="Tie";
        }
        //System.out.println("Winner: "+winner);
        sb.append("winner");
        sb.append(",");
        sb.append("of");
        sb.append(",");
        sb.append("the");
        sb.append(",");
        sb.append("game:");
        sb.append(",");
        sb.append(winner);
        sb.append("\r\n");
        sb.append("\r\n");

    }
    if(p1>p2){
        sb.append("Final");
        sb.append(",");
        sb.append("winner");
        sb.append(",");
        sb.append("of");
        sb.append(",");
        sb.append("the");
        sb.append(",");
        sb.append("game:");
        sb.append(",");
        sb.append("Player1");
        

    }
    else{
        sb.append("Final");
        sb.append(",");
        sb.append("winner");
        sb.append(",");
        sb.append("of");
        sb.append(",");
        sb.append("the");
        sb.append(",");
        sb.append("game:");
        sb.append(",");
        sb.append("Player2");

    }

        w.write(sb.toString());
        w.close();
        
    }
    
}