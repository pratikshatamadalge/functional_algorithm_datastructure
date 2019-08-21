package com.bridgelabz.functional_program;
import com.bridgelabz.utility.InputScanner;

//import org.w3c.dom.ranges.RangeException;

//import java.awt.font.NumericShaper.Range;
import java.util.Random;
public class TicTacToe {
	public static void main(String[]args)
	{
		Random rand=new Random();
		int r,c,m,n;
		boolean flag = false;
		int count1=0,count2=0,chance=0;

		System.out.println("Enter the value of row");
		r=InputScanner.intInput();
		System.out.println("Enter the value of column");
		c=InputScanner.intInput();

		int a[][]=new int[r][c];

		for(m=0;m<r;m++)
		{
			for(n=0;n<c;n++)
			{
				if(flag==false && chance<=9)
				{
					System.out.println("User:Enter the value of row ");
					m=InputScanner.intInput();

					System.out.println("User:Enter the value coulmn");
					n=InputScanner.intInput();

					while(a[m][n]!=0)
					{
						System.out.println("Previous entered value is already used Enter again");
						System.out.println("User:Enter the value of row ");
						m=InputScanner.intInput();

						System.out.println("User:Enter the value coulmn");
						n=InputScanner.intInput();

					}
					a[m][n]='*';

					chance++;
					System.out.print("***********************************************");
					System.out.println("\n");

					for(int x=0;x<r;x++)
					{
						for(int y=0;y<c;y++)
						{
							System.out.print(a[x][y]+"\t");
						}
						System.out.println("\n");
					}
					System.out.print("***********************************************");
					System.out.print("\n");


					System.out.println("System:Enter the value of row");
					m=rand.nextInt(2);

					System.out.println("System:Enter the value of coulmn");
					n=rand.nextInt(2);

					while(a[m][n]!=0)
					{
						System.out.println("Previous entered value is already used Enter again");

						System.out.println("System:Enter the value of row ");
						m=rand.nextInt(2);

						System.out.println("System:Enter the value coulmn");
						n=rand.nextInt(2);

					}
					a[m][n]='$';

					chance++;
					System.out.print("***********************************************");
					System.out.println("\n");

					for(int x=0;x<r;x++)
					{
						for(int y=0;y<c;y++)
						{
							System.out.print(a[x][y]+"\t");
						}
						System.out.println("\n");
					}
					System.out.print("***********************************************");
					System.out.println("\n");

					//**************case1:rows constant column variable************************
					//row 1 constant
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							if(i==0 && flag==false)
							{
								int x=i;
								for(int y=0;y<c;y++)
								{
									if(a[x][y]=='*')
									{
										count1++;
									}
									else if(a[x][y]=='$')
									{
										count2++;
									}
									else
									{
										count1=0;
										count2=0;
									}
								}
								if(count1==3)
								{
									System.out.println("User:win the game");
									flag=true;
								}
								else if(count2==3)
								{
									System.out.println("System:win the game");
									flag=true;
								}
								else
								{
									count1=0;
									count2=0;
									flag=false;

								}
							}
							else if(i==1 && flag==false)
							{
								int x=i;
								for(int y=0;y<c;y++)
								{
									if(a[x][y]=='*')
									{
										count1++;
									}
									else if(a[x][y]=='$')
									{
										count2++;
									}
									else
									{
										count1=0;
										count2=0;
									}
								}
								if(count1==3)
								{
									System.out.println("User:win the game");
									flag=true;
									break;
								}
								else if(count2==3)
								{
									System.out.println("System:win the game");
									flag=true;
									break;
								}
								else
								{
									count1=0;
									count2=0;
									flag=false;
								}
							}
							
							 if(i==2 && flag==false)
							{
								int x=i;
								for(int y=0;y<c;y++)
								{
									if(a[x][y]=='*')
									{
										count1++;
									}
									else if(a[x][y]=='$')
									{
										count2++;
									}
									else
									{
										count1=0;
										count2=0;
									}
								}
								if(count1==3)
								{
									System.out.println("User:win the game");
									flag=true;
									break;
								}
								else if(count2==3)
								{
									System.out.println("System:win the game");
									flag=true;
									break;
								}
								else
								{
									count1=0;
									count2=0;
									flag=false;
								}
							}
						}
					}
					//*********************case2:column constant row variable**********************
					//column constant
					//column 0 constant
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{

							if(j==0 && flag==false)
							{

								if(a[i][j]=='*')
								{
									count1++;
								}
								else if(a[i][j]=='$')
								{
									count2++;
								}
								else
								{
									count1=0;
									count2=0;
								}
							}

							//							if(count1==3)
							//							{
							//								System.out.println("User:win the game");
							//								flag=true;
							//								break;
							//							}
							//							else if(count2==3)
							//							{
							//								System.out.println("System:win the game");
							//								flag=true;
							//								break;
							//							}
							//							else
							//							{
							//								count1=0;
							//								count2=0;
							//								flag=false;
							//							}
							 if(j==1 && flag==false)
							{
								if(a[i][j]=='*')
								{
									count1++;
								}
								else if(a[i][j]=='$')
								{
									count2++;
								}
								else
								{
									count1=0;
									count2=0;
								}
							}

							//								if(count1==3)
							//								{
							//									System.out.println("User:win the game");
							//									flag=true;
							//									break;
							//								}
							//								else if(count2==3)
							//								{
							//									System.out.println("System:win the game");
							//									flag=true;
							//									break;
							//								}
							//								else
							//								{
							//									count1=0;
							//									count2=0;
							//									flag=false;
							//								}

							else if(j==2 && flag==false)
							{
								if(a[i][j]=='*')
								{
									count1++;
								}
								else if(a[i][j]=='$')
								{
									count2++;
								}
								else
								{
									count1=0;
									count2=0;
								}
							}

							if(count1==3)
							{
								System.out.println("User:win the game");
								flag=true;
								break;
							}
							else if(count2==3)
							{
								System.out.println("System:win the game");
								flag=true;
								break;
							}
							else
							{
								count1=0;
								count2=0;
								flag=false;
							}
						}
					}
				}
				//************case3:row number is equal to column number**********************

				for(int x=0;x<r;x++)
				{
					for(int y=0;y<c;y++)
					{
						if(x==y)
						{
							if(a[x][y]=='*')
							{
								count1++;
							}
							else if(a[x][y]=='$')
							{
								count2++;
							}
							else
							{
								count1=0;
								count2=0;
							}
						}
					}
				}
				if(count1==3)
				{
					System.out.println("User:win the game");
					flag= true;
					break;
				}
				else if(count2==3)
				{
					System.out.println("System:win the game");
					flag =true;
					break;
				}
				else
				{
					count1=0;
					count2=0;
					flag=false;
				}

				//****************case4:row number and column numbers are reverse***********

				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						if(i==0 && j==2)
						{
							if(a[i][j]=='*')
							{
								count1++;
							}
							else if(a[i][j]=='$')
							{
								count2++;
							}
							else
							{
								count1=0;
								count2=0;
							}
						}
						if(i==1 && j==1)
						{
							if(a[i][j]=='*')
							{
								count1++;
							}
							else if(a[i][j]=='$')
							{
								count2++;
							}
							else
							{
								count1=0;
								count2=0;
							}
						}
						if(i==2 && j==0)
						{
							if(a[i][j]=='*')
							{
								count1++;
							}
							else if(a[i][j]=='$')
							{
								count2++;
							}
							else
							{
								count1=0;
								count2=0;
							}
						}


						if(count1==3)
						{
							System.out.println("User:win the game");
							flag=true;
							break;
						}
						else if(count2==3)
						{
							System.out.println("System:win the game");
							flag=true;
							break;
						}
						else
						{
							count1=0;
							count2=0;
							flag=false;
						}
					}
				}
			}
		}
	}
}