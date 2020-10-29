import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JTextField inputBox;

  JLabel usersName;

  JButton sayHello; 

  JPanel mainPanel;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //intialize main panel and show it
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    frame.add(mainPanel);

    //sets the text field to type in usersName
    inputBox = new JTextField();
    inputBox.setBounds(150, 50, 500, 25);

    //shows text inputBox
    mainPanel.add(inputBox);

    //creates j label to show usersName
    usersName = new JLabel("");
    usersName.setBounds(150, 95, 200, 20);

    //shows users usersName
    mainPanel.add(usersName);

    //makes button for user to click
    sayHello = new JButton("Say Hello");
    sayHello.setBounds(250, 145, 300, 50);

    //sets action command for say Hello
    sayHello.setActionCommand("hello");

    //adds action listener for button
    sayHello.addActionListener(this);

    //adds button to the main panel
    mainPanel.add(sayHello);
 
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    //if button is pressed
    if(command.equals("hello")){
      //reprints the j label to hello plus users name
      String helloUser = inputBox.getText();
      usersName.setText("Hello " + helloUser);
      //if there is no text in the box
    }else{
      usersName.setText("");
    }
    

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
