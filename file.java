import java.util.*;
public class file {
    public static void main(String args[]){
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<Integer> spaces=new ArrayList<>();
        ArrayList<Integer> nospaces=new ArrayList<>();
        
        ArrayList<String> arr3=new ArrayList<>();

        String str[]={"File1","File2","File3","File4","File5"};

        String arr2[][]=new String[10][10];
        int space_num;

       
        arr.add("File1\n");
        arr.add("\t\tFile2\n");
        arr.add("\t\tFile3\n");
        arr.add ("\t\t\tFile4\n");
        arr.add("\t\tFile5\n");
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
           int space=arr.get(i).lastIndexOf("\t");
           spaces.add(space);
        }
        for(int i=0;i<arr.size();i++){
            space_num=arr.get(i).length()-arr.get(i).trim().length();
            nospaces.add(space_num);

        }
        for(int i=0;i<arr.size();i++){
            String parent=" ";
            if(nospaces.get(i)==1){
                parent="null";

            }
            if(nospaces.get(i)==3){
                 parent="File1";

            }
            if(nospaces.get(i)==4){
                 parent="File3";

            }
            arr3.add(parent);


        }


       
        
        
        System.out.println(nospaces);
        System.out.println(arr3);
        System.out.print("File\t\t\tParentFile\n");

        for(int i=0;i<arr.size();i++){
            
            System.out.print(str[i]+"\t\t\t"+arr3.get(i));
            System.out.println("\n");
        }

    }
    
}