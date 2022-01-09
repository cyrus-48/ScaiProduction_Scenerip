package cat210;


public enum ItemType{
AU("AUDIO"),VI("VISUAL"),AM("AUDIOMOBILE"), VM("VISUALMOBILE");
//enum constant
private final String code;
 
ItemType(String code){
this.code = code;
}
/* Overrides toString and allows the programmer to use the enum
   */
@Override
public String toString(){
     return code;
}
}