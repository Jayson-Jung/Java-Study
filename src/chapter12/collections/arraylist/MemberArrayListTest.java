package chapter12.collections.arraylist;

import chapter12.collections.Member;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);

        memberArrayList.showAll();      //ArrayList자체의 ToString도 구현되어있다. (모든멤버의 toString에 comma)

        System.out.println("");
        memberArrayList.removeMember(memberKim.getMemberId());

        memberArrayList.showAll();
    }
}
