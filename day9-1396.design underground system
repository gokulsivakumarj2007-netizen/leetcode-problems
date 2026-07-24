import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    // Helper class to store check-in details
    private static class CheckIn {
        String stationName;
        int time;

        CheckIn(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    // Helper class to aggregate travel time and trip counts
    private static class RouteData {
        double totalTime;
        int tripCount;

        RouteData(double totalTime, int tripCount) {
            this.totalTime = totalTime;
            this.tripCount = tripCount;
        }
    }

    private final Map<Integer, CheckIn> checkIns;
    private final Map<String, RouteData> routeStats;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        routeStats = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkInInfo = checkIns.remove(id);
        String routeKey = checkInInfo.stationName + "->" + stationName;
        int travelTime = t - checkInInfo.time;

        RouteData stats = routeStats.getOrDefault(routeKey, new RouteData(0, 0));
        stats.totalTime += travelTime;
        stats.tripCount += 1;
        routeStats.put(routeKey, stats);
    }

    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "->" + endStation;
        RouteData stats = routeStats.get(routeKey);
        return stats.totalTime / stats.tripCount;
    }
}
