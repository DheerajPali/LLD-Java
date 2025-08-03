package designPattern.strategy;

public class CarPathCalculator implements PathCalculator{

    @Override
    public void findPath(String src, String dst){
        System.out.println("Path found by CAR");
    }
}
