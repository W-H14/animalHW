package smyrna;

public class Animal {
    public int avgWeight;
    public String[] description = {"", "", ""};
    public String sound;

    public void printAnimalSound() {
        System.out.println(this.sound);
    }

    public void printDescription() {
        for (int i = 0; i < this.description.length; i++) {
            if (!this.description[i].isEmpty()) {
                System.out.println(this.description[i]);
            }
        }
    }

    public void setDescription(String[] newDescription) {
        if (newDescription.length == this.description.length) {
            for (int i = 0; i < this.description.length; i++) {
                this.description[i] = newDescription[i];
            }
        }
    }
}