## [Download as pdf](https://gitprint.com/BakstraetisDrengir/TicTacToe/blob/master/docs/development_manual.md)
# Development manual: 

This project was developed using the Github, Java V 1.8, Spark Framework, Travis CI, Selenium and Heroku.

It is hosted on an open repository on [here](https://github.com/BakstraetisDrengir/TicTacToe).

You will need [JDK 1.8](https://java.com/en/download/help/download_options.xml) and the [Gradle Build Tool](https://gradle.org/install/) installed on your computer to run this application.

## Github

GitHub is a source control system used to develop and host code.

GitHub is an essential tool to work on code in teams. Useful commands can be found [here](https://github.com/bpassos/git-commands).

You can retrieve the repository from GitHub by creating a directory  entering the following command in the terminal:

> git clone https://github.com/BakstraetisDrengir/TicTacToe.git

## Gradle 

Gradle is an build automation system that helps with building, testing and deploying the application.

Once you have gradle installed you can run the following commands in terminal.

To build the application: 

> $ ./gradlew build

Run unit tests:

> $ ./gradlew test

Run the application:

> $ ./gradlew run

## Travis CI 

Travis CI is a continuous integration service that automatically tries to build and run the application after each push to GitHub. 

We made all changes to our code on seprate branches on GitHub and once we recived green light from Travis CI we could make pull requests to the master branch.

To get better acquainted with Travis CI you can visit their [website](https://travis-ci.org/)

## Selenium

Selenium is a testing framework for web applications and is used to mimic user behaviour. 

To run integration tests you have to make sure you have WebDriver installed. We used Chromedriver. 

Run integration tests:

> ./gradlew selenium 

## Heroku

Heroku is a cloud platform as a service supporting several programming languages that is used as a web application deployment model.

GitHub, Travis CI and Heroku work in unison to make sure that we have shareable code, that builds and is at last deployd to the web.

## Play the game

Once we everything is up and running we could play the game on our heroku site at https://tictactoe-bakstraetisdrengir.herokuapp.com/.

To play the game locally we made sure the application is running successfully and used http://localhost:4567.
