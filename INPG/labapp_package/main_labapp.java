package labapp_package;
import java.awt.EventQueue;



import labapp_package.gui_interface;

public class main_labapp {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new gui_interface();
			}
		});
		
	}

}
