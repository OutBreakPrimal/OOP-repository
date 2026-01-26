package task12;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
public class Bowling {
    private final Queue<Track> tracks = new LinkedList<>();
    private final Queue<PairOfShoes> shoesShelf = new LinkedList<>();
    public Bowling(int tracksNumber) {
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.add(new Track(i));
        }
        for (int i = 0; i < 50; i++) {
            int size = 38 + (i % 8);
            shoesShelf.add(new PairOfShoes(size));
        }
    }

    public synchronized Track acquireTrack() {
        Track track = tracks.poll();
        if (track != null) {
            track.setPrice(100 - tracks.size());
        }
        return track;
    }
    public synchronized void releaseTrack(Track track) {
            if (track != null) {
                tracks.add(track);
            }
            System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        }


    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) {
            return null;
        }
        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(new PairOfShoes(42));
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        if (shoes != null) {
            shoesShelf.addAll(shoes);
        }
        System. out. printf("%d pairs of shoes returned to the wardrobe\n", shoes.size());
    }
}
