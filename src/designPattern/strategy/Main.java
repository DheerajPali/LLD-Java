package designPattern.strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("A", "B", TransportMode.BIKE);
    }
}
