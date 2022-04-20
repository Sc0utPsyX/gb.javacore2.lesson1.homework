public class Robot implements Action {

    String name;
    int runLength;
    int jumpHeight;

    public Robot(String name) {
        this.name = name;
        this.runLength = (int) Math.round(Math.random() * 1000);
        this.jumpHeight = (int) Math.round(Math.random() * 100);
    }

    @Override
    public boolean run(Barriers barriers){
        if (this.runLength > barriers.length) {
            System.out.printf("%s пробежал беговую дорожку длиной %d\n", this.name, barriers.length);
            return false;
        } else {
            System.out.printf("%s не смог пробежать %d метров и сошел с дистанции\n", this.name, barriers.length);
            return true;
        }
    }

    public boolean jump(Barriers barriers){
        if (this.jumpHeight > barriers.height) {
            System.out.printf("%s перепрыгнул стену высотой %d\n", this.name, barriers.height);
            return false;
        } else {
            System.out.printf("%s не смог перепрыгнуть стену высотой %d и сошел с дистанции\n", this.name, barriers.height);
            return true;
        }
    }
}