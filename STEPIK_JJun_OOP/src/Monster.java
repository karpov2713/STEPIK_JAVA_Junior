public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster() {
        this.eyes = 2;
        this.hands = 2;
        this.legs = 2;
    }

    Monster(int count) {
        this.eyes = count;
        this.hands = count;
        this.legs = count;
    }

    Monster(int eyes, int hands, int legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    void voice(){
        voice(1);
    }

    void  voice(int count){
        voice(count,"Grrrrrrrrrrr...");
    }

    void voice(int count, String word){
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
