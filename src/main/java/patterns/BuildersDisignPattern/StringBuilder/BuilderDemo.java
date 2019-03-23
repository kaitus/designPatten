package patterns.BuildersDisignPattern.StringBuilder;

public class BuilderDemo {
    public static void main(String[] args) {
        // we want to build a simple HTML paragraph
        System.out.println("Testing");
        String hello = "hello";
        System.out.println("<p>" + hello + "</p>");

        // now we want to build a list with 2 words
        String [] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word: words)
        {
            // indentation management, line breaks and other evils
            sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);

        // ordinary non-fluent builder
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);

        // fluent builder
        builder.clear();
        builder.addChildFluent("li", "hello")
                .addChildFluent("li", "world");
        System.out.println(builder);
    }
}
