package insight;

public class CampaignValue {
    private int runningCount;
    private int runningMedian;
    private int totalContributionAmount;

    public CampaignValue(int runningCount, int runningMedian, int totalContributionAmount) {
        this.runningCount = runningCount;
        this.runningMedian = runningMedian;
        this.totalContributionAmount = totalContributionAmount;
    }


    public int getTotalContributionAmount() {
        return totalContributionAmount;
    }

    public void setTotalContributionAmount(int totalContributionAmount) {
        this.totalContributionAmount = totalContributionAmount;
    }



    public int getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(int runningCount) {
        this.runningCount = runningCount;
    }

    public int getRunningMedian() {
        return runningMedian;
    }

    public void setRunningMedian(int runningMedian) {
        this.runningMedian = runningMedian;
    }


}
