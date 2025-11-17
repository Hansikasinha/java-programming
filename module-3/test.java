class test 
{
    protected void finalize() 
{
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args)
 {
        test obj = new test();
        obj = null;
        System.gc(); // JVM may call finalize()
    }
}
