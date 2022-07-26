package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import application.Main;
import controle.ControleVenda;
import modelo.Venda;

@SuppressWarnings("serial")
public class TelaConsultarVenda extends javax.swing.JDialog {
	
	ControleVenda controleVenda = Main.controleVenda;

    public TelaConsultarVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        ConsultarVendaDataFinal.setText(sdf.format(c.getTime()));
        
        c.add(Calendar.YEAR, -3);
        Date dataUmAnoAtras = c.getTime();
        ConsultarVendaDataInicial.setText(sdf.format(dataUmAnoAtras));
        ConsultarVendaBtnPesquisarActionPerformed(null);
    }
                         
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ConsultarVendaPanelConsulta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ConsultarVendaBtnPesquisar = new javax.swing.JButton();
        ConsultarVendaDataInicial = new javax.swing.JFormattedTextField();
        ConsultarVendaDataFinal = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsultarVendaTblVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de clientes");
        setLocation(new java.awt.Point(300, 150));
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel3.setText("Consultar vendas");

        ConsultarVendaPanelConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar por data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setText("Data inicial:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setText("Data fim:");

        ConsultarVendaBtnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 18));
        ConsultarVendaBtnPesquisar.setText("Pesquisar");
        ConsultarVendaBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarVendaBtnPesquisarActionPerformed(evt);
            }
        });

        try {
            ConsultarVendaDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ConsultarVendaDataInicial.setFont(new java.awt.Font("Segoe UI", 1, 18));

        try {
            ConsultarVendaDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ConsultarVendaDataFinal.setFont(new java.awt.Font("Segoe UI", 1, 18));

        javax.swing.GroupLayout ConsultarVendaPanelConsultaLayout = new javax.swing.GroupLayout(ConsultarVendaPanelConsulta);
        ConsultarVendaPanelConsulta.setLayout(ConsultarVendaPanelConsultaLayout);
        ConsultarVendaPanelConsultaLayout.setHorizontalGroup(
            ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsultarVendaDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsultarVendaDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(ConsultarVendaBtnPesquisar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        ConsultarVendaPanelConsultaLayout.setVerticalGroup(
            ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultarVendaPanelConsultaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ConsultarVendaPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(ConsultarVendaDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarVendaDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ConsultarVendaBtnPesquisar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ConsultarVendaTblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Data da venda", "Cliente", "Funcion�rio", "Total da venda"
            }
        ));
        jScrollPane1.setViewportView(ConsultarVendaTblVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(ConsultarVendaPanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarVendaPanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void ConsultarVendaBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        try {        	
        	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        	Date dataInicial = formato.parse(ConsultarVendaDataInicial.getText());
        	Date dataFinal = formato.parse(ConsultarVendaDataFinal.getText());
        	Calendar cal = Calendar.getInstance();
        	cal.setTime(dataFinal);
        	cal.add(Calendar.DATE, +1);
        	dataFinal = cal.getTime();
        	
        	List<Venda> vendasConsultadas = controleVenda.consultarVendaComData(dataInicial, dataFinal);		
    		DefaultTableModel tabelaVendas = (DefaultTableModel) ConsultarVendaTblVendas.getModel();
    		// REMOVENDO DADOS DA TABELA
            while (ConsultarVendaTblVendas.getModel().getRowCount() > 0) {  
                   ((DefaultTableModel) ConsultarVendaTblVendas.getModel()).setRowCount(0);  
            }
            
            SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
            
            for(Venda v: vendasConsultadas) {
                // PEGANDO DADOS
                Integer codigo = v.getId(); 
                String data = out.format(v.getDataVenda());
                String nomeCliente = v.getCliente().getNome();
                String funcionario = v.getVendedor().getNome();
                String preco = String.format("%.2f", v.getValorVenda());

                // INSERIR DADOS NUM NOVO ARRAY
                Object[] novaVenda = new Object[] {
                    codigo,
                    data,
                    nomeCliente,
                    funcionario,
                    preco
                };

                // NOVA LINHA TABELA
                tabelaVendas.addRow(novaVenda);
        	}
        } catch (ParseException e) {

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
//                TelaConsultarVenda dialog = new TelaConsultarVenda(new javax.swing.JFrame(), true);
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
                 
    private javax.swing.JButton ConsultarVendaBtnPesquisar;
    private javax.swing.JFormattedTextField ConsultarVendaDataFinal;
    private javax.swing.JFormattedTextField ConsultarVendaDataInicial;
    private javax.swing.JPanel ConsultarVendaPanelConsulta;
    private javax.swing.JTable ConsultarVendaTblVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;                 
}
