class Solution {
    public int romanToInt(String s) {
        
    int decimal[] = new int[s.length()];
        
    String romanNumeral = s.toUpperCase();
    for(int i = 0; i<romanNumeral.length(); i++)
    {
        char convertToDecimal = s.charAt(i);

        switch (convertToDecimal)
        {
        case 'M':
            decimal[i] = 1000;
            break;

        case 'D':
            decimal[i] = 500;
            break;

        case 'C':
            decimal[i] = 100;
            break;

        case 'L':
            decimal[i] = 50;
            break;

        case 'X':
            decimal[i] = 10;
            break;

        case 'V':
            decimal[i] = 5;
            break;

        case 'I':
            decimal[i] = 1;
            break;
        }
    }
	    int sum = 0;
	    for(int i=0; i<decimal.length-1; i++){
	        if(decimal[i] < decimal[i+1])
	            sum -= decimal[i];
	        else
	            sum += decimal[i];
	    }
         
	    return sum + decimal[decimal.length-1];
        
    }
}