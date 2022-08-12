package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import application.Main;
import controle.ControleCliente;
import modelo.Cliente;

@SuppressWarnings("serial")
public class TelaCliente extends javax.swing.JDialog {
    
    ControleCliente controleCliente = Main.controleCliente;

    public TelaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controleClienteInputCod.setText(String.valueOf(controleCliente.ultimoCodigoCadastrado() + 1));
        controleClienteInputUF.setText("AC");
        controleClienteBtnListarTodosActionPerformed(null);
    }
                        
    private void initComponents() {

        controleClienteTabbedPane = new javax.swing.JTabbedPane();
        controleClienteCadastrar = new javax.swing.JPanel();
        controleClienteBtnApagarCampos = new javax.swing.JButton();
        controleClienteBtnSalvar = new javax.swing.JButton();
        controleClienteDadosPessoais = new javax.swing.JPanel();
        controleClienteInputEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        controleClienteInputCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        controleClienteInputCPF = new javax.swing.JFormattedTextField();
        controleClienteInputNome = new javax.swing.JTextField();
        controleClienteEndereco = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        controleClienteInputEndereco = new javax.swing.JTextField();
        controleClienteInputBairro = new javax.swing.JTextField();
        controleClienteInputCEP = new javax.swing.JFormattedTextField();
        controleClienteInputUF = new javax.swing.JFormattedTextField();
        controleClienteInputCidade = new javax.swing.JTextField();
        controleClienteInputNumero = new javax.swing.JTextField();
        controleClienteEstados = new javax.swing.JComboBox<>();
        controleClienteConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        controleClienteTblClientes = new javax.swing.JTable();
        controleClienteBtnExcluir = new javax.swing.JButton();
        controleClienteBtnEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        controleClienteBtnPesquisar = new javax.swing.JButton();
        controleClienteBtnListarTodos = new javax.swing.JButton();
        controleClienteInputPesquisarCPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de clientes");
        setLocation(new java.awt.Point(200, 130));

        controleClienteTabbedPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        controleClienteBtnApagarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleClienteBtnApagarCampos.setText("Apagar campos");
        controleClienteBtnApagarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteBtnApagarCamposActionPerformed(evt);
            }
        });

        controleClienteBtnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleClienteBtnSalvar.setText("Salvar");
        controleClienteBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteBtnSalvarActionPerformed(evt);
            }
        });

        controleClienteDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel1.setText("C�digo:");

        controleClienteInputCod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel5.setText("CPF:");

        try {
            controleClienteInputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout controleClienteDadosPessoaisLayout = new javax.swing.GroupLayout(controleClienteDadosPessoais);
        controleClienteDadosPessoais.setLayout(controleClienteDadosPessoaisLayout);
        controleClienteDadosPessoaisLayout.setHorizontalGroup(
            controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(controleClienteInputCod, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(controleClienteInputNome))
                .addGap(18, 18, 18)
                .addGroup(controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(controleClienteInputEmail)
                    .addComponent(controleClienteInputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controleClienteDadosPessoaisLayout.setVerticalGroup(
            controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteDadosPessoaisLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(controleClienteInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(controleClienteInputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(controleClienteInputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleClienteInputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controleClienteEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endere�o", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel6.setText("CEP:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel7.setText("Endere�o:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel8.setText("Numero:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel9.setText("Bairro:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel10.setText("Cidade:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel11.setText("UF:");

        try {
            controleClienteInputCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        controleClienteInputUF.setEditable(false);
        try {
            controleClienteInputUF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        controleClienteEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        controleClienteEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteEstadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controleClienteEnderecoLayout = new javax.swing.GroupLayout(controleClienteEndereco);
        controleClienteEndereco.setLayout(controleClienteEnderecoLayout);
        controleClienteEnderecoLayout.setHorizontalGroup(
            controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteEnderecoLayout.createSequentialGroup()
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controleClienteEnderecoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(controleClienteInputCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(controleClienteInputCidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controleClienteEnderecoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(controleClienteEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(controleClienteInputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controleClienteEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(controleClienteInputUF, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controleClienteEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(controleClienteInputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controleClienteEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(controleClienteInputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(controleClienteEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 488, Short.MAX_VALUE))
        );
        controleClienteEnderecoLayout.setVerticalGroup(
            controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteEnderecoLayout.createSequentialGroup()
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(controleClienteInputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(controleClienteInputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(controleClienteInputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(controleClienteInputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(controleClienteInputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(controleClienteInputUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleClienteEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controleClienteCadastrarLayout = new javax.swing.GroupLayout(controleClienteCadastrar);
        controleClienteCadastrar.setLayout(controleClienteCadastrarLayout);
        controleClienteCadastrarLayout.setHorizontalGroup(
            controleClienteCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleClienteCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controleClienteDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controleClienteCadastrarLayout.createSequentialGroup()
                        .addComponent(controleClienteBtnApagarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleClienteBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(controleClienteEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controleClienteCadastrarLayout.setVerticalGroup(
            controleClienteCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleClienteDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controleClienteEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleClienteBtnApagarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleClienteBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        controleClienteTabbedPane.addTab("Cadastrar", controleClienteCadastrar);

        controleClienteTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Nome", "E-mail", "CPF", "CEP", "Endereco", "Numero", "Bairro", "Cidade", "UF"
            }
        ));
        jScrollPane1.setViewportView(controleClienteTblClientes);

        controleClienteBtnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleClienteBtnExcluir.setText("Excluir");
        controleClienteBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteBtnExcluirActionPerformed(evt);
            }
        });

        controleClienteBtnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleClienteBtnEditar.setText("Editar");
        controleClienteBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteBtnEditarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel12.setText("CPF:");

        controleClienteBtnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12));
        controleClienteBtnPesquisar.setText("Pesquisar");
        controleClienteBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteBtnPesquisarActionPerformed(evt);
            }
        });

        controleClienteBtnListarTodos.setFont(new java.awt.Font("Segoe UI", 1, 12));
        controleClienteBtnListarTodos.setText("Listar todos");
        controleClienteBtnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleClienteBtnListarTodosActionPerformed(evt);
            }
        });

        try {
            controleClienteInputPesquisarCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout controleClienteConsultarLayout = new javax.swing.GroupLayout(controleClienteConsultar);
        controleClienteConsultar.setLayout(controleClienteConsultarLayout);
        controleClienteConsultarLayout.setHorizontalGroup(
            controleClienteConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
            .addGroup(controleClienteConsultarLayout.createSequentialGroup()
                .addGroup(controleClienteConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controleClienteConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleClienteInputPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleClienteBtnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleClienteBtnListarTodos))
                    .addGroup(controleClienteConsultarLayout.createSequentialGroup()
                        .addComponent(controleClienteBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleClienteBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        controleClienteConsultarLayout.setVerticalGroup(
            controleClienteConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleClienteConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleClienteConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(controleClienteBtnPesquisar)
                    .addComponent(controleClienteBtnListarTodos)
                    .addComponent(controleClienteInputPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleClienteConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleClienteBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleClienteBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        controleClienteTabbedPane.addTab("Consulta de clientes", controleClienteConsultar);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel3.setText("CONTROLE DE CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleClienteTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controleClienteTabbedPane)
                .addContainerGap())
        );

        pack();
    }                      
    
    private void controleClienteBtnApagarCamposActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        // APAGANDO TODOS OS CAMPOS
    	controleClienteInputCod.setText(String.valueOf(controleCliente.ultimoCodigoCadastrado() + 1)); // SETANDO COD PARA O PROXIMO A SER CADASTRADO
    	controleClienteInputEmail.setText("");
    	controleClienteInputNome.setText("");
    	controleClienteInputCPF.setText("");
    	controleClienteInputCEP.setText("");
    	controleClienteInputCidade.setText("");
    	controleClienteInputEndereco.setText("");
    	controleClienteInputNumero.setText("");
    	controleClienteInputBairro.setText("");
    	controleClienteInputUF.setText("");
    }                                                              

    private void controleClienteBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        int linhaSelecionada = controleClienteTblClientes.getSelectedRow(); // PEGANDO LINHA SELECIONADA DA TABELA
    	
        // SE N�O TIVER NENHUMA LINHA SELECIONADA
    	if(linhaSelecionada == -1) { 
    		JOptionPane.showMessageDialog(this, "Selecione uma linha.");
    	}else {
    		// PEGANDO DADOS DA LINHA SELECIONADA
    		Integer id = (Integer) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 0);
        	String nome = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 1);
        	String email = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 2);
        	String cpf = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 3);
        	String cep = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 4);
        	String endereco = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 5);
        	String numero = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 6);
        	String bairro = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 7);
        	String cidade = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 8);
        	String uf = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 9);
        	
        	// ALTERANDO SELE��O DA TABBEDPANE
        	controleClienteTabbedPane.setSelectedIndex(0);
        	
        	// COLOCANDO DADOS A SEREM EDITADOS NOS INPUTS
        	controleClienteInputCod.setText(String.valueOf(id));
        	controleClienteInputEmail.setText(email);
        	controleClienteInputNome.setText(nome);
        	controleClienteInputCPF.setText(cpf);
        	controleClienteInputCEP.setText(cep);
        	controleClienteInputCidade.setText(cidade);
        	controleClienteInputEndereco.setText(endereco);
        	controleClienteInputNumero.setText(numero);
        	controleClienteInputBairro.setText(bairro);
        	controleClienteInputUF.setText(uf);
    	}
    }                                                        

    private void controleClienteBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        int linhaSelecionada = controleClienteTblClientes.getSelectedRow(); // PEGANDO LINHA SELECIONADA DA TABELA
        DefaultTableModel tabelaClientes = (DefaultTableModel) controleClienteTblClientes.getModel(); // PEGANDO MODELO DA TABELA
        
        // SE N�O TIVER NENHUMA LINHA SELECIONADA
    	if(linhaSelecionada == -1) { 
    		JOptionPane.showMessageDialog(this, "Selecione uma linha.");
    	}else if(tabelaClientes.getRowCount() == 1 && linhaSelecionada == 0){ // TENTANDO EXCLUIR TABELA COM APENAS 1 CLIENTE
    		JOptionPane.showMessageDialog(this, "� necess�rio ao menos 1 cliente no sistema.");    		
    		controleClienteInputCod.setText(String.valueOf(controleCliente.ultimoCodigoCadastrado() + 1));
    	}else { // EXCLUINDO CLIENTE SELECIONADO
    		String cpf = (String) controleClienteTblClientes.getModel().getValueAt(linhaSelecionada, 3); // PEGANDO CPF DA LINHA SELECIONADA
    		controleCliente.excluirCliente(cpf);    			
    		controleClienteBtnListarTodosActionPerformed(evt);
    		JOptionPane.showMessageDialog(this, "Cliente apagado!", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
    		
    		// ADICIONANDO PROXIMO ID A SER CADASTRADO NO INPUT CODIGO
    		controleClienteInputCod.setText(String.valueOf(controleCliente.ultimoCodigoCadastrado() + 1));
    	}
    }                                                                                                                

    private void controleClienteBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {        
    	//PEGANDO INFORMA��ES DIGITADAS NOS INPUTS
    	Integer novoCodigoCliente = Integer.parseInt(controleClienteInputCod.getText());
    	String nomeCliente = controleClienteInputNome.getText();
    	String emailCliente = controleClienteInputEmail.getText();
    	String cpf = controleClienteInputCPF.getText();
    	String cepCliente = controleClienteInputCEP.getText();
    	String cidadeCliente = controleClienteInputCidade.getText();
    	String enderecoCliente = controleClienteInputEndereco.getText();
    	String numeroCliente = controleClienteInputNumero.getText();
    	String bairroCliente = controleClienteInputBairro.getText();
    	String ufCliente = controleClienteInputUF.getText();
    	
    	// CHECAGENS
    	if(!controleCliente.validarCPF(cpf)) { // CPF INV�LIDO
    		JOptionPane.showMessageDialog(this, "CPF inv�lido", "Erro", JOptionPane.ERROR_MESSAGE);
    	}else if(controleClienteInputNome.getText().equals("") ||
    			controleClienteInputEmail.getText().equals("") ||
    			controleClienteInputCPF.getText().equals("") ||
    			controleClienteInputCEP.getText().equals("") ||
    			controleClienteInputCidade.getText().equals("") ||
    			controleClienteInputNumero.getText().equals("") ||
    			controleClienteInputBairro.getText().equals("") ||
    			controleClienteInputUF.getText().equals("")
    			) { // CAMPOS EM BRANCO
    		JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
    	}else if(!controleCliente.validarEmail(emailCliente)) { // EMAIL INV�LIDO
    		JOptionPane.showMessageDialog(this, "E-mail inv�lido!");
    	}
    	else if(controleCliente.checarId(novoCodigoCliente)) { // CHECANDO SE O ID DO CLIENTE J� EXISTE E OS DADOS EST�O SENDO EDITADOS
    		controleCliente.editarCliente(new Cliente(novoCodigoCliente, nomeCliente, emailCliente, cpf, cepCliente, cidadeCliente, enderecoCliente, numeroCliente, bairroCliente, ufCliente));
    		// APAGANDO OS INPUTS DIGITADOS
    		controleClienteInputEmail.setText("");
    		controleClienteInputNome.setText("");
    		controleClienteInputCPF.setText("");
    		controleClienteInputCEP.setText("");
    		controleClienteInputCidade.setText("");
    		controleClienteInputEndereco.setText("");
    		controleClienteInputNumero.setText("");
    		controleClienteInputBairro.setText("");
    		controleClienteInputUF.setText("");
    		
    		// ADICIONANDO PROXIMO ID A SER CADASTRADO NO INPUT CODIGO
    		controleClienteInputCod.setText(String.valueOf(controleCliente.ultimoCodigoCadastrado() + 1));
    		
    		// ALTERANDO TABBEDPANE E ATUALIZANDO LISTA
    		controleClienteTabbedPane.setSelectedIndex(1);
    		controleClienteBtnListarTodosActionPerformed(evt);
    	}else { // CLIENTE COM ID NOVO
    		if(controleCliente.cpfNoSistema(cpf)) {
    			JOptionPane.showMessageDialog(this, "CPF j� cadastrado no sistema!");
    		}else {
	    		controleCliente.adicionarCliente(new Cliente(novoCodigoCliente, nomeCliente, emailCliente, cpf, cepCliente, cidadeCliente, enderecoCliente, numeroCliente, bairroCliente, ufCliente));
	    		// APAGANDO OS INPUTS DIGITADOS
	    		controleClienteInputEmail.setText("");
	    		controleClienteInputNome.setText("");
	    		controleClienteInputCPF.setText("");
	    		controleClienteInputCEP.setText("");
	    		controleClienteInputCidade.setText("");
	    		controleClienteInputEndereco.setText("");
	    		controleClienteInputNumero.setText("");
	    		controleClienteInputBairro.setText("");
	    		controleClienteInputUF.setText("");
	    		
	    		// ADICIONANDO PROXIMO ID A SER CADASTRADO NO INPUT CODIGO
	    		controleClienteInputCod.setText(String.valueOf(controleCliente.ultimoCodigoCadastrado() + 1));
	    		
	    		// ALTERANDO TABBEDPANE E ATUALIZANDO LISTA
	    		controleClienteTabbedPane.setSelectedIndex(1);
	    		controleClienteBtnListarTodosActionPerformed(evt);
    		}
    	}
    }                                                        

    private void controleClienteBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
    	//VALIDANDO CPF
    	if(!controleCliente.validarCPF(controleClienteInputPesquisarCPF.getText())) {
    		JOptionPane.showMessageDialog(this, "CPF inv�lido!");
    	}else {
	        // REMOVENDO DADOS DA TABELA
	        while (controleClienteTblClientes.getModel().getRowCount() > 0) {  
	               ((DefaultTableModel) controleClienteTblClientes.getModel()).setRowCount(0);  
	        }
	        
	        DefaultTableModel tabelaClientes = (DefaultTableModel) controleClienteTblClientes.getModel(); // PEGANDO MODELO DA TABELA
	        
	        // PESQUISANDO NO BANCO DE DADOS E INSERINDO EM VARIAVEIS
	        Cliente c = controleCliente.pesquisarClientePorCPF(controleClienteInputPesquisarCPF.getText()); 
	        Integer codigo = c.getId(); 
	        String nome = c.getNome();
	        String email = c.getEmail(); 
	        String cpf = c.getCpf();
	        String cep = c.getEndereco().getCep(); 
	        String endereco = c.getEndereco().getEndereco(); 
	        String numero = c.getEndereco().getNumero();
	        String bairro = c.getEndereco().getBairro();
	        String cidade = c.getEndereco().getCidade();
	        String uf = c.getEndereco().getUf();
	
	        // INSERIR DADOS EM UM NOVO ARRAY
	        Object[] novoCliente = new Object[] {
	            codigo,
	            nome,
	            email,
	            cpf,
	            cep,
	            endereco,
	            numero,
	            bairro,
	            cidade,
	            uf
	        };
	
	        // ADICIONANDO DADOS ENCONTRADOS NA TABELA
	        tabelaClientes.addRow(novoCliente);
    	}
    }                                                                                                                 

    private void controleClienteBtnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        DefaultTableModel tabelaClientes = (DefaultTableModel) controleClienteTblClientes.getModel(); // PEGANDO MODELO DA TABELA
    	List<Cliente> todosClientes = controleCliente.obterTodosClientes(); // PEGANDO TODOS OS CLIENTES DO BANCO DE DADOS
    	
    	// REMOVENDO DADOS DA TABELA
        while (controleClienteTblClientes.getModel().getRowCount() > 0) {  
               ((DefaultTableModel) controleClienteTblClientes.getModel()).setRowCount(0);  
        }

        // INSERINDO CADA CLIENTE NA TABELA
    	for(Cliente c: todosClientes) {
            // PEGANDO DADOS
            Integer codigo = c.getId(); 
            String nome = c.getNome();
            String email = c.getEmail(); 
            String cpf = c.getCpf();
            String cep = c.getEndereco().getCep(); 
            String endereco = c.getEndereco().getEndereco(); 
            String numero = c.getEndereco().getNumero();
            String bairro = c.getEndereco().getBairro();
            String cidade = c.getEndereco().getCidade();
            String uf = c.getEndereco().getUf();

            // INSERIR DADOS NUM NOVO ARRAY
            Object[] novoCliente = new Object[] {
                codigo,
                nome,
                email,
                cpf,
                cep,
                endereco,
                numero,
                bairro,
                cidade,
                uf
            };

            // NOVA LINHA TABELA
            tabelaClientes.addRow(novoCliente);
    	}	
    }                                                                                                                   

    private void controleClienteEstadosActionPerformed(java.awt.event.ActionEvent evt) {                                                       
	        String estadoSelecionado = controleClienteEstados.getSelectedItem().toString();
	        controleClienteInputUF.setText(estadoSelecionado);
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
//            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                TelaCliente dialog = new TelaCliente(new javax.swing.JFrame(), true);
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
                    
    private javax.swing.JButton controleClienteBtnApagarCampos;
    private javax.swing.JButton controleClienteBtnEditar;
    private javax.swing.JButton controleClienteBtnExcluir;
    private javax.swing.JButton controleClienteBtnListarTodos;
    private javax.swing.JButton controleClienteBtnPesquisar;
    private javax.swing.JButton controleClienteBtnSalvar;
    private javax.swing.JPanel controleClienteCadastrar;
    private javax.swing.JPanel controleClienteConsultar;
    private javax.swing.JPanel controleClienteDadosPessoais;
    private javax.swing.JPanel controleClienteEndereco;
    private javax.swing.JComboBox<String> controleClienteEstados;
    private javax.swing.JTextField controleClienteInputBairro;
    private javax.swing.JFormattedTextField controleClienteInputCEP;
    private javax.swing.JFormattedTextField controleClienteInputCPF;
    private javax.swing.JTextField controleClienteInputCidade;
    private javax.swing.JTextField controleClienteInputCod;
    private javax.swing.JTextField controleClienteInputEmail;
    private javax.swing.JTextField controleClienteInputEndereco;
    private javax.swing.JTextField controleClienteInputNome;
    private javax.swing.JTextField controleClienteInputNumero;
    private javax.swing.JFormattedTextField controleClienteInputPesquisarCPF;
    private javax.swing.JFormattedTextField controleClienteInputUF;
    private javax.swing.JTabbedPane controleClienteTabbedPane;
    private javax.swing.JTable controleClienteTblClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;                  
}
