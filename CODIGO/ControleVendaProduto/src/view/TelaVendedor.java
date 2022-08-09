package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import application.Main;
import controle.ControleVendedor;
import modelo.Vendedor;

@SuppressWarnings("serial")
public class TelaVendedor extends javax.swing.JDialog {

    ControleVendedor controleVendedor = Main.controleVendedor;

    public TelaVendedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controleFuncionarioInputCod.setText(String.valueOf(controleVendedor.ultimoCodigoCadastrado() + 1));
        controleFuncionarioBtnListarTodosActionPerformed(null);
    }
                        
    private void initComponents() {
        controleFuncionarioTabbedPane = new javax.swing.JTabbedPane();
        controleFuncionarioCadastrar = new javax.swing.JPanel();
        controleFuncionarioBtnApagarCampos = new javax.swing.JButton();
        controleFuncionarioBtnSalvar = new javax.swing.JButton();
        controleFuncionarioDadosPessoais = new javax.swing.JPanel();
        controleFuncionarioInputEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        controleFuncionarioInputCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        controleFuncionarioInputDep = new javax.swing.JTextField();
        controleFuncionarioInputNome = new javax.swing.JTextField();
        controleFuncionarioConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        controleFuncionarioTblFuncionarios = new javax.swing.JTable();
        controleFuncionarioBtnExcluir = new javax.swing.JButton();
        controleFuncionarioBtnEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        controleFuncionarioBtnPesquisar = new javax.swing.JButton();
        controleFuncionarioBtnListarTodos = new javax.swing.JButton();
        controleFuncionarioInputPesquisarNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de funcionarios");
        setLocation(new java.awt.Point(300, 150));

        controleFuncionarioTabbedPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        controleFuncionarioBtnApagarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleFuncionarioBtnApagarCampos.setText("Apagar campos");
        controleFuncionarioBtnApagarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionarioBtnApagarCamposActionPerformed(evt);
            }
        });

        controleFuncionarioBtnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleFuncionarioBtnSalvar.setText("Salvar");
        controleFuncionarioBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionarioBtnSalvarActionPerformed(evt);
            }
        });

        controleFuncionarioDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel1.setText("C�digo:");

        controleFuncionarioInputCod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel4.setText("E-mail:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel13.setText("Dep.:");

        javax.swing.GroupLayout controleFuncionarioDadosPessoaisLayout = new javax.swing.GroupLayout(controleFuncionarioDadosPessoais);
        controleFuncionarioDadosPessoais.setLayout(controleFuncionarioDadosPessoaisLayout);
        controleFuncionarioDadosPessoaisLayout.setHorizontalGroup(
            controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleFuncionarioDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controleFuncionarioInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleFuncionarioInputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controleFuncionarioDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(controleFuncionarioInputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controleFuncionarioDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(controleFuncionarioInputDep, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        controleFuncionarioDadosPessoaisLayout.setVerticalGroup(
            controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleFuncionarioDadosPessoaisLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(controleFuncionarioInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(controleFuncionarioInputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controleFuncionarioDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(controleFuncionarioInputDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(controleFuncionarioInputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controleFuncionarioCadastrarLayout = new javax.swing.GroupLayout(controleFuncionarioCadastrar);
        controleFuncionarioCadastrar.setLayout(controleFuncionarioCadastrarLayout);
        controleFuncionarioCadastrarLayout.setHorizontalGroup(
            controleFuncionarioCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleFuncionarioCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleFuncionarioCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controleFuncionarioDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE)
                    .addGroup(controleFuncionarioCadastrarLayout.createSequentialGroup()
                        .addComponent(controleFuncionarioBtnApagarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleFuncionarioBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controleFuncionarioCadastrarLayout.setVerticalGroup(
            controleFuncionarioCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleFuncionarioCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleFuncionarioDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleFuncionarioCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleFuncionarioBtnApagarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleFuncionarioBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        controleFuncionarioTabbedPane.addTab("Cadastrar", controleFuncionarioCadastrar);

        controleFuncionarioTblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Nome", "E-mail", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(controleFuncionarioTblFuncionarios);

        controleFuncionarioBtnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleFuncionarioBtnExcluir.setText("Excluir");
        controleFuncionarioBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionarioBtnExcluirActionPerformed(evt);
            }
        });

        controleFuncionarioBtnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        controleFuncionarioBtnEditar.setText("Editar");
        controleFuncionarioBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionarioBtnEditarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel12.setText("Nome:");

        controleFuncionarioBtnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12));
        controleFuncionarioBtnPesquisar.setText("Pesquisar");
        controleFuncionarioBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionarioBtnPesquisarActionPerformed(evt);
            }
        });

        controleFuncionarioBtnListarTodos.setFont(new java.awt.Font("Segoe UI", 1, 12));
        controleFuncionarioBtnListarTodos.setText("Listar todos");
        controleFuncionarioBtnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFuncionarioBtnListarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controleFuncionarioConsultarLayout = new javax.swing.GroupLayout(controleFuncionarioConsultar);
        controleFuncionarioConsultar.setLayout(controleFuncionarioConsultarLayout);
        controleFuncionarioConsultarLayout.setHorizontalGroup(
            controleFuncionarioConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
            .addGroup(controleFuncionarioConsultarLayout.createSequentialGroup()
                .addGroup(controleFuncionarioConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controleFuncionarioConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(controleFuncionarioInputPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(controleFuncionarioBtnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleFuncionarioBtnListarTodos))
                    .addGroup(controleFuncionarioConsultarLayout.createSequentialGroup()
                        .addComponent(controleFuncionarioBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleFuncionarioBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        controleFuncionarioConsultarLayout.setVerticalGroup(
            controleFuncionarioConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleFuncionarioConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleFuncionarioConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(controleFuncionarioBtnPesquisar)
                    .addComponent(controleFuncionarioBtnListarTodos)
                    .addComponent(controleFuncionarioInputPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleFuncionarioConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleFuncionarioBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleFuncionarioBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        controleFuncionarioTabbedPane.addTab("Consulta de funcionarios", controleFuncionarioConsultar);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel3.setText("CONTROLE DE FUNCION�RIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleFuncionarioTabbedPane)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controleFuncionarioTabbedPane)
                .addContainerGap())
        );

        pack();
    }                        

    private void controleFuncionarioBtnApagarCamposActionPerformed(java.awt.event.ActionEvent evt) {                                                                   
    	// APAGANDO TODOS OS CAMPOS
        controleFuncionarioInputNome.setText("");
        controleFuncionarioInputEmail.setText("");
        controleFuncionarioInputDep.setText("");        
		controleFuncionarioInputCod.setText(String.valueOf(controleVendedor.ultimoCodigoCadastrado() + 1)); // ADICIONANDO PROXIMO ID A SER CADASTRADO NO INPUT CODIGO
    }                                                                  

    private void controleFuncionarioBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        int linhaSelecionada = controleFuncionarioTblFuncionarios.getSelectedRow(); // PEGANDO LINHA SELECIONADA DA TABELA
        
        // SE N�O TIVER NENHUMA LINHA SELECIONADA
     	if(linhaSelecionada == -1) { 
     		JOptionPane.showMessageDialog(this, "Selecione uma linha.");
     	}else {
     		// PEGANDO DADOS DA TABELA, DA LINHA SELECIONADA
     		Integer id = (Integer) controleFuncionarioTblFuncionarios.getModel().getValueAt(linhaSelecionada, 0);
         	String nome = (String) controleFuncionarioTblFuncionarios.getModel().getValueAt(linhaSelecionada, 1);
         	String email = (String) controleFuncionarioTblFuncionarios.getModel().getValueAt(linhaSelecionada, 2);
         	String departamento = (String) controleFuncionarioTblFuncionarios.getModel().getValueAt(linhaSelecionada, 3);
         	
         	// ALTERANDO SELE��O DE TABBEDPANE
         	controleFuncionarioTabbedPane.setSelectedIndex(0);
         	
         	// COLOCANDO DADOS A SEREM EDITADOS
         	controleFuncionarioInputCod.setText(String.valueOf(id));
         	controleFuncionarioInputEmail.setText(email);
         	controleFuncionarioInputNome.setText(nome);
         	controleFuncionarioInputDep.setText(departamento);
     	}
    }                                                            

    private void controleFuncionarioBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        int linhaSelecionada = controleFuncionarioTblFuncionarios.getSelectedRow(); // PEGANDO LINHA SELECIONADA DA TABELA
        DefaultTableModel tabelaVendedores = (DefaultTableModel) controleFuncionarioTblFuncionarios.getModel(); // PEGANDO MODELO DA TABELA
        
        // SE N�O TIVER NENHUMA LINHA SELECIONADA
    	if(linhaSelecionada == -1) { 
    		JOptionPane.showMessageDialog(this, "Selecione uma linha.");
    	}else if(tabelaVendedores.getRowCount() == 1 && linhaSelecionada == 0) { // TENTANDO EXCLUIR TABELA COM APENAS 1 CLIENTE
    		JOptionPane.showMessageDialog(this, "� necess�rio ao menos 1 vendedor no sistema.");    		
    		controleFuncionarioInputCod.setText(String.valueOf(controleVendedor.ultimoCodigoCadastrado() + 1));
    	}else { // EXCLUINDO VENDEDOR SELECIONADO
    		Integer id = (Integer) controleFuncionarioTblFuncionarios.getModel().getValueAt(linhaSelecionada, 0);
    		controleVendedor.apagarVendedor(id);    			
    		controleFuncionarioBtnListarTodosActionPerformed(evt);
    		JOptionPane.showMessageDialog(this, "Vendedor apagado!");
    		
    		// ADICIONANDO PROXIMO ID A SER CADASTRADO NO INPUT CODIGO
    		controleFuncionarioInputCod.setText(String.valueOf(controleVendedor.ultimoCodigoCadastrado() + 1));
    	}
    }                                                                                                                       

    private void controleFuncionarioBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                                             
    	//PEGANDO INFORMA��ES DIGITADAS NOS INPUTS
    	Integer cod = Integer.parseInt(controleFuncionarioInputCod.getText());
    	String nome = controleFuncionarioInputNome.getText();
    	String email = controleFuncionarioInputEmail.getText();
    	String departamento = controleFuncionarioInputDep.getText();
    	
        // CHECAGENS
    	if(!controleVendedor.validarEmail(email)) { // VALIDANDO EMAIL
    		JOptionPane.showMessageDialog(this, "E-mail inv�lido", "Erro", JOptionPane.ERROR_MESSAGE);
    	}else if(controleFuncionarioInputNome.getText().equals("") ||
    			controleFuncionarioInputEmail.getText().equals("") ||
    			controleFuncionarioInputDep.getText().equals("")
    			) { // CAMPOS EM BRANCO
    		JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
    	}else if(controleVendedor.checarId(cod)) { // CHECANDO SE ID J� EXISTE NO BANCO DE DADOS
    		controleVendedor.editarVendedor(new Vendedor(cod, nome, email, departamento));
    		// PROXIMO ID A SER CADASTRADO
            controleFuncionarioInputCod.setText(String.valueOf(controleVendedor.ultimoCodigoCadastrado() + 1));
         
            // SETANDO TEXTO PARA NADA.
            controleFuncionarioInputNome.setText("");
            controleFuncionarioInputEmail.setText("");
            controleFuncionarioInputDep.setText("");
            
            // ALTERANDO TABBEDPANE E ATUALIZANDO LISTA
        	controleFuncionarioTabbedPane.setSelectedIndex(1);
        	controleFuncionarioBtnListarTodosActionPerformed(evt);
    	}else {
    		controleVendedor.adicionarVendedor(new Vendedor(cod, nome, email, departamento));
    		// PROXIMO ID A SER CADASTRADO
    		controleFuncionarioInputCod.setText(String.valueOf(controleVendedor.ultimoCodigoCadastrado() + 1));
    		
    		// SETANDO TEXTO PARA NADA.
            controleFuncionarioInputNome.setText("");
            controleFuncionarioInputEmail.setText("");
            controleFuncionarioInputDep.setText("");
    		
    		// ALTERANDO TABBEDPANE E ATUALIZANDO LISTA
    		controleFuncionarioTabbedPane.setSelectedIndex(1);
    		controleFuncionarioBtnListarTodosActionPerformed(evt);
    	}
    }                                                            

    private void controleFuncionarioBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {  
    	//CAMPO EM BRANCO
    	if(controleFuncionarioInputPesquisarNome.getText().equals("")) {
    		JOptionPane.showMessageDialog(this, "Digite um nome v�lido!");
    	}else {
	    	// REMOVENDO DADOS DA TABELA
	        while (controleFuncionarioTblFuncionarios.getModel().getRowCount() > 0) {  
	               ((DefaultTableModel) controleFuncionarioTblFuncionarios.getModel()).setRowCount(0);  
	        }
	        
	        DefaultTableModel tabelaVendedores = (DefaultTableModel) controleFuncionarioTblFuncionarios.getModel(); // PEGANDO MODELO DA TABELA
	        
	        // PESQUISANDO NO BANCO DE DADOS E INSERINDO EM VARIAVEIS
	        Vendedor v = controleVendedor.pesquisarPorNome(controleFuncionarioInputPesquisarNome.getText()); 
	        Integer codigo = v.getId(); 
	        String nome = v.getNome();
	        String email = v.getEmail(); 
	        String departamento = v.getDepartamento();
	        
	        // INSERIR DADOS EM UM NOVO ARRAY
	        Object[] novoVendedor = new Object[] {
	            codigo,
	            nome,
	            email,
	            departamento
	        };
	
	        // ADICIONANDO DADOS ENCONTRADOS NA TABELA
	        tabelaVendedores.addRow(novoVendedor);
    	}
    }                                                                                                                          

    private void controleFuncionarioBtnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                                                  
        DefaultTableModel tabelaVendedores = (DefaultTableModel) controleFuncionarioTblFuncionarios.getModel(); //MODELO DA TABELA 
    	List<Vendedor> todosVendedores = controleVendedor.obterTodosVendedores(); //PEGANDO TODOS OS VENDEDORES DO BANCO DE DADOS
    	
    	// REMOVENDO DADOS DA TABELA
        while (controleFuncionarioTblFuncionarios.getModel().getRowCount() > 0) {  
               ((DefaultTableModel) controleFuncionarioTblFuncionarios.getModel()).setRowCount(0);  
        }
        
        // PEGANDO CADA CLIENTE NO BANCO DE DADOS
    	for(Vendedor v: todosVendedores) {
            // PEGANDO DADOS
            Integer codigo = v.getId(); 
            String nome = v.getNome();
            String email = v.getEmail(); 
            String departamento = v.getDepartamento();

            // INSERIR DADOS NUM NOVO ARRAY
            Object[] novoVendedor = new Object[] {
                codigo,
                nome,
                email,
                departamento
            };

            // NOVA LINHA TABELA
            tabelaVendedores.addRow(novoVendedor);
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
//            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                TelaVendedor dialog = new TelaVendedor(new javax.swing.JFrame(), true);
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
                  
    private javax.swing.JButton controleFuncionarioBtnApagarCampos;
    private javax.swing.JButton controleFuncionarioBtnEditar;
    private javax.swing.JButton controleFuncionarioBtnExcluir;
    private javax.swing.JButton controleFuncionarioBtnListarTodos;
    private javax.swing.JButton controleFuncionarioBtnPesquisar;
    private javax.swing.JButton controleFuncionarioBtnSalvar;
    private javax.swing.JPanel controleFuncionarioCadastrar;
    private javax.swing.JPanel controleFuncionarioConsultar;
    private javax.swing.JPanel controleFuncionarioDadosPessoais;
    private javax.swing.JTextField controleFuncionarioInputCod;
    private javax.swing.JTextField controleFuncionarioInputDep;
    private javax.swing.JTextField controleFuncionarioInputEmail;
    private javax.swing.JTextField controleFuncionarioInputNome;
    private javax.swing.JTextField controleFuncionarioInputPesquisarNome;
    private javax.swing.JTabbedPane controleFuncionarioTabbedPane;
    private javax.swing.JTable controleFuncionarioTblFuncionarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;                 
}
