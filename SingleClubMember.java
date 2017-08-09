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
public class SingleClubMember extends Member {
    private int club;

    
    public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees) {
        super(pMemberType, pMemberID, pName, pFees);
    } 
    
   /* public SingleClubMember(char pMemberType, Integer pMemberID, String pName, Double pFees) {
        super(pMemberType, pMemberID, pName, pFees);
    } */    
    
    public void setClub(int pClub){
        club = pClub;
    }
    
    public int getClub(){
        return club;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + club;
    }
}
