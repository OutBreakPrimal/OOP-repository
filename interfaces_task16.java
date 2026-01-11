import java.awt.*;

public class interfaces_task16 {
    public static void main(String[] args) throws Exception {
    }
    public interface Animal {
        String getName();
        Color getColor();
        Integer getAge();
    }
    public static class Fox {
        public String getName() {
            return "Fox.";
        }
    }
}
