package strategy.context;

import strategy.AdvancedMemberStrategy;
import strategy.IntermediateMemberStrategy;
import strategy.MemberStrategy;
import strategy.PrimaryMemberStrategy;

public class Price {

    //持有一个具体的策略对象
    private MemberStrategy strategy;
    /**
     * 构造函数，传入一个具体的策略对象
     * @param strategy    具体的策略对象
     */
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }

    public Price(String type){
        switch (type){
            case "A": strategy = new AdvancedMemberStrategy();
                break;
            case "I": strategy = new IntermediateMemberStrategy();
                break;
            case "P": strategy = new PrimaryMemberStrategy();
                break;
        }
    }

    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
