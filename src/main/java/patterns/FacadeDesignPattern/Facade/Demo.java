package patterns.FacadeDesignPattern.Facade;

public class Demo {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();

        System.out.println("Ejemplo simplificado....");

        Console console2 = console.newConsole(30, 20);
        console2.render();
    }
}
