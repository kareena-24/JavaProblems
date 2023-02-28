import java.util.*;
public class wordcount {
    public static void frequency(String str) {
      HashMap<String,Integer> word= new HashMap<>();
      String[] string = str.split("//s+");
      for (String w:string){
        if(word.containsKey(w)){
          word.put(w,word.get(w)+1);
    

          }
          else{
            word.put(w,1);
          }
        }
        for(String w : word.keySet()){
          word.put(w,word.get(w));
        }
        System.out.println(word);
      }
      public static void main(String[] args) 
        {String str ="bity bought a butter the butter bought was bitter";
          frequency(str);

      }
    }
      