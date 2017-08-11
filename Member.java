/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author GAlipui
 */
public class Member {

 private char memberType; 
 int memberID; 
 String name; 
 double fees;

  public Member(char pMemberType, int pMemberID, String pName, double pFees){

 memberType = pMemberType;

 memberID = pMemberID;

 name = pName;

 fees = pFees;
  }
  
public void setMemberType(char pMemberType)
{
   memberType = pMemberType;
}

public char getMemberType()
{
  return memberType;
}

public void setmemberID(int pMemberID)
{
  memberID =pMemberID;
}

public int getMemberID()
{
  return memberID;
}


public void setname(String pName)
{
 name = pName;
}

public String getname()
{
 return name;
}


public void setFees(double pFees)
{
 fees = pFees;
}

public double getFees()
{
  return fees;

}

@Override

public String toString()
{
  return  memberType + ", "  + memberID + ", " + name + ", " + fees;
}

}
