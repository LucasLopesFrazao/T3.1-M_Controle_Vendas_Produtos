package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import application.Main;
import controle.ControleProduto;
import modelo.Produto;

@SuppressWarnings("serial")
public class TelaProduto extends javax.swing.JDialog {

    ControleProduto controleProduto = Main.controleProduto;

    public TelaProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controleProdutoInputCod.setText(String.valueOf(controleProduto.ultimoCodigoCadastrado()+1));
        controleProdutoBtnListarTodosActionPerformed(null);
    }
                        
    private void initComponents() {

        controleProdutoTabbedPane = new javax.swing.JTabbedPane();
        controleProdutoCadastrar = new javax.swing.JPanel();
        controleProdutoBtnApagarCampos = new javax.swing.JButton();
        controleProdutoBtnSalvar = new javax.swing.JButton();
        controleProdutoDadosPessoais = new javax.swing.JPanel();
        controleProdutoInputPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        controleProdutoInputCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        controleProdutoInputEstoque = new javax.swing.JTextField();
        controleProdutoInputNome = new javax.swing.JTextField();
        controleProdutoConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        controleProdutoTblProdutos = new javax.swing.JTable();
        controleProdutoBtnExcluir = new javax.swing.JButton();
        controleProdutoBtnEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        controleProdutoBtnPesquisar = new javax.swing.JButton();
        controleProdutoBtnListarTodos = new javax.swing.JButton();
        controleProdutoInputPesquisarNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de produtos");
        setLocation(new java.awt.Point(300, 150));

        controleProdutoTabbedPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        controleProdutoBtnApagarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        controleProdutoBtnApagarCampos.setText("Apagar campos");
        controleProdutoBtnApagarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleProdutoBtnApagarCamposActionPerformed(evt);
            }
        });

        controleProdutoBtnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        controleProdutoBtnSalvar.setText("Salvar");
        controleProdutoBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleProdutoBtnSalvarActionPerformed(evt);
            }
        });

        controleProdutoDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); 

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel1.setText("C�digo:");

        controleProdutoInputCod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel2.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel4.setText("Pre�o:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel13.setText("Estoque:");

        javax.swing.GroupLayout controleProdutoDadosPessoaisLayout = new javax.swing.GroupLayout(controleProdutoDadosPessoais);
        controleProdutoDadosPessoais.setLayout(controleProdutoDadosPessoaisLayout);
        controleProdutoDadosPessoaisLayout.setHorizontalGroup(
            controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleProdutoDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controleProdutoInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleProdutoInputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controleProdutoDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(controleProdutoInputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controleProdutoDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(controleProdutoInputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        controleProdutoDadosPessoaisLayout.setVerticalGroup(
            controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleProdutoDadosPessoaisLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(controleProdutoInputCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(controleProdutoInputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controleProdutoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(controleProdutoInputEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(controleProdutoInputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controleProdutoCadastrarLayout = new javax.swing.GroupLayout(controleProdutoCadastrar);
        controleProdutoCadastrar.setLayout(controleProdutoCadastrarLayout);
        controleProdutoCadastrarLayout.setHorizontalGroup(
            controleProdutoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleProdutoCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleProdutoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controleProdutoDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 771, Short.MAX_VALUE)
                    .addGroup(controleProdutoCadastrarLayout.createSequentialGroup()
                        .addComponent(controleProdutoBtnApagarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleProdutoBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controleProdutoCadastrarLayout.setVerticalGroup(
            controleProdutoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleProdutoCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleProdutoDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleProdutoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleProdutoBtnApagarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleProdutoBtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        controleProdutoTabbedPane.addTab("Cadastrar", controleProdutoCadastrar);

        controleProdutoTblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Nome", "Pre�o (R$)", "Estoque"
            }
        ));
        jScrollPane1.setViewportView(controleProdutoTblProdutos);

        controleProdutoBtnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        controleProdutoBtnExcluir.setText("Excluir");
        controleProdutoBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleProdutoBtnExcluirActionPerformed(evt);
            }
        });

        controleProdutoBtnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        controleProdutoBtnEditar.setText("Editar");
        controleProdutoBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleProdutoBtnEditarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel12.setText("Nome:");

        controleProdutoBtnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        controleProdutoBtnPesquisar.setText("Pesquisar");
        controleProdutoBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleProdutoBtnPesquisarActionPerformed(evt);
            }
        });

        controleProdutoBtnListarTodos.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        controleProdutoBtnListarTodos.setText("Listar todos");
        controleProdutoBtnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleProdutoBtnListarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controleProdutoConsultarLayout = new javax.swing.GroupLayout(controleProdutoConsultar);
        controleProdutoConsultar.setLayout(controleProdutoConsultarLayout);
        controleProdutoConsultarLayout.setHorizontalGroup(
            controleProdutoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
            .addGroup(controleProdutoConsultarLayout.createSequentialGroup()
                .addGroup(controleProdutoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controleProdutoConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(controleProdutoInputPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(controleProdutoBtnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleProdutoBtnListarTodos))
                    .addGroup(controleProdutoConsultarLayout.createSequentialGroup()
                        .addComponent(controleProdutoBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controleProdutoBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        controleProdutoConsultarLayout.setVerticalGroup(
            controleProdutoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controleProdutoConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controleProdutoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(controleProdutoBtnPesquisar)
                    .addComponent(controleProdutoBtnListarTodos)
                    .addComponent(controleProdutoInputPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controleProdutoConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controleProdutoBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controleProdutoBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        controleProdutoTabbedPane.addTab("Consulta de produtos", controleProdutoConsultar);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel3.setText("CONTROLE DE PRODUTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controleProdutoTabbedPane)
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
                .addComponent(controleProdutoTabbedPane)
                .addContainerGap())
        );

        pack();
    }                        

    private void controleProdutoBtnApagarCamposActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        // APAGANDO INPUTS
    	controleProdutoInputNome.setText("");
    	controleProdutoInputEstoque.setText("");
    	controleProdutoInputPreco.setText("");
    	controleProdutoInputCod.setText(String.valueOf(controleProduto.ultimoCodigoCadastrado()+1));
    }                                                              

    private void controleProdutoBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        int linhaSelecionada = controleProdutoTblProdutos.getSelectedRow(); // PEGANDO LINHA SELECIONADA
     	
     	if(linhaSelecionada == -1) { // SE N�O TIVER NENHUMA LINHA SELECIONADA
     		JOptionPane.showMessageDialog(this, "Selecione uma linha.");
     	}else {
     		// PEGANDO DADOS DA TABELA, DA LINHA SELECIONADA
     		Integer id = (Integer) controleProdutoTblProdutos.getModel().getValueAt(linhaSelecionada, 0);
         	String nome = (String) controleProdutoTblProdutos.getModel().getValueAt(linhaSelecionada, 1);
         	Double preco = Double.parseDouble(String.valueOf(controleProdutoTblProdutos.getModel().getValueAt(linhaSelecionada, 2)).replace(",", ".")); 
         	Integer estoque = (Integer) controleProdutoTblProdutos.getModel().getValueAt(linhaSelecionada, 3);
         	
         	// ALTERANDO SELE��O DE TABBEDPANE
         	controleProdutoTabbedPane.setSelectedIndex(0);
         	
         	//MUDANDO TEXTO
         	controleProdutoInputCod.setText(String.valueOf(id));
         	controleProdutoInputNome.setText(nome);
        	controleProdutoInputEstoque.setText(String.valueOf(estoque));
        	controleProdutoInputPreco.setText(String.valueOf(preco));
     	}
    }                                                        

    private void controleProdutoBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        int linhaSelecionada = controleProdutoTblProdutos.getSelectedRow(); // PEGANDO LINHA SELECIONADA
        DefaultTableModel tabelaProdutos = (DefaultTableModel) controleProdutoTblProdutos.getModel(); // MODELO DA TABELA
    	
    	if(linhaSelecionada == -1) { // SE N�O TIVER NENHUMA LINHA SELECIONADA
    		JOptionPane.showMessageDialog(this, "Selecione uma linha.");
    	}else if(tabelaProdutos.getRowCount() == 1 && linhaSelecionada == 0) { // APAGAR PRODUTO COM 1 ITEM
    		JOptionPane.showMessageDialog(this, "� necess�rio ao menos 1 produto no sistema.");    		
    		controleProdutoInputCod.setText(String.valueOf(controleProduto.ultimoCodigoCadastrado()+1));
    	}else { //EXCLUINDO PRODUTO
    		Integer id = (Integer) controleProdutoTblProdutos.getModel().getValueAt(linhaSelecionada, 0);
    		controleProduto.excluirProduto(id);    			
    		controleProdutoBtnListarTodosActionPerformed(null);
    		JOptionPane.showMessageDialog(this, "Produto apagado!");
    		
    		// ADICIONANDO PROXIMO ID A SER CADASTRADO NO INPUT CODIGO
    		controleProdutoInputCod.setText(String.valueOf(controleProduto.ultimoCodigoCadastrado()+1));
    	}
    }                                                                                                                 

    private void controleProdutoBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {  
    	boolean precoValido = false;
    	boolean estoqueValido = false;
        // PEGANDO INFORMA��ES DOS CAMPOS
    	Integer cod = Integer.parseInt(controleProdutoInputCod.getText());
    	String nome = controleProdutoInputNome.getText();
    	Double preco = 0.0;
    	Integer estoque = 1;
    	
    	try {
    		String precoDigitado = controleProdutoInputPreco.getText().replace(",", ".");
    		preco = Double.parseDouble(precoDigitado);
    		precoValido = true;
    	}catch(NumberFormatException e) {
    	
    	}
    	
    	try {
    		estoque = Integer.parseInt(controleProdutoInputEstoque.getText());
    		estoqueValido = true;
    	}catch(NumberFormatException e) {
    	
    	}
    	
        // ADICIONANDO AO BANCO DE DADOS
    	if(!precoValido) {
    		JOptionPane.showMessageDialog(this, "Pre�o inv�lido!", "Erro", JOptionPane.ERROR_MESSAGE);    		    		
    	}else if(!estoqueValido) {
    		JOptionPane.showMessageDialog(this, "Estoque inv�lido!", "Erro", JOptionPane.ERROR_MESSAGE);    		    		    		
    	}else if(controleProdutoInputNome.getText().equals("")) {
    		JOptionPane.showMessageDialog(this, "Insira um nome!", "Erro", JOptionPane.ERROR_MESSAGE);    		    		    		    		
    	} else
			if(controleProduto.checarId(cod)) { // CHECANDO SE J� EXISTE
				controleProduto.editarProduto(new Produto(cod, preco, estoque, nome));
				// SETANDO TEXTO PARA NADA.
				controleProdutoInputNome.setText("");
				controleProdutoInputEstoque.setText("");
				controleProdutoInputPreco.setText("");
				
				// PROXIMO ID A SER CADASTRADO
				controleProdutoInputCod.setText(String.valueOf(controleProduto.ultimoCodigoCadastrado()+1));
			    
			    // ALTERANDO TABBEDPANE E ATUALIZANDO LISTA
				controleProdutoTabbedPane.setSelectedIndex(1);
				controleProdutoBtnListarTodosActionPerformed(null);
			}else {
				controleProduto.adicionarProduto(new Produto(cod, preco, estoque, nome));
				// SETANDO TEXTO PARA NADA.
				controleProdutoInputNome.setText("");
				controleProdutoInputEstoque.setText("");
				controleProdutoInputPreco.setText("");
			
				// PROXIMO ID A SER CADASTRADO
				controleProdutoInputCod.setText(String.valueOf(controleProduto.ultimoCodigoCadastrado()+1));
			    
			    // ALTERANDO TABBEDPANE E ATUALIZANDO LISTA
				controleProdutoTabbedPane.setSelectedIndex(1);
				controleProdutoBtnListarTodosActionPerformed(null);
			} 
    }                                                        

    private void controleProdutoBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	if(controleProdutoInputPesquisarNome.getText().equals("")) { // INPUT VAZIO
    		JOptionPane.showMessageDialog(this, "Digite um nome v�lido!", "Erro", JOptionPane.ERROR_MESSAGE);
    	}else {
	    	// REMOVENDO DADOS DA TABELA
	        while (controleProdutoTblProdutos.getModel().getRowCount() > 0) {  
	               ((DefaultTableModel) controleProdutoTblProdutos.getModel()).setRowCount(0);  
	        }
	        
	        DefaultTableModel tabelaProdutos = (DefaultTableModel) controleProdutoTblProdutos.getModel(); // MODELO DA TABELA
	        
	        // PESQUISANDO NO BANCO DE DADOS E INSERINDO EM VARIAVEIS
	        Produto p = controleProduto.pesquisarProduto(controleProdutoInputNome.getText());
	        // PEGANDO DADOS
	        Integer codigo = p.getId(); 
	        String nome = p.getNome();
	        String preco = String.format("%.2f", p.getPreco());
	        Integer estoque = p.getQtdEstoque();
	        
	        // INSERIR DADOS NUM NOVO ARRAY
	        Object[] novoProduto = new Object[] {
	            codigo,
	            nome,
	            preco,
	            estoque
	        };
	
	        // NOVA LINHA TABELA
	        tabelaProdutos.addRow(novoProduto);
    	}
    }                                                                                                                   

    private void controleProdutoBtnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        DefaultTableModel tabelaProdutos = (DefaultTableModel) controleProdutoTblProdutos.getModel(); // MODELO TABELA
    	List<Produto> todosProdutos = controleProduto.obterTodosProdutos(); // PEGANDO TODOS OS PRODUTOS DO BANCO DE DADOS
    	
    	// REMOVENDO DADOS DA TABELA
        while (controleProdutoTblProdutos.getModel().getRowCount() > 0) {  
               ((DefaultTableModel) controleProdutoTblProdutos.getModel()).setRowCount(0);  
        }
        
        // PEGANDO CADA CLIENTE NO BANCO DE DADOS
    	for(Produto p: todosProdutos) {
            // PEGANDO DADOS
            Integer codigo = p.getId(); 
            String nome = p.getNome();
            String preco = String.format("%.2f", p.getPreco());
            Integer estoque = p.getQtdEstoque();

            // INSERIR DADOS NUM NOVO ARRAY
            Object[] novoProduto = new Object[] {
                codigo,
                nome,
                preco,
                estoque
            };

            // NOVA LINHA TABELA
            tabelaProdutos.addRow(novoProduto);
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
//                TelaProduto dialog = new TelaProduto(new javax.swing.JFrame(), true);
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
                     
    private javax.swing.JButton controleProdutoBtnApagarCampos;
    private javax.swing.JButton controleProdutoBtnEditar;
    private javax.swing.JButton controleProdutoBtnExcluir;
    private javax.swing.JButton controleProdutoBtnListarTodos;
    private javax.swing.JButton controleProdutoBtnPesquisar;
    private javax.swing.JButton controleProdutoBtnSalvar;
    private javax.swing.JPanel controleProdutoCadastrar;
    private javax.swing.JPanel controleProdutoConsultar;
    private javax.swing.JPanel controleProdutoDadosPessoais;
    private javax.swing.JTextField controleProdutoInputCod;
    private javax.swing.JTextField controleProdutoInputEstoque;
    private javax.swing.JTextField controleProdutoInputNome;
    private javax.swing.JTextField controleProdutoInputPesquisarNome;
    private javax.swing.JTextField controleProdutoInputPreco;
    private javax.swing.JTabbedPane controleProdutoTabbedPane;
    private javax.swing.JTable controleProdutoTblProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;              
}
