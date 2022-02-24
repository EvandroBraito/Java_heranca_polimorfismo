package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalcharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalcharge) {
        super(name, hours, valuePerHour);
        this.additionalcharge = additionalcharge;
    }

    public Double getAdditionalcharge() {
        return additionalcharge;
    }

    public void setAdditionalcharge(Double additionalcharge) {
        this.additionalcharge = additionalcharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalcharge * 1.1;
    }
}
