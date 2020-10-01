package JUnitTesting;
import com.capg.junittesting.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;
public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
		//String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD", moodAnalyser.analyseMood());
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy()
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is Happy message");
		//String mood = moodAnalyser.analyseMood("This is Happy message");
		Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
	}
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser(null);
			Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
	
	}
}