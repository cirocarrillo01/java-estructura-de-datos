package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component//importante agregar
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tableModelClientes;
    private Integer idCliente;
    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio=clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
        clientesTabla.addMouseListener(new MouseAdapter() {
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
    }
    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }
    private void createUIComponents() {//creandolo manualmente
        // TODO: place custom component creation code here
        //this.tableModelClientes = new DefaultTableModel(0,4);
        //evitamos la ediccion de los valores de las celdas de la tabla
        this.tableModelClientes = new DefaultTableModel(0,4){
            @Override
            public boolean isCellEditable(int row,int colum){
                return false;
            }
        };
        String[]cabeceros = {"ID","Nombre","apellido","Membresia"};
        this.tableModelClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(tableModelClientes);
        // restringimos la selecion de la tabla a un solo registro
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //cargar listado de clientes
        listarClientes();
    }
    private void listarClientes(){
        this.tableModelClientes.setRowCount(0);
        var clientes = this.clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            this.tableModelClientes.addRow(renglonCliente);
        });

    }
    private void guardarCliente(){
        if (nombreTexto.getText().equals("")){
            mostrarMensaje("Poporciona un nombre");
            nombreTexto.requestFocusInWindow();
            return;
        }
        if (membresiaTexto.getText().equals("")){
            mostrarMensaje("proporciona una membresia");
            membresiaTexto.requestFocusInWindow();
            return;
        }
        //recuperamos los valores del formulario
        var nombre = nombreTexto.getText();
        var apellido = apellidoTexto.getText();
        var membresia = Integer.parseInt(membresiaTexto.getText());
        var cliente = new Cliente(this.idCliente,nombre,apellido,membresia);
        this.clienteServicio.guardarCliente(cliente);//inserta / modificar
        if(this.idCliente==null)
            mostrarMensaje("se agrego el nuevo Cliente");
        else
            mostrarMensaje("se actualizo el cliente");
        limpiarFormulario();
        listarClientes();
    }
    private void cargarClienteSeleccionado() {
        var renglon = clientesTabla.getSelectedRow();
        if (renglon != -1) {// -1 significa que no selecciono ningun registro
            var id = clientesTabla.getModel().getValueAt(renglon,0).toString();
            this.idCliente=Integer.parseInt(id);
            var nombre = clientesTabla.getModel().getValueAt(renglon,1).toString();
            this.nombreTexto.setText(nombre);
            var apellido = clientesTabla.getModel().getValueAt(renglon,2).toString();
            this.apellidoTexto.setText(apellido);
            var membresia = clientesTabla.getModel().getValueAt(renglon,3).toString();
            this.membresiaTexto.setText(membresia);
        }
    }
    private void eliminarCliente(){
        var renglon = clientesTabla.getSelectedRow();
        if (renglon!=-1){
            var idClienteStr = clientesTabla.getModel().getValueAt(renglon,0).toString();
            this.idCliente=Integer.parseInt(idClienteStr);
            var cliente = new Cliente();
            cliente.setId(this.idCliente);
            clienteServicio.eliminarCliente(cliente);
            mostrarMensaje("cliente con id: "+ this.idCliente+" eliminado");
            limpiarFormulario();
            listarClientes();
        }
        else
            mostrarMensaje("debe selecionar un cliente a eliminar");
    }
    private void limpiarFormulario(){
        nombreTexto.setText("");
        apellidoTexto.setText("");
        membresiaTexto.setText("");
        //limpiamos el id del cliente selecionado
        this.idCliente = null;
        //deselecionamos el registro selecionado de la tabla
        this.clientesTabla.getSelectionModel().clearSelection();
    }
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
