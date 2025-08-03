package designPattern.strategy;

public class GoogleMaps {
    public void findPath(String source , String destination, TransportMode mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source,destination);
    }

}
