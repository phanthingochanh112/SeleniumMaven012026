package BT.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocatorsCRM {
    public static void main(String[] args) {

        // Suppress CDP warning
        Logger.getLogger("org.openqa.selenium.chromium.ChromiumDriver").setLevel(Level.OFF);
        Logger.getLogger("org.openqa.selenium.devtools.CdpVersionFinder").setLevel(Level.OFF);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crm.anhtester.com/admin/authentication");
        //------------- Xpath Login page-----------------
        driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id ='remember']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //------------- Xpath Menu Customer------------------
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/clients']")).click();
        driver.findElement(By.xpath("//div[@class= 'hide-menu tw-ml-1']")).click(); // Hide menu Customer
        driver.findElement(By.xpath("//input[@id='search_input' and @placeholder='Search...']")).click(); // TextSearch
        driver.findElement(By.xpath("//button[@class='tw-outline-none tw-border-0 tw-text-neutral-600 search_remove']/descendant::i")).click();// Remove Search
        driver.findElement(By.xpath("//li[@class='dropdown-header tw-mb-1']")).click();// Button QuickCreate
        driver.findElement(By.xpath("//span[normalize-space()='Export']")).click(); // Button Export
        driver.findElement(By.xpath("//span[normalize-space()='Bulk Actions']")).click(); // Button Bulk Action
        driver.findElement(By.xpath("//div[@class='btn-group btn-with-tooltip-group open']/following::button")).click(); // Filter button
        driver.findElement(By.xpath("//span[@class='text-dark tw-truncate sm:tw-text-clip']")).click(); // Lable Total Customers
        driver.findElement(By.xpath("//span[normalize-space()='Active Customers']")).click(); // Lable Active Customers
        driver.findElement(By.xpath("//input[@type='checkbox' and @id='8965]")).click();// Active Button
        driver.findElement(By.xpath("//li[@id='clients_previous']")).click();// Button Previous
        driver.findElement(By.xpath("//a[normalize-space()='Next']")).click();// Button Next

        //------------Xpath Customers Summary-------------
        //*Customer Detais*//
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Công ty TNHH Con Cò");
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='phonenumber)']")).sendKeys("0901371474");
        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("www.conco.com");
        driver.findElement(By.xpath("//select[@id='groups_in[]']")).click(); // Group dropdown
        driver.findElement(By.xpath("///div[@class='input-group-btn']/descendant::a")).click(); // Add new customer group
        driver.findElement(By.xpath("//select[@id='default_currency']")).click(); // Default currency dropdown
        driver.findElement(By.xpath("//select[@id='default_currency']/option[@value='1']")).click(); // Select USD currency
        driver.findElement(By.xpath("//select[@id='default_currency']/option[@value='2']")).click(); // Select VND currency
        driver.findElement(By.xpath("//select[@id='default_language']")).click(); // Default language dropdown
        driver.findElement(By.xpath("///select[@id='default_language']/option[normalize-space()='English']")).click(); // Select English language
        driver.findElement(By.xpath("//label[normalize-space()='Address']")).click(); // Lable Address
        driver.findElement(By.xpath("//input[@id='city']")).click(); //Label City
        driver.findElement(By.xpath("//input[@id='state']")).click(); // Label State
        driver.findElement(By.xpath("//input[@id='zip']")).click(); // Label zip code
        driver.findElement(By.xpath("//select[@id='country']")).click(); // Label Country
        driver.findElement(By.xpath("//select[@id='country']/option[@value='243']")).click(); // Select Country Viet Nam
        driver.findElement(By.xpath("//button[normalize-space()='Save and create contact']")).click(); // Save and Create contact
        driver.findElement(By.xpath("///button[@class='btn btn-primary only-save customer-form-submiter']")).click(); // Save customer

        //*Billing and Shipping*//
        driver.findElement(By.xpath("//a[normalize-space()='Billing & Shipping']")).click(); // Tab Billing and Shipping
        driver.findElement(By.xpath("//textarea[@id='billing_street']")).click(); // Street
        driver.findElement(By.xpath(" //input[@id='billing_city']")).click(); //City
        driver.findElement(By.xpath(" //input[@id='billing_state']")).click(); // State
        driver.findElement(By.xpath("//input[@id='billing_zip']")).click(); // Zipcode
        driver.findElement(By.xpath("//div[@app-field-wrapper='billing_country']")).click();//Country
        driver.findElement(By.xpath("//a[normalize-space()='Same as Customer Info']")).click();// Same as Customer Info
        driver.findElement(By.xpath("//i[@class='fa-regular fa-circle-question tw-mr-1']")).click(); // Lable Shipping address
        driver.findElement(By.xpath("//a[normalize-space()='Copy Billing Address']")).click(); // Copy Billing Address
        driver.findElement(By.xpath("//textarea[@id='shipping_street']")).click(); // Shipping Street
        driver.findElement(By.xpath("//input[@id='shipping_city']")).click(); // Shipping City
        driver.findElement(By.xpath("//input[@id='shipping_state']")).click(); // Shipping State
        driver.findElement(By.xpath("//input[@id='shipping_zip']")).click(); // Zip code
        driver.findElement(By.xpath("///div[@app-field-wrapper='shipping_country']")).click(); //Country

        //-------------Xpath Menu Project----------------
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click(); // Menu Project
        driver.findElement(By.xpath("//label[normalize-space()='Projects']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Project']")).click();
        driver.findElement(By.xpath("//a[@role='tab'][normalize-space()='Project']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).click(); //Form Project Name
        driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']")).click(); // Form Customer
        driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).click(); // Form Type to search
        driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).click(); // Checkbox Calculate progress through tasks
        driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).click(); // Slider progress
        driver.findElement(By.xpath("//label[@for='billing_type']")).click(); // Lable Billing Type
        driver.findElement(By.xpath("//button[@title='Task Hours Based on task hourly rate']")).click(); // Task House
        driver.findElement(By.xpath("//div[contains(text(),'Not Started')]")).click(); // Select Not Started
        driver.findElement(By.xpath("//input[@id='estimated_hours']")).click();  // Estimated Hours
        driver.findElement(By.xpath("//div[contains(text(),'Admin Example')]")).click(); // Member
        driver.findElement(By.xpath("//input[@id='start_date']")).click(); // Start Date
        driver.findElement(By.xpath("///input[@id='deadline']")).click();    // Deadline
        driver.findElement(By.xpath("//input[@placeholder='Tag']")).click();   //Tags
        driver.findElement(By.xpath("//input[@id='description']")).click();   //
        driver.findElement(By.xpath("//p[contains(text(),'Description')]")).click();  // Label Description
        driver.findElement(By.xpath("///span[normalize-space()='File']")).click();   // Label File
        driver.findElement(By.xpath("///span[normalize-space()='Edit']")).click();   // Label Edit
        driver.findElement(By.xpath("//span[normalize-space()='Insert']")).click();   // Label Insert
        driver.findElement(By.xpath("//span[normalize-space()='Format']")).click(); // Label Format
        driver.findElement(By.xpath("//span[normalize-space()='Tools']")).click();  // Label Tool
        driver.findElement(By.xpath("//span[normalize-space()='Table']")).click();  // Label Table
        driver.findElement(By.xpath("//span[normalize-space()='System Font']")).click();  // System Font
        driver.findElement(By.xpath("//body[@id='tinymce']")).click();   // Body description
        driver.findElement(By.xpath("//input[@id='send_created_email']")).click();   // Checkbox Send email
        driver.findElement(By.xpath("//label[@for='send_created_email']")).click();   // Lable Send project created email
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();    // Save Button




    }

}
