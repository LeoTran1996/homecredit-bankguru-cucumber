@bankguru
Feature: Register and Login

@register_login
	Scenario: Register to application and login
		Given Get Login page Url
		When Open Register page
		When Input to Email textbox with "lukaku123@gmail.com"
		And Click to Submit button at Register page
		Then Get UserID and Password infor
		When Back to Login page
		And Submit valid infor to login form
		Then Homepage is displayed
	
@new_customer
	Scenario Outline: Create new a Customer
		Given Open New Customer page
		When Input to CustomerName textbox with "<CustomerName>"
		And Click to Female radio button
		And Input to Date of Birth textbox with "<Date of Birth>"
		And Input to Address textbox with	"<Address>"
		And Input to City textbox with"<City>"
		And Input to State textbox with	"<State>"
		And Input to PIN textbox with	"<PIN>"
		And Input to Mobile Number textbox with	"<Mobile>"
		And Input to Emai textbox	with "<Email>"
		And Input to Password textbox	with "<Password>"
		And Click to Submit button at New Customer page
		Then Verify Customer successmessage is displayed
		When get CustomerID
	
	Examples:
	
	| CustomerName | Date of Birth | Address     | City | State    | PIN    | Mobile     | Email               | Password    | 
  | Anh Tran     | 03031996      | Tran Van Du | HCM  | Tan Binh | 123456 | 035878111  | messi009@gmail.com  | vananhmessi | 
  
@new_account
Scenario: Create new a Account
	Given Open New Account page
	When Input to CustomerID textbox 	
	And Select Current type in Account Type
	And Input to Initial deposit textbox with "100000"
	And Click to Submit button at New Accout page
	Then Verify Account successmessage is dispalyed
	When Get Account ID
	
@deposit
Scenario Outline: Deposit
	Given Open Deposit page
	When Input to Account No textbox
	And Input to Amount textbox with "<Amount>"
	And Input to Description textbox "<Description>"
	And Click to Submit button a Deposit page
	Then Verify Transaction successmessage is displayed

Examples:
	
	| Amount  | Description|  
  | 200000  | banker     |


	










