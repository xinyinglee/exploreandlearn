package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import model.Parent;
import model.Parent;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;

public class ParentDAO {
	// a. Parent class method: C R U D
	public static ArrayList<Parent> getAllParents() {
		ArrayList<Parent> parents = new ArrayList<Parent>();
		DetachedCriteria dc = DetachedCriteria.forClass(Parent.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			parents.add((Parent) o);
		}
		return parents;
	}

	public static Parent getParentById(long id) {
		return (Parent) HibernateUtil.get(Parent.class, id);
	}

	public static void addParent(Parent parent) {
		HibernateUtil.save(parent);
	}

	public static void modifyParent(Parent modifiedParent) {
		HibernateUtil.update(modifiedParent);
	}

	public static void deleteParent(Parent parent) {
		HibernateUtil.delete(parent);
	}
	
	//features
	public static Parent getParentByEmail(String email){
		Parent parent = null;
		Parent tempParent = null;
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Parent.class);
		detachedCriteria.add(Restrictions.eq(Key.EMAIL, email));
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(detachedCriteria);
		for(Object o : list){
			tempParent = (Parent)o;
			if(tempParent.getEmail().equals(email)){
				parent = tempParent;
				break;
			}
		}
		return parent;
	}
}
