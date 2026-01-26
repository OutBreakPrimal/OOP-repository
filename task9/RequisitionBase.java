package task9;

public abstract class RequisitionBase extends AbstractEntity {
    public RequisitionBase() {
    }
    public RequisitionBase(RequisitionBase other) {
        super(other);
        if (other != null) {
            this.user = (other.user != null) ? (User) other.user.clone() : null;
            this.name = other.name;
            this.mail = other.mail;
            this.utmMark = other.utmMark;
            this.webinarType = other.webinarType;
            this.promoCode = other.promoCode;
        }
    }
    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;
}
