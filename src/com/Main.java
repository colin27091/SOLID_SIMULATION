package com;

import com.Distribution.LoiNormale;
import com.Distribution.PerfectDistribution;
import com.Distribution.RandomDistribution;
import com.Inequality.Gini;
import com.Interaction.NeighbourInteraction;
import com.Interaction.RandomInteraction;
import com.Transaction.FullTransaction;
import com.Transaction.RandomTransaction;

public class Main {

    public static void main(String[] args) {

        //Lois distribution de richesse
        LoiNormale normale = new LoiNormale(500,100);
        RandomDistribution randomDistribution = new RandomDistribution(50,500);
        PerfectDistribution perfect = new PerfectDistribution(500);

        //Lois d'interaction
        RandomInteraction randomInteraction = new RandomInteraction();
        NeighbourInteraction neighbourInteraction = new NeighbourInteraction();

        //Lois de transaction
        RandomTransaction randomTransaction = new RandomTransaction();
        FullTransaction fullTransaction = new FullTransaction();

        //Calcul d'inégalité
        Gini gini = new Gini();


        Simulation simulation1 = new Simulation(10000, normale, neighbourInteraction, randomTransaction, gini);
        Simulation simulation2 = new Simulation(10000, randomDistribution, randomInteraction, fullTransaction, gini);
        Simulation simulation3 = new Simulation(10000, perfect, randomInteraction, fullTransaction, gini);
        simulation1.runSimulation(10000);
        simulation2.runSimulation(10000);
        simulation3.runSimulation(10000);
    }
}
