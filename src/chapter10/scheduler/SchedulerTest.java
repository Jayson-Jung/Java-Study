package chapter10.scheduler;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        System.out.println("전화 당담 배분방식을 선택하세요. R, L, P");

        int ch = System.in.read();
        Scheduler scheduler;

        if( ch == 'R' || ch == 'r' ) {
            scheduler = new RoundRobin();
        }
        else if ( ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        }
        else if( ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
