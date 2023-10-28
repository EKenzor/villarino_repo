class TableAndChairs {
   public static void main(String[ ] args){
   int n = 5;
   
   //Print the seat
   for(int i = 1; i < n ; i++){
      for(int j = 1; j <= n; j++){
         if(j == 1 || i == n-1)  
            System.out.print("X");
         else 
            System.out.print("  ");
      }
      System.out.println();
   }
   
   // Print the chair legs
   for(int i = 0; i < 2; i++){
         for(int j = 1; j <= n; j++){
         if(j == 1 || j == 3)
            System.out.print("X ");
            else
            System.out.print("  ");
         }
         System.out.println();
      }
      
    
   }
}