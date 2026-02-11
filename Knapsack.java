//implementation of fractional knapsack problem using greedy method
public class Knapsack{
    public static void main (String args []){
        int [] profit = {70,50,30};
        int[] weight = {10,20,30};
        int capacity= 50; 
        int n= weight.length;
        double totalProfit=0;
        double ratio[] = new double[n];
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) profit[i]/weight[i];
            
        }
        for(int i= 0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++){
                if(ratio[i]<ratio[j]){
                    double temp =ratio[i];
                    ratio[i]=ratio[j];
                    ratio[j]=temp;
                    int t =weight[i];
                    weight[i]=weight[j];
                    weight[j]= t;
                    t= profit[i];
                    profit[i]= profit[j];
                    profit[j]= t;
                }
            }
        }
        for (int i = 0; i <n;i++){
            if(capacity>=weight[i]){
                totalProfit=totalProfit+profit[i];
                capacity=capacity-weight[i];
            }
            else{
                totalProfit=totalProfit+ratio[i]*capacity;
                break;
            }
        }
        System.out.println("maximum profit="+totalProfit);
        }
    }
