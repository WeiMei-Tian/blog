/**
 * Created by liwei on 2017/5/15.
 */
public class test {


    public static void main(String[] args){

        String[] files = {
                "aaa","bbb","cc","d","sd"
        };

        String[] names = new String[files.length];

        for(int i = 0; i < files.length;i++) {
            names[i] = files[i];
        }

        for(String str: names){
            System.out.println(str);
        }
    }


}
