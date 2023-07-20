/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjunit.services;

import ejerciciosjunit.entities.TaskManager;
import java.util.ArrayList;

/**
 *
 * @author luis_
 */
public class TaskManagerService {
    
    private ArrayList<TaskManager> tasks; 
    
    public TaskManagerService(){
        tasks = new ArrayList<TaskManager>();
    }
    
    public boolean addTask(TaskManager task){
        tasks.add(task);
        return true;
    }
    
    public boolean deleteTask(TaskManager task){
        boolean deleted = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (task.getTaskName().trim().equalsIgnoreCase(tasks.get(i).getTaskName().trim()) &&
                task.getTaskDescription().trim().equalsIgnoreCase(tasks.get(i).getTaskDescription().trim())){
                tasks.remove(i);
                deleted = true;
                break;
            }
        }
        return deleted;
    }
    
    public ArrayList<TaskManager> getTasks(){
        return tasks;
    }
}
