public class pattern13 {
    public static void main(String[] args){
int n = 14;
for(int i=1;i<=n;i++)
{
    for(int k=1;k<=n-i+1;k++)
    {
    System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
