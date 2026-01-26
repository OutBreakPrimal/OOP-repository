package task5.Facade;

import task5.Potion;
import task5.Type;
import task5.task5;
import task5.Extractor;
import task5.Essence;
import task5.EssenceFactory;
import task5.ManaEssenceConverter;
import task5.StaminaEssenceConverter;
import task5.HealingEssenceConverter;
import task5.Finalizator;

import static task5.Type.MANA;
import static task5.Type.STAMINA;

public class PotionConversionFacade {
    public String convertPotion(String potionName, String convertTo){
        System.out.println("Client Code: conversion started.");
        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(convertTo.toUpperCase());
        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;
        if (type == MANA) {
            destinationEssence = new ManaEssenceConverter();
        } else if (type == STAMINA) {
            destinationEssence = new StaminaEssenceConverter();
        } else {
            destinationEssence = new HealingEssenceConverter();
        }
        potion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(potion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);

        System.out.println(result.getName());
        System.out.println("PotionConversionFacade:");
        return "Converted " + potionName + " to " + convertTo;
    }
}
