package chapter12.collections;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member() {}

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return this.memberId == member.memberId;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {//나와넘어온애 비교
        //return -(this.memberId - member.memberId) ; //    오름차순(내가더컸을때)

        return -(this.memberName.compareTo((member.memberName)));
    }

    @Override
    public int compare(Member member1, Member member2) {    //member1이 나고 member2가 넘어온애
        return  (member1.memberId - member2.memberId);
    }
}
