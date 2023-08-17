package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcelo Oliveira
 */
public class PacienteDAOTest {

	public PacienteDAOTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of cadastrarPaciente method, of class PacienteDAO.
	 */
	@Test
	public void testCadastrarPaciente() throws Exception {
		System.out.println("testCadastrarPaciente");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Paciente pac = new Paciente();
		pac.setNome("TesteName");
		pac.setCpf("123.456.789-00");
		pac.setDataNascimento(sdf.parse("01/02/2023"));
		pac.setEndereco("Rua testerua 172");
		pac.setConvenio(1);
		pac.setTelefone("(51)88888-7777");

		PacienteDAO instance = new PacienteDAO();
		instance.cadastrarPaciente(pac);

	}

}
