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
public class MultiClubMember extends Member {
    
    private int membershipPoints;
    
    public MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMemberShipPoints) {
        super(pMemberType, pMemberID, pName, pFees);
    }

    public void setMembershipPoints(int pMembershipPoints){
        membershipPoints = pMembershipPoints;
    }
    
    public int getMembershipPoints()
    {
        return membershipPoints;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + membershipPoints;
    } 
    
}
