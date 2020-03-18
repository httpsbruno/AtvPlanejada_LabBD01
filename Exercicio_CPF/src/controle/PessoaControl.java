package controle;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Pessoa;
import persistencia.DAOPessoa;

public class PessoaControl {
	public void inserePessoa(JTextField txtCpf, JTextField txtNome) throws SQLException {
		Pessoa p = new Pessoa();
		p.setCpf(txtCpf.getText());
		p.setNome(txtNome.getText());
		
		DAOPessoa pDAO = new DAOPessoa();
		String saida = pDAO.procPessoa(p);
		JOptionPane.showMessageDialog(null, saida, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
	}
}
