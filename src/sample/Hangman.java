package sample;



public class Hangman {
    private int count ; //anatomy
    private String target ;
    //  private int answer ;
    private char[] guess;

    public Hangman(String target) {
        this.target = target.toLowerCase();
        count = 6;
        //  answer = target.length;
        this.guess = new char[target.length()];
        for(int i =0;i<this.guess.length;i++){
            this.guess[i]='_';
        }

    }

    public void check(char guess){
        boolean isCorrect = false;
        for (int i = 0; i < target.length() ; i++) {
            if(target.charAt(i) == guess){
                this.guess[i]=guess;
                isCorrect = true;
            }
        }
        if(!isCorrect) count--;
    }


    public String draw(){
        String temp="";
        for(int i =0;i<this.guess.length;i++){
            temp += guess[i]+" ";
        }
        return temp;
    }

    public boolean isWin(){
        for(int i =0;i<this.target.length();i++){
            if(this.target.charAt(i) != this.guess[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isLose(){
        if(this.count <= 0){
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }
}