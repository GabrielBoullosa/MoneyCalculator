package moneycalculator;

import java.util.Iterator;

public class ParseReader<T> implements Iterable<T> {
    private final IteratorReader reader;
    private final Parser<T> parser;

    public ParseReader(IteratorReader reader, Parser<T> parser) {
        this.reader = reader;
        this.parser = parser;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T> (){
            Iterator<String> iterator = reader.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public T next() {
                return parser.parse(iterator.next());
            }
        };
        
    }
    
}
