# User Notes Management System README

## Introduction

Welcome to the User Notes Management System! This system is designed to help users store their notes securely, retrieve their most recent notes after successfully logging in, and automatically manage their notes by deleting older ones on an hourly basis.

## Table of Contents

1. [Getting Started](#getting-started)
2. [Features](#features)
3. [Usage](#usage)
4. [Automated Deletion](#automated-deletion)


## Getting Started

To get started with this system, you need to have the following prerequisites installed:

- Node.js (v14 or higher)
- MongoDB

Follow these steps to set up the system:

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Run `npm install` to install the required dependencies.
4. Configure the database connection (see [Configuration](#configuration)).
5. Start the server by running `npm start`.
6. Your User Notes Management System is now up and running!

## Features

1. **User Authentication**: Users can create accounts and log in securely to access their notes.

2. **Retrieve Recent Notes**: After a user successfully logs in, the API will return the 10 most recent notes associated with their account.

3. **Automated Note Deletion**: The system automatically deletes all notes except the last 10 recent notes on an hourly basis to manage storage efficiently. Users can delete notes manually also.

## Usage

Once the system is up and running, users can interact with it through the provided API endpoints (see [API Endpoints](#api-endpoints)). They can create, retrieve, update, and delete notes associated with their account.

To use the system effectively, ensure that you have the necessary authentication tokens when making API requests.


## Automated Deletion

The system is configured to automatically delete all notes except the last 10 recent notes on an hourly basis. This automated process is essential for managing storage efficiently and ensuring that users always have access to their most recent notes.

