package java8;

/**
 * Created by hrshtt on 8/20/17.
 */
public class LambdaTest
{
    static MathOperation add = ( a, b ) ->
    {
        System.out.println( "Add operation: " );
        return a + b;
    };
    static MathOperation subtract = ( a, b ) ->
    {
        System.out.println( "Subtract operation: " );
        return a - b;
    };

    public static void main( String args[] )
    {
        LambdaTest test = new LambdaTest();
        System.out.println( test.operate( 3, 6, add ) );
        System.out.println( test.operate( 3, 6, subtract ) );

    }

    public interface MathOperation
    {
        int operation( int n1, int n2 );
    }

    private int operate( int n1, int n2, MathOperation mathOperation )
    {
        return mathOperation.operation( n1, n2 );
    }
}
