package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import application.Main;
import controle.ControleCliente;
import controle.ControleProduto;
import controle.ControleVenda;
import controle.ControleVendedor;
import exceptions.CampoEmBrancoException;
import exceptions.CarrinhoException;
import exceptions.EstoqueException;
import exceptions.IdProdutoException;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;
import modelo.Venda;
import modelo.Vendedor;

@SuppressWarnings("serial")
public class TelaRealizarVenda extends javax.swing.JDialog {
    ControleCliente controleCliente = Main.controleCliente;
    ControleVendedor controleVendedor = Main.controleVendedor;
    ControleProduto controleProduto = Main.controleProduto;
    ControleVenda controleVenda = Main.controleVenda;

    public TelaRealizarVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
                          
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
        RealizarVendaInputCodProduto = new javax.swing.JTextField();
        RealizarVendaInputNomeProduto = new javax.swing.JTextField();
        RealizarVendaInputPrecoProduto = new javax.swing.JTextField();
        RealizarVendaInputQtdProduto = new javax.swing.JTextField();
        RealizarVendaPanelVendedor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        RealizarVendaBtnPesquisarVendedor = new javax.swing.JButton();
        RealizarVendaInputNomeVendedor = new javax.swing.JTextField();
        RealizarVendaPanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RealizarVendaBtnPesquisarCliente = new javax.swing.JButton();
        RealizarVendaInputCPF = new javax.swing.JFormattedTextField();
        RealizarVendaInputNomeCliente = new javax.swing.JTextField();
        RealizarVendaBtnCancelarVenda = new javax.swing.JButton();
        RealizarVendaBtnRealizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Venda");
        setLocation(new java.awt.Point(200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel3.setText("REALIZAR VENDA");

        RealizarVendaPanelTbl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho de compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

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

        RealizarVendaPanelTotalVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total da venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel12.setText("TOTAL DA VENDA:");

        RealizarVendaInputTotalVendaInput.setEditable(false);
        RealizarVendaInputTotalVendaInput.setFont(new java.awt.Font("Segoe UI", 1, 18));
        RealizarVendaInputTotalVendaInput.setText("0.0");

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

        RealizarVendaPanelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

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

        RealizarVendaBtnAdicionarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 12));
        RealizarVendaBtnAdicionarCarrinho.setText("Adicionar ao carrinho");
        RealizarVendaBtnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        RealizarVendaInputNomeProduto.setEditable(false);

        RealizarVendaInputPrecoProduto.setEditable(false);

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
                        .addComponent(RealizarVendaInputCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RealizarVendaBtnPesquisarProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RealizarVendaPanelProdutosLayout.createSequentialGroup()
                        .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(RealizarVendaInputPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RealizarVendaInputQtdProduto))
                                    .addComponent(RealizarVendaBtnAdicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(RealizarVendaPanelProdutosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RealizarVendaInputNomeProduto)))
                        .addGap(1, 1, 1)))
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
                    .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(RealizarVendaInputPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RealizarVendaPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(RealizarVendaInputQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(RealizarVendaBtnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RealizarVendaPanelVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        jLabel7.setText("Nome:");

        RealizarVendaBtnPesquisarVendedor.setText("Pesquisar");
        RealizarVendaBtnPesquisarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnPesquisarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RealizarVendaPanelVendedorLayout = new javax.swing.GroupLayout(RealizarVendaPanelVendedor);
        RealizarVendaPanelVendedor.setLayout(RealizarVendaPanelVendedorLayout);
        RealizarVendaPanelVendedorLayout.setHorizontalGroup(
            RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RealizarVendaBtnPesquisarVendedor)
                .addGap(18, 18, 18))
            .addGroup(RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RealizarVendaPanelVendedorLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(RealizarVendaInputNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        RealizarVendaPanelVendedorLayout.setVerticalGroup(
            RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelVendedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RealizarVendaBtnPesquisarVendedor))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(RealizarVendaPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RealizarVendaPanelVendedorLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(RealizarVendaInputNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        RealizarVendaPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

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

        RealizarVendaInputNomeCliente.setEditable(false);

        javax.swing.GroupLayout RealizarVendaPanelClienteLayout = new javax.swing.GroupLayout(RealizarVendaPanelCliente);
        RealizarVendaPanelCliente.setLayout(RealizarVendaPanelClienteLayout);
        RealizarVendaPanelClienteLayout.setHorizontalGroup(
            RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RealizarVendaPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RealizarVendaPanelClienteLayout.createSequentialGroup()
                        .addComponent(RealizarVendaInputCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RealizarVendaBtnPesquisarCliente))
                    .addComponent(RealizarVendaInputNomeCliente))
                .addGap(17, 17, 17))
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
                .addGroup(RealizarVendaPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(RealizarVendaInputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        RealizarVendaBtnCancelarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14));
        RealizarVendaBtnCancelarVenda.setText("CANCELAR VENDA");
        RealizarVendaBtnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaBtnCancelarVendaActionPerformed(evt);
            }
        });

        RealizarVendaBtnRealizarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14));
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
    }                       

    private void RealizarVendaBtnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        Cliente c = controleCliente.pesquisarClientePorCPF(RealizarVendaInputCPF.getText()); // PESQUISANDO CLIENTE POR CPF NO BANCO DE DADOS
        RealizarVendaInputNomeCliente.setText(c.getNome()); // ADICIONANDO AO INPUT
    }                                                                

    private void RealizarVendaBtnPesquisarVendedorActionPerformed(java.awt.event.ActionEvent evt) {                                                                  
        Vendedor v = controleVendedor.pesquisarPorNome(RealizarVendaInputNomeVendedor.getText());  // PESQUISANDO VENDEDOR NO BANCO DE DADOS
        RealizarVendaInputNomeVendedor.setText(v.getNome()); // ADICIONANDO AO INPUT
    }                                                                                                                               

    private void RealizarVendaBtnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {     
    	try {
    		Produto p = controleProduto.pesquisarProdutoId(Integer.parseInt(RealizarVendaInputCodProduto.getText())); // PESQUISANDO PRODUTO POR ID NO BANCO DE DADOS
    		controleProduto.checarIdNoSistema(Integer.parseInt(RealizarVendaInputCodProduto.getText())); // CHECANDO SE INPUT DIGITADO EXISTE NO BANCO DE DADOS
    		RealizarVendaInputNomeProduto.setText(p.getNome()); // SETANDO INPUT
    		RealizarVendaInputPrecoProduto.setText(String.format("%.2f", p.getPreco())); // SETANDO INPUT
    	}catch(NumberFormatException | IdProdutoException e) {
    		JOptionPane.showMessageDialog(this, "C�digo inv�lido!", "Erro", JOptionPane.ERROR_MESSAGE);
    	}
    }                                                                

    private void RealizarVendaBtnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {
    	int totalRows = RealizarVendaTblCarrinho.getRowCount(); // PEGANDO QTD DE LINHAS DA TABELA
    	for(int i = 0; i < totalRows; i++) { // ADICIONANDO O ESTOQUE DE VOLTA
    		Integer cod = (Integer) RealizarVendaTblCarrinho.getModel().getValueAt(i, 0);
    		Integer quantidade = (Integer) RealizarVendaTblCarrinho.getModel().getValueAt(i, 2);
    		controleProduto.aumentarEstoque(cod, quantidade);
    	}
        dispose(); // FECHANDO O PROGRAMA
    }                                                             

    private void RealizarVendaBtnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        try {
        	int totalRows = RealizarVendaTblCarrinho.getRowCount(); // PEGANDO QTD DE LINHAS DA TABELA 
        	if(totalRows == 0) { // SE LINHAS FOREM ZERO
        		throw new CarrinhoException("Carrinho v�zio!"); 
        	}
        	
        	List<Pedido> pedidos = new ArrayList<>();
        	
        	for(int i = 0; i < totalRows; i++) { // GERANDO UM NOVO PEDIDO DE ACORDO COM A TABELA
        		Integer cod = (Integer) RealizarVendaTblCarrinho.getModel().getValueAt(i, 0);
        		String nome = (String) RealizarVendaTblCarrinho.getModel().getValueAt(i, 1);
        		Integer quantidade = (Integer) RealizarVendaTblCarrinho.getModel().getValueAt(i, 2);
        		Double preco = Double.parseDouble(String.valueOf(RealizarVendaTblCarrinho.getModel().getValueAt(i, 3)).replace(",", "."));
        		Double precoTotal = Double.parseDouble(String.valueOf(RealizarVendaTblCarrinho.getModel().getValueAt(i, 4)).replace(",", "."));
        		
        		Pedido p = new Pedido(new Produto(cod, preco, nome), quantidade, precoTotal);
        		pedidos.add(p);
        	}
        	
        	Cliente cliente = controleCliente.pesquisarClientePorCPF(RealizarVendaInputCPF.getText()); // PEGANDO CLIENTE 
        	Vendedor vendedor = controleVendedor.pesquisarPorNome(RealizarVendaInputNomeVendedor.getText()); // PEGANDO VENDEDOR
        	if(cliente.getCpf() == null || vendedor.getNome() == null) { // CAMPOS EM BRANCO
        		throw new CampoEmBrancoException(""); 
        	}
        	
        	controleVenda.adicionarVenda(new Venda(
        			controleVenda.ultimoCodigoCadastrado() + 1, 
        			new Date(), 
        			controleVenda.totalVenda(pedidos), 
        			vendedor, 
        			cliente, 
        			pedidos)); // ADICIONANDO VENDA AO BANCO DE DADOS
        	JOptionPane.showMessageDialog(this, "Venda realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE); // MSG SUCESSO
        	dispose(); // FECHANDO PROGRAMA
        } catch(CampoEmBrancoException e) {
        	JOptionPane.showMessageDialog(this, "Campos inv�lidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (CarrinhoException e) {
        	JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
    }                                                                                                                      

    private void RealizarVendaBtnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
            DefaultTableModel tabelaCarrinho = (DefaultTableModel) RealizarVendaTblCarrinho.getModel(); //MODELO DA TABELA
            
            //PEGANDO INFORMA��ES DIGITADAS
        	Integer cod = Integer.parseInt(RealizarVendaInputCodProduto.getText());        	
        	String nome = RealizarVendaInputNomeProduto.getText();
        	Integer qtd = Integer.parseInt(RealizarVendaInputQtdProduto.getText());
        	if(qtd <= 0) {
        		throw new EstoqueException("Quantidade n�o pode ser 0!"); // QTD IGUAL A ZERO
        	}
        	
        	// PEGANDO VALORES EM REAL E TRANSFORMANDO
        	Double preco = Double.parseDouble(String.valueOf(RealizarVendaInputPrecoProduto.getText()).replace(",", "."));
        	Double total = qtd * preco;
        	String precoReal = String.format("%.2f", Double.parseDouble(String.valueOf(RealizarVendaInputPrecoProduto.getText()).replace(",", ".")));
        	String totalFormatado = String.format("%.2f", total);
        	
        	//DIMINUINDO ESTOQUE
        	controleProduto.diminuirEstoque(cod, qtd);
        	
        	// NOVO ARRAY COM O ITEM
        	Object[] novoItem = new Object[] {
        			cod,
        			nome,
        			qtd,
        			precoReal,
        			totalFormatado
                };
        	
        	tabelaCarrinho.addRow(novoItem); // NOVA LINHA TABELA
        	
        	//MOSTRANDO TOTAL
        	Double precoAnterior = Double.parseDouble(RealizarVendaInputTotalVendaInput.getText().replace(",", "."));
        	Double novoPreco = precoAnterior + total;
        	RealizarVendaInputTotalVendaInput.setText(String.format("%.2f", novoPreco));
        	
        	//APAGANDO CAMPOS
        	RealizarVendaInputCodProduto.setText("");
        	RealizarVendaInputNomeProduto.setText("");
        	RealizarVendaInputPrecoProduto.setText("");
        	RealizarVendaInputQtdProduto.setText("");
    	}catch(NumberFormatException e) {
    		JOptionPane.showMessageDialog(this, "Campos inv�lidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    	} catch (EstoqueException e) {
    		JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
//            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                TelaRealizarVenda dialog = new TelaRealizarVenda(new javax.swing.JFrame(), true);
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
                  
    private javax.swing.JButton RealizarVendaBtnAdicionarCarrinho;
    private javax.swing.JButton RealizarVendaBtnCancelarVenda;
    private javax.swing.JButton RealizarVendaBtnPesquisarCliente;
    private javax.swing.JButton RealizarVendaBtnPesquisarProduto;
    private javax.swing.JButton RealizarVendaBtnPesquisarVendedor;
    private javax.swing.JButton RealizarVendaBtnRealizarVenda;
    private javax.swing.JFormattedTextField RealizarVendaInputCPF;
    private javax.swing.JTextField RealizarVendaInputCodProduto;
    private javax.swing.JTextField RealizarVendaInputNomeCliente;
    private javax.swing.JTextField RealizarVendaInputNomeProduto;
    private javax.swing.JTextField RealizarVendaInputNomeVendedor;
    private javax.swing.JTextField RealizarVendaInputPrecoProduto;
    private javax.swing.JTextField RealizarVendaInputQtdProduto;
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
}
