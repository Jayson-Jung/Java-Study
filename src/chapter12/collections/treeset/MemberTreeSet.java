package chapter12.collections.treeset;

import chapter12.collections.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>(new Member());      //comparator를 위해선 new Member()을 넣어줘야한다.
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {

        /*for( int i = 0;i<arrayList.size();i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if( memberId == tempId) {
                arrayList.remove(i);
                return true;
            }
        }*/

        Iterator<Member> iterator = treeSet.iterator();
        while( iterator.hasNext()) {
            Member member = iterator.next();

            int tempId = member.getMemberId();
            if( memberId == tempId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {

        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println(treeSet);
    }
}
