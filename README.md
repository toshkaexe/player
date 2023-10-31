# player
Online player and storage of audiobooks with bookmark function and the ability to continue listening.

## Entities

### User
- **userId**: Unique identifier for the user.
- **name**: Name of the user.

### Audiobook
- **audiobookId**: Unique identifier for the audiobook.
- **title**: Title of the audiobook.
- **author**: Author of the audiobook.
- **audiobookUrl**: URL or location of the audiobook.

### Bookmark
- **bookmarkId**: Unique identifier for the bookmark.
- **audiobookId**: Identifier linking to the audiobook associated with the bookmark.
- **userId**: Identifier linking to the user who created the bookmark.
- **lastPlayTime**: Timestamp indicating the last played time of the audiobook.

## Description

This document provides an overview of the essential entities within the Audiobook Management System. The system manages users, audiobooks, and bookmarks. Here's a breakdown of the primary components:

- **User**: Represents individuals using the system. Each user has a unique ID and a name associated with them.

- **Audiobook**: Describes the audiobooks available within the system. Each audiobook has an ID, a title, an author, and a URL pointing to its location.

- **Bookmark**: Connects users and audiobooks, providing a reference point for a user's progress within an audiobook. It includes a unique ID, references to the associated audiobook and user, and the last played timestamp.

![](/Users/banderas/IdeaProjects/player/src/main/resources/schema_dao.png)


Example of endpoints for the application

GET http://localhost:8099/api/bookmarks/
###
GET http://localhost:8099/api/audiobooks/
###
GET http://localhost:8099/api/users/
