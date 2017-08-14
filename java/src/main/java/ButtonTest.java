import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Created by jianjun.zjj on 2017/8/14.
 */
public class ButtonTest {


    public static void main(String[] args) {
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });

        //函数式编程
        //单参，一个表达式
        button.addActionListener(event-> System.out.println("button clicked"));

        //单参，一段代码
        button.addActionListener(event->{
            event.getSource();
            System.out.println("button clicked");
        });

        //无参
        Runnable runnable = ()->{
           System.out.println("无参");
        } ;

        //多参
        BinaryOperator<Long> add = (x,y)->x+y;
        BinaryOperator<Long> addExplicat = (Long x,Long y)->x+y;
    }
}
