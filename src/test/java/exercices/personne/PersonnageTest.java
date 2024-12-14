package exercices.personne;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PersonnageTest {

    private Personnage monPersonnage;

    @BeforeEach
    public void setUp() {
       monPersonnage = new Personnage();
    }
    @AfterEach
    public void tearDown() {
        monPersonnage = null;
    }

    @Test
    public void testTournerZero() {
        //GIVEN
         String ExpectedResult = "NORD";
        //WHEN
          String ActualResult = monPersonnage.tourner(0);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

    @Test
    public void testTournerUn() {
        //GIVEN
        String ExpectedResult = "EST";
        //WHEN
        String ActualResult = monPersonnage.tourner(1);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }
    @Test
    public void testTournerDeux() {
        //GIVEN
        String ExpectedResult = "SUD";
        //WHEN
        String ActualResult = monPersonnage.tourner(2);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

    @Test
    public void testTourner_3() {
        //GIVEN
        String ExpectedResult = "OUEST";
        //WHEN
        String ActualResult = monPersonnage.tourner(3);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

    @Test
    public void testTourner_4() {
        //GIVEN
        String ExpectedResult = "NORD";
        //WHEN
        String ActualResult = monPersonnage.tourner(4);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }
    @Test
    public void testTourner_5() {
        //GIVEN
        String ExpectedResult = "EST";
        //WHEN
        String ActualResult = monPersonnage.tourner(5);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }

    @Test
    public void testTourner_10() {
        //GIVEN
        String ExpectedResult = "SUD";
        //WHEN
        String ActualResult = monPersonnage.tourner(10);
        //THEN
        assertThat(ActualResult).isEqualTo(ExpectedResult);
    }
}
