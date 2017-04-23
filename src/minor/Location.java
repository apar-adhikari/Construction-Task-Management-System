package minor;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class Location {
    static JFrame frame = new JFrame("Location");
    private static void initAndShowGUI() {
        // This method is invoked on the EDT thread
        //JFrame frame = new JFrame("Location");
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        /*frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent){
                frame.setVisible(false);
                //User us = new User();
                //us.setVisible(true);
            }
        });*/
        
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
            
       });
       
    }
    

    private static void initFX(JFXPanel fxPanel) {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);    
    }

    private static Scene createScene() {
        
        Group  root  =  new  Group();
        Scene  scene  =  new  Scene(root);
        /*Text  text  =  new  Text();
        
        text.setX(40);
        text.setY(100);
        text.setFont(new Font(25));
        text.setText("Welcome JavaFX!");

        root.getChildren().add(text);*/
        
        WebView  browser = new WebView();
	WebEngine engine = browser.getEngine();
        String url = Location.class.getResource("location.html").toExternalForm();
	engine.load(url);
		
	//StackPane sp = new StackPane();
	//sp.getChildren().add(browser);
        
        root.getChildren().add(browser);
        return (scene);
    }
    
    public static void exc(User us) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initAndShowGUI();
                frame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                        us.setVisible(true);
                    }
                });
            }           
        });
    }
}
