public class pattern14 {
        public static void main(String[] args){
    int n = 14;
    for(int i=1;i<=n;i++)
    {
        for(int k=1;k<=i;k++)
        {
        System.out.print(" ");
        }
        for(int j=1;j<=29-(2*i);j++){
            System.out.print("*");
        }
        System.out.println();
    }
        }
    }
    
