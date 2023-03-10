# aws-lambda-kotlin

A simple template for AWS Lambda including testing and CICD written in Kotlin.

## CICD

When you push your commits on `main` or `dev` branch, the workflow is going to deploy your function to AWS Lambda automatically.

You need following variables on your repository's secret.
- AWS_REGION
- AWS_ACCOUNT_ID
- AWS_ACCESS_KEY_ID
- AWS_SECRET_ACCESS_KEY