package controller;

public class Controller {

    public ProcessBuilderController processBuilder;
    public ProcessManagerController processManager;

    public Controller() {

        processBuilder = new ProcessBuilderController();
        processManager = new ProcessManagerController();
    }

}
