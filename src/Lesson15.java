public class Lesson15 {

    public static void main(String[] args) {

        String inputString = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        // Positive scenario
        // All the characters that DO NOT BELONG TO
        // a - z, A - Z, 0 - 9, SPACE

        // INITIALIZE the counter OUTSIDE THE LOOP
        // to hold the values we retrieve within EVERY iteration
        int counter = 0;

        for (int i = 0; i < inputString.length(); i++) {

            char characterToCheck = inputString.charAt(i);
            char[] characterArray = {characterToCheck};

            String stringToCheck = new String(characterArray);

            if (stringToCheck.matches("[^a-zA-Z0-9\\s]")) {
                System.out.println(String.format("Character %s is matching the REGEX", stringToCheck));
                counter++;
            }
        }

        // PRINT the result when we have gone through ALL THE ITERATIONS IN THE LOOP
        System.out.println(String.format("There were %d occurences", counter));


        // NEGATIVE PATTERN SCENARIO
        for (int i = 0; i < inputString.length(); i++) {

            char characterToCheck = inputString.charAt(i);
            char[] characterArray = {characterToCheck};

            String stringToCheck = new String(characterArray);

            if (stringToCheck.matches("[\\.\\,\\:\\?]")) {
                System.out.println(String.format("Character %s is matching the REGEX", stringToCheck));
                counter++;
            }
        }




        // CARD
    }
}
