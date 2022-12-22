package controller;

import model.User;
import service.impl.LoginService;
import service.impl.UserDao;
import view.LoginView;
import view.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {
    private UserDao userDao;
    private LoginView loginView;
    private StudentView studentView;
    private LoginService loginService;

    public LoginController(LoginView loginView) {
        this.userDao = new UserDao();
        this.loginView = loginView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	String button = e.getActionCommand();
        User user = loginView.getUser();
        if (button.equals("LOGIN")) {
        	if (userDao.checkLogin(user)) {             
                studentView = new StudentView();
                StudentController studentController = new StudentController(studentView);
                studentController.showStudentView();
                loginView.setVisible(false);
            } else {
            	JOptionPane.showMessageDialog(new JFrame(), 
                        "Accounts or passwords are incorrect", 
                        "Login unsuccessful", 
                        JOptionPane.ERROR_MESSAGE); 
            }
		}
        
    }
}
