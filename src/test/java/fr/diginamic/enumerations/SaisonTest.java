package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SaisonTest {

    /** Test des cas nominaux */
    @Test
    public void testValueOfLibelle_CasNominal() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    /** Test des cas limites */
    @Test
    public void testValueOfLibelle_CasLimites() {
        // Libellé inexistant
        assertNull(Saison.valueOfLibelle("Inexistant"));

        // Valeur null
        assertNull(Saison.valueOfLibelle(null));

        // Chaîne vide
        assertNull(Saison.valueOfLibelle(""));

        // Variations de casse (sensibilité à la casse)
        assertNull(Saison.valueOfLibelle("printemps"));  // devrait être sensible à la casse
    }
}