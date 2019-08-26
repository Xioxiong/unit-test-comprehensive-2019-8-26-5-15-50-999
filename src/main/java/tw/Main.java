package tw;

import tw.commands.GuessInputCommand;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            List<String> list = Arrays.asList(input.split(""));
            Map<String,Integer> map = new HashMap<>();
            Map<String,Integer> map2 = new HashMap<>();
            Map<String,Integer> map3 = new HashMap<>();
            for(String str:list){
                int position = "1234".indexOf(str);
                if(position != -1){
                    map.put(str,position);
                }
            }
            map.forEach((t,v)->{
                if(list.get(v).equals(t)){
                    map2.put(t,v);
                }else{
                    map3.put(t,v);
                }
            });
            if(map2.size() == 4){
                System.out.println("恭喜你猜对了！");
                break;
            }else{
                System.out.println(map2.size()+"A"+map3.size()+"B");
            }
        }
        System.out.println("游戏结束！");
    }
}
