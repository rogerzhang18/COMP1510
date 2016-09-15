package p11;

import java.util.Scanner;

/**
 * Player.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Player {

    /**
     * Name of player.
     */
    private String name;
    /**
     * Team of player.
     */
    private String team;
    /**
     * Jersey number of player.
     */
    private int jerseyNumber;

    /**
     * Prompts for and reads in the player's name, team, and jersey number.
     */
    public void readPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    /**
     * Checks if the players is the same.
     * 
     * @param obj
     *            Takes a player to compare.
     * @return True if the same, false otherwise.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Player other = (Player) obj;
        if (jerseyNumber != other.jerseyNumber) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (team == null) {
            if (other.team != null) {
                return false;
            }
        } else if (!team.equals(other.team)) {
            return false;
        }
        return true;
    }

}