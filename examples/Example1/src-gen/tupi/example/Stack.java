package tupi.example;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Stack {
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
  
  public List list;
  
  protected boolean guard_hasMore0Elem() {
    int _size = this.list.size();
    boolean _greaterThan = (_size > 0);
    return _greaterThan;
  }
  
  public Stack() {
    _states.add("empty");
    _states.add("notempty");
    if(_match("*")){
    	if(true){
    		action_initList(); 
    		_currentState="empty";
    		return;
    	}
    }
    
  }
  
  public void PUSH(final Object obj) {
    if(_match("*empty")){
    	if(true){
    		action_push(obj); 
    		_currentState="notempty";
    		return;
    	}
    }
    
  }
  
  public void POP() {
    if(_match("notempty")){
    	if(guard_hasMore0Elem()){
    		action_pop(); 
    		_currentState="notempty";
    		return;
    	}
    }
    
    if(_match("notempty")){
    	if(true){
    		action_pop(); 
    		_currentState="empty";
    		return;
    	}
    }
    
  }
  
  protected void action_initList() {
    ArrayList<Object> _arrayList = new ArrayList<Object>();
    this.list = _arrayList;
  }
  
  protected void action_push(final Object obj) {
    this.list.add(obj);
  }
  
  protected void action_pop() {
    int _size = this.list.size();
    int _minus = (_size - 1);
    this.list.remove(_minus);
  }
}
