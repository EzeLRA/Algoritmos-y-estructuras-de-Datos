package Practica1.TP1.ej8;

public class ej8 {
    
    private static boolean contains(char[] array, char c) {
        boolean result = false;
		
        for (char e : array) {
            if (e==c) {
                result = true;
		break;
            }
	}
	return result;
    }
    
    public static boolean isBalanced(String string) {
		char[] carray =  string.toCharArray();
		char[] openChars = {'(','{','['};
		int i;
		Stack<Character> stack;
                stack = new Stack();
		
		for (i=0;i<carray.length;i++) {
                    char current =  carray[i];
			
                    if (contains(openChars, current)) {
                        stack.push(carray[i]);
                    } else {
                        char c = stack.pop();
                        switch (c) {
                            case '(':
                                if (carray[i] != ')') return false;
				break;
                            case '{':
                                if (carray[i] != '}') return false;
                                break;
                            case '[':
                                if (carray[i] != ']') return false;
                                break;
                            default:
                                return false;
				
                        }	
                    }
		}
		
		return stack.isEmpty();
	}
    
    public static void main(String[] args) {
        
        
    }
    
}
