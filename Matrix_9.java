class Matrix_9
{ 
       static  
   	 {    
        	System.out.println("TOFIK MULTANI");
        	System.out.println("MCA");
        	System.out.println("Roll : 35"); 
    	}

        public static void main(String[] args)  
    	{ 
        int[][] a={{8,9},{2,8}}; 
        int[][] b={{12,18},{7,18}}; 
        int[][] sum=new int[a.length][a[0].length]; 
        int[][] multi=new int[a.length][a[0].length]; 
        //Sum 
        for(int i=0;i<a.length;i++) 
        { 
            for(int j=0;j<a[i].length;j++) 
            { 
                sum[i][j]=a[i][j]+b[i][j]; 
            } 
        }       
        System.out.print("Matrix Addtion\n"); 
        for(int i=0;i<a.length;i++) 
        { 
            for(int j=0;j<a[i].length;j++)  { 
                System.out.print(sum[i][j]+" "); 
            } 
            System.out.println(""); 
        }     
        for(int i=0;i<a.length;i++) 
        { 
            for(int j=0;j<a[i].length;j++) 
            { 
                multi[i][j]=0; 
                for(int k=0;k<b[i].length;k++) 
                { 
                    multi[i][j]+=a[i][k]*b[k][j]; 
                } 
            } 
        }    
        System.out.print("Matrix Multiplication\n"); 
        for(int i=0;i<a.length;i++) 
        { 
            for(int j=0;j<a[i].length;j++) 
            { 
                System.out.print(multi[i][j]+" "); 
            } 
            System.out.println(""); 
        } 
        } 
}