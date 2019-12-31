/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Algorithm {
    //instance variables    
    private int i;
     //////// ACTUAL CLASS /////// 
    
    // The following will be used for storing all the City objects, indexed by their name.
    private City[] allCities;
    
    private Scanner scan;
    
    public Algorithm()
    {
        i=0;
        allCities = new City[14];   // There are 14 cities.
        
        scan = new Scanner(System.in);
        
        setupConnections();
        
        City current, destination;
        
        current = chooseCity("Where will the journey start?");
        destination = chooseCity("Where will the journey end?");
        
        Queue<City> flightRoute = new LinkedList<City>();
        flightRoute.add(current);
        determineRoute(current, destination, flightRoute);

        printFinalRoute(flightRoute);
    }
    
    private void setupConnections()
    {
        System.out.println("Creating cities, and connecting them according to flight paths");
        City paris = new City("Paris");         allCities[0] = paris;
        City london = new City("London");       allCities[1] = london;
        City amsterdam = new City("Amsterdam"); allCities[2] = amsterdam;
        City newYork = new City("New York");    allCities[3] = newYork;
        City sydney = new City("Sydney");       allCities[4] = sydney;
        City bristol = new City("Bristol");     allCities[5] = bristol;
        City jburg = new City("Johannesburg");  allCities[6] = jburg;
        City melb = new City("Melbourne");      allCities[7] = melb;
        City kuala = new City("Kuala Lumpur");  allCities[8] = kuala;
        City brisbane = new City("Brisbane");   allCities[9] = brisbane;
        City perth = new City("Perth");         allCities[10] = perth;
        City delhi = new City("Delhi");         allCities[11] = delhi;
        City beijing = new City("Beijing");     allCities[12] = beijing;
        City calif = new City("California");    allCities[13] = calif;

                
        london.addConnection(paris); paris.addConnection(london); 

        // This causes a triangular one-way segment of routes
        amsterdam.addConnection(bristol); 
        bristol.addConnection(london);
        london.addConnection(amsterdam); 
            
        amsterdam.addConnection(london);

        // Most of the remaining flights, are two-way...
        london.addConnection(jburg); jburg.addConnection(london);
        
        jburg.addConnection(perth); perth.addConnection(jburg);
                
        sydney.addConnection(brisbane); brisbane.addConnection(sydney);
        
        brisbane.addConnection(kuala); kuala.addConnection(brisbane);
        
        sydney.addConnection(newYork); newYork.addConnection(sydney);
        
        newYork.addConnection(calif); calif.addConnection(newYork);
        
        // The following is another special one-way triangular segment of the flight routes.
        brisbane.addConnection(delhi); 
        delhi.addConnection(beijing);
        beijing.addConnection(brisbane);

        // This is a loop.
        perth.addConnection(sydney); sydney.addConnection(melb); melb.addConnection(perth);

        // A special one-way route.
        beijing.addConnection(sydney);
        
        System.out.println("done.");
    }
    
    public City chooseCity(String prompt)
    {
        int choice;
        
        System.out.println(prompt);     // Show the message explaining the purpose of this call
        
        for (int i = 0; i < allCities.length; i++)
        {
            System.out.println(i + ". " + allCities[i]);
        }
        
        do {
            System.out.print("> ");     // Shows that user input is expected.
            choice = scan.nextInt();
        } while (choice < 0 || choice >= allCities.length);
        
        // Give the caller the reference to the chosen city.
        return allCities[choice];
    }
    
    public boolean determineRoute(City from, City to, Queue<City> flightRoute)
    {
        // NEEDS TO BE COMPLETED BY STUDENT
        /**my code start*/
        i++;
        if (from.getConnections().contains(to))
        {
            flightRoute.add(to);
            return true;
        }
        else //if(i!=7)
        {
                
            for (City a: from.getConnections())
            {
                if(!flightRoute.contains(a))
                {
                    flightRoute.add(a);
                    if(determineRoute(a, to, flightRoute))
                        return true;
                    
                        flightRoute.remove(a);
                }
                   
            }
        }
        return false;
    }

    public void printFinalRoute(Queue<City> flightRoute)
    {
       for(City s : flightRoute) { 
        System.out.print(s.toString()+" : "); 
       }
    }
    
}
