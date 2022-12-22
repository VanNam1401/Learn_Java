package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.StudentView;

public class StudentController implements ActionListener {
//        private StudentDao studentDao;
	private StudentView studentView;

	public StudentController(StudentView studentView) {
		super();
		this.studentView = studentView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if () {
			
		}
	}

	public void showStudentView() {
		// TODO Auto-generated method stub
		studentView.setVisible(true);
	}

}
