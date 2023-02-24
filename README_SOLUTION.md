****
ASSESSMENT DEVELOPMENT

ENDPOINT SETUP:
All these steps were needed for setup and run the endpoint
1. Generation of the Jar artifact
2. Building of Jar file
3. Execution of Jar file

NEEDED DEPENDENCIES:
1. Rest assured libraries, version 5.1.1
2. Junit 5
3. Json Schema Validator, version 5.1.1

TASK 1:
Assert "Text" from response
1. Creation of the scenarios with and without query parameters
2. Send Get request and Assert the "text" from response


TASK 2:
Assert De-serialize response
1. Creation of Pojo class
2. Saving the response of the endpoint in the game Pojo class(De-serialization)
3. Assert expected value and actual value from game Pojo class

TASK 3:
Json Schema validation
1. Creation Json Schema file using an online json schema generator
2. Create a file "gameSchema.json" in the test resources that contains the generated schema
3. Assert the schema using "JsonSchemaValidator" Libraries 

TASK 4:
Pull Request

****
PROJECT EXECUTION
1. Execute Jar File to have endpoint working located in "out/artifacts/simple_game_service_jar/simple-game-service.jar" from the project
2. Execute tests from "GameTests" and "GameJsonSchemaValidationTest"
3. Assertions will be passed and no errors will be showed 


