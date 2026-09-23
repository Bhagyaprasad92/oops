public class Student {
    private String name;
    private int score;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Invalid score! Must be between 0 and 100.");
        }
    }

    public int getScore() {
        return this.score;
    }
}