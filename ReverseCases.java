/*
import java.util.*;

public class ReverseCases {

    */
/**
     * A/B -> wins -> 3 , draw - 1, loss - 0
     * 4 teams
     *
     * A -B   = A(wins)
     * A -C   = A(wins)
     * A -D   = A(wins)-C
     * B -C   = B(wins)
     * B -D   = B(wins)
     * C -D   = C(wins)
     *
     * (n-1)! = 6
      * @param args
     *//*

    public static void main(String[] args) {
        Map<String, Integer> matchSummary = new HashMap<>();
        List<TeamCombination> matches = getMatches();
        for (TeamCombination match : matches) {
              if(match.isDraw) {
                  updateMatchSummary(matchSummary, match);
              }
              updateWinnersSummary(match.winnerTeam, matchSummary, 4);
        }


    }

    private static void updateWinnersSummary(String winnerTeam, Map<String, Integer> matchSummary, int point) {
        Integer teamScore = matchSummary.get(winnerTeam);
        if (null == teamScore)  {
            matchSummary.put(match.team1, 2);
        } else {
            matchSummary.put(match.team1, teamScore + 4);
        }
    }

    private static void updateMatchSummary(Map<String, Integer> matchSummary, TeamCombination match) {
        Integer team1Score = matchSummary.get(match.team1);
        if (null == team1Score)  {
            matchSummary.put(match.team1, 2);
        } else {
            matchSummary.put(match.team1, team1Score + 4);
        }

        Integer team2Score = matchSummary.get(match.team2);
        if (null == team2Score)  {
            matchSummary.put(match.team2, 2);
        } else {
            matchSummary.put(match.team2, team2Score + 4);
        }
    }

    private static List<TeamCombination> getMatches() {
        List<TeamCombination> matches = new ArrayList<>();
        matches.add(simulateMatch("A","B", "A"));
        matches.add(simulateMatch("A","C", "A"));
        matches.add(simulateMatch("A","D", "A"));
        matches.add(simulateMatch("B","C", "B"));
        matches.add(simulateMatch("B","D", "B"));
        matches.add(simulateMatch("C","D", "C"));
        return matches;
    }

    private static TeamCombination simulateMatch(String a, String b, String a1) {
        TeamCombination teamCombination = new TeamCombination(a, b);
        teamCombination.setWinnerTeam(a1);
    }


}


class TeamCombination {

    String team1;
    String team2;
    String winnerTeam;
    boolean isDraw;

    TeamCombination(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void setWinnerTeam(String team) {
        this.winnerTeam = team;
    }

    public boolean isDraw(Boolean isDraw) {
        this.isDraw = isDraw;
    }
}
*/
