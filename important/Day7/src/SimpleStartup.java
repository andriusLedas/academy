public class SimpleStartup {
    int[] locationCells = new int[3];
    int numHits = 0;

    public void setLocationCells(int[] locationSells) {
        this.locationCells = locationSells;
    }

    public String checkYourself(int guess) {
        String result = "miss";
        for (int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]) {
                result = "hit";
                numHits++;
                locationCells[i] = -1;
                break;
            }
        }
        if (numHits == locationCells.length)
            result = "kill";
        return result;
    }
}
