class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // Any 2 points will always form a straight line
        if (coordinates.length <= 2) {
            return true;
        }
        
        // Establish baseline run and rise using the first two points
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        
        int dx = x1 - x0;
        int dy = y1 - y0;
        
        // Check if every subsequent point satisfies the cross-multiplied slope formula
        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            
            // If cross multiplication does not yield equal values, slopes do not match
            if (dy * (xi - x0) != dx * (yi - y0)) {
                return false;
            }
        }
        
        return true;
    }
}
