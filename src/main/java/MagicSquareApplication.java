import controller.MagicSquareController;
import io.ConsoleReader;
import io.ConsoleWriter;
import service.MagicSquareService;

public class MagicSquareApplication {
    public static void main(String[] args) {
        MagicSquareController controller = new MagicSquareController(new ConsoleWriter(), new MagicSquareService());
        controller.createMagicSquare(Integer.parseInt(new ConsoleReader().read()));
    }
}
