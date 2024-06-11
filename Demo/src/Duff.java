import org.openqa.selenium.By;

while(true) {
			String current_month = driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[2]")).getText();
			if(month.equals(current_month)) {
				System.out.println(current_month);
				break;
			}
			else {
				System.out.println(current_month);
				driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[3]")).click();
			}
		}
		int col =7;
		int flag=0;
		int row=driver.findElements(By.xpath("//table/tbody/tr")).size();
		for(int i=3;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String actual_date=driver.findElement(By.xpath("//table/tbody/tr["+1+"]/td["+1+"]")).getText();
				if(actual_date.equals(date)) {
					driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[+j+]")).click();
					flag=1;
					System.out.print(actual_date);
					Thread.sleep(2000);
					break;
				}
				else {
					continue;
				}
			}
			if(flag==1) {
				break;
			}
		}