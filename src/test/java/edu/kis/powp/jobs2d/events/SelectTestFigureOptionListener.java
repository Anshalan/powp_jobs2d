package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.ShapesCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Figure Joe 1")) {
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equals("Figure Joe 2")) {
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equals("Square")) {
            ComplexCommand shape = ShapesCommand.square();
            shape.execute(driverManager.getCurrentDriver());
        }else if (e.getActionCommand().equals("Envelop")) {
            ComplexCommand shape = ShapesCommand.envelop();
            shape.execute(driverManager.getCurrentDriver());
        }else if (e.getActionCommand().equals("Rectangle")) {
            ComplexCommand shape = ShapesCommand.rectangle();
            shape.execute(driverManager.getCurrentDriver());
        }
    }
}
