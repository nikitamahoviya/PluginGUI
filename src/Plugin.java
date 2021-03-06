import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Plugin {

	protected Shell shell;
	private Text EnterVCellUser;
	private Text EnterVCellModel;
	private Text EnterApplication;
	private Text EnterSimulation;
	private Text EnterVariable;
	private Text EnterTimePoint;
	private Text EnterImageName;
	private Text EnterSize;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Plugin window = new Plugin();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(335, 405);
		shell.setText("Image 5D");

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(75, 10, 81, 25);
		lblNewLabel.setText("VCell user:");

		Label lblVcellModel = new Label(shell, SWT.NONE);
		lblVcellModel.setText("VCell model:");
		lblVcellModel.setBounds(50, 41, 106, 25);

		Label lblApplication = new Label(shell, SWT.NONE);
		lblApplication.setText("Application:");
		lblApplication.setBounds(64, 72, 94, 25);

		Label lblSimulation = new Label(shell, SWT.NONE);
		lblSimulation.setText(" Simulation:");
		lblSimulation.setBounds(64, 103, 92, 25);

		Label lblVariable = new Label(shell, SWT.NONE);
		lblVariable.setText("Variable:");
		lblVariable.setBounds(89, 134, 76, 25);

		Label lblTimePoint = new Label(shell, SWT.NONE);
		lblTimePoint.setText(" Time Point:");
		lblTimePoint.setBounds(64, 167, 92, 25);

		Label lblImageName = new Label(shell, SWT.NONE);
		lblImageName.setText("Image Name:");
		lblImageName.setBounds(50, 198, 106, 25);

		Label lblSizeOfThe = new Label(shell, SWT.NONE);
		lblSizeOfThe.setText("Size of the Image");
		lblSizeOfThe.setBounds(10, 229, 146, 46);

		EnterVCellUser = new Text(shell, SWT.BORDER);
		EnterVCellUser.setBounds(162, 7, 106, 25);

		EnterVCellModel = new Text(shell, SWT.BORDER);
		EnterVCellModel.setBounds(162, 38, 106, 25);

		EnterApplication = new Text(shell, SWT.BORDER);
		EnterApplication.setBounds(162, 72, 106, 25);

		EnterSimulation = new Text(shell, SWT.BORDER);
		EnterSimulation.setBounds(162, 100, 106, 25);

		EnterVariable = new Text(shell, SWT.BORDER);
		EnterVariable.setBounds(163, 131, 106, 25);

		EnterTimePoint = new Text(shell, SWT.BORDER);
		EnterTimePoint.setBounds(163, 164, 106, 25);

		EnterImageName = new Text(shell, SWT.BORDER);
		EnterImageName.setBounds(162, 198, 106, 25);

		EnterSize = new Text(shell, SWT.BORDER);
		EnterSize.setBounds(162, 258, 106, 25);

		Button OKbutton = new Button(shell, SWT.NONE);
		OKbutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String EnterVCellUser;
				String EnterVCellModel;
				String EnterApplication;
				String EnterSimulation;
				String EnterVariable;
				int EnterTimePoint;
				String EnterImageName;
				int EnterSize;
				
				try {
				     EnterVCellUser=String.valueOf(EnterVCellUser);
				     EnterVCellModel=String.valueOf(EnterVCellModel);
				     EnterApplication=String.valueOf(EnterApplication);
				     EnterSimulation=String.valueOf(EnterSimulation);
				     EnterVariable=String.valueOf(EnterVariable);
				     EnterTimePoint=Integer.valueOf(EnterTimePoint);
				     EnterImageName=String.valueOf(EnterImageName);
				     EnterSize=Integer.valueOf(EnterSize);
				     
				    }catch(Exception e){
				        
					JOptionPane.showMessageDialog(null, "Please enter a valid VCell Model");
				    }
			}
		});
		OKbutton.setBounds(173, 309, 60, 35);
		OKbutton.setText("OK");

		Button Cancelbutton = new Button(shell, SWT.NONE);
		Cancelbutton.addSelectionListener(new SelectionAdapter() {
		@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Cancelbutton.setText("Cancel");
		Cancelbutton.setBounds(245, 309, 60, 35);

		Label lblInImagej = new Label(shell, SWT.NONE);
		lblInImagej.setText("in ImageJ:");
		lblInImagej.setBounds(75, 258, 81, 46);

	}
}