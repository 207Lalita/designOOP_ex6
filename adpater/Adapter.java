public class Adapter {
    private StockMarketDataParser adaptee;

    public Adapter(StockMarketDataParser adaptee){
        this.adaptee = adaptee;
    }

    public void parseCSV() {
		adaptee.parseFromCSV();
	}
}
