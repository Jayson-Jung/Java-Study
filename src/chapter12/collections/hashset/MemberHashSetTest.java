package chapter12.collections.hashset;

import chapter12.collections.Member;
import chapter12.collections.arraylist.MemberArrayList;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberShin);

        memberHashSet.showAll();

        Member memberLee2 = new Member(101, "이몽룡");
        memberHashSet.addMember(memberLee2);
        System.out.println("");
        //memberHashSet.removeMember(memberKim.getMemberId());

        memberHashSet.showAll();
    }
}
