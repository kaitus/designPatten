package patterns.ObserverDesignPattern.ObserverAndObservable;

public interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);

}
