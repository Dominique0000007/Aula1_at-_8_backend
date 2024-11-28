package Empresa;


abstract class funcionarioextends  implements UsuarioAutenticavel {

	protected String nome;
	protected String cargo;
	protected String salario;
	
	public void funcionario(String nome, String cargo, String salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public String autenticar() {
		return null;
	}
	
	}
