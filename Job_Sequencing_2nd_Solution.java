import java.util.*;

public class Job_Sequencing_2nd_Solution {
    public static void main(String[] args) {

        int[][] jobs = {{4,20},{1,10},{1,40},{1,30}};

        Arrays.sort(jobs, (a,b) -> b[1] - a[1]);

        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>();

        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i][0] > time) {
                seq.add(i);
                time++;
            }
        }

        System.out.println("Max jobs: " + seq.size());
        System.out.println(seq);
    }
}

