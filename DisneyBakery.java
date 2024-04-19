class DisneyBakery
{
public static void serveTea()
{
System.out.println("price for normal tea=INR 10");
}
public static void serveTea(int cups)
{
System.out.println("total price for normal tea=INR"+(10*cups));
}
public static void serveTea(String ingredient)
{
System.out.println("price for"+ingredient+"tea=INR 20");
}
public static void serveTea(String ingredient,int cups)
{
System.out.println("total price for"+ingredient+"tea=INR"+(20*cups));
}
public static void main(String[]args)
{
serveTea();
serveTea(3);
serveTea("Lemon");
serveTea("Ilaichi",2);
}
}