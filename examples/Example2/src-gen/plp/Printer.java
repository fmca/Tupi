package plp;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Printer {
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
  
  public String message;
  
  protected boolean guard_canPrint() {
    return true;
  }
  
  public Printer() {
    _states.add("printReady");
    if(_match("*")){
    	if(true){
    		action_initialize(); 
    		_currentState="printReady";
    		return;
    	}
    }
    
  }
  
  public void PRINT() {
    if(_match("print*")){
    	if(guard_canPrint()){
    		action_print(); 
    		_currentState="printReady";
    		 PRINT ();
    		
    		return;
    	}
    }
    
  }
  
  protected void action_initialize() {
    this.message = "Hello World";
  }
  
  protected void action_print() {
  }
}
