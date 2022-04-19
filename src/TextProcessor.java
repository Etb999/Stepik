public class TextProcessor {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for (TextAnalyzer analyzer : analyzers){
            if ( analyzer.processText(text) != Label.OK){
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    abstract class KeyWordAnalyzer implements TextAnalyzer{

        abstract protected String[] getKeywords();

        abstract protected Label getLabel();

    }

    class SpamAnalyzer extends KeyWordAnalyzer{

        private String[] keywords;
        Label label = Label.SPAM;

        public SpamAnalyzer(String[] keywords){
            this.keywords = keywords;
        }

        @Override
        public Label processText(String text){
            for ( String s : getKeywords()){
                if( (s.indexOf(" " + s + " "))  > -1){
                    return label;
                }
            }
            return Label.OK;
        }

        @Override
        public Label getLabel(){
            return label;
        }
        @Override
        public String[] getKeywords(){
            return keywords;
        }
    }

    class NegativeTextAnalyzer extends KeyWordAnalyzer{

        private String[] keywords = {":(", "=(", ":|"};
        Label label = Label.NEGATIVE_TEXT;

        public NegativeTextAnalyzer(){
        }

        @Override
        public Label processText(String text){
            for ( String s : getKeywords()){
                if( (s.indexOf(" " + s + " "))  > -1){
                    return label;
                }
            }
            return Label.OK;
        }

        @Override
        public Label getLabel(){
            return label;
        }
        @Override
        public String[] getKeywords(){
            return keywords;
        }
    }

    class TooLongTextAnalyzer implements TextAnalyzer{

        private int maxLength;
        Label label = Label.TOO_LONG;

        public TooLongTextAnalyzer(int maxLength){
            this.maxLength = maxLength;
        }

        @Override
        public Label processText(String text){
            if (text.length() > maxLength){
                return label;
            }
            return Label.OK;
        }
    }

}
