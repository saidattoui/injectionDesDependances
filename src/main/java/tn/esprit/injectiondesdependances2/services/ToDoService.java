package tn.esprit.injectiondesdependances2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.injectiondesdependances2.dao.IToDoDao;

@Service

public class ToDoService {
	@Autowired
	private IToDoDao toDoDao;

	public List<String> getCoursesList() {
		return toDoDao.getCoursesList();
	}
}
