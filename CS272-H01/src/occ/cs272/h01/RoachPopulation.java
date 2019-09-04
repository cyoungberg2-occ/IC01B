/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author cyoungberg2
 * @version 08302019
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "cyoungberg2";
    public static final String ASSIGNMENT = "H01-A";


    private int population;

    public RoachPopulation(){
    	population = 0;
    }

    public RoachPopulation(int populationSize){
    	population = populationSize;
    }

    public int getRoaches()
    {
        return population;
    }

    public void breed()
    {
    	population = population * 2;
       }

    public void spray()
    {
    	population = population - (population/10);
      }
    
    
    
}
