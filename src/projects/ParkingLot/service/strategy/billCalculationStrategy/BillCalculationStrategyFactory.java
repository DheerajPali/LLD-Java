package projects.ParkingLot.service.strategy.billCalculationStrategy;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStragety(PricingStrategy pricingStrategy){
        return switch (pricingStrategy){
            case LINEAR -> new LinearBillCalculationStrategy();
            case SURGE -> new SurgeBillCalculationStrategy();
        };
    }
}
