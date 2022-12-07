package nl.Novi.FileManagerExamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //Stap1: content bepalen, dus wat willen we opslaan

        String scores = "PlayerA: 3, PlayerB: 9";

        //Stap2: bestand aanmaken door gebruik te maken van de File klasse binnen Java

        File scoresFiles = new File("C:\\Users\\Kaila\\IdeaProjects\\FileManagerExamples\\Scores.txt"); //Representatie van een bestand.

        //Bestand werkelijk opslaan: middels klasse FileWriter (deze klasse gaat een foutmelding geven welke ignored kan worden, waarna throws IOException wordt toegevoegd bij de main methode) binnen Java:

        FileWriter fileWriter = new FileWriter(scoresFiles);

        //Stap3: content naar het bestand wegschrijven

        fileWriter.write(scores);

        //Stap4: fileWriter afsluiten

        fileWriter.close();

    }
}