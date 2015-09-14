package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import model.Result;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;

public class ResultDAO {
	// a. Result class method: C R U D
	public static ArrayList<Result> getAllResults() {
		ArrayList<Result> results = new ArrayList<Result>();
		DetachedCriteria dc = DetachedCriteria.forClass(Result.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			results.add((Result) o);
		}
		return results;
	}

	public static Result getResultById(long id) {
		return (Result) HibernateUtil.get(Result.class, id);
	}

	public static void addResult(Result result) {
		HibernateUtil.save(result);
	}

	public static void modifyResult(Result modifiedResult) {
		HibernateUtil.update(modifiedResult);
	}

	public static void deleteResult(Result result) {
		HibernateUtil.delete(result);
	}
	
	//features
}
