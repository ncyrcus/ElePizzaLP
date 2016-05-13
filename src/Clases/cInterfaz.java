package Clases;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Created by Neekuu on 13-05-2016.
 */
public class cInterfaz {
    public Label nuMeChi;
    public Label nuMeMe;
    public Label nuMeGra;
    public Label nuEmpCo;
    public Label nuEmpMe;
    public Label nuDeRe;
    public Label nuDeBo;
    public Label nuDeEs;
    public Label CPInf;
    public Label CAInf;
    public Label CSInf;
    public Label CRInf;
    public Label ESTInfo;
    public Label Dinero;
    public Label nuCoCos;
    public Label nuCoPre;
    public Label COSInf;
    public Label INGInf;
    public Label SUEInf;
    public Label RESInf;
    public Label DiaInfo;

    Local catzzeria = new Local();

    public void clickCoEmpCo(ActionEvent actionEvent) {
        catzzeria.contratarCocinero();
        nuEmpCo.setText(String.valueOf(catzzeria.cantidadCocineros()));
    }

    public void clickVeMeChi(ActionEvent actionEvent) {
        catzzeria.venderMesaChica();
        nuMeChi.setText(String.valueOf(catzzeria.getNumeroMesaChica()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));

    }

    public void clickCoMeChi(ActionEvent actionEvent) {
        catzzeria.comprarMesaChica();
        nuMeChi.setText( String.valueOf(catzzeria.getNumeroMesaChica()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickCoMeMe(ActionEvent actionEvent) {
        catzzeria.comprarMesaMediana();
        nuMeMe.setText(String.valueOf(catzzeria.getNumeroMesaMediana()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickVeMeMe(ActionEvent actionEvent) {
        catzzeria.venderMesaMediana();
        nuMeMe.setText(String.valueOf(catzzeria.getNumeroMesaMediana()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickCoMeGra(ActionEvent actionEvent) {
        catzzeria.comprarMesaGrande();
        nuMeGra.setText(String.valueOf(catzzeria.getNumeroMesaGrande()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }


    public void clickVeMeGra(ActionEvent actionEvent) {
        catzzeria.venderMesaGrande();
        nuMeGra.setText(String.valueOf(catzzeria.getNumeroMesaGrande()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickDeEmpCo(ActionEvent actionEvent) {
        catzzeria.despedirCocinero();
        nuEmpCo.setText(String.valueOf(catzzeria.cantidadCocineros()));
    }

    public void clickCoEmpMe(ActionEvent actionEvent) {
        catzzeria.contratarMesero();
        nuEmpMe.setText(String.valueOf(catzzeria.cantidadMeseros()));
    }

    public void clickDeEmpMe(ActionEvent actionEvent) {
        catzzeria.despedirMesero();
        nuEmpCo.setText(String.valueOf(catzzeria.cantidadMeseros()));
    }

    public void clickCoDeRe(ActionEvent actionEvent) {
        catzzeria.comprarDecoracionRegular();
        nuDeRe.setText(String.valueOf(catzzeria.getNumeroDecoracionRegular()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickVeDeRe(ActionEvent actionEvent) {
        catzzeria.venderDecoracionRegular();
        nuDeRe.setText(String.valueOf(catzzeria.getNumeroDecoracionRegular()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickCoDeBo(ActionEvent actionEvent) {
        catzzeria.comprarDecoracionBonita();
        nuDeBo.setText(String.valueOf(catzzeria.getNumeroDecoracionBonita()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickVeDeBo(ActionEvent actionEvent) {
        catzzeria.venderDecoracionBonita();
        nuDeBo.setText(String.valueOf(catzzeria.getNumeroDecoracionBonita()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickCoDeEs(ActionEvent actionEvent) {
        catzzeria.comprarDecoracionEspectacular();
        nuDeEs.setText(String.valueOf(catzzeria.getNumeroDecoracionEspectacular()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));

    }

    public void clickVeDeEs(ActionEvent actionEvent) {
        catzzeria.venderDecoracionEspectacular();
        nuDeEs.setText(String.valueOf(catzzeria.getNumeroDecoracionEspectacular()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
    }

    public void clickTrabajar(ActionEvent actionEvent) {
        catzzeria.realizarDia();
        Dia diaactual = catzzeria.getDiaActual();
        CPInf.setText(String.valueOf(diaactual.getClientesPotenciales()));
        CAInf.setText(String.valueOf(diaactual.getClientesAtendidos()));
        CSInf.setText(String.valueOf(diaactual.getClientesSentados()));
        CRInf.setText(String.valueOf(diaactual.getClientesRecibidos()));
        COSInf.setText(String.valueOf(diaactual.getCosto()));
        INGInf.setText(String.valueOf(diaactual.getIngreso()));
        SUEInf.setText(String.valueOf(diaactual.getSueldo()));
        RESInf.setText(String.valueOf(diaactual.getResultado()));
        Dinero.setText(String.valueOf(catzzeria.getDineroActual()));
        DiaInfo.setText(String.valueOf(catzzeria.getNumeroDia()));
        ESTInfo.setText(String.valueOf(catzzeria.getNumeroEstrellas()));

    }

    public void clickCoMePi(ActionEvent actionEvent) {
        catzzeria.mejorarComida();
        nuCoPre.setText(String.valueOf(catzzeria.getPrecioComida()));
        nuCoCos.setText(String.valueOf(catzzeria.getCostoComida()));
    }
}
