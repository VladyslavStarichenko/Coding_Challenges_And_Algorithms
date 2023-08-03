package leetcode;

import java.util.*;

public class KeyCardAlert {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        // Map from person name to list of their log times
        Map<String, List<Integer>> logTimes = new HashMap<>();

        for (int i = 0; i < keyTime.length; i++) {
            String name = keyName[i];
            String timeStr = keyTime[i];
            int time = getMinutes(timeStr);
            logTimes.putIfAbsent(name, new ArrayList<>());
            logTimes.get(name).add(time);
        }

        TreeSet<String> overUsedNames = new TreeSet<>();
        for (String name : logTimes.keySet()) {
            List<Integer> times = logTimes.get(name);
            Collections.sort(times);

            for (int i = 0; i < times.size() - 2; i++) {
                int thirdLogTime = times.get(i + 2);
                int currLogTime = times.get(i);
                if (thirdLogTime - currLogTime <= 60) {
                    // i, i+1 and i+2 are within one hour
                    overUsedNames.add(name);
                    break;
                }
            }
        }
        return new ArrayList<>(overUsedNames);
    }

    private int getMinutes(String time) {
        String[] timeArr = time.split(":");
        int hour = Integer.parseInt(timeArr[0]);
        int minute = Integer.parseInt(timeArr[1]);
        return hour * 60 + minute;
    }
}
