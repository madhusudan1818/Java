//implementation of job sequencing with deadlines using greedy method
public class JobSequence{
    public static void main (String args[]){
        char job[]= {'a','b','c'};
        int profit[]={100,19,27};
        int deadline[]={2,1,3};
        int n = job.length;
        boolean slot[]= new boolean[n];
        char result[] = new char[n];
        int totalProfit = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               if(profit[i] < profit[j]){
                int t= profit[i];
                profit[i] = profit[j];
                profit[j] = t;
                t = deadline[i];
                deadline[i] = deadline[j];
                deadline[j] = t;
                char c = job[i];
                job[i] = job[j];
                job[j] = c;
               }

            }
        }
        for (int i = 0;i< n;i++){
            for(int j=deadline[i]-1;j>=0;j--){
                if(!slot[j]){
                    slot[j]=true;
                    result[j] = job[i];
                    totalProfit=totalProfit+profit[i];
                    break;
                }
            }
        }
        System.out.print("jobs:");
        for(int i=0;i<n;i++){
            if(slot[i]){
                System.out.print(result[i]+" ");
            }
        }
        System.out.println("\nprofit = "+totalProfit);
    }
}
