package creational.factory;

public interface GraderFactory {

    public Grader instance(GraderType type);
}
