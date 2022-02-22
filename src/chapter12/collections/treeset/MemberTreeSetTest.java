package chapter12.collections.treeset;

import chapter12.collections.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberShin);

        memberTreeSet.showAll();

        Member memberLee2 = new Member(101, "이몽룡");
        memberTreeSet.addMember(memberLee2);
        System.out.println("");
        //memberHashSet.removeMember(memberKim.getMemberId());

        memberTreeSet.showAll();
    }
}
