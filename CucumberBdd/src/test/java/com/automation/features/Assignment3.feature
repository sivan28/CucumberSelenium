Feature: User registration in  http://newtours.demoaut.com/mercurywelcome.php

@travel
Scenario Outline: Register 10 users in a demo flight application

Given Navigate to homepage of http://newtours.demoaut.com/mercurywelcome.php
When Click on the register link

And Enter First name "<firstname>"
And Enter Last Name "<lastname>"
And Enter Phone "<phone>"
And Enter Email "<email>"
And Enter Address "<address>"
And Enter City "<city>"
And Enter State "<state>"
And Enter Postal Code "<postalcode>"
And Select Country india "<country>"
And Enter Username "<username>" of your choice
And Enter password "<password>"
And Enter same password in confirm password "<confirmpassword>" field
And Click on submit

Examples:
|firstname 	|lastname 	|phone 		|email			|address		|city	    |state	|postalcode	|country	|username	|password	| confirmpassword |
|siva1 		|sankar 	|898899999 	|sn1@gmail.com	| 222 address1	|Hyderabad	|AP 	|50000 		|92			|snach1		|testing1 	| testing1	      |
|siva2 		|sankar 	|898893999 	|sn2@gmail.com	| 322 address2	|Bangalore	|KA 	|50000 		|92			|snach2		|testing2 	| testing2	      |
|siva3 		|sankar 	|598899999 	|sn3@gmail.com	| 422 address3	|Wayanad	|KR 	|50000 		|92			|snach3		|testing3 	| testing3	      |
|siva4 		|sankar 	|798899999 	|sn4@gmail.com	| 622 address4	|Mumbai		|MH 	|50000 		|92			|snach4		|testing4 	| testing4	      |
|siva5		|sankar 	|098899999 	|sn5@gmail.com	| 722 address5	|Chennai	|TN 	|50000 		|92			|snach5		|testing5 	| testing5	      |
|siva6 		|sankar 	|398899999 	|sn6@gmail.com	| 322 address6	|Darjeeling	|SK 	|50000 		|92			|snach6		|testing6 	| testing6	      |
|siva7 		|sankar 	|598899999 	|sn7@gmail.com	| 822 address7	|Goa		|MH 	|50000 		|92			|snach7		|testing7 	| testing7	      |
|siva8 		|sankar 	|798899999 	|sn8@gmail.com	| 522 address8	|Pune		|MH 	|50000 		|92			|snach8		|testing8 	| testing8	      |
|siva9 		|sankar 	|798899999 	|sn9@gmail.com	| 422 address9	|Vizag		|AP 	|50000 		|92			|snach9		|testing9 	| testing9	      |
|siva10 	|sankar 	|298899999 	|sn10@gmail.com	| 122 address10	|Vijayawad	|AP 	|50000 		|92			|snach10	|testing10 	| testing10	      |

