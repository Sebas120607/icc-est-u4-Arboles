package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {
    public Set <String>construirHashSet(){
         Set <String>HashSet = new HashSet<>();
         HashSet.add("A");
         HashSet.add("B");
         HashSet.add("C");
         HashSet.add("D");
         HashSet.add("E");
         HashSet.add("F");
        HashSet.add("1Ggggggeegeg");
        HashSet.add("2G2gggggeegeg");
        HashSet.add("3Gggggeegeg");
        HashSet.add("4Ggggggeegeg");
        HashSet.add("5Ggggggeegeg");
        HashSet.add("5Ggggggeegeg");
        HashSet.add("6Ggggggeegeg");
        HashSet.add("G7gggggeegeg");
         return HashSet;

    }


    public Set <String> construirLinkedHashSet(){
        Set <String> lSet = new LinkedHashSet<>();
        lSet.add("A");
        lSet.add("B");
        lSet.add("C");
        lSet.add("A");
        lSet.add("D");
        lSet.add("E");
        lSet.add("F");
        lSet.add("1Ggggggeegeg");
        lSet.add("2G2gggggeegeg");
        lSet.add("3Gggggeegeg");
        lSet.add("4Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("5Ggggggeegeg");
        lSet.add("6Ggggggeegeg");
        lSet.add("G7gggggeegeg");
        return lSet;
    }

    public Set <String> construirTreeSet(){
        Set <String> TreeSet = new LinkedHashSet<>();
        TreeSet.add("A");
        TreeSet.add("B");
        TreeSet.add("C");
        TreeSet.add("A");
        TreeSet.add("D");
        TreeSet.add("E");
        TreeSet.add("F");
        TreeSet.add("1Ggggggeegeg");
        TreeSet.add("2G2gggggeegeg");
        TreeSet.add("3Gggggeegeg");
        TreeSet.add("4Ggggggeegeg");
        TreeSet.add("5Ggggggeegeg");
        TreeSet.add("5Ggggggeegeg");
        TreeSet.add("6Ggggggeegeg");
        TreeSet.add("G7gggggeegeg");
        return TreeSet;
    }

    public Set<Contacto>construirHasSetContacto(){
        Set<Contacto>hCSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan","Perez","123456789");
        Contacto c2 = new Contacto("Ana","Gomez","123456789");
        Contacto c3 = new Contacto("Pedro","Lopez","123456789");
        Contacto c4 = new Contacto("Maria","Rpdriguez","123456789");
        Contacto c5 = new Contacto("Juan","Perez","123456789");
        Contacto c6= new Contacto("Juan","Lopez","123456789");
        
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);

        return hCSet;
    }
    public Set<Contacto>construirTreeSetContacto(){
        Set<Contacto>tCSet = new TreeSet<>();
        (c1,c2) -> {
            return c1.getNombre().compareTo(c2.getNombre());
        }
        tCSet.add(new Contacto("Juan","Perez","123456789"));
        tCSet.add(new Contacto("Ana","Gomez","123456789"));
        tCSet.add(new Contacto("Pedro","Lopez","123456789"));
        tCSet.add(new Contacto("Maria","Rpdriguez","123456789"));
        tCSet.add(new Contacto("Juan","Perez","123456789"));
        tCSet.add(new Contacto("Juan","Lopez","123456789"));
        return tCSet;
    }
}

    