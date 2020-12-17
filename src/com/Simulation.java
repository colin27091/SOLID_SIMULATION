package com;

import com.Distribution.IDistribution;
import com.Inequality.IInequality;
import com.Interaction.IInteraction;
import com.Transaction.ITransaction;

import java.util.Collections;
import java.util.List;

public class Simulation {

    private int nbPerson;
    private List<Float> richesse;
    private IDistribution distribution;
    private IInteraction interaction;
    private ITransaction transaction;
    private IInequality inequality;

    public Simulation(int nbPerson, IDistribution distribution, IInteraction interaction, ITransaction transaction, IInequality inequality) {
        this.nbPerson = nbPerson;
        this.distribution = distribution;
        this.richesse = distribution.distribution(nbPerson);
        this.interaction = interaction;
        this.transaction = transaction;
        this.inequality = inequality;
    }

    public void runSimulation(int nbRound){
        System.out.println("---------------------------------------------------");
        System.out.println("Lancement de la simulation : ");
        System.out.println("La simulation contient les paramètres suivants :");
        System.out.println("    Loi de distribution : "+this.distribution.getClass().getSimpleName());
        System.out.println("    Loi d'interaction : "+this.interaction.getClass().getSimpleName());
        System.out.println("    Loi de transaction : "+this.transaction.getClass().getSimpleName());
        System.out.println("    Loi de calcul d'inégalité : "+this.inequality.getClass().getSimpleName());
        System.out.println("");
        float inBefore = this.inequality.calculParam(richesse);
        System.out.println("Inegalité de richesse avant transaction : " + inBefore);
        for(int i = 0; i<nbRound; i++){
            transaction.transact(richesse, interaction.interact(nbPerson));
        }
        float inAfter = this.inequality.calculParam(richesse);
        System.out.println("Inegalité de richesse après transaction : " + inAfter);
        System.out.println("---------------------------------------------------");

    }

}
