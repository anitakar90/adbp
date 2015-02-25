from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
import time

driver=webdriver.Firefox()
driver.get("http://nytimes.com")

# time.sleep(3)

iframe_list=WebDriverWait(driver, 10).until(lambda driver: driver.find_elements(By.XPATH, '//iframe'))

for iframe_elem in iframe_list:
	location = iframe_elem.location
	size = iframe_elem.size
	print(location)	
	print(size)	

driver.quit()


