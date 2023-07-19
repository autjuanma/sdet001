# Template testNg GL
This a mvn project uses the page object model (POM).
This is a simple project base using The Factory Design Pattern
If you need a good base or colaborate write me
do not copy without permission.

The achievement is not looking for a job on this site, it is interacting with modals, tabs directly using the driver to later use it in SF * this is my current sponsor.
Because I can't do it directly in the SF URL, not current QA user with an official account ON SF Enjoy It
Made by: JuanTM

## Stack & Libraries
- Java
- Selenium WebDriver
- TestNG 
- Maven
- Extent Reports and logging

## Prerequisites
- IDE (Eclipse)
- JDK (version 1.8.022)
- Maven configuration

### Easy way to configure Maven (Mac)
<details>
  <summary>Click to view instructions</summary> 
  
1. Download Maven (tar.gz for mac) from [here](https://maven.apache.org/download.cgi)
2. Move the downloaded apache-maven-3.6.3 folder to your Home directory (This is the folder with your username)

In terminal:

1. Set system variables:
```
export M2_HOME=/Users/<YOUR USER NAME>/apache-maven-3.6.3/
```
2. Append the Maven bin folder to the path:
```
export PATH=$PATH:/Users/<YOUR USER NAME>/apache-maven-3.6.3/bin/
```
3. If you don't have a bash profile, create one:
```
touch .bash_profile
```
4. If you do have one, or after creating one, open the bash profile to edit:
```
open .bash_profile
```
5. Paste the two paths from step 1 and 2
6. Save and close
7. Now Maven will be installed for all sessions. To verify Maven is installed, type:
```
mvn --version
```
</details>

## How to run tests
In terminal:
```
git clone https://github.com/touscorporategl/beta_x.git
```
mvn clean
```
To run the test
```
mvn test
```
###### Note: For the verifyLogin test case to pass, you must edit the SmokeTestSuite.xml and change the values for parameter "username" and "password" to a registered username/password

## Project components

- Page objects are in the directory *src/main/java/pages*
- Test classes are in the the directory *src/test/java/tests*
- Listener class is in the directory *src/main/java/util*

## Highlights
- This framework supports all drivers Chrome, firefox ,safari and run on all OS like linux
soon I will include rest assured to exploit a few endpoints


