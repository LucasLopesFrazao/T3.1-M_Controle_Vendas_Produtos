package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author lucas
 */
@SuppressWarnings("serial")
public class RealizarVenda extends javax.swing.JDialog {

    /**
     * Creates new form CadastrarCliente
     */
    public RealizarVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        RealizarVendaPanelTbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RealizarVendaTblCarrinho = new javax.swing.JTable();
        RealizarVendaPanelTotalVenda = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        RealizarVendaInputTotalVendaInput = new javax.swing.JTextField();
        RealizarVendaPanelProdutos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        RealizarVendaBtnPesquisarProduto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RealizarVendaBtnAdicionarCarrinho = new javax.swing.JButton();
        RealizarVendaInputCodProduto = new javax.swing.JFormattedTextField();
        RealizarVendaInputNomeProduto = new javax.swing.JFormattedTextField();
        RealizarVendaInputPrecoProduto = new javax.swing.JFormattedTextField();
        RealizarVendaInputQtdProduto = new javax.swing.JFormattedTextField();
        RealizarVendaPanelVendedor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        RealizarVendaBtnPesquisarVendedor = new javax.swing.JButton();
        RealizarVendaInputNomeVendedor = new javax.swing.JFormattedTextField();
        RealizarVendaPanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RealizarVendaBtnPesquisarCliente = new javax.swing.JButton();
        RealizarVendaInputCPF = new javax.swing.JFormattedTextField();
        RealizarVendaInputNomeCliente = new javax.swing.JFormattedTextField();
        RealizarVendaBtnCancelarVenda = new javax.swing.JButton();
        RealizarVendaBtnRealizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Venda");
        setLocation(new java.awt.Point(200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("REALIZAR VENDA");

        RealizarVendaPanelTbl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho de compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        RealizarVendaTblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Produto", "Quantidade", "Pre�o", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(RealizarVendaTblCarrinho);

        javax.swing.GroupLayout RealizarVendaPanelTblLayout = new javax.swing.GroupLayout(RealizarVendaPanelTbl);
        RealizarVendaPanelTbl.setLayout(RealizarVendaPanelTblLayout);
        RealizarVendaPanelTblLayout.setHorizontalGroup(
            RealizarVendaPanelTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        RealizarVendaPanelTblLayout.setVerticalGroup(
            RealizarVendaPanelTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );

        RealizarVendaPanelTotalVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total da venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("TOTAL DA VENDA:");

        RealizarVendaInputTotalVendaInput.setEditable(false);
        RealizarVendaInputTotalVendaInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RealizarVendaInputTotalVendaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaInputTotalVendaInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RealizarVendaPanelTotalVendaLayout = new javax.swing.GroupLayout(RealizarVendaPanelTotalVenda);
        RealizarVendaPanelTotalVenda.setLayout(RealizarVendaPanelTotalVendaLayout);
        RealizarVendaPanelTotalVendaLayout.setHorizontalGroup(
            RealizarVendaPanelTotalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelTotalVendaLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RealizarVendaInputTotalVendaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        RealizarVendaPanelTotalVendaLayout.setVerticalGroup(
            RealizarVendaPanelTotalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelTotalVendaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(RealizarVendaPanelTotalVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(RealizarVendaInputTotalVendaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        RealizarVendaPanelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel5.setText("C�digo:");

        RealizarVendaBtnPesquisarProduto.setText("Pesquisar");
        RealizarVendaBtnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnPesquisarProdutoActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome:");

        jLabel10.setText("Pre�o:");

        jLabel11.setText("Quantidade:");

        RealizarVendaBtnAdicionarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RealizarVendaBtnAdicionarCarrinho.setText("Adicionar ao carrinho");

        try {
            RealizarVendaInputCodProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            RealizarVendaInputNomeProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("????????????????????????????????????????????????????????????????????????????????????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            RealizarVendaInputPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            RealizarVendaInputQtdProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout RealizarVendaPanelProdutosLayout = new javax.swing.GroupLayout(RealizarVendaPanelProdutos);
        RealizarVendaPanelProdutos.setLayout(RealizarVendaPanelProdutosLayout);
        RealizarVendaPanelProdutosLayout.setHorizontalGroup(
            RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RealizarVendaInputCodProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RealizarVendaBtnPesquisarProduto))
                    .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RealizarVendaInputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(RealizarVendaInputPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RealizarVendaInputQtdProduto))
                            .addComponent(RealizarVendaBtnAdicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        RealizarVendaPanelProdutosLayout.setVerticalGroup(
            RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RealizarVendaBtnPesquisarProduto)
                    .addComponent(RealizarVendaInputCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(RealizarVendaInputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(RealizarVendaInputPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RealizarVendaInputQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(RealizarVendaBtnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RealizarVendaPanelVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel7.setText("Nome:");

        RealizarVendaBtnPesquisarVendedor.setText("Pesquisar");
        RealizarVendaBtnPesquisarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnPesquisarVendedorActionPerformed(evt);
            }
        });

        try {
            RealizarVendaInputNomeVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("????????????????????????????????????????????????????????????????????????????????????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout RealizarVendaPanelVendedorLayout = new javax.swing.GroupLayout(RealizarVendaPanelVendedor);
        RealizarVendaPanelVendedor.setLayout(RealizarVendaPanelVendedorLayout);
        RealizarVendaPanelVendedorLayout.setHorizontalGroup(
            RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RealizarVendaInputNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RealizarVendaBtnPesquisarVendedor)
                .addGap(18, 18, 18))
        );
        RealizarVendaPanelVendedorLayout.setVerticalGroup(
            RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelVendedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RealizarVendaBtnPesquisarVendedor)
                    .addComponent(RealizarVendaInputNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        RealizarVendaPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel2.setText("Nome:");

        jLabel4.setText("CPF:");

        RealizarVendaBtnPesquisarCliente.setText("Pesquisar");
        RealizarVendaBtnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnPesquisarClienteActionPerformed(evt);
            }
        });

        try {
            RealizarVendaInputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            RealizarVendaInputNomeCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("????????????????????????????????????????????????????????????????????????????????????????????????????")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout RealizarVendaPanelClienteLayout = new javax.swing.GroupLayout(RealizarVendaPanelCliente);
        RealizarVendaPanelCliente.setLayout(RealizarVendaPanelClienteLayout);
        RealizarVendaPanelClienteLayout.setHorizontalGroup(
            RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RealizarVendaPanelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RealizarVendaInputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RealizarVendaPanelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RealizarVendaInputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(RealizarVendaBtnPesquisarCliente)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        RealizarVendaPanelClienteLayout.setVerticalGroup(
            RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RealizarVendaInputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RealizarVendaBtnPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RealizarVendaInputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        RealizarVendaBtnCancelarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RealizarVendaBtnCancelarVenda.setText("CANCELAR VENDA");
        RealizarVendaBtnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnCancelarVendaActionPerformed(evt);
            }
        });

        RealizarVendaBtnRealizarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RealizarVendaBtnRealizarVenda.setText("REALIZAR VENDA");
        RealizarVendaBtnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnRealizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RealizarVendaPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RealizarVendaPanelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RealizarVendaPanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RealizarVendaPanelTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RealizarVendaPanelTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RealizarVendaBtnCancelarVenda)
                        .addGap(37, 37, 37)
                        .addComponent(RealizarVendaBtnRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RealizarVendaPanelTbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RealizarVendaPanelTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RealizarVendaPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RealizarVendaPanelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RealizarVendaPanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RealizarVendaBtnRealizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RealizarVendaBtnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void RealizarVendaBtnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        // TODO add your handling code here:
    }                                                                

    private void RealizarVendaBtnPesquisarVendedorActionPerformed(java.awt.event.ActionEvent evt) {                                                                  
        // TODO add your handling code here:
    }                                                                 

    private void RealizarVendaInputTotalVendaInputActionPerformed(java.awt.event.ActionEvent evt) {                                                                  
        // TODO add your handling code here:
    }                                                                 

    private void RealizarVendaBtnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        // TODO add your handling code here:
    }                                                                

    private void RealizarVendaBtnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    private void RealizarVendaBtnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RealizarVenda dialog = new RealizarVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton RealizarVendaBtnAdicionarCarrinho;
    private javax.swing.JButton RealizarVendaBtnCancelarVenda;
    private javax.swing.JButton RealizarVendaBtnPesquisarCliente;
    private javax.swing.JButton RealizarVendaBtnPesquisarProduto;
    private javax.swing.JButton RealizarVendaBtnPesquisarVendedor;
    private javax.swing.JButton RealizarVendaBtnRealizarVenda;
    private javax.swing.JFormattedTextField RealizarVendaInputCPF;
    private javax.swing.JFormattedTextField RealizarVendaInputCodProduto;
    private javax.swing.JFormattedTextField RealizarVendaInputNomeCliente;
    private javax.swing.JFormattedTextField RealizarVendaInputNomeProduto;
    private javax.swing.JFormattedTextField RealizarVendaInputNomeVendedor;
    private javax.swing.JFormattedTextField RealizarVendaInputPrecoProduto;
    private javax.swing.JFormattedTextField RealizarVendaInputQtdProduto;
    private javax.swing.JTextField RealizarVendaInputTotalVendaInput;
    private javax.swing.JPanel RealizarVendaPanelCliente;
    private javax.swing.JPanel RealizarVendaPanelProdutos;
    private javax.swing.JPanel RealizarVendaPanelTbl;
    private javax.swing.JPanel RealizarVendaPanelTotalVenda;
    private javax.swing.JPanel RealizarVendaPanelVendedor;
    private javax.swing.JTable RealizarVendaTblCarrinho;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

