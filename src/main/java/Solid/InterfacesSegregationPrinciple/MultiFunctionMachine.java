package Solid.InterfacesSegregationPrinciple;

public class MultiFunctionMachine implements MultiFunctionDevice {

    // compose this out of several modules
    private Printer printer;
    private IScanner scanner;

    @Override
    public void Scan(Document d) throws Exception {
        printer.Print(d);
    }

    @Override
    public void Print(Document d) throws Exception {
        scanner.Scan(d);
    }
}
