package patterns.BridgeDesigPattern.Quiz;

public class VectorRenderer implements Renderer {
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}
