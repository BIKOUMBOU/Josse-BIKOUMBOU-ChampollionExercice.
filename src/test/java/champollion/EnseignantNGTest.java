/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import static org.testng.Assert.*;

/**
 *
 * @author bikoumbou.jc
 */
public class EnseignantNGTest {
    
    public EnseignantNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of heuresPrevues method, of class Enseignant.
     */
    @org.testng.annotations.Test
    public void testHeuresPrevues() {
        System.out.println("heuresPrevues");
        Enseignant instance = null;
        int expResult = 0;
        int result = instance.heuresPrevues();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of heuresPrevuesPourUE method, of class Enseignant.
     */
    @org.testng.annotations.Test
    public void testHeuresPrevuesPourUE() {
        System.out.println("heuresPrevuesPourUE");
        UE ue = null;
        Enseignant instance = null;
        int expResult = 0;
        int result = instance.heuresPrevuesPourUE(ue);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteEnseignement method, of class Enseignant.
     */
    @org.testng.annotations.Test
    public void testAjouteEnseignement() {
        System.out.println("ajouteEnseignement");
        UE ue = null;
        int volumehoCM = 0;
        int volumehoTD = 0;
        int volumehoTP = 0;
        Enseignant instance = null;
        instance.ajouteEnseignement(ue, volumehoCM, volumehoTD, volumehoTP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enseignements method, of class Enseignant.
     */
    @org.testng.annotations.Test
    public void testEnseignements() {
        System.out.println("enseignements");
        Enseignant instance = null;
        instance.enseignements();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
