package patterns.BridgeDesigPattern.Quiz;

public class RasterRenderer implements Renderer {

    @Override
    public String whatToRenderAs()
    {
        return "pixels";
    }
}
