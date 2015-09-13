package dataManager;

import hibernate.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import model.Course;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import system.Key;

public class CourseDAO {
	// a. Course class method: C R U D
	public static ArrayList<Course> getAllCourses() {
		ArrayList<Course> courses = new ArrayList<Course>();
		DetachedCriteria dc = DetachedCriteria.forClass(Course.class);
		List<Object> list = HibernateUtil.detachedCriteriaReturnList(dc);
		for (Object o : list) {
			courses.add((Course) o);
		}
		return courses;
	}

	public static Course getCourseById(long id) {
		return (Course) HibernateUtil.get(Course.class, id);
	}

	public static void addCourse(Course course) {
		HibernateUtil.save(course);
	}

	public static void modifyCourse(Course modifiedCourse) {
		HibernateUtil.update(modifiedCourse);
	}

	public static void deleteCourse(Course course) {
		HibernateUtil.delete(course);
	}
	
	//features
}
