class BC{
    public static void main(String args[])
    {
        System.out.println("Break Example");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            break;
            System.out.println(i);
        }
        System.out.println("Continue Example");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            continue;
            System.out.println(i);
        }
    }
}