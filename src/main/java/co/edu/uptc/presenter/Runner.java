package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.Modelnterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.model.ManagerModel;
import co.edu.uptc.view.MainFrame;

public class Runner {
    PresenterInterface presenter;
    Modelnterface model;
    ViewInterface view;

    private void makeMVP(){
        presenter = new MainPresenter();
        model = new ManagerModel();
        view = new MainFrame();

        presenter.setModel(model);
        view.setPresenter(presenter);
    }
    public void start(){
        makeMVP();
        view.start();
    }
}
