package Stories;

public class Word {
 private String value;
 private String partSentence;

    public void setValue(String value){
        this.value = value;
    }

    public void setPartSentence(String partSentence){
        this.partSentence = partSentence;
    }

    public String getValue (){
        return value;
    }

    public String getPartSentence (){
        return partSentence;
    }
}
