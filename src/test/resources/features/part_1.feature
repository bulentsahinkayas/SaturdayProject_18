Feature: Adding a user and logging in by using the user we have created on the webpage thedemosite.co.uk/addauser;

  Background:
    Given I navigate to the website


  Scenario Outline:User cannot be created with invalid short credentials
    Given I enter Add a User page
    And I enter username  "<Username>"
    And I enter password  "<Password>"
    When  I click save button
    Then I validate error "<message>"



    Examples:
      | Username | Password |                               message                                      |
      | aaa      | aaaaa    | Username too short. The username must be at least 4 characters in length.  |
      |          | 12345    | Username too short. The username must be at least 4 characters in length.  |
      | aa       |          | Username too short. The username must be at least 4 characters in length.  |
      | aaabc    |          | Password too short.  The password must be at least 4 characters in length. |
      | cgfyhu   | 12       | Password too short.  The password must be at least 4 characters in length. |
      | aaaa     | 236      | Password too short.  The password must be at least 4 characters in length. |
      | aaabb    | a        | Password too short.  The password must be at least 4 characters in length. |


  Scenario Outline:User can be created with a username and a password whose lengths are more than 3 characters
    Given I enter Add a User page
    And I enter username  "<UsernameV>"
    And I enter password  "<PasswordV>"
    When  I click save button
    Then I validate success message
    Examples:
      | UsernameV |  PasswordV |
      |   aaaaa   |     aaaa   |
      |   aaab    |     12345  |
      |   abcab   |    22d536  |
      |   aabb    |     aaa58  |


  Scenario Outline: User can login by using the credentials that have just been created
    Given I enter Login page
    And I enter username  "<UsernameL>"
    And I enter password  "<PasswordL>"
    When  I click Test Login button
    Then I validate success message
    Examples:
      | UsernameL | PasswordL |
      | aaaaa     | aaaa      |
      | aaab      | 12345     |
      | abcab     | 22d536    |
      | aabb      | aaa58     |

  Scenario Outline: User can not login by using the invalid credentials
    Given I enter Login page
    And I enter username  "<UsernameI>"
    And I enter password  "<PasswordI>"
    When  I click Test Login button
    Then I validate error message "<Message>"
    Examples:
      | UsernameI | PasswordI | Message                                                                    |
      | aaa       | aaaaa     | Username too short. The username must be at least 4 characters in length.  |
      |           | 12345     | Username too short. The username must be at least 4 characters in length.  |
      | a         |           | Username too short. The username must be at least 4 characters in length.  |
      | aaabc     |           | Password too short.  The password must be at least 4 characters in length. |
      | cgfyhu    | 12        | Password too short.  The password must be at least 4 characters in length. |
      | aaaa      | 236       | Password too short.  The password must be at least 4 characters in length. |
      | aaabb     | a         | Password too short.  The password must be at least 4 characters in length. |

#  Scenario outline: User cannot login if at least one of the credentials is less than 4 characters
    #Examples:
    #   - with a valid username and a short password
    #   - with a valid password and a short username
    #   - both username and password are short

#/*
#  Background:
#    Given I navigate to website "https://test.campus.techno.study/"
#    And I login using username:daulet2030@gmail.com and password "TechnoStudy123@"
#    And I go to menu 1 1 4
#
#  Scenario: Create a nationality (and delete it)
#    When I create nationality with name "French"
#    Then I see success message "Nationality successfully created"
#    When I delete saved nationality
#    Then I see success message "Nationality successfully deleted"
#
#  Scenario: Create a duplicated nationality (and delete it)
#    When I create nationality with name "German"
#    Then I see success message "Nationality successfully created"
#    When I create nationality with name "German"
#    Then I see error message 'The Nationality with Name "German" already exists.'
#    When I delete saved nationality
#    Then I see success message "Nationality successfully deleted"
#
#
#
#
#
#
# */






#Feature:	Navigating	to	specific	accounts	in	Accounts	Activity
#  Scenario:	Savings	account	redirect
#    Given	the	user	is	logged	in
#    When the	user	clicks	on	Savings	link	on	the	Account	Summary	page
#    Then the	Account	Activity page	should	be	displayed
#    And Account	drop	down	should	have	Savings	selected
#  Scenario:	Brokerage	account	redirect
#    Given	the	user	is	logged	in
#    When the	user	clicks	on	Brokerage	link	on	the	Account	Summary	page
#    Then the	Account	Activity page	should	be	displayed
#    And Account	drop	down	should	have	Brokerage selected
#  Scenario:	Checking	account	redirect
#    Given	the	user	is	logged	in
#    When the	user	clicks	on	Checking	link	on	the	Account	Summary	page
#    Then the	Account	Activity page	should	be	displayed
#    And Account	drop	down	should	have	Checking selected
#  Scenario:	Credit	Card	account	redirect
#    Given	the	user	is	logged	in
#    When the	user	clicks	on	Credit	card	link	on	the	Account	Summary	page
#    Then the	Account	Activity page	should	be	displayed
#    And Account	drop	down	should	have	Credit	Card selected