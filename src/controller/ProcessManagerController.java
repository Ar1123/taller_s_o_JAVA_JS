package controller;

import java.util.ArrayList;
import model.ProcessModel;

/**
 *
 * @author Laptop Asus M415DA
 */
public class ProcessManagerController {

    private final ArrayList<ProcessModel> processListp = new ArrayList<>();
    private final ArrayList<ProcessModel> processListp2 = new ArrayList<>();
    private ProcessModel processModel;

    public ProcessManagerController() {
    }
//processList: la lista de procesos, type: el tipo de evento ejecutar

    public ArrayList<ProcessModel> filterProcess(ArrayList<ProcessModel> processList, int type) {
    processList.forEach(e -> {
            llenar(e);
        });
    
        switch (type) {
            case 1:
                MayorCpu();
                break;
            case 2:
                MenorCpu();
                break;
            case 3:
                MayorRam();
                break;
            case 4:
                MenorRam();
                break;
            case 5:
                sistema();
                break;
            case 6:
                usuario();
                break;

        }
        return processListp2;
    }

    private void MayorRam() {
        ProcessModel temp = new ProcessModel();
        for (int i = 0; i < processListp.size(); i++) {
            System.out.println(Float.parseFloat(processListp.get(i).getMemory().replace("KB", "").trim().replace(".", "")));
            for (int j = 1; j < (processListp.size() - i); j++) {

            }

        }
        System.out.println("mayor ram");
    }

    private void MenorRam() {
        processListp.forEach(e -> {

        });
        System.out.println("menor ram");
    }

    private void MayorCpu() {
        processListp.forEach(e -> {

        });
        System.out.println("mayor cpu");
    }

    private void MenorCpu() {
        System.out.println("menor cpu");
    }

    private void usuario() {
        processListp.forEach(e -> {

        });
        System.out.println("usuario");
    }

    private void sistema() {
        processListp.forEach(e -> {

        });
        System.out.println("sistema");
    }
    
    
    private void llenar(ProcessModel pm ){
    
            processModel = new ProcessModel();
            processModel.setPid(pm.getPid());
            processModel.setName(pm.getName());
            processModel.setUser(pm.getUser());
            processModel.setDescription(pm.getDescription());
            processModel.setPriority(pm.getPriority());
            processModel.setMemory(pm.getMemory());
            processModel.setCpu(pm.getCpu());
            processListp.add(processModel);

}
    
    private void changePosition(int position1, int position2){
            
        
    }
}
