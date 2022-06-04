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
    private ProcessModel[] vecpr;

    public ProcessManagerController() {
    }
//processList: la lista de procesos, type: el tipo de evento ejecutar

    public ArrayList<ProcessModel> filterProcess(ArrayList<ProcessModel> processList, int type) {
        vecpr = new ProcessModel[processList.size()];

        for (int i = 0; i < processList.size(); i++) {
            vecpr[i] = processList.get(i);
        }

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
        for (int i = 1; i < vecpr.length; i++) {
            for (int j = 0; j < (vecpr.length - i); j++) {
                float eval1 = Float.parseFloat(vecpr[j].getMemory().replace("KB", "").trim().replace(".", ""));
                float eval2 = Float.parseFloat(vecpr[j + 1].getMemory().replace("KB", "").trim().replace(".", ""));

                changePosition(j, j + 1, (eval1 > eval2));
            }
        }
    }

    private void MenorRam() {

        for (int i = 1; i < vecpr.length; i++) {
            for (int j = 0; j < (vecpr.length - i); j++) {
                float eval1 = Float.parseFloat(vecpr[j].getMemory().replace("KB", "").trim().replace(".", ""));
                float eval2 = Float.parseFloat(vecpr[j + 1].getMemory().replace("KB", "").trim().replace(".", ""));

                changePosition(j, j + 1, (eval1 < eval2));
            }
        }

    }

    private void MayorCpu() {

        for (int i = 0; i < vecpr.length; i++) {
            System.out.println(vecpr[i].getCpu());
        }
        System.out.println("mayor cpu");

    }

    private void MenorCpu() {
        System.out.println("menor cpu");
    }

    private void usuario() {

        System.out.println("usuario");
    }

    private void sistema() {

        System.out.println("sistema");
    }

    private void changePosition(int p1, int p2, boolean condtition) {

        if (condtition) {

            ProcessModel pm;
            pm = vecpr[p1];
            vecpr[p1] = vecpr[p2];
            vecpr[p2] = pm;
        }

    }
}
