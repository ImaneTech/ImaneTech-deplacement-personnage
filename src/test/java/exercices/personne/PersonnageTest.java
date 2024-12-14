package exercices.personne;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PersonnageTest {



    @Test
    public void testTournerZero() {
        //GIVEN
        Personnage p = new Personnage();
         String ExpectedResult = "NORD";
        //WHEN
          String ActualResult = p.tourner(0);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

    @Test
    public void testTournerUn() {
        //GIVEN
        Personnage monPersonnage = new Personnage();
        String ExpectedResult = "EST";
        //WHEN
        String ActualResult = monPersonnage.tourner(1);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }
    @Test
    public void testTournerDeux() {
        //GIVEN
        Personnage monPersonnage = new Personnage();
        String ExpectedResult = "SUD";
        //WHEN
        String ActualResult = monPersonnage.tourner(2);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

    @Test
    public void testTourner_3() {
        //GIVEN
        Personnage monPersonnage = new Personnage();
        String ExpectedResult = "OUEST";
        //WHEN
        String ActualResult = monPersonnage.tourner(3);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

}
