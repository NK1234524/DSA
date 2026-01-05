import java.util.*;

public class Activity_Selection_Sorted {
    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[]   = {2, 4, 6, 7, 9, 9};

        // STEP 1: store activities
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;        // index
            activities[i][1] = start[i]; // start
            activities[i][2] = end[i];   // end
        }

        // STEP 2: sort by end time
        //Lamda Function
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
//here comparator is non another then an interface 
        // STEP 3: greedy selection
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i < activities.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        // OUTPUT
        System.out.println("Max activities = " + maxAct);
        for(int idx : ans) {
            System.out.print("A" + idx + " ");
        }
    }
}
