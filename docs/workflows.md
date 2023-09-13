# Workflows

## Introduction

Workflows are a way to automate the execution of a series of tasks. They are a powerful tool that can be used to automate many different types of tasks. Workflows are defined in a YAML file and can be executed from the command line or from the web interface.

## Available Workflows

The following workflows are available:

* [Pull request build](/.github/workflows/pr_build.yml): This workflow is triggered when a pull request is opened or updated. It builds all the projects to ensure that the pull request does not break any of the projects.
* [Publish](/.github/workflows/publish.yml): This workflow is triggered when committing to the main branch after tests have passed. It builds all the projects and publishes them to the [GitHub Package Registry](https://github.com/features/packages).
* [Test](/.github/workflows/test.yml): This workflow is triggered when committing to the main branch or when a pull request is opened or updated. It will run tests on all the projects to ensure that the code is working as expected.
