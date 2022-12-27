public class DVD implements Media {
    private String title;
    private String producer;
    private double price;

    public DVD(String title, String producer, double price) {
        this.title = title;
        this.producer = producer;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void play() {
        System.out.println("\n  Playing DVD " + toString());
    }
}
