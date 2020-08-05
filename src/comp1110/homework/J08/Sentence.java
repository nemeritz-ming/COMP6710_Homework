package comp1110.homework.J08;

public class Sentence {
    public Word[] words;
    public Sentence(int size){
        this.words = new Word[size];
    }
    public boolean isValid(){
        if (words.length < 1){return false;} // check length
        int onlyone = 0;
        for (Word word : words) {
            if (word.type == Word.Type.VERB) {
                onlyone = onlyone + 1;
            }
        }
        if(onlyone != 1){return false;} //check # of verbs
        for (int i = 0; i < words.length-1; i++){
            if (words[i].type == Word.Type.NOUN && words[i+1].type != Word.Type.VERB){
                return false; // check rule 2
            }
            else if (words[i].type == Word.Type.ADJECTIVE && words[i+1].type != Word.Type.ADJECTIVE && words[i+1].type != Word.Type.NOUN){return false;}
        }
        return words[words.length - 1].type == Word.Type.NOUN || words[words.length - 1].type == Word.Type.VERB;
    }
    public static class Word{
        String value;
        public Type type;
        public enum Type{NOUN,ADJECTIVE,VERB}
        public Word(String value,Type type){
            this.type = type;
            this.value = value;
        }
    }
}

