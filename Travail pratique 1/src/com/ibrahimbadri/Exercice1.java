/*
 * Proposez un programme qui demande à l'utilisateur
 * la valeur d'une température en degrés Celcius et qui calcule
 * puis affiche la température Farenheit équivalente
 */

package com.ibrahimbadri; // Nom du package

import java.util.Scanner; // Package permettant le fonctionnement de l'objet Scanner

public class Exercice1 {

	public static void main(String[] args) {

		// Initialisation des variables des températures
		double temperatureFarenheit;

		System.out.println("Veuillez entrer votre température en degrés Celcius : ");

		// Initialisation d'un scanner
		Scanner clavier = new Scanner(System.in);

		// Capture de la valeur de la température en degrés Celcius
		double temperatureCelcius = clavier.nextDouble();

		// Conversion de la valeur en degré Farenheit
		temperatureFarenheit = temperatureCelcius * 9 / 5 + 32;

		// Affichage de la température en Farenheit équivalente
		System.out.println("La température en Farenheit équivalente est égale à " + temperatureFarenheit);
	}

}
