package creational.factory;

public class GraderFactoryImpl implements GraderFactory {
    @Override
    public Grader instance(GraderType type) {
        switch (type){
            case MCQ -> {
                return new McqGraderImpl();
            }
            case COMPLETE -> {
                return new CompleteGraderImpl();
            }
            default ->  new CompleteGraderImpl();
        }

        return null;
    }
}
