package controller;

import java.util.ArrayList;

/**
 *
 * @author Laptop Asus M415DA
 */
public class ProcessManagerController {

    private final ArrayList<String> processListp = new ArrayList<>();
    private final ArrayList<String> processListp2 = new ArrayList<>();

    public ProcessManagerController() {
    }
//processList: la lista de procesos, type: el tipo de evento ejecutar

    public ArrayList<String> filterProcess(ArrayList<String> processList, int type) {
        processList.forEach(e -> {
            processListp.add(e);
        });

        switch (type) {
            case 1:
                MayorRam();
                break;

            case 2:
                MenorRam();
                break;

            case 3:
                MayorCpu();
                break;
            case 4:
                MenorCpu();

                break;

            case 5:
                usuario();

                break;
            case 6:
                sistema();

                break;

        }
        return processListp2;
    }

    private void MayorRam() {
        System.out.println("mayor ram");
    }

    private void MenorRam() {
        System.out.println("menor ram");
    }

    private void MayorCpu() {
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
}
