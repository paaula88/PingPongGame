package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.Modelnterface;
import co.edu.uptc.interfaces.PresenterInterface;

public class MainPresenter implements PresenterInterface {
    private Modelnterface model;
    @Override
    public void setModel(Modelnterface model) {
        this.model = model;

    }
}
