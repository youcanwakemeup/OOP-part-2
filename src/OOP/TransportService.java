package OOP;

public interface TransportService {
    void updateTyre();
     default void checkEngine() {
         System.out.println("Проверять нечего");
     }
     default void checkTrailer() {
         System.out.println("Проверять нечего");
     }
}
