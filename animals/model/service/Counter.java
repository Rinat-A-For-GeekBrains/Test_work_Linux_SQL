package animals.model.service;

public class Counter implements AutoCloseable {
    int q=0 ;
    public void addAnimal()
    {
        q=q+1;
    }

    @Override
    public void close() throws Exception {

    }
}
