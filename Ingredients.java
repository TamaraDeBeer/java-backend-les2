public class Ingredients {
    private Integer amount;
    private String unit;
    private String name;

    public Ingredients () {
    }

    public Ingredients (Integer amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public Integer getAmount () {
        return amount;
    }

    public Integer setAmount () {
        return this.amount;
    }

    public String getUnit () {
        return unit;
    }

    public String setUnit () {
        return this.unit;
    }

    public String getName () {
        return name;
    }

    public String setName () {
        return this.name;
    }

}
