package JUnitTesting;
import com.capg.junittesting.*;
import org.junit.Test;
import org.junit.Assert;
public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD", mood);
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is Happy message");
		Assert.assertEquals("HAPPY", mood);
	}
}