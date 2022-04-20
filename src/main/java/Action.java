public interface Action {
    boolean run(Barriers barriers);
    boolean jump(Barriers barriers);
}