package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import application.Main;
import controle.ControleVenda;
import exceptions.CampoEmBrancoException;
import modelo.Pedido;
import modelo.Venda;

@SuppressWarnings("serial")
public class TelaVizualizarVendaUnica extends javax.swing.JDialog {

    ControleVenda controleVenda = Main.controleVenda;

    public TelaVizualizarVendaUnica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
                        
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ConsultarVendaPanelConsulta = new javax.swing.JPanel();
        VendaUnicaBtnPesquisar = new javax.swing.JButton();
        VendaUnicaInputCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        VendaUnicaInputVendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        VendaUnicaInputCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        VendaUnicaPrecoTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        VendaUnicaTblProdutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar venda ID");
        setLocation(new java.awt.Point(300, 150));
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel3.setText("Consultar venda por ID");

        ConsultarVendaPanelConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        VendaUnicaBtnPesquisar.setText("Pesquisar ID");
        VendaUnicaBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaUnicaBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Vendedor:");

        VendaUnicaInputVendedor.setEditable(false);

        jLabel2.setText("Cliente:");

        VendaUnicaInputCliente.setEditable(false);

        jLabel4.setText("Total da venda:");

        VendaUnicaPrecoTotal.setEditable(false);

        VendaUnicaTblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Pre�o", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(VendaUnicaTblProdutos);

        jLabel5.setText("Produtos:");

        javax.swing.GroupLayout ConsultarVendaPanelConsultaLayout = new javax.swing.GroupLayout(ConsultarVendaPanelConsulta);
        ConsultarVendaPanelConsulta.setLayout(ConsultarVendaPanelConsultaLayout);
        ConsultarVendaPanelConsultaLayout.setHorizontalGroup(
            ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VendaUnicaPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addComponent(VendaUnicaInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VendaUnicaBtnPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VendaUnicaInputCliente)
                            .addComponent(VendaUnicaInputVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15))
        );
        ConsultarVendaPanelConsultaLayout.setVerticalGroup(
            ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VendaUnicaBtnPesquisar)
                            .addComponent(VendaUnicaInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(VendaUnicaInputVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(VendaUnicaInputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(VendaUnicaPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ConsultarVendaPanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarVendaPanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                        

    private void VendaUnicaBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {   
    	try {
    		//MODELO DA TABELA
            DefaultTableModel tabelaPedidos = (DefaultTableModel) VendaUnicaTblProdutos.getModel();
        	
            Integer id = Integer.parseInt(VendaUnicaInputCod.getText());
            if(VendaUnicaInputCod.getText().equals("")) {
            	throw new CampoEmBrancoException("C�digo inv�lido!");
            }
            Venda vendaConsultada = controleVenda.consultarVenda(id);
            if(vendaConsultada == null) {
            	throw new CampoEmBrancoException("C�digo inv�lido!");            	
            }
            VendaUnicaInputCliente.setText(vendaConsultada.getCliente().getNome());
            VendaUnicaInputVendedor.setText(vendaConsultada.getVendedor().getNome());
            VendaUnicaPrecoTotal.setText(String.valueOf(String.format("%.2f", vendaConsultada.getValorVenda())));
            
            // REMOVENDO DADOS DA TABELA
            while (VendaUnicaTblProdutos.getModel().getRowCount() > 0) {  
                   ((DefaultTableModel) VendaUnicaTblProdutos.getModel()).setRowCount(0);  
            }
            for(Pedido p: vendaConsultada.getCarrinho()) {
            	String preco = String.format("%.2f", p.getProduto().getPreco());
            	String totalFormatado = String.format("%.2f", p.getPrecoTotal());
            	Object[] novoItem = new Object[] {
            			p.getProduto().getId(),
            			p.getProduto().getNome(),
            			p.getQuantidade(),
            			preco,
            			totalFormatado

                    };
            	
            	// NOVA LINHA TABELA
            	tabelaPedidos.addRow(novoItem);
            }
    	}catch (CampoEmBrancoException | NumberFormatException e) {
    		JOptionPane.showMessageDialog(this, "C�digo inv�lido", "Erro", JOptionPane.ERROR_MESSAGE);
		}
    }                                                      

//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                TelaVizualizarVendaUnica dialog = new TelaVizualizarVendaUnica(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
                 
    private javax.swing.JPanel ConsultarVendaPanelConsulta;
    private javax.swing.JButton VendaUnicaBtnPesquisar;
    private javax.swing.JTextField VendaUnicaInputCliente;
    private javax.swing.JTextField VendaUnicaInputCod;
    private javax.swing.JTextField VendaUnicaInputVendedor;
    private javax.swing.JTextField VendaUnicaPrecoTotal;
    private javax.swing.JTable VendaUnicaTblProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;                  
}
