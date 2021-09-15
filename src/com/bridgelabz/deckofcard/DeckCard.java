package com.bridgelabz.deckofcard;

import java.util.Scanner;

public class DeckCard {

	static String[] Clubs = { "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJack", "CQueen", "CKing",
			"CAce" };
	static String[] Diamonds = { "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJack", "DQueen", "DKing",
			"DAce" };
	static String[] Hearts = { "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJack", "HQueen", "HKing",
			"HAce" };
	static String[] Spades = { "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJack", "SQueen", "SKing",
			"SAce" };
	static String[][] deck = { Clubs, Diamonds, Hearts, Spades };

	public static void main(String[] args) {
		System.out.println("Welcome to the DeckCards computation program");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int maxPlayers = s.nextInt();
		s.close();
		System.out.println("max players are : " + maxPlayers);
		showAllCards();
	}

	private static void showAllCards() {
		System.out.println("Displaying total cards");
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.println(" " + deck[i][j]);
			}
				System.out.println();
		}
	}
}
