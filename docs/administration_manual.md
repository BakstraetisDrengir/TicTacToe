
# Administration manual:

This project was developed using the Github, Java V 1.8, Spark Framework, Travis CI, Selenium and Heroku.

It is hosted on an open repository on [here](https://github.com/BakstraetisDrengir/TicTacToe).

You will need [JDK 1.8](https://java.com/en/download/help/download_options.xml) and the [Gradle Build Tool](https://gradle.org/install/) installed on your computer to run this application. You will also need to have a [Travis CI](https://travis-ci.org/), [Heroku](http://heroku.com) account and have [Selenium](http://www.seleniumhq.org/download/) set up on your device.

## Setting up

* Install Java:
Please refer to [JDK 1.8](https://java.com/en/download/help/download_options.xml) for instuctions. 

* Set up Travis CI: 
Go to https://travis-ci.org/ and setup an account.

* Set up Heroku: Go to https://www.heroku.com/ and create an account.

* Set up Selenium: Install a WebDriver on your device(you can visit the [Selenium](http://www.seleniumhq.org/download/) page for instructions)/


Please refer to the [development manual](https://github.com/BakstraetisDrengir/TicTacToe/blob/master/docs/development_manual.md) for additional information.

## Install and run

Clone the project to your computer, run this command:

> git clone https://github.com/BakstraetisDrengir/TicTacToe.git

To create a deployable package, run this command:

> gradle installDist

To run the application:

> gradle run

Once the application is successfully running you can visit http://localhost:4567 and play the game. 

## Deploy and maintain

1. Go to Travis-ci.org
    * Sign in with GitHub
    * Give GitHub access to your repository
2. Use the Heroku toolbelt to create an app by running `heroku create`.
3. Replace the badge already in the README.md file with your own: `[![Build Status](your travis url for the repo here.png)](your travis url for the repo here)`.
3. Set up a heroku key for travis by running the following command: `travis encrypt $(heroku auth:token) --add deploy.api_key`
4. Change the .travis.yml file to correspond with your app.

You should now have a running application that you can deploy, run and maintain.

