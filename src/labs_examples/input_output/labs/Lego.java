package labs_examples.input_output.labs;

public class Lego {

    private String category;
    private int uniqueParts;
    private int total;

    public Lego(){

    }

    public Lego(String category, int uniqueParts, int total) {
        this.category = category;
        this.uniqueParts = uniqueParts;
        this.total = total;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUniqueParts() {
        return uniqueParts;
    }

    public void setUniqueParts(int uniqueParts) {
        this.uniqueParts = uniqueParts;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Parts List{" +
                " Category: " + category + ", " +
                "Unique: " + uniqueParts + ", " +
                "Total: " + total +
                "}";
    }
}
