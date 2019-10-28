package moneycalculator;

import java.util.Iterator;

public class ParseReader<T> implements Iterable<T> {
    private final IteratorReador reader;
    private final Parser<T> parser;

    public ParseReader(IteratorReador reader, Parser<T> parser) {
        this.reader = reader;
        this.parser = parser;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T> (){
            Iterator<String> iterator = reader.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hashNext();
            }

            @Override
            public T next() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        }
        
    }
    
}
