package ca.ciccc.wmad202.project.TheCastleCompany;

import java.util.ArrayList;

public class Sequence {
    protected int[] sequence;

    public Sequence(int[] sequence) {
        this.sequence = RemoveContinuous.removeContinuous(sequence);
    }

    // return the number of Castle
    public int getNumberOfCastle() {
        int castle = 0;
        castle += getPeak(this.sequence);
        castle += getValley(this.sequence);
        return castle;
    }

    private int getPeak(int[] peakOfSequence) {
        int peak = 0;
        ArrayList<Integer> continuous = new ArrayList<>();

        for (int i = 0; i < peakOfSequence.length; i++) {
            int number = peakOfSequence[i];
            if (i != 0 && i != peakOfSequence.length - 1) {
                int preceding = peakOfSequence[i - 1];
                int following = peakOfSequence[i + 1];
                if (number > preceding && number > following) {
                    peak += 1;
                }
            }
        }

        return peak;
    }

    private int getValley(int[] valleyOfSequence) {
        int valley = 0;

        for (int i = 0; i < valleyOfSequence.length; i++) {
            int number = valleyOfSequence[i];
            if (i != 0 && i != valleyOfSequence.length - 1) {
                int preceding = valleyOfSequence[i - 1];
                int following = valleyOfSequence[i + 1];
                if (number < preceding && number < following) {
                    valley += 1;
                }
            }
        }
        return valley;
    }
}
