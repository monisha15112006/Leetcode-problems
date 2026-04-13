class Solution {
    
    public int romanToInt(String s) {
        int len = s.length();
        int x = 0;
        for (int i = 0; i < len; i++){
            char current = s.charAt(i);
            char next = ' ';
            if(!(i == (len - 1)))
            {
                next = s.charAt(i + 1);
            }
            switch (current){
                case 'V':
                    x += 5;
                    break;
                case 'L':
                    x += 50;
                    break;
                case 'D':
                    x += 500;
                    break;
                case 'M':
                    x += 1000;
                    break;
                case 'I':
                    if (next == 'V' || next == 'X'){
                        x -= 1;
                    }
                    else{
                        x += 1;
                    }
                    break;
                case 'X':
                    if (next == 'L' || next == 'C'){
                        x -= 10;
                    }
                    else{
                        x += 10;
                    }
                    break;
                case 'C':
                    if (next == 'D' || next == 'M'){
                        x -= 100;
                    }
                    else{
                        x += 100;
                    }
                    break;
            }
        }
        return x;
    }
}
