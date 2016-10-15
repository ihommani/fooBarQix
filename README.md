# fooBarQix
Display integers from 1 to 100 following these rules:
 * If integer is divisible by 3 or contains 3 --> replace it by Foo
 * If integer is divisible by 5 or contains 5 --> replace it by Bar
 * If integer is divisible by 7 or contains 7 --> replace it by Qix

 * Order:<br/>
 * We apply the divisible rule first, then contain rule<br/>
 * Note: We look at the multiple in the following order "Foo", "Bar" and "Qix"
 
 # Usage
 ## Building the java archive
 ./gradlew jar  
 or on windows  
 gradlew.bat jar?
 
 The archive is generated in the folder build/libs
 
 ## Launching 
 java -jar foobarqix.jar
 
 You should see in the stdout:  
 1  
 2  
 FooFoo  
 4  
 BarBar  
 ...
 
 
