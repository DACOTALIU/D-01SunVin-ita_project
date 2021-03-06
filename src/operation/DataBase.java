package operation;

import java.util.List;

import dao.AddDao;
import dao.DeleteDao;
import dao.ShowListDao;
import dao.UpdateDao;
import dao.impl.AddDaoImpl;
import dao.impl.DeleteDaoImpl;
import dao.impl.ShowListDaoImpl;
import dao.impl.UpdateDaoImpl;
import po.Depart;
import po.Person;

public class DataBase {
	
	private AddDao add = new AddDaoImpl();
	private DeleteDao delete = new DeleteDaoImpl();
	private ShowListDao show = new ShowListDaoImpl();
	private UpdateDao update = new UpdateDaoImpl();
	
	public int addPerson(Person person){
		return add.addPerson(person);
	}

	public int addDepart(Depart depart) {
		
		return add.addDepart(depart);
	}

	public int updateDepart(Depart depart) {
		
		return update.updateDepart(depart);
	}

	public int updatePerson(Person person) {
		// TODO Auto-generated method stub
		return update.updatePerson(person);
	}
//
//	@Override
//	public Depart loadDepart(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Person loadPerson(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public List<Depart> showAllDepart() {
		// TODO Auto-generated method stub
		return show.showAllDepart();
	}

	public List<Person> showAllPerson() {
		// TODO Auto-generated method stub
		return show.showAllPerson();
	}

	public List<Person> findPersonByDid(int id) {
		// TODO Auto-generated method stub
		return show.findPersonByDid(id);
	}

	public int deleteDepart(int id) {
		// TODO Auto-generated method stub
		return delete.deleteDepart(id);
	}

	public int deletePerson(int id) {
		// TODO Auto-generated method stub
		return delete.deletePerson(id);
	}
	

}
