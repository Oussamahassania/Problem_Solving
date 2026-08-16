
    public boolean isValid(String s) { 
        boolean flag = false; 
        int counter = 0;
        Stack<Character> stack  = new Stack<>();

        for (int i = 0; i < s.length(); i++) { 
            char current = s.charAt(i); 

            if (current == '(' || current == '[' || current == '{' ) { 
                stack.push(current);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(  current == ')' && open!='('
                  || current == ']' && open!='['
                  || current == '}' && open!='{'){
                    return false;
                  }
                  
                
      

           
        } 

        return stack.isEmpty(); 
    } 
}
