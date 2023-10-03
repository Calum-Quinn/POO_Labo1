public class NouvelleStar {
    public static void main(String[] args) {

        //Table of candidates
        String[] candidates = new String[args.length];

        //Table of votes for each candidate
        int[] votesFor = new int[candidates.length];

        //Utilities for random number generation
        java.util.Random random = new java.util.Random();
        //Maximum number of votes
        final int VOTES = 150;
        int votesLeft = VOTES;


        //Defines whether there are candidates
        if (args.length == 0)
            System.out.println("Il n'existe pas de candidats !");
        else {
            System.out.println("Candidats:");

            //Prints the name of each candidate
            for (int i = 0; i < candidates.length; ++i) {
                candidates[i] = args[i];

                System.out.println("#" + (i+1) + " " + candidates[i]);

                //If it gets to the last candidate
                if (i == candidates.length - 1) {
                    votesFor[candidates.length - 1] = votesLeft;

                    //Prints the number of votes and the corresponding dots
                    System.out.println("\n" + VOTES + " votes:");
                    for (int j = 0; j < VOTES; ++j) {
                        System.out.print(".");
                    }
                }
                else {
                    votesFor[i] = random.nextInt(votesLeft);
                    votesLeft -= votesFor[i];
                }
            }

            //Prints the results
            System.out.println("\n\nRésultats:");

            //Calculates the percentage depending on the number of votes
            for (int i = 0; i < candidates.length; ++i) {
                System.out.println((int)(((double)votesFor[i] /
                        (double)VOTES) * 100) + "% " + candidates[i]);
            }
        }
    }
}
