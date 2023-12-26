package lambdas;

//Lambda expressions basically express instances of the functional interface (An interface with a single abstract method is called a functional interface).

@FunctionalInterface
public interface Sum<T> {

    public T sum(T x, T y);
}