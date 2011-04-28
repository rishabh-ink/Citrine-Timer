/*

Citrine Timer
A timer application for mobile phones.
Copyright 2010, Rishabh Rao

This file is part of Citrine Timer.

Citrine Timer is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Citrine Timer is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Citrine Timer.  If not, see <http://www.gnu.org/licenses/>.

 */
package citrine;

import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;

/**
 * @author Rishabh Rao
 */
public class CitrineMIDlet extends MIDlet implements CommandListener
{
	private boolean midletPaused = false;
	//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
	private Command timerDisplayExitCommand;
	private Command timerDisplaySetupCommand;
	private Command timerSetupOkCommand;
	private Command timerSetupCancelCommand;
	private Command timerDisplayStartCommand;
	private Command timerDisplayHelpCommand;
	private Command citrineHelpBackCommand;
	private Command citrineAboutHelpCommand;
	private Command citrineAboutBackCommand;
	private Command timerDisplayAboutCommand;
	private Command timerDisplayStopCommand;
	private Command citrineHelpAboutCommand;
	private Form timerDisplayForm;
	private StringItem timerDisplayTime;
	private Form timerSetupForm;
	private TextField timerSetupMinutesTextField;
	private TextField timerSetupSecondsTextField;
	private TextField timerSetupHoursTextField;
	private TextField TimeUpNoteTextField;
	private Form citrineHelpForm;
	private StringItem citrineHelpInstructionsStringItem;
	private Form citrineAboutForm;
	private StringItem citrineAboutCopyrightText;
	private Font timerDisplayFont;
	//</editor-fold>//GEN-END:|fields|0|
	private Time givenTime;
	private Timer timer;
	private RunningTimer runningTimer;
	private boolean isTimerRunning = false; // package level access required
	private boolean isTimerSetup = false;

	/**
	 * The CitrineMIDlet constructor.
	 */
	public CitrineMIDlet()
	{
	}

	//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
	//</editor-fold>//GEN-END:|methods|0|
	//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
	/**
	 * Initilizes the application.
	 * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
	 */
	private void initialize()
	{//GEN-END:|0-initialize|0|0-preInitialize
		// write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
		// write post-initialize user code here
	}//GEN-BEGIN:|0-initialize|2|
	//</editor-fold>//GEN-END:|0-initialize|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
	/**
	 * Performs an action assigned to the Mobile Device - MIDlet Started point.
	 */
	public void startMIDlet()
	{//GEN-END:|3-startMIDlet|0|3-preAction
		// write pre-action user code here
		switchDisplayable(null, getTimerDisplayForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
		// write post-action user code here
	}//GEN-BEGIN:|3-startMIDlet|2|
	//</editor-fold>//GEN-END:|3-startMIDlet|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
	/**
	 * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
	 */
	public void resumeMIDlet()
	{//GEN-END:|4-resumeMIDlet|0|4-preAction
		// write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
		// write post-action user code here
	}//GEN-BEGIN:|4-resumeMIDlet|2|
	//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
	/**
	 * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
	 * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
	 * @param nextDisplayable the Displayable to be set
	 */
	public void switchDisplayable(Alert alert, Displayable nextDisplayable)
	{//GEN-END:|5-switchDisplayable|0|5-preSwitch
		// write pre-switch user code here
		Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
		if (alert == null)
		{
			display.setCurrent(nextDisplayable);
		}
		else
		{
			display.setCurrent(alert, nextDisplayable);
		}//GEN-END:|5-switchDisplayable|1|5-postSwitch
		// write post-switch user code here
	}//GEN-BEGIN:|5-switchDisplayable|2|
	//</editor-fold>//GEN-END:|5-switchDisplayable|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
	/**
	 * Called by a system to indicated that a command has been invoked on a particular displayable.
	 * @param command the Command that was invoked
	 * @param displayable the Displayable where the command was invoked
	 */
	public void commandAction(Command command, Displayable displayable)
	{//GEN-END:|7-commandAction|0|7-preCommandAction
		// write pre-action user code here
		Alert timerNotSetup = new Alert("Timer Not Setup!", "The timer has not been set. Please set it from the Setup screen.", null, AlertType.WARNING);
		
		if (displayable == citrineAboutForm)//GEN-BEGIN:|7-commandAction|1|57-preAction
		{
			if (command == citrineAboutBackCommand)
			{//GEN-END:|7-commandAction|1|57-preAction
				// write pre-action user code here
				switchDisplayable(null, getTimerDisplayForm());//GEN-LINE:|7-commandAction|2|57-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|3|60-preAction
			else if (command == citrineAboutHelpCommand)
			{//GEN-END:|7-commandAction|3|60-preAction
				// write pre-action user code here
				switchDisplayable(null, getCitrineHelpForm());//GEN-LINE:|7-commandAction|4|60-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|5|67-preAction
		}
		else if (displayable == citrineHelpForm)
		{
			if (command == citrineHelpAboutCommand)
			{//GEN-END:|7-commandAction|5|67-preAction
				// write pre-action user code here
				switchDisplayable(null, getCitrineAboutForm());//GEN-LINE:|7-commandAction|6|67-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|7|53-preAction
			else if (command == citrineHelpBackCommand)
			{//GEN-END:|7-commandAction|7|53-preAction
				// write pre-action user code here
				switchDisplayable(null, getTimerDisplayForm());//GEN-LINE:|7-commandAction|8|53-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|9|64-preAction
		}
		else if (displayable == timerDisplayForm)
		{
			if (command == timerDisplayAboutCommand)
			{//GEN-END:|7-commandAction|9|64-preAction
				// write pre-action user code here
				switchDisplayable(null, getCitrineAboutForm());//GEN-LINE:|7-commandAction|10|64-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|11|19-preAction
			else if (command == timerDisplayExitCommand)
			{//GEN-END:|7-commandAction|11|19-preAction
				// write pre-action user code here
				exitMIDlet();//GEN-LINE:|7-commandAction|12|19-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|13|49-preAction
			else if (command == timerDisplayHelpCommand)
			{//GEN-END:|7-commandAction|13|49-preAction
				// write pre-action user code here
				switchDisplayable(null, getCitrineHelpForm());//GEN-LINE:|7-commandAction|14|49-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|15|31-preAction
			else if (command == timerDisplaySetupCommand)
			{//GEN-END:|7-commandAction|15|31-preAction
				// write pre-action user code here

				if (isTimerRunning == true)
				{
					Alert timerNotRunning = new Alert("Timer Running!", "The timer is currently running. Please stop the timer and try again.", null, AlertType.WARNING);
					switchDisplayable(timerNotRunning, getTimerDisplayForm());
					return;
				}

				switchDisplayable(null, getTimerSetupForm());//GEN-LINE:|7-commandAction|16|31-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|17|46-preAction
			else if (command == timerDisplayStartCommand)
			{//GEN-END:|7-commandAction|17|46-preAction
				// write pre-action user code here
				if (isTimerSetup == false)
				{
					switchDisplayable(timerNotSetup, getTimerDisplayForm());
					return;
				}
				else
				{
					if (isTimerRunning == true)
					{
						Alert timerNotRunning = new Alert("Timer Running!", "The timer is already running.", null, AlertType.INFO);
						switchDisplayable(timerNotRunning, getTimerDisplayForm());
						return;
					}
				}
//GEN-LINE:|7-commandAction|18|46-postAction
				// write post-action user code here
				// schedule a TimerTask to be executed every second
				timer = new Timer();
				runningTimer = new RunningTimer(givenTime, this);
				timer.schedule(runningTimer, 0, 1000); // schedule the RunningTimer object to be called every second

				isTimerRunning = true;
			}//GEN-BEGIN:|7-commandAction|19|71-preAction
			else if (command == timerDisplayStopCommand)
			{//GEN-END:|7-commandAction|19|71-preAction
				// write pre-action user code here
				if (isTimerSetup == false)
				{
					switchDisplayable(timerNotSetup, getTimerDisplayForm());
					return;
				}
				else
				{
					if (isTimerRunning == false)
					{
						Alert timerNotRunning = new Alert("Timer Not Running!", "The timer is currently not running.", null, AlertType.INFO);
						switchDisplayable(timerNotRunning, getTimerDisplayForm());
						return;
					}
				}

				Alert timeUp = new Alert("Timer Stopped!", "The timer has been stopped.", null, AlertType.CONFIRMATION);
				switchDisplayable(timeUp, getTimerDisplayForm());
//GEN-LINE:|7-commandAction|20|71-postAction
				// write post-action user code here
				timer.cancel();
				resetTimer();
			}//GEN-BEGIN:|7-commandAction|21|37-preAction
		}
		else if (displayable == timerSetupForm)
		{
			if (command == timerSetupCancelCommand)
			{//GEN-END:|7-commandAction|21|37-preAction
				// write pre-action user code here
				switchDisplayable(null, getTimerDisplayForm());//GEN-LINE:|7-commandAction|22|37-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|23|34-preAction
			else if (command == timerSetupOkCommand)
			{//GEN-END:|7-commandAction|23|34-preAction
				// write pre-action user code here

				// fetch the user input values for hours, minutes and seconds
				givenTime = new Time(timerSetupHoursTextField.getString(), timerSetupMinutesTextField.getString(), timerSetupSecondsTextField.getString());

				if (givenTime.isZero())
				{
					Alert cannotSetZero = new Alert("Timer Zero!", "The time cannot be set as zero.", null, AlertType.ERROR);
					switchDisplayable(cannotSetZero, getTimerSetupForm());
					return;
				}
				else
				{
					timerDisplayTime.setText(givenTime.toString());
					isTimerSetup = true;
				}

				switchDisplayable(null, getTimerDisplayForm());//GEN-LINE:|7-commandAction|24|34-postAction
				// write post-action user code here

				// FIXME: BUG if the user leaves the fields as 0 and says OK, isTimerSetup becomes true and when the timer is started, it starts counting in negative.
			}//GEN-BEGIN:|7-commandAction|25|7-postCommandAction
		}//GEN-END:|7-commandAction|25|7-postCommandAction
		// write post-action user code here
	}//GEN-BEGIN:|7-commandAction|26|
	//</editor-fold>//GEN-END:|7-commandAction|26|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayExitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayExitCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerDisplayExitCommand()
	{
		if (timerDisplayExitCommand == null)
		{//GEN-END:|18-getter|0|18-preInit
			// write pre-init user code here
			timerDisplayExitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
			// write post-init user code here
		}//GEN-BEGIN:|18-getter|2|
		return timerDisplayExitCommand;
	}
	//</editor-fold>//GEN-END:|18-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayForm ">//GEN-BEGIN:|14-getter|0|14-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayForm component.
	 * @return the initialized component instance
	 */
	public Form getTimerDisplayForm()
	{
		if (timerDisplayForm == null)
		{//GEN-END:|14-getter|0|14-preInit
			// write pre-init user code here
			timerDisplayForm = new Form("Citrine Timer", new Item[] { getTimerDisplayTime() });//GEN-BEGIN:|14-getter|1|14-postInit
			timerDisplayForm.addCommand(getTimerDisplayExitCommand());
			timerDisplayForm.addCommand(getTimerDisplaySetupCommand());
			timerDisplayForm.addCommand(getTimerDisplayStartCommand());
			timerDisplayForm.addCommand(getTimerDisplayStopCommand());
			timerDisplayForm.addCommand(getTimerDisplayHelpCommand());
			timerDisplayForm.addCommand(getTimerDisplayAboutCommand());
			timerDisplayForm.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
			// write post-init user code here

			// initially, don't display the Start and Stop commands
			// they will be displayed once the setup is done
			//timerDisplayForm.removeCommand(getTimerDisplayStartCommand());
			//timerDisplayForm.removeCommand(getTimerDisplayStopCommand());
		}//GEN-BEGIN:|14-getter|2|
		return timerDisplayForm;
	}
	//</editor-fold>//GEN-END:|14-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayTime ">//GEN-BEGIN:|16-getter|0|16-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayTime component.
	 * @return the initialized component instance
	 */
	public StringItem getTimerDisplayTime()
	{
		if (timerDisplayTime == null)
		{//GEN-END:|16-getter|0|16-preInit
			// write pre-init user code here
			timerDisplayTime = new StringItem("", "--:--:--");//GEN-BEGIN:|16-getter|1|16-postInit
			timerDisplayTime.setLayout(ImageItem.LAYOUT_CENTER | Item.LAYOUT_2);
			timerDisplayTime.setFont(getTimerDisplayFont());//GEN-END:|16-getter|1|16-postInit
			// write post-init user code here
		}//GEN-BEGIN:|16-getter|2|
		return timerDisplayTime;
	}
	//</editor-fold>//GEN-END:|16-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayFont ">//GEN-BEGIN:|22-getter|0|22-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayFont component.
	 * @return the initialized component instance
	 */
	public Font getTimerDisplayFont()
	{
		if (timerDisplayFont == null)
		{//GEN-END:|22-getter|0|22-preInit
			// write pre-init user code here
			timerDisplayFont = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE);//GEN-LINE:|22-getter|1|22-postInit
			// write post-init user code here
		}//GEN-BEGIN:|22-getter|2|
		return timerDisplayFont;
	}
	//</editor-fold>//GEN-END:|22-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerSetupForm ">//GEN-BEGIN:|23-getter|0|23-preInit
	/**
	 * Returns an initiliazed instance of timerSetupForm component.
	 * @return the initialized component instance
	 */
	public Form getTimerSetupForm()
	{
		if (timerSetupForm == null)
		{//GEN-END:|23-getter|0|23-preInit
			// write pre-init user code here

			timerSetupForm = new Form("Setup", new Item[] { getTimerSetupHoursTextField(), getTimerSetupMinutesTextField(), getTimerSetupSecondsTextField(), getTimeUpNoteTextField() });//GEN-BEGIN:|23-getter|1|23-postInit
			timerSetupForm.addCommand(getTimerSetupOkCommand());
			timerSetupForm.addCommand(getTimerSetupCancelCommand());
			timerSetupForm.setCommandListener(this);//GEN-END:|23-getter|1|23-postInit
			// write post-init user code here
		}//GEN-BEGIN:|23-getter|2|
		return timerSetupForm;
	}
	//</editor-fold>//GEN-END:|23-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplaySetupCommand ">//GEN-BEGIN:|30-getter|0|30-preInit
	/**
	 * Returns an initiliazed instance of timerDisplaySetupCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerDisplaySetupCommand()
	{
		if (timerDisplaySetupCommand == null)
		{//GEN-END:|30-getter|0|30-preInit
			// write pre-init user code here
			timerDisplaySetupCommand = new Command("Setup", Command.SCREEN, 1);//GEN-LINE:|30-getter|1|30-postInit
			// write post-init user code here
		}//GEN-BEGIN:|30-getter|2|
		return timerDisplaySetupCommand;
	}
	//</editor-fold>//GEN-END:|30-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerSetupOkCommand ">//GEN-BEGIN:|33-getter|0|33-preInit
	/**
	 * Returns an initiliazed instance of timerSetupOkCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerSetupOkCommand()
	{
		if (timerSetupOkCommand == null)
		{//GEN-END:|33-getter|0|33-preInit
			// write pre-init user code here
			timerSetupOkCommand = new Command("OK", Command.OK, 0);//GEN-LINE:|33-getter|1|33-postInit
			// write post-init user code here
		}//GEN-BEGIN:|33-getter|2|
		return timerSetupOkCommand;
	}
	//</editor-fold>//GEN-END:|33-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerSetupCancelCommand ">//GEN-BEGIN:|36-getter|0|36-preInit
	/**
	 * Returns an initiliazed instance of timerSetupCancelCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerSetupCancelCommand()
	{
		if (timerSetupCancelCommand == null)
		{//GEN-END:|36-getter|0|36-preInit
			// write pre-init user code here
			timerSetupCancelCommand = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|36-getter|1|36-postInit
			// write post-init user code here
		}//GEN-BEGIN:|36-getter|2|
		return timerSetupCancelCommand;
	}
	//</editor-fold>//GEN-END:|36-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerSetupHoursTextField ">//GEN-BEGIN:|41-getter|0|41-preInit
	/**
	 * Returns an initiliazed instance of timerSetupHoursTextField component.
	 * @return the initialized component instance
	 */
	public TextField getTimerSetupHoursTextField()
	{
		if (timerSetupHoursTextField == null)
		{//GEN-END:|41-getter|0|41-preInit
			// write pre-init user code here
			timerSetupHoursTextField = new TextField("Hours", null, 2, TextField.NUMERIC);//GEN-LINE:|41-getter|1|41-postInit
			// write post-init user code here
			timerSetupHoursTextField.setString("00");
		}//GEN-BEGIN:|41-getter|2|
		return timerSetupHoursTextField;
	}
	//</editor-fold>//GEN-END:|41-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerSetupMinutesTextField ">//GEN-BEGIN:|42-getter|0|42-preInit
	/**
	 * Returns an initiliazed instance of timerSetupMinutesTextField component.
	 * @return the initialized component instance
	 */
	public TextField getTimerSetupMinutesTextField()
	{
		if (timerSetupMinutesTextField == null)
		{//GEN-END:|42-getter|0|42-preInit
			// write pre-init user code here
			timerSetupMinutesTextField = new TextField("Minutes", null, 2, TextField.NUMERIC);//GEN-LINE:|42-getter|1|42-postInit
			// write post-init user code here
			timerSetupMinutesTextField.setString("00");
		}//GEN-BEGIN:|42-getter|2|
		return timerSetupMinutesTextField;
	}
	//</editor-fold>//GEN-END:|42-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerSetupSecondsTextField ">//GEN-BEGIN:|43-getter|0|43-preInit
	/**
	 * Returns an initiliazed instance of timerSetupSecondsTextField component.
	 * @return the initialized component instance
	 */
	public TextField getTimerSetupSecondsTextField()
	{
		if (timerSetupSecondsTextField == null)
		{//GEN-END:|43-getter|0|43-preInit
			// write pre-init user code here
			timerSetupSecondsTextField = new TextField("Seconds", null, 2, TextField.NUMERIC);//GEN-LINE:|43-getter|1|43-postInit
			// write post-init user code here
			timerSetupSecondsTextField.setString("00");
		}//GEN-BEGIN:|43-getter|2|
		return timerSetupSecondsTextField;
	}
	//</editor-fold>//GEN-END:|43-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayStartCommand ">//GEN-BEGIN:|45-getter|0|45-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayStartCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerDisplayStartCommand()
	{
		if (timerDisplayStartCommand == null)
		{//GEN-END:|45-getter|0|45-preInit
			// write pre-init user code here
			timerDisplayStartCommand = new Command("Start", Command.SCREEN, 2);//GEN-LINE:|45-getter|1|45-postInit
			// write post-init user code here
		}//GEN-BEGIN:|45-getter|2|
		return timerDisplayStartCommand;
	}
	//</editor-fold>//GEN-END:|45-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayHelpCommand ">//GEN-BEGIN:|48-getter|0|48-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayHelpCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerDisplayHelpCommand()
	{
		if (timerDisplayHelpCommand == null)
		{//GEN-END:|48-getter|0|48-preInit
			// write pre-init user code here
			timerDisplayHelpCommand = new Command("Help", Command.HELP, 4);//GEN-LINE:|48-getter|1|48-postInit
			// write post-init user code here
		}//GEN-BEGIN:|48-getter|2|
		return timerDisplayHelpCommand;
	}
	//</editor-fold>//GEN-END:|48-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineHelpBackCommand ">//GEN-BEGIN:|52-getter|0|52-preInit
	/**
	 * Returns an initiliazed instance of citrineHelpBackCommand component.
	 * @return the initialized component instance
	 */
	public Command getCitrineHelpBackCommand()
	{
		if (citrineHelpBackCommand == null)
		{//GEN-END:|52-getter|0|52-preInit
			// write pre-init user code here
			citrineHelpBackCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|52-getter|1|52-postInit
			// write post-init user code here
		}//GEN-BEGIN:|52-getter|2|
		return citrineHelpBackCommand;
	}
	//</editor-fold>//GEN-END:|52-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineAboutBackCommand ">//GEN-BEGIN:|56-getter|0|56-preInit
	/**
	 * Returns an initiliazed instance of citrineAboutBackCommand component.
	 * @return the initialized component instance
	 */
	public Command getCitrineAboutBackCommand()
	{
		if (citrineAboutBackCommand == null)
		{//GEN-END:|56-getter|0|56-preInit
			// write pre-init user code here
			citrineAboutBackCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|56-getter|1|56-postInit
			// write post-init user code here
		}//GEN-BEGIN:|56-getter|2|
		return citrineAboutBackCommand;
	}
	//</editor-fold>//GEN-END:|56-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineAboutHelpCommand ">//GEN-BEGIN:|59-getter|0|59-preInit
	/**
	 * Returns an initiliazed instance of citrineAboutHelpCommand component.
	 * @return the initialized component instance
	 */
	public Command getCitrineAboutHelpCommand()
	{
		if (citrineAboutHelpCommand == null)
		{//GEN-END:|59-getter|0|59-preInit
			// write pre-init user code here
			citrineAboutHelpCommand = new Command("Help", Command.HELP, 0);//GEN-LINE:|59-getter|1|59-postInit
			// write post-init user code here
		}//GEN-BEGIN:|59-getter|2|
		return citrineAboutHelpCommand;
	}
	//</editor-fold>//GEN-END:|59-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayAboutCommand ">//GEN-BEGIN:|63-getter|0|63-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayAboutCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerDisplayAboutCommand()
	{
		if (timerDisplayAboutCommand == null)
		{//GEN-END:|63-getter|0|63-preInit
			// write pre-init user code here
			timerDisplayAboutCommand = new Command("About", Command.HELP, 5);//GEN-LINE:|63-getter|1|63-postInit
			// write post-init user code here
		}//GEN-BEGIN:|63-getter|2|
		return timerDisplayAboutCommand;
	}
	//</editor-fold>//GEN-END:|63-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineHelpAboutCommand ">//GEN-BEGIN:|66-getter|0|66-preInit
	/**
	 * Returns an initiliazed instance of citrineHelpAboutCommand component.
	 * @return the initialized component instance
	 */
	public Command getCitrineHelpAboutCommand()
	{
		if (citrineHelpAboutCommand == null)
		{//GEN-END:|66-getter|0|66-preInit
			// write pre-init user code here
			citrineHelpAboutCommand = new Command("About", Command.SCREEN, 0);//GEN-LINE:|66-getter|1|66-postInit
			// write post-init user code here
		}//GEN-BEGIN:|66-getter|2|
		return citrineHelpAboutCommand;
	}
	//</editor-fold>//GEN-END:|66-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineHelpForm ">//GEN-BEGIN:|50-getter|0|50-preInit
	/**
	 * Returns an initiliazed instance of citrineHelpForm component.
	 * @return the initialized component instance
	 */
	public Form getCitrineHelpForm()
	{
		if (citrineHelpForm == null)
		{//GEN-END:|50-getter|0|50-preInit
			// write pre-init user code here
			citrineHelpForm = new Form("Help", new Item[] { getCitrineHelpInstructionsStringItem() });//GEN-BEGIN:|50-getter|1|50-postInit
			citrineHelpForm.addCommand(getCitrineHelpBackCommand());
			citrineHelpForm.addCommand(getCitrineHelpAboutCommand());
			citrineHelpForm.setCommandListener(this);//GEN-END:|50-getter|1|50-postInit
			// write post-init user code here
		}//GEN-BEGIN:|50-getter|2|
		return citrineHelpForm;
	}
	//</editor-fold>//GEN-END:|50-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineAboutForm ">//GEN-BEGIN:|55-getter|0|55-preInit
	/**
	 * Returns an initiliazed instance of citrineAboutForm component.
	 * @return the initialized component instance
	 */
	public Form getCitrineAboutForm()
	{
		if (citrineAboutForm == null)
		{//GEN-END:|55-getter|0|55-preInit
			// write pre-init user code here
			citrineAboutForm = new Form("About", new Item[] { getCitrineAboutCopyrightText() });//GEN-BEGIN:|55-getter|1|55-postInit
			citrineAboutForm.addCommand(getCitrineAboutBackCommand());
			citrineAboutForm.addCommand(getCitrineAboutHelpCommand());
			citrineAboutForm.setCommandListener(this);//GEN-END:|55-getter|1|55-postInit
			// write post-init user code here
		}//GEN-BEGIN:|55-getter|2|
		return citrineAboutForm;
	}
	//</editor-fold>//GEN-END:|55-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineAboutCopyrightText ">//GEN-BEGIN:|62-getter|0|62-preInit
	/**
	 * Returns an initiliazed instance of citrineAboutCopyrightText component.
	 * @return the initialized component instance
	 */
	public StringItem getCitrineAboutCopyrightText()
	{
		if (citrineAboutCopyrightText == null)
		{//GEN-END:|62-getter|0|62-preInit
			// write pre-init user code here
			citrineAboutCopyrightText = new StringItem("Citrine Timer", "A timer application for mobile phones.\nCopyright 2010, Rishabh Rao\n\nhttp://kenai.com/projects/citrinetimer\n\nDeveloped using NetBeans IDE 6.9.1\nhttp://www.netbeans.org");//GEN-LINE:|62-getter|1|62-postInit
			// write post-init user code here
		}//GEN-BEGIN:|62-getter|2|
		return citrineAboutCopyrightText;
	}
	//</editor-fold>//GEN-END:|62-getter|2|
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: citrineHelpInstructionsStringItem ">//GEN-BEGIN:|69-getter|0|69-preInit
	/**
	 * Returns an initiliazed instance of citrineHelpInstructionsStringItem component.
	 * @return the initialized component instance
	 */
	public StringItem getCitrineHelpInstructionsStringItem()
	{
		if (citrineHelpInstructionsStringItem == null)
		{//GEN-END:|69-getter|0|69-preInit
			// write pre-init user code here
			citrineHelpInstructionsStringItem = new StringItem("Citrine Timer", "A timer application for mobile phones.\nCopyright 2010, Rishabh Rao\n\nUse the Setup screen to set hours, minutes and seconds for the timer.\n\nSelect Start/Stop to start or stop the timer.\n\nFor further help and instructions, visit the Citrine Timer forums or the wiki page at http://kenai.com/projects/citrinetimer");//GEN-LINE:|69-getter|1|69-postInit
			// write post-init user code here
		}//GEN-BEGIN:|69-getter|2|
		return citrineHelpInstructionsStringItem;
	}
	//</editor-fold>//GEN-END:|69-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: timerDisplayStopCommand ">//GEN-BEGIN:|70-getter|0|70-preInit
	/**
	 * Returns an initiliazed instance of timerDisplayStopCommand component.
	 * @return the initialized component instance
	 */
	public Command getTimerDisplayStopCommand()
	{
		if (timerDisplayStopCommand == null)
		{//GEN-END:|70-getter|0|70-preInit
			// write pre-init user code here
			timerDisplayStopCommand = new Command("Stop", Command.SCREEN, 3);//GEN-LINE:|70-getter|1|70-postInit
			// write post-init user code here
		}//GEN-BEGIN:|70-getter|2|
		return timerDisplayStopCommand;
	}
	//</editor-fold>//GEN-END:|70-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: TimeUpNoteTextField ">//GEN-BEGIN:|72-getter|0|72-preInit
	/**
	 * Returns an initiliazed instance of TimeUpNoteTextField component.
	 * @return the initialized component instance
	 */
	public TextField getTimeUpNoteTextField()
	{
		if (TimeUpNoteTextField == null)
		{//GEN-END:|72-getter|0|72-preInit
			// write pre-init user code here
			TimeUpNoteTextField = new TextField("Time up note", null, 32, TextField.ANY);//GEN-LINE:|72-getter|1|72-postInit
			// write post-init user code here
		}//GEN-BEGIN:|72-getter|2|
		return TimeUpNoteTextField;
	}
	//</editor-fold>//GEN-END:|72-getter|2|

	/**
	 * Returns a display instance.
	 * @return the display instance.
	 */
	public Display getDisplay()
	{
		return Display.getDisplay(this);
	}

	/**
	 * Exits MIDlet.
	 */
	public void exitMIDlet()
	{
		switchDisplayable(null, null);
		destroyApp(true);
		notifyDestroyed();
	}

	/**
	 * Called when MIDlet is started.
	 * Checks whether the MIDlet have been already started and
	 * initialize/starts or resumes the MIDlet.
	 */
	public void startApp()
	{
		if (midletPaused)
		{
			resumeMIDlet();
		}
		else
		{
			initialize();
			startMIDlet();
		}
		midletPaused = false;
	}

	/**
	 * Called when MIDlet is paused.
	 */
	public void pauseApp()
	{
		midletPaused = true;
	}

	/**
	 * Called to signal the MIDlet to terminate.
	 * @param unconditional if true, then the MIDlet has to be
	 * unconditionally terminated and all resources has to be released.
	 */
	public void destroyApp(boolean unconditional)
	{
	}

	/**
	 * Called when the time is up. Performs post-stop work.
	 */
	void timeIsUp()
	{
		resetTimer();

		Alert timeUp = new Alert("Time Up!", TimeUpNoteTextField.getString(), null, AlertType.CONFIRMATION);
		timeUp.setTimeout(Alert.FOREVER);
		switchDisplayable(timeUp, getTimerDisplayForm());

		try
		{
			InputStream is = getClass().getResourceAsStream("/resources/timeUp.wav");
			Player p = Manager.createPlayer(is, "audio/x-wav");
			p.start();
		}
		catch (IOException ioe)
		{
			System.err.println("Error: " + ioe);
		}
		catch (MediaException me)
		{
			System.err.println("Error: " + me);
		}
	}

	/**
	 * Sets the timer display string to the given time.
	 * @param toString The time to be displayed.
	 */
	void setTimerText(String time)
	{
		timerDisplayTime.setText(time);
	}

	/**
	 * Resets the timer.
	 */
	private void resetTimer()
	{
		timerDisplayTime.setText("--:--:--");
		isTimerRunning = false;
		isTimerSetup = false;
	}
}
