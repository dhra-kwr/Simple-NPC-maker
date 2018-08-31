package simplenpcs;

import java.util.ArrayList;
import java.util.Random;

public class NameLists {
    
    public Random rand = new Random();
    
    ArrayList<String> humanMaleList = new ArrayList<>();
    ArrayList<String> humanFemaleList = new ArrayList<>();
    ArrayList<String> elfMaleList = new ArrayList<>();
    ArrayList<String> elfFemaleList = new ArrayList<>();
    ArrayList<String> dwarfMaleList = new ArrayList<>();
    ArrayList<String> dwarfFemaleList = new ArrayList<>();
    ArrayList<String> dragonbornList = new ArrayList<>();
    ArrayList<String> savageList = new ArrayList<>();
    ArrayList<String> otherList = new ArrayList<>();
    
    public void createNameLists() {
        
        // human male names
        humanMaleList.add("Galov");
        humanMaleList.add("Senek");
        humanMaleList.add("Aram");
        humanMaleList.add("Tito");
        humanMaleList.add("Wydric");
        humanMaleList.add("Jadyn");
        humanMaleList.add("Rydel");
        humanMaleList.add("Masa");
        humanMaleList.add("Keth");
        humanMaleList.add("Erden");
        humanMaleList.add("Nadar");
        humanMaleList.add("Colm");
        humanMaleList.add("Davin");
        humanMaleList.add("Ramir");
        humanMaleList.add("Vasil");
        humanMaleList.add("Haran");
        humanMaleList.add("Berak");
        humanMaleList.add("Eron");
        humanMaleList.add("Zenoes");
        humanMaleList.add("Giron");
        humanMaleList.add("Shep");
        humanMaleList.add("Immo");
        humanMaleList.add("Pravad");
        humanMaleList.add("Fjoder");
        humanMaleList.add("Cedric");
        humanMaleList.add("Aikyn");
        
        // human female names
        humanFemaleList.add("Taysa");
        humanFemaleList.add("Ninel");
        humanFemaleList.add("Firin");
        humanFemaleList.add("Ilgrid");
        humanFemaleList.add("Marym");
        humanFemaleList.add("Vanna");
        humanFemaleList.add("Uire");
        humanFemaleList.add("Oona");
        humanFemaleList.add("Branvin");
        humanFemaleList.add("Vigla");
        humanFemaleList.add("Shana");
        humanFemaleList.add("Myrra");
        humanFemaleList.add("Kidre");
        humanFemaleList.add("Reena");
        humanFemaleList.add("Hildin");
        humanFemaleList.add("Aira");
        humanFemaleList.add("Alra");
        humanFemaleList.add("Erre");
        humanFemaleList.add("Bianka");
        humanFemaleList.add("Issa");
        humanFemaleList.add("Deire");
        humanFemaleList.add("Grete");
        
        // elf male names
        elfMaleList.add("Kireth");
        elfMaleList.add("Zelfin");
        elfMaleList.add("Varandin");
        elfMaleList.add("Nabreth");
        elfMaleList.add("Eranthir");
        elfMaleList.add("Sadryn");
        elfMaleList.add("Xavyth");
        elfMaleList.add("Tarethir");
        elfMaleList.add("Garandir");
        elfMaleList.add("Fusinder");
        elfMaleList.add("Baruthin");
        elfMaleList.add("Joveth");
        elfMaleList.add("Diseth");
        elfMaleList.add("Edryn");
        elfMaleList.add("Harathir");
        elfMaleList.add("Paryn");
        elfMaleList.add("Celand");
        elfMaleList.add("Rywath");
        
        // elf female names
        elfFemaleList.add("Ylwen");
        elfFemaleList.add("Asaviel");
        elfFemaleList.add("Indil");
        elfFemaleList.add("Viniel");
        elfFemaleList.add("Gemiene");
        elfFemaleList.add("Tariel");
        elfFemaleList.add("Diniel");
        elfFemaleList.add("Oranna");
        elfFemaleList.add("Utienne");
        elfFemaleList.add("Hirenna");
        elfFemaleList.add("Pariel");
        elfFemaleList.add("Zannael");
        elfFemaleList.add("Raniele");
        elfFemaleList.add("Kiranna");
        elfFemaleList.add("Falwen");
        elfFemaleList.add("Ezdiele");
        elfFemaleList.add("Sanwen");
        elfFemaleList.add("Jiendil");
        //elfFemaleList.add("");
        
        // dwarf male names
        dwarfMaleList.add("Xubrym");
        dwarfMaleList.add("Hragnir");
        dwarfMaleList.add("Krurin");
        dwarfMaleList.add("Fergast");
        dwarfMaleList.add("Nawdrin");
        dwarfMaleList.add("Magrym");
        dwarfMaleList.add("Adrir");
        dwarfMaleList.add("Rhorin");
        dwarfMaleList.add("Bergrim");
        dwarfMaleList.add("Grimyr");
        dwarfMaleList.add("Egrir");
        dwarfMaleList.add("Turmgast");
        dwarfMaleList.add("Jedrin");
        dwarfMaleList.add("Parzym");
        dwarfMaleList.add("Ofrim");
        dwarfMaleList.add("Lumgast");
        //dwarfMaleList.add("");
        
        // dwarf female names
        dwarfFemaleList.add("Xubi");
        dwarfFemaleList.add("Hirnhild");
        dwarfFemaleList.add("Kruri");
        dwarfFemaleList.add("Gemma");
        dwarfFemaleList.add("Falka");
        dwarfFemaleList.add("Rhona");
        dwarfFemaleList.add("Edri");
        dwarfFemaleList.add("Illa");
        //dwarfFemaleList.add("");
        
        
        // dragonborn names
        dragonbornList.add("Balanwyr");
        dragonbornList.add("Tokugraw");
        dragonbornList.add("Gruudran");
        dragonbornList.add("Hardraal");
        dragonbornList.add("Jyraxim");
        dragonbornList.add("Okandryx");
        dragonbornList.add("Lyzandim");
        dragonbornList.add("Praxor");
        dragonbornList.add("Nazhakim");
        dragonbornList.add("Wranwyr");
        dragonbornList.add("Xymram");
        dragonbornList.add("Aqraw");
        dragonbornList.add("Shazbrim");
        dragonbornList.add("Zornwyr");
        dragonbornList.add("Dabryn");
        dragonbornList.add("Star Scale");
        dragonbornList.add("Sharp Claw");
        dragonbornList.add("Qizyr");
        dragonbornList.add("Long Tail");
        dragonbornList.add("Dvigar");
        dragonbornList.add("Scar Snout");
        dragonbornList.add("Vradraal");
        dragonbornList.add("Yxamsin");
        dragonbornList.add("Fzaram");
        dragonbornList.add("Ghilraw");
        //dragonbornList.add("");
        
        // savage names
        savageList.add("Chirn");
        savageList.add("Limb Ripper");
        savageList.add("Stalking One");
        savageList.add("Swift Foot");
        savageList.add("Face Gnasher");
        savageList.add("Hulking");
        savageList.add("Shrieking Spear");
        savageList.add("Wrarak");
        savageList.add("Skull Dancer");
        savageList.add("Cloud Burn");
        savageList.add("Creature");
        savageList.add("Render");
        savageList.add("Monolith");
        savageList.add("Skin Eater");
        savageList.add("Tuskbringer");
        //savageList.add("");
        
        // "other" names
        otherList.add("Mischief");
        otherList.add("Taunt");
        otherList.add("Glimmer");
        otherList.add("Sardonious");
        otherList.add("Aloof");
        otherList.add("Coin");
        otherList.add("Vengeance");
        otherList.add("Curse");
        otherList.add("Wayward");
        otherList.add("Smirk");
        otherList.add("Sardonic");
        otherList.add("Ghastly");
        otherList.add("Dirge");
        otherList.add("Lament");
        otherList.add("Grinner");
        otherList.add("Finder");
        otherList.add("Lush");
        otherList.add("Pellet");
        otherList.add("Portent");
        otherList.add("Scuttle");
        otherList.add("Chance");
        otherList.add("Roil");
        otherList.add("Tumor");
        otherList.add("Dregs");
        otherList.add("Hide");
        otherList.add("Dusty");
        otherList.add("Smoke");
        otherList.add("Dusk");
        otherList.add("Nightfall");
        otherList.add("Uncertain");
        otherList.add("Certain");
        //otherList.add("");
    }
    
}
