/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejerciciosjunit.entities.TaskManager;
import ejerciciosjunit.services.TaskManagerService;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis_
 */
public class TaskManagerTest {
    
    private TaskManagerService taskManagerService;
    
    public TaskManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        taskManagerService = new TaskManagerService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TaskManagerTest() {
        // Add Task test
        assertTrue(taskManagerService.addTask(new TaskManager("Test_Name", "Test_Description")));
        // Drop Task test
        assertTrue(taskManagerService.addTask(new TaskManager("Test_Name", "Test_Description")));
        // List Tasks test
        assertNotNull(taskManagerService.getTasks());
    }
}
