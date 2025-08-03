import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC  
@pytest.fixture
def driver():
    """Setup and teardown for WebDriver"""
    driver = webdriver.Chrome()
    driver.get("https://demoqa.com/menu")
    driver.maximize_window()
    yield driver  # Provide driver instance to tests
    driver.quit()
    

    
def test_hover_over_menu(driver):

    """Test hover over 'Main Item 2'"""
    wait = WebDriverWait(driver, 10)
    # Locate the element
    main_item_2 = wait.until(EC.presence_of_element_located((By.XPATH, "//a[text()='Main Item 2']")))

    # Perform hover action
    actions = ActionChains(driver)
    actions.move_to_element(main_item_2).perform()


    # Verify if the submenu appears
    submenu = wait.until(EC.visibility_of_element_located((By.XPATH, "//a[text()='SUB SUB LIST »']")))
    assert submenu.is_displayed(), "Submenu did not appear after hovering!"

