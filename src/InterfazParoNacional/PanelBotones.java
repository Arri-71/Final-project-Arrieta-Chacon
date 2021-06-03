package InterfazParoNacional;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import ParoNacional.Victima;

public class PanelBotones extends JPanel   implements ActionListener
{
    /**
     * Constante que representa el comando de agregar
     */
    public static final String AGREGAR = "Agregar";

    /**
     * Constante que representa el comando de buscar
     */
    public static final String BUSCAR = "Buscar";

    /**
     * Constante que representa el comando de editar
     */
    public static final String EDITAR = "Editar";

    /**
     * Constante que representa el comando de eliminar
     */
    public static final String ELIMINAR = "Eliminar";

    /**
     * Constante que representa el comando de exportar
     */
    public static final String EXPORTAR = "Exportar";

    /**
     * Atributo que modela la relacion del panel con la interfaz grafica
     */
    private InterfazParoNacional ventana;

    /**
     * Atributo que representa el boton de agregar
     */
    private JButton butAgregar;

    /**
     * Atributo que representa el boton de buscar
     */
    private JButton butBuscar;

    /**
     * Atributo que representa el boton de editar
     */
    private JButton butEditar;

    /**
     * Atributo que representa el boton de eliminar
     */
    private JButton butEliminar;

    /**
     * Atributo que representa el boton de exportar
     */
    private JButton butExportar;

    /**
     * Este metodo se encarga de crear en la panel de botones
     * @param pVentana Interfaz grafica madre
     */
    public PanelBotones(InterfazParoNacional pVentana) {
        ventana = pVentana;

        setLayout(new GridLayout(1, 5));
        setSize(100, 250);
        TitledBorder borde = BorderFactory.createTitledBorder("Opciones");
        setBorder(borde);

        //Creaci�n de los botones
        butAgregar = new JButton(AGREGAR);
        butAgregar.setActionCommand(AGREGAR);
        butAgregar.addActionListener(this);

        butBuscar = new JButton(BUSCAR);
        butBuscar.setActionCommand(BUSCAR);
        butBuscar.addActionListener(this);

        butEditar = new JButton(EDITAR);
        butEditar.setActionCommand(EDITAR);
        butEditar.addActionListener(this);

        butEliminar = new JButton(ELIMINAR);
        butEliminar.setActionCommand(ELIMINAR);
        butEliminar.addActionListener(this);

        butExportar = new JButton(EXPORTAR);
        butExportar.setActionCommand(EXPORTAR);
        butExportar.addActionListener(this);

        add(butAgregar);
        add(butBuscar);
        add(butEditar);
        add(butEliminar);
        add(butExportar);
    }
}