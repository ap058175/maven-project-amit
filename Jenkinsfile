pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'Welcome to Jenkins Pipline'
			}
		}
		stage('Clean stage')
		{
			steps
			{
			sh 'mvn clean'
			}
		}
		stage('Build stage')
		{
			steps
			{
			  echo 'mvn install'
			}
		}
		
		stage('Build success')
		{
			steps
			{
			  echo 'Build successful'
			}
		}
		
	}
}