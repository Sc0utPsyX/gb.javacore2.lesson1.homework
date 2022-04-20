public class Homework {
    public static boolean next = false;

    public static void main(String[] args) {
        Object[] creatures = {
                new Human("Алексей"),
                new Cat("Васька"),
                new Robot("R2D2"),
                new Human("Анатолий"),
                new Cat("Леопольд"),
                new Robot("РБ-235")
        };
        Barriers[] barriers = {
                new Wall(),
                new RunningTrack(),
                new Wall(),
                new RunningTrack(),
                new Wall(),
                new RunningTrack()
        };
        for (Object creature : creatures) {
            for (Object barrier : barriers) {
                if (!next) {
                    if (creature.getClass() == Human.class) {
                        if (barrier.getClass() == Wall.class) {
                            next = ((Human) creature).jump((Wall) barrier);
                        } else {
                            next = ((Human) creature).run((RunningTrack) barrier);
                        }
                    } else if (creature.getClass() == Cat.class) {
                        if (barrier.getClass() == Wall.class) {
                            next = ((Cat) creature).jump((Wall) barrier);
                        } else {
                            next = ((Cat) creature).run((RunningTrack) barrier);
                        }
                    } else {
                        if (barrier.getClass() == Wall.class) {
                            next = ((Robot) creature).jump((Wall) barrier);
                        } else {
                            next = ((Robot) creature).run((RunningTrack) barrier);
                        }
                    }
                } else {
                    next = false;
                    break;
                }
            }
        }
    }
}