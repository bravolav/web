import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cw {
    /**
     *
     * @param index
     * @param object
     */


    public static void main(String[] args){
        demoControlFlow();

    }
    public static void demoString(){
        StringBuilder sb = new StringBuilder();//线程不安全
        sb.append("x ");
        sb.append(true);
        sb.append(1.2);
        System.out.println(sb.toString());
    }
    public static void demoControlFlow(){
        List<String> stringList = new ArrayList<String>(10);
       for(int i = 0; i<4 ; ++i){
           stringList.add(String.valueOf(i*i));
       }
        System.out.println(stringList);
        Collections.reverse(stringList);
        System.out.println(stringList);

    }

}
