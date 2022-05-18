/*
Create a class Abbreviations for managing common abbreviations. The class must have a constructor, which does not take any parameters. The class must also provide the following methods:

public void addAbbreviation(String abbreviation, String explanation) adds a new abbreviation and its explanation.
public boolean hasAbbreviation(String abbreviation) checks if an abbreviation has already been added; returns true if it has and false if it has not.
public String findExplanationFor(String abbreviation) finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
*/
import java.util.*;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if (this.abbreviations.containsKey(abbreviation)){
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation){
            if(this.abbreviations.containsKey(abbreviation)){
                return this.abbreviations.get(abbreviation);
            } else {
                return null;
            }
    }
}
