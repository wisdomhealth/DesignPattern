package strategy.client;

import strategy.AdvancedMemberStrategy;
import strategy.MemberStrategy;
import strategy.context.Price;

public class Client {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);

        //创建环境
        price = new Price("I");
        //计算价格
        quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);

    }
}
