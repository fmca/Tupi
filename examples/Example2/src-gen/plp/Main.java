package plp;

import java.util.ArrayList;
import java.util.List;
import plp.PrinterLimited;

@SuppressWarnings("all")
public class Main {
  protected List _states = new ArrayList();
  
  protected String _currentState = "";
  
  protected boolean _match(final String... statesToMatch) {
    boolean matched = false;
    if(statesToMatch!=null){
    	boolean newMatched = false;
    	for(String s : statesToMatch){
    		if(s.equals("*")){ 
    			newMatched = true; 
    		}else if(s.startsWith("*")){
    			if(s.endsWith("*")){
    				newMatched = _currentState.contains(s); 
    			}else{
    				newMatched = _currentState.endsWith(s.substring(1));	
    			}	
    		}else{
    			if(s.endsWith("*")){
    				newMatched = _currentState.startsWith(s.substring(0, s.length()-1));	
    			}else{
    				newMatched = _currentState.equals(s);	
    			}
    		}
    		matched = matched || newMatched;
    		//matched = matched || java.util.regex.Pattern.matches(s, _currentState);
    	}
    }else{
    	matched = true; //Class not yet initialized
    }
    return matched;
  }
  
  public PrinterLimited print;
  
  public static void main(final String[] args) {
    new Main ();
  }
  
  public Main() {
    _states.add("init");
    if(_match("*")){
    	if(true){
    		_currentState="init";
    		print = new PrinterLimited (); 
    		
    		print. PRINT ();
    		
    		return;
    	}
    }
    
  }
}
