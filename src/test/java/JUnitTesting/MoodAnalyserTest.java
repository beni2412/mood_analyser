package JUnitTesting;
import com.capg.junittesting.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;
public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodException
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
		//String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD", moodAnalyser.analyseMood());
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodException
	{
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is Happy message");
		//String mood = moodAnalyser.analyseMood("This is Happy message");
		Assert.assertEquals("HAPPY", moodAnalyser.analyseMood());
	}
	@Test
	public void givenMessage_WhenNull() throws MoodException {
	MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodException.class);		
			}catch (Exception e) {
				e.printStackTrace();
				Assert.assertEquals("Null Exception", moodAnalyser.analyseMood());
			}
		}
	
	@Test
	public void givenMessage_When_Empty() throws MoodException {
	MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodException.class);
			}catch (Exception e) {
				e.printStackTrace();
				Assert.assertEquals("Empty Exception", moodAnalyser.analyseMood());
			}
		}
}