package gridTest;


	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.Test;
	
	public class TestGoogle {
		@Test
		public void openChrome() {
			try {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.LINUX);

			
				WebDriver driver = new RemoteWebDriver(new URL(" http://localhost:4444/wd/hub/"), cap);
				driver.manage().window().maximize();
				driver.get("http://www.google.co.in");
				System.out.println(driver.getTitle() + " This is the First test case");

				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		@Test
		public void openFireFox() {
			try {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setBrowserName("firefox");
				cap.setPlatform(Platform.LINUX);

				@SuppressWarnings("deprecation")
				WebDriver driver = new RemoteWebDriver(new URL(" http://localhost:4444/wd/hub/"), cap);
				driver.manage().window().maximize();
				driver.get("http://www.bing.co.in");
				System.out.println(driver.getTitle() + " This is the Second test case");
				driver.quit();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

	}
