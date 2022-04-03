class pattern5{
    public static void main(String args[])
    {
    int n=10;
    for (int i=0;i<n;i++)
    {
    for(int j= 0;j<n;j++)
    {
    if(i==0 || i==n-1 || j==n-1|| (j==0 && i>1)|| (i==2&&j<n-2) || (j==7&&i>1&&i<8)||(i==7&&j>1&&j<8) ||(j==2&&i>3&&i<8)||(i==4&&j>1&&j<6)||(j==5&&i>3&&i<6))
    {
    System.out.print("*" + " ");
    }
    
    else
    { 
    System.out.print("  ");
    }
    }
    System.out.println();
    }
    }
    }