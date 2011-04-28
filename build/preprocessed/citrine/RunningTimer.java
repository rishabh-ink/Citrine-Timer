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

import java.util.TimerTask;

/**
 * Use to hold a the <code>run</code> method of the <code>TimerTask</code> which will is scheduled to be called every second.
 * @author Rishabh Rao, Abhishek K N
 * @see TimerTask
 */
public class RunningTimer extends TimerTask
{
	/**
	 * The starting time for the timer.
	 */
	Time startTime;
	/**
	 * A reference to the timer MIDlet.
	 */
	CitrineMIDlet timer;

	/**
	 * Initialize the object.
	 * @param startTime The starting time for the timer.
	 * @param timerDisplayTime A reference to the timer display in the MIDlet.
	 */
	public RunningTimer(Time startTime, CitrineMIDlet citrineTimer)
	{
		this.startTime = startTime;
		this.timer = citrineTimer;
	}

	/**
	 * This function is scheduled to be called every second.
	 */
	public void run()
	{
		startTime = startTime.decrementOneSecond(); // count down by one second
		timer.setTimerText(startTime.toString()); // update the display

		if (startTime.isZero())
		{
			this.cancel();
			timer.timeIsUp();
		}
	}
}
