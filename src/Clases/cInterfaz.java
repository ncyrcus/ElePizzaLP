package Clases;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

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
    public Label laPreMe;
    public Label laPreDe;
    public Pane Winner;

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
        if(catzzeria.getNumeroEstrellas()==5){
            Winner.setVisible(true);
        }

    }

    public void clickCoMePi(ActionEvent actionEvent) {
        catzzeria.mejorarComida();
        nuCoPre.setText(String.valueOf(catzzeria.getPrecioComida()));
        nuCoCos.setText(String.valueOf(catzzeria.getCostoComida()));
    }

    
    
    
    
    public void inCoMeChi(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioMesaChica()));

    }
    public void inVeMeChi(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio venta:"+String.valueOf(catzzeria.getPrecioMesaChica()-100));
    }
    public void inCoMeMe(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioMesaMediana()));

    }
    public void inCoVeMe(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio venta:"+String.valueOf(catzzeria.getPrecioMesaMediana()-200));
    }
    public void inCoMeGra(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioMesaGrande()));
    }
    public void inVeMeGra(Event event) {
        laPreMe.setVisible(true);
        laPreMe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioMesaGrande()-300));
    }


    public void outClickMesa(Event event) {
        laPreMe.setVisible(false);
    }


    public void inCoDeRe(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioDeRe()));
    }

    public void inCoDeBo(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioDeBo()));
    }

    public void inCoDeEs(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio compra:"+String.valueOf(catzzeria.getPrecioDeEs()));
    }

    public void inVeDeRe(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio venta:"+String.valueOf(catzzeria.getPrecioDeRe()-75));
    }

    public void inVeDeBo(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio venta:"+String.valueOf(catzzeria.getPrecioDeBo()-150));
    }

    public void inVeDeEs(Event event) {
        laPreDe.setVisible(true);
        laPreDe.setText("Precio venta:"+String.valueOf(catzzeria.getPrecioDeRe()-300));
    }

    public void outClickDeco(Event event) {
        laPreDe.setVisible(false);
    }
}
        