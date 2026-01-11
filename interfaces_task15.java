public class interfaces_task15 {
    public static void main(String[] args) throws Exception {
    }
    interface Selectable {
        public void onSelect();
    }
    interface Updatable extends Selectable {
        public void refresh();
    }
    class Screen implements Updatable {
        public void onSelect() {};
        public void refresh() {};
    }
}
