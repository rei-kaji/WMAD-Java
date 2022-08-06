package ca.ciccc.wmad202.project.TheTransformationCompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Additional Assumption
// 1: No spaces between each element in transformers.txt
// 2: Half-width space between each transformer in transformers.txt
// 3: The limit of member is three.
// The name don't have to have space.
public class MyCompany {


    public static void main(String[] args) {
        HashMap<Integer, String[]> Deception = new HashMap<>();
        HashMap<Integer, String[]> Autobot = new HashMap<>();
        ArrayList<String[]> DeceptionsList = new ArrayList<>();
        ArrayList<String[]> AutobotsList = new ArrayList<>();
        int countDeception = 0;
        int countAutobot = 0;
        // Get value from text file
        try {
            Scanner in = new Scanner(new File("./wmad202-project/src/ca/ciccc/wmad202/project/TextFolder/transformers.txt"));
            while (in.hasNext()) {
                String input = in.nextLine();
                if (input.isEmpty()) {
                    continue;
                }
                // Remove extraneous text and white space
                input = input.replace("*", ",").replace(" ","");
                String[] line = input.split(",");
                if (Objects.equals(line[1], "D")) {
                    Deception.put(countDeception, line);
                    countDeception++;
                } else {
                    Autobot.put(countAutobot, line);
                    countAutobot++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        // Adjust the sequence style
        for (int i = 0; i < countDeception; i++) {
            DeceptionsList.add(Deception.get(i));
            System.out.println("The battle " + i + " team(Deception): " + Arrays.toString(Deception.get(i)));
        }

        for (int i = 0; i < countAutobot; i++) {
            AutobotsList.add(Autobot.get(i));
            System.out.println("The battle " + i + " team(Autobot): " + Arrays.toString(Autobot.get(i)));
        }

        // Start Battle
        for (int i = 0; i < DeceptionsList.size(); i++) {
            ArrayList<Transformer> DeceptionTransformers = new ArrayList<>();
            ArrayList<Transformer> AutobotTransformers = new ArrayList<>();
            ArrayList<String[]> dep = new ArrayList<>();
            ArrayList<String[]> aut = new ArrayList<>();
            String[] strAut = AutobotsList.get(i);
            String[] strDep = DeceptionsList.get(i);

            // Separate each Transformer
            dep.add(Arrays.copyOfRange(strDep, 0, 10));
            if (strDep.length > 10) {
                dep.add(Arrays.copyOfRange(strDep, 10, 20));
                if (strDep.length > 20) {
                    dep.add(Arrays.copyOfRange(strDep, 20, 30));
                }
            }

            aut.add(Arrays.copyOfRange(strAut, 0, 10));
            if (strAut.length > 10) {
                aut.add(Arrays.copyOfRange(strAut, 10, 20));
                if (strAut.length > 20) {
                    aut.add(Arrays.copyOfRange(strAut, 20, 30));
                }
            }

            // Adjust the Transformer style
            for (String[] line : dep) {
                Transformer transformer = new Transformer(line[0], line[1], Integer.parseInt(line[2])
                        , Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5])
                        , Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8]), Integer.parseInt(line[9]));

                DeceptionTransformers.add(transformer);
            }
            for (String[] line : aut) {
                Transformer transformer = new Transformer(line[0], line[1], Integer.parseInt(line[2])
                        , Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5])
                        , Integer.parseInt(line[6]), Integer.parseInt(line[7]), Integer.parseInt(line[8]), Integer.parseInt(line[9]));

                AutobotTransformers.add(transformer);
            }


            // The battle section
            int battleCount = 0;
            ArrayList<Integer> removeDeception = new ArrayList<>();
            ArrayList<Integer> removeAutobot = new ArrayList<>();
            boolean decepWin = false;
            boolean autoWin = false;
            boolean end = false;

            for (int k = 0; k < DeceptionTransformers.size(); k++) {
                battleCount++;
                Transformer deceptionRobot;
                Transformer autobotRobot;
                CourageCompare courageCompare = new CourageCompare();
                int courageResult = 0;
                CourageCompare strengthCompare = new CourageCompare();
                int strengthResult = 0;
                CourageCompare skillCompare = new CourageCompare();
                int skillResult = 0;
                int DeceptionOrverAllRating = 0;
                int AutobotOverAllRating = 0;
                try {
                    deceptionRobot = DeceptionTransformers.get(k);
                    autobotRobot = AutobotTransformers.get(k);
                    decepWin = deceptionRobot.getName() == "Predaking";
                    autoWin = autobotRobot.getName() == "OptimusPrime";

                    // compare courage
                    courageResult = courageCompare.compare(deceptionRobot.getCourage(), autobotRobot.getCourage());

                    // compare strength
                    strengthResult = strengthCompare.compare(deceptionRobot.getCourage(), autobotRobot.getCourage());

                    // compare skill
                    skillResult = skillCompare.compare(deceptionRobot.getCourage(), autobotRobot.getCourage());

                    DeceptionOrverAllRating = deceptionRobot.getOverallRating();
                    AutobotOverAllRating = autobotRobot.getOverallRating();
                } catch (IndexOutOfBoundsException e) {
                    battleCount--;
                    continue;
                }

                // Check the name (Optimus Prime or Predaking)
                if (decepWin && autoWin) {
                    end = true;
                    break;
                } else if (decepWin && !autoWin) {
                    autoWin = false;
                    end = true;
                    break;
                } else if (!decepWin && autoWin) {
                    decepWin = false;
                    end = true;
                    break;
                }

                // compare courage
                if (courageResult == 1) {
                    removeAutobot.add(k);
                    autoWin = false;
                    decepWin = true;
                    continue;
                } else if (courageResult == 2) {
                    removeDeception.add(k);
                    decepWin = false;
                    autoWin = true;
                    continue;
                }

                // compare strength
                if (strengthResult == 1) {
                    removeAutobot.add(k);
                    autoWin = false;
                    decepWin = true;
                    continue;
                } else if (strengthResult == 2) {
                    removeDeception.add(k);
                    decepWin = false;
                    autoWin = true;
                    continue;
                }

                // compare skill
                if (skillResult == 1) {
                    removeAutobot.add(k);
                    autoWin = false;
                    decepWin = true;
                    continue;
                } else if (skillResult == 2) {
                    removeDeception.add(k);
                    decepWin = false;
                    autoWin = true;
                    continue;
                }
                // compare overall rating
                if (DeceptionOrverAllRating > AutobotOverAllRating) {
                    removeAutobot.add(k);
                    autoWin = false;
                    decepWin = true;
                } else if(DeceptionOrverAllRating < AutobotOverAllRating) {
                    removeDeception.add(k);
                    decepWin = false;
                    autoWin = true;
                }
            }

            // Delete loser
            for (int d = 0; d < removeDeception.size(); d++) {
                DeceptionTransformers.remove(0);
            }
            for (int a = 0; a < removeAutobot.size(); a++) {
                AutobotTransformers.remove(0);
            }

            // the battle result
            if (end) {
                System.out.println("This battle ended with all competitors destroyed.");
            } else if (decepWin) {
                System.out.println("The number of battles: " + battleCount);
                System.out.println("The winning team:(Decepticons): " + DeceptionTransformers.get(0).getName());
                if (AutobotTransformers.size() == 0) {
                    System.out.println("The surviving members of the losing team: (Autobots): None");
                }
                for (Transformer str : AutobotTransformers) {
                    System.out.println("The surviving members of the losing team: (Autobots): " + str.getName());
                }
            } else {
                System.out.println("The number of battles: " + battleCount);
                System.out.println("The winning team:(Autobots): " + AutobotTransformers.get(0).getName());
                if (DeceptionTransformers.size() == 0) {
                    System.out.println("The surviving members of the losing team: (Decepticons): None");
                }
                for (Transformer str : DeceptionTransformers) {
                    System.out.println("The surviving members of the losing team: (Decepticons): " + str.getName());
                }
            }
        }




    }



}
