package simpledb;

/**
 * JoinPredicate compares fields of two tuples using a predicate.
 * JoinPredicate is most likely used by the Join operator.
 */
public class JoinPredicate {
    
    private Predicate.Op _op;
    private int _leftField;
    private int _rightField;

    /**
     * Constructor -- create a new predicate over two fields of two tuples.
     *
     * @param field1 The field index into the first tuple in the predicate
     * @param field2 The field index into the second tuple in the predicate
     * @param op The operation to apply (as defined in Predicate.Op); either
     *   Predicate.Op.GREATER_THAN, Predicate.Op.LESS_THAN, Predicate.Op.EQUAL,
     *   Predicate.Op.GREATER_THAN_OR_EQ, or Predicate.Op.LESS_THAN_OR_EQ
     * @see Predicate
     */
    public JoinPredicate(int field1, Predicate.Op op, int field2) {

    this._op = op;
    this._leftField = field1;
    this._rightField = field2;



	//IMPLEMENT THIS
    }

    /**
     * Apply the predicate to the two specified tuples.
     * The comparison can be made through Field's compare method.
     * @return true if the tuples satisfy the predicate.
     */
    public boolean filter(Tuple t1, Tuple t2) {
        //System.out.println("not failed yet");
        Field tuple1 = getLeftField(t1);

        Field tuple2 = getRightField(t2);
        //System.out.println("not fail yet");
        return tuple1.compare(_op,tuple2);
	//IMPLEMENT THIS
	
	
    }


    public boolean filterLessThan(Tuple t1, Tuple t2) {
        //System.out.println("not failed yet");
        Field tuple1 = getLeftField(t1);

        Field tuple2 = getRightField(t2);
        //System.out.println("not fail yet");
        return tuple1.compare(Predicate.Op.LESS_THAN,tuple2);
    //IMPLEMENT THIS
    
    
    }

    public boolean filterGreaterThan(Tuple t1, Tuple t2) {
        //System.out.println("not failed yet");
        Field tuple1 = getLeftField(t1);

        Field tuple2 = getRightField(t2);
        //System.out.println("not fail yet");
        return tuple1.compare(Predicate.Op.GREATER_THAN,tuple2);
    //IMPLEMENT THIS
    
    
    }



    public Field getLeftField(Tuple t){
	return t.getField(_leftField);
    }

    public Field getRightField(Tuple t){
	return t.getField(_rightField);
    }

}
