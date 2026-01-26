package task9;

import java.util.Date;

public abstract class AbstractEntity {
    public int id;
    public Date createdTime;
    public Date updatedTime;
    public AbstractEntity() {}
    public AbstractEntity(AbstractEntity other) {
        if (other != null) {
            this.id = other.id;
            this.createdTime = other.createdTime;
            this.updatedTime = other.updatedTime;
        }
    }
    public abstract AbstractEntity clone();
}
