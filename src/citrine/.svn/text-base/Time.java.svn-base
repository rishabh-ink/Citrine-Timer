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

/**
 * A simple container for dealing with time: hours, minutes and seconds
 * @author Rishabh Rao
 */
public final class Time
{
	/**
	 * The hour value of the time.
	 */
	private long hours;
	/**
	 * The minute value of the time.
	 */
	private long minutes;
	/**
	 * The second value of the time.
	 */
	private long seconds;

	public static final long ONE_SECOND = 1000;

	public Time()
	{
	}

	/**
	 * Initializes the <code>Time</code> object.
	 * @param hours The hour value of the time.
	 * @param minutes The minute value of the time.
	 * @param seconds The second value of the time.
	 */
	public Time(long hours, long minutes, long seconds)
	{
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}

	/**
	 * Initializes the <code>Time</code> object.
	 * @param hours The hour value of the time.
	 * @param minutes The minute value of the time.
	 * @param seconds The second value of the time.
	 */
	public Time(String hours, String minutes, String seconds)
	{
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}

	/**
	 * Sets the hour value of the time.
	 * @param hours The hour value of the time.
	 * @throws NumberFormatException If the argument cannot be converted to a number.
	*/
	public final void setHours(String hours)
	{
		long toSetHours;

		try
		{
			toSetHours = Long.parseLong(hours);
		}
		catch(NumberFormatException nfe)
		{
			toSetHours = 0;
		}

		// some phones can actually enter negative numbers
		if(toSetHours < 0)
		{
			toSetHours = 0;
		}

		if(toSetHours > 59)
		{
			this.hours = 59;
		}
		else
		{
			this.hours = toSetHours;
		}
	}

	/**
	 * Sets the minute value of the time.
	 * @param minutes The minute value of the time.
	 * @throws NumberFormatException If the argument cannot be converted to a number.
	*/
	public final void setMinutes(String minutes)
	{
		long toSetMinutes;

		try
		{
			toSetMinutes = Long.parseLong(minutes);
		}
		catch(NumberFormatException nfe)
		{
			toSetMinutes = 0;
		}

		// some phones can actually enter negative numbers
		if(toSetMinutes < 0)
		{
			toSetMinutes = 0;
		}

		if(toSetMinutes > 59)
		{
			this.minutes = 59;
		}
		else
		{
			this.minutes = toSetMinutes;
		}
	}

	/**
	 * Sets the second value of the time.
	 * @param seconds The second value of the time.
	 * @throws NumberFormatException If the argument cannot be converted to a number.
	*/
	public final void setSeconds(String seconds)
	{
		long toSetSeconds;

		try
		{
			toSetSeconds = Long.parseLong(seconds);
		}
		catch(NumberFormatException nfe)
		{
			toSetSeconds = 0;
		}

		// some phones can actually enter negative numbers
		if(toSetSeconds < 0)
		{
			toSetSeconds = 0;
		}

		if(toSetSeconds > 59)
		{
			this.seconds = 59;
		}
		else
		{
			this.seconds = toSetSeconds;
		}
	}

	/**
	 * Sets the hour value of the time.
	 * @param hours The hour value of the time.
	 */
	public final void setHours(long hours)
	{
		// some phones can actually enter negative numbers
		if(hours < 0)
		{
			this.hours = 0;
		}
		else
		{
			if (hours > 59)
			{
				this.hours = 59;
			}
			else
			{
				this.hours = hours;
			}
		}
	}

	/**
	 * Sets the minute value of the time.
	 * @param minutes The minute value of the time.
	 */
	public final void setMinutes(long minutes)
	{
		// some phones can actually enter negative numbers
		if(minutes < 0)
		{
			this.minutes = 0;
		}
		else
		{
			if (minutes > 59)
			{
				this.minutes = 59;
			}
			else
			{
				this.minutes = minutes;
			}
		}
	}


	/**
	 * Sets the second value of the time.
	 * @param seconds The second value of the time.
	 */
	public final void setSeconds(long seconds)
	{
		// some phones can actually enter negative numbers
		if(seconds < 0)
		{
			this.seconds = 0;
		}
		else
		{
			if (seconds > 59)
			{
				this.seconds = 59;
			}
			else
			{
				this.seconds = seconds;
			}
		}
	}

	/**
	 * @return The hour value of the time.
	 */
	public final long getHours()
	{
		return hours;
	}

	/**
	 * @return The minute value of the time.
	 */
	public final long getMinutes()
	{
		return minutes;
	}

	/**
	 * @return The second value of the time.
	 */
	public final long getSeconds()
	{
		return seconds;
	}

	/**
	 * @return The time converted to milliseconds.
	 */
	public final long toMillseconds()
	{
		final long SIXTY = 60;
		return (((this.hours * SIXTY * SIXTY) + (this.minutes * SIXTY) + (this.seconds)) * ONE_SECOND);
	}

	/**
	 * @return A new <code>Time</code> object based on the given millisecond value.
	 */
	public final Time fromMillseconds(long ms)
	{
		Time returnTime = new Time();

		long msByThousand = ms / ONE_SECOND;

		returnTime.setSeconds((msByThousand % 60));
		msByThousand /= 60;

		returnTime.setMinutes(msByThousand % 60);
		msByThousand /= 60;

		returnTime.setHours(msByThousand % 24);

		return returnTime;
	}

	/**
	 * @return The string representation of the time. For example, as 01:32:16.
	 */
	public final String toString()
	{
		String timerString;

		timerString = (this.getHours() < 10) ? ("0" + String.valueOf(this.getHours())) : (String.valueOf(this.getHours()));
		timerString += ":";
		timerString += (this.getMinutes() < 10) ? ("0" + String.valueOf(this.getMinutes())) : (String.valueOf(this.getMinutes()));
		timerString += ":";
		timerString += (this.getSeconds() < 10) ? ("0" + String.valueOf(this.getSeconds())) : (String.valueOf(this.getSeconds()));

		return timerString;
	}

	/**
	 * @return A <code>Time</code> object which is one second less than the calling time object.
	 */
	public final Time decrementOneSecond()
	{
		long timeInMilliseconds = this.toMillseconds();

		timeInMilliseconds -= ONE_SECOND;

		return fromMillseconds(timeInMilliseconds);
	}

	/**
	 * @return <code>true</code> if the time is 00:00:00, else returns <code>false</code>.
	 */
	public final boolean isZero()
	{
		if((this.getHours() == 0) && (this.getMinutes() == 0) && (this.getSeconds() == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
