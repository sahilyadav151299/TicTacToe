package tictactoe;

class TTT
{ 

java.util.Scanner S=new java.util.Scanner(System.in);
int choice,count=0;
int v=0,u=0;
char []arr=new char[9];
int []brr=new int[9];

public void menu()
{
System.out.println("                                            ");
System.out.println("                                            ");
System.out.println("                                   || Tic Tac Toe ||");
System.out.println("                                            ");
System.out.println("                                 1. Player 1 with : X");
System.out.println("                                 2. Player 2 with : O");
System.out.println("                                 3. Exit");
}

public void getChoice()
{
System.out.println("  ");
System.out.print("   Enter Your Choice : ");
choice=S.nextInt();
System.out.println("  ");
if(choice==3)
exit();
else
chooseTurn();
}

public void chooseTurn()
{
showTable();
System.out.print("   Who Will Play First P1 Or P2 : ");
int choose=S.nextInt();
System.out.println("  ");
if(choose==1)
play1();
else
play2();
forDraw();
}
 
public void showTable()
{
System.out.println("                               ");
System.out.println("        "+arr[6]+" | "+arr[7]+" | "+arr[8]);
System.out.println("      -----------");
System.out.println("        "+arr[3]+" | "+arr[4]+" | "+arr[5]);
System.out.println("      -----------");
System.out.println("        "+arr[0]+" | "+arr[1]+" | "+arr[2]);
System.out.println("                               ");
}

public void exit()
{
System.out.println("                                  Are Sure Want To Exit ");
System.out.print("                                    1.Yes Or 2.No : ");
int decide=S.nextInt();
System.out.println("  ");
if(1==decide)
System.out.println("                                        Thank You");
else
getChoice();
}

public void play1()
{
int choice;
for(int i=1;i<=9;i++)
{ 
if(v==1)
break;
if(u==2)
break;
choice=i;
switch(choice)  
{ 
case 1: case 3: case 5: case 7: case 9: 
P1();
break;      
case 2:case 4: case 6: case 8: 
P2();
break;
default:
System.out.println("                      EROR 404"); 
}  
count++;
v=resultP1();
if(v==1)
System.out.println("                         P1 Won The Match...!!!"); 
u=resultP2();
if(u==2)
System.out.println("                         P2 Won The Match...!!!");
}
}

public void play2()
{
int choice;
for(int i=1;i<=9;i++)
{ 
if(v==1)
break;
if(u==2)
break;
choice=i;
switch(choice)  
    
{ 
case 1: case 3: case 5: case 7: case 9: 
P2();
break;      
case 2:case 4: case 6: case 8: 
P1();
break;
default:
System.out.println("                      EROR 404");  
}  
count++; 
v=resultP1();
if(v==1)
System.out.println("                         P1 Won The Match...!!!"); 
u=resultP2();
if(u==2)
System.out.println("                         P2 Won The Match...!!!");                                                        
}
}

public void P1()
{
System.out.print("   For P1 Enter Position : ");
int pos=S.nextInt();
arr[pos-1]='X'; 
brr[pos-1]=1;
showTable(); 
}

public void P2()
{
System.out.print("   For P2 Enter Position : "); 
int pos=S.nextInt();                        
arr[pos-1]='O';
brr[pos-1]=2;
showTable();
}

public void forDraw()
{
if(count==9)
{
if(v!=1)
{
if(u!=2)
System.out.println("                               Match Draw ...!!!");
System.out.println("  ");                                            
}}}

public int resultP1()
{
int v=1;
          if(1==(brr[0]&brr[1]&brr[2])) 
          return v;
          else if(1==(brr[3]&brr[4]&brr[5]))
          return v;
          else if(1==(brr[6]&brr[7]&brr[8]))
          return v;
          else if(1==(brr[0]&brr[3]&brr[6]))
          return v;
          else if(1==(brr[1]&brr[4]&brr[7]))
          return v;
          else if(1==(brr[2]&brr[5]&brr[8]))
          return v;
          else if(1==(brr[0]&brr[4]&brr[8]))
          return v;
          else if(1==(brr[2]&brr[4]&brr[6]))
          return v;        
          else
          System.out.println(" ");
          return v=0;
}

public int resultP2()
{
int u=2;
          if(2==(brr[0]&brr[1]&brr[2])) 
          return u;
          else if(2==(brr[3]&brr[4]&brr[5]))
          return u;
          else if(2==(brr[6]&brr[7]&brr[8]))
          return u;
          else if(2==(brr[0]&brr[3]&brr[6]))
          return u;
          else if(2==(brr[1]&brr[4]&brr[7]))
          return u;
          else if(2==(brr[2]&brr[5]&brr[8]))
          return u;
          else if(2==(brr[0]&brr[4]&brr[8]))
          return u;
          else if(2==(brr[2]&brr[4]&brr[6]))
          return u;        
          else
          System.out.println(" ");
          return u=0;
}

}

public class TicTacToe 
{ 
    public static void main(String[] args) 
    {
       TTT T=new TTT();
       T.menu();
       T.getChoice();
    }
    
}
