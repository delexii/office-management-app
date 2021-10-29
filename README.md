# Office management challenge

### Project Description
This app allows staff members and office managers to keep track of meeting rooms in use at the office.

### Set up:
Fork the repo to your github repo
Clone the project from your github repo to your machine
```
cd office-management-challenge
gradle
```

### User Stories
```As a staff member
In order to distinguish between meeting rooms
I would like my meeting room to have a name

As an office manager
So that staff can coordinate meetings
I would like to add a meeting room to the office

As an office manager
So that I can manage meeting rooms
I would like to list all the meeting rooms in the office

As a staff member
In order to have meeting,
I would like to check if the meeting room is available or not (true or false)

As a staff member
In order to have a meeting,
I would like to be able to enter the meeting room and this should make it unavailable

As a staff member
In order to end a meeting
I would like to be able to leave the meeting room and this should make it available again

As a staff member
So that I can see where to have my meeting
I would like to be able to see a list of available rooms in the office

As a staff member
So that I can avoid interrupting a meeting
I would like an error if I try to use a room that has already been entered
```

> Stretch user stories
```As an office manager
So that I can find out when a room becomes available
I would like to receive a text message whenever a meeting room becomes available again

As an office manager
So that I can have visibility of how the rooms are being used
I would like to see the name of the meeting and the name of the team that is using the room
```

## Project Planning

1. Read all user stories
2. Identify classes with states(properties) and behaviours(methods)
3. Test drive simple features using JUnit
4. Pass all tests
5. Review code before submissions to ensure:

- Is this code presentable? Am I proud to show it off to others?
- Have I cleaned up things like whitespace, commented-out code, debugger statements from my code?
- Does the indentation look right?
- Have I conformed my code to styleguide rules?
- Is it clear to someone unfamiliar with my codebase what's going on?


## Project Features

- [ ] the user can see the name of each meeting room
- [ ] the user can add a meeting room to the office
- [ ] the user can see a list of all the meeting rooms
- [ ] the user can check whether a room is available or not
- [ ] the user can enter a meeting room and render this unavailable for others
- [ ] the user can leave a meeting room and render this available for others
- [ ] the user can see a list of available rooms in the office
- [ ] the user can attempt to enter a meeting room that is in use and it will be shown an error
