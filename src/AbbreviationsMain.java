import java.util.*;

public class AbbreviationsMain {
    public static void main(String[] args){
    Abbreviations abbreviations = new Abbreviations();

    abbreviations.addAbbreviation("e.g.", "for example");
    abbreviations.addAbbreviation("etc.", "and so on");
    abbreviations.addAbbreviation("i.e.", "more precisely");
    abbreviations.addAbbreviation("lol", "laugh out loud");
    abbreviations.addAbbreviation("fyi", "for your info");

    String text = "e.g. i.e. etc. lol fyi";

    for (String part : text.split(" ")) {
        if(abbreviations.hasAbbreviation(part)) {
            part = abbreviations.findExplanationFor(part);
        }
    
        System.out.print(part);
        System.out.print(" ");
    }
    
    System.out.println();

    }
}
