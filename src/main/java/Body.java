public class Body {
    public int torso;
    public int rArm;
    public int lArm;
    public int lLeg;
    public int head;

    public Body() {
    }

    public int getTorso() {
        return torso;
    }

    public void setTorso(int torso) {
        this.torso = torso;
    }

    public int getrArm() {
        return rArm;
    }

    public void setrArm(int rArm) {
        this.rArm = rArm;
    }

    public int getlArm() {
        return lArm;
    }

    public void setlArm(int lArm) {
        this.lArm = lArm;
    }

    public int getlLeg() {
        return lLeg;
    }

    public void setlLeg(int lLeg) {
        this.lLeg = lLeg;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Body{" +
                "torso=" + torso +
                ", rArm=" + rArm +
                ", lArm=" + lArm +
                ", lLeg=" + lLeg +
                ", head=" + head +
                '}';
    }
}

