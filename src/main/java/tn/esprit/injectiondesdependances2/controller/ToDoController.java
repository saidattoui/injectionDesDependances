package tn.esprit.injectiondesdependances2.controller;

import java.util.List;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.injectiondesdependances2.services.ToDoService;
@RestController
@AllArgsConstructor
public class ToDoController {
	ToDoService toDoService;

	public List<String> getCoursesList() {
		return toDoService.getCoursesList();
	}
}
