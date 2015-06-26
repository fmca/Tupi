package plp;

import org.eclipse.xtext.xbase.lib.InputOutput;
import plp.Printer;

@SuppressWarnings("all")
public class PrinterLimited extends Printer {
  public int limit;
  
  protected boolean guard_canPrint() {
    boolean _lessThan = (this.limit < 10);
    return _lessThan;
  }
  
  protected void action_print() {
    String _plus = ("Hello from Limited: " + Integer.valueOf(this.limit));
    InputOutput.<String>println(_plus);
    int _plus_1 = (this.limit + 1);
    this.limit = _plus_1;
  }
}
