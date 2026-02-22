#!/user/bin/env groovy

def call() {
    echo "Building the application on branch $BRANCH_NAME..."
    sh "mvn package"
}