package InterfazParoNacional;


import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ParoNacional.Directorio;
import ParoNacional.Victima;

/**
 * Clase que representa la interfaz grafica
 */
public class InterfazParoNacional   extends JFrame {
    /**
     * Constante que representa la ruta del archivo al cual se persiste
     */
    public static final String RUTA_PERSISTENCIA = "ArchivoPersistencia/Directorio.csv";

    /**
     * Atributo que modela la relacion con el panel de botones
     */
    private PanelBotones panelBotones;

    /**
     * Atributo que modela la relacion con el panel de la lista de victimas
     */
    private PanelLista panelLista;

    /**
     * Atributo que modela la relacion con el panel de informacion de la victima buscada
     */
    private PanelInfo panelInfo;

    /**
     * Atributo que modela la relacion de la interfaz grafica y la parte logica del programa
     */
    private Directorio directorio;

    /**
     * Este metodo se encarga de contruir la interfaz grafica
     */
    public InterfazParoNacional() {
        setLayout(new BorderLayout());
        setTitle("PARO NACIONAL 2021");
        setSize(800, 500);
        setResizable(false);

        directorio = new Directorio(RUTA_PERSISTENCIA);

        panelBotones = new PanelBotones(this);
        panelLista = new PanelLista(this);
        panelInfo = new PanelInfo();

        JPanel aux = new JPanel();
        aux.setLayout(new GridLayout(1, 2));

        aux.add(panelLista);
        aux.add(panelInfo);

        add(panelBotones, BorderLayout.SOUTH);
        add(aux, BorderLayout.CENTER);

        cerrar();
    }
}