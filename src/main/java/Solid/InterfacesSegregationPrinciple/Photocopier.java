package Solid.InterfacesSegregationPrinciple;

public class Photocopier implements Printer, IScanner {
    @Override
    public void Scan(Document d) throws Exception {
        throw new Exception();
    }

    @Override
    public void Print(Document d) throws Exception {
        throw new Exception();
    }
}
