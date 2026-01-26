package task9;

abstract class RequisitionWithPhone extends RequisitionBase {
    public String phone;

    public RequisitionWithPhone() {
    }
    public RequisitionWithPhone(RequisitionWithPhone other) {
        super(other);
        if (other != null) {
            this.phone = other.phone;
        }
    }
}
