package controller;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ProcessHandlerController {

    private Stream<ProcessHandle> process;
    private final ArrayList<String> processList = new ArrayList();

    public ProcessHandlerController() {
    }

    //Método para obtener los procesos de la maquina; retorna un flujo de stream
    private Stream<ProcessHandle> getProcess() {
        try {
            Stream<ProcessHandle> getProcess = ProcessHandle.allProcesses();// interface ProcessHandle, no se implementa como interface para no llamar a todos sus métodos :V
            return getProcess;
        } catch (Exception e) {
            System.err.println("Error al obtener procesos" + e);
        }
        return null;
    }

    //se llena el array con los procesos obtenidos y a su vez se evalua si el proceso es del  sistema o del usuario
    private void orderProcesses(ProcessHandle process) {
        String priority;
        //se evalua la prioridad
        priority = (process.info().user().toString().contains("SYSTEM")) ? "1" : "0";
        //se llena el array de la siguiente forma  
         // PID, NOMBRE, USUARIO, DESCRIPCION, PRIORIDAD, CPU, MEMORIA
        processList.add(process.pid() + "," + process.info().command() + "," + process.info().user() + "," + priority + "," + process.info().user());
    }

    public ArrayList<String> listProcess() {
        process = getProcess();
        processList.clear();
        process.forEach(p -> orderProcesses(p));
        return processList;
    }
    
    
}
