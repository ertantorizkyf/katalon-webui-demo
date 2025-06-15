import com.kms.katalon.core.annotation.TearDownIfFailed
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.configuration.RunConfiguration

@TearDownIfFailed
def conditionalCloseBrowser() {
	def closeTCs = ['ButtonsCases']
    String testCaseId = RunConfiguration.getTestCaseId()
    
    // Replace with the exact test case IDs or partial names you want
    if (closeTCs.any { testCaseId.contains(it) }) {
        WebUI.comment("Test failed. Closing browser for: ${testCaseId}")
        WebUI.closeBrowser()
    } else {
        WebUI.comment("Test failed, but browser will remain open for: ${testCaseId}")
    }
}
