/* Filename: Television.java
   Author: Rich Raposa
   Date: 9/20/02
*/

public class Television
{
	private int channel; //current channel
	private int prev;  //previous channel

	/** This method changes the channel
	*   of this television.
	*   @param newChannel The channel to be changed to.
	*/
	public void setChannel(int newChannel)
	{
		prev = channel; //keep track of the previous channel
		channel = newChannel; //change to the new channel
	}
}
