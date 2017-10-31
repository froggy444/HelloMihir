package insight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateFileProcessor {


    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }
public String Output;
    private int total_count=1;

    public Map<CampaignByDate, CampaignValue> processDate(Campaign input, Map<CampaignByDate, CampaignValue> CampaignByDateMap) {
        List<Integer> amountList = new ArrayList<Integer>();
        DateFileProcessor DateFileProcessor = new DateFileProcessor();
        CampaignByDate CampaignByDate = new CampaignByDate(input.getCmpid(),input.getdate() );
       // AppendToFileExample appendToFileExample = new AppendToFileExample();
        //CampaignByDate campaignByDate=new CampaignByDate();
        WriteDate writeDate=new WriteDate();
        if (input.getCmpid() != null && input.getdate() != null) {

            if (!CampaignByDateMap.containsKey(CampaignByDate)) {
                CampaignValue campaignValue = new CampaignValue(1,
                        0,Integer.parseInt(input.getamount()));
                CampaignByDateMap.put(CampaignByDate, campaignValue);
            } else {
                Integer newRunningCount = CampaignByDateMap.get(CampaignByDate).getRunningCount() + 1;
                Integer newTotalContribution = Integer.parseInt(input.getamount()) +
                        CampaignByDateMap.get(CampaignByDate).getTotalContributionAmount();
                CampaignValue campaignValue = new CampaignValue(newRunningCount,
                        0,newTotalContribution);
                CampaignByDateMap.put(CampaignByDate,campaignValue);
                //CampaignByDate.setTotalContributionAmt(CampaignByDate.getTotalContributionAmt() +
                //Integer.parseInt(input.getamount()));

            }
            int runningCount = CampaignByDateMap.get(CampaignByDate).getRunningCount();
            int totalContribution = CampaignByDateMap.get(CampaignByDate).getTotalContributionAmount();
            DateFileProcessor.setTotal_count(runningCount);
            //campaignByDate.setTotalContributionAmt(totalContribution);
            System.out.println("Running Count is" +runningCount);
            System.out.println("Running Total Contribution is" +totalContribution);

          /* Output = input.getCmpid() + "|" +input.getdate()+"|"+CampaignByDateMap.get(CampaignByDate).getRunningCount()+"|"+
                 +CampaignByDateMap.get(CampaignByDate).getTotalContributionAmount();
            writeDate.WriteFile1(Output);*/



            return CampaignByDateMap;
           // CampaignByDate campaignByDate=new CampaignByDate();
        } //String Output = input.getCmpid() + "|" +input.getdate()+"|"+getTotal_count()+"|"
               // +campaignByDate.getTotalContributionAmt();


        return null;
    }

}