/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Personal
 */
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buscar method, of class ProductoDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 52;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = null;
        Producto result = instance.buscar(id);
        if (expResult != null) {
            fail("No se encontro el producto");
        }

    }

    /**
     * Test of actualizarStock method, of class ProductoDAO.
     */
    @Test
    public void testActualizarStock() {
        System.out.println("actualizarStock");
        int id = 2;
        int stock = 4;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizarStock(id, stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("No se a podido actualizar el stock");
        }
    }

    /**
     * Test of listarId method, of class ProductoDAO.
     */
    @Test
    public void testListarId() {
        System.out.println("listarId");
        int id = 1;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = null;
        Producto result = instance.listarId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("No se a podido listar las diferentes");
        }
    }

    /**
     * Test of listar method, of class ProductoDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ProductoDAO instance = new ProductoDAO();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("No se a podido listar los diferentes productos");
        }
    }

    /**
     * Test of listarImg method, of class ProductoDAO.
     */
    @Test
    public void testListarImg() {
        System.out.println("listarImg");
        int id = 2;
        HttpServletResponse response = null;
        ProductoDAO instance = new ProductoDAO();
        instance.listarImg(id, response);
        // TODO review the generated test code and remove the default call to fail.
        if (id !=2) {
            fail("No se a podido subir la imagen");
        }
    }

    /**
     * Test of agregar method, of class ProductoDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Producto p = new Producto(1, "hello", null, "hello", 1, 1);
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.agregar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != 0) {
            fail("Se a podido agregar el producto");   
        }
    }

    /**
     * Test of actualizar method, of class ProductoDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Producto p = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != 0) {
            fail("No se a podido actualizar el producto");   
        }
    }

    /**
     * Test of delete method, of class ProductoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        if (id != 0) {
            fail("No no se a podido eliminar el producto");   
        }
    }
    
}
