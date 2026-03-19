package Task6_Parallel;
public interface Queue {
    void put(Command cmd);
    Command take();

}