import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.demoqa_base_url)

WebUI.scrollToElement(findTestObject('Navigation Cards/nav_card_elements'), 0)

WebUI.click(findTestObject('Navigation Cards/nav_card_elements'))

WebUI.scrollToElement(findTestObject('Menus/Elements/Buttons/menu_elements_buttons'), 0)

WebUI.click(findTestObject('Menus/Elements/Buttons/menu_elements_buttons'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Menus/Elements/Buttons/text_double_click'), 0)

WebUI.verifyElementNotPresent(findTestObject('Menus/Elements/Buttons/text_right_click'), 0)

WebUI.verifyElementNotPresent(findTestObject('Menus/Elements/Buttons/text_click_me'), 0)

WebUI.scrollToElement(findTestObject('Menus/Elements/Buttons/btn_double_click'), 0)

WebUI.doubleClick(findTestObject('Menus/Elements/Buttons/btn_double_click'))

WebUI.verifyElementPresent(findTestObject('Menus/Elements/Buttons/text_double_click'), 0)

WebUI.rightClick(findTestObject('Menus/Elements/Buttons/btn_right_click'))

WebUI.verifyElementPresent(findTestObject('Menus/Elements/Buttons/text_right_click'), 0)

WebUI.click(findTestObject('Menus/Elements/Buttons/btn_click_me'))

WebUI.verifyElementPresent(findTestObject('Menus/Elements/Buttons/text_click_me'), 0)

WebUI.closeBrowser()

