package task1;
import java. util.HashSet;
import java.util.Set;
public class task1 {
    public static void main(String[] args) {
        HardWorker worker1 = new HardWorker("Bob", getNailsPack(), new Hammer());
        Microscope microscope = new Microscope();
        HardWorker worker2 = new HardWorker("Bob Jr.", getNailsPack(), new MicroscopeAdapter(microscope));

        worker1.hammerAllNails();
        worker2.hammerAllNails();
    }
    public static Set<Nail> getNailsPack() {
        Set<Nail> nailPack = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            nailPack.add(new Nail());
        }
        return nailPack;
    }
}
