# InMusicPlayer

Student Number: ST10461558
Details: KHOLOFELO TIISETSO NOKUTHULA MOTENO
Module: INTRO TO MOBILE APPLICATION DEVELPMENT
Code: IMAD5112 - ONLINE
Assessment Type: PRACTICUM EXAM

Music Playlist Manager App Report

GITHUB: KholoAzi/InMusicPlayer
(https://github.com/KholoAzi/InMusicPlayer)

App Overview:
The Music Playlist Manager is an Android application developed in Kotlin using Android Studio. It allows users to manage a personal music playlist, including adding songs, displaying details, and calculating average ratings. The app supports images for each song and uses arrays and loops to handle data, with navigation between two screens.

Features:
•	Parallel arrays store song title, artist, rating, comment, and image.
•	Add new songs through a dialog input.
•	Display a list of all songs using a custom adapter with images.
•	Calculate the average rating of all added songs.
•	Navigate between main and detail screens.
•	Error handling and user validation included.

Issues:
1. Navigation errors were fixed by ensuring correct activity and intent setup.
2. Incorrect use of findViewById was resolved by matching XML IDs and updating layout references.
3. Array index out-of-bound was prevented using dynamic ArrayLists.
4. Added default image association with each song to improve user interface.
5. Implemented a BaseAdapter to manage ListView content visually with images and metadata.

Image Assets:
The application uses four main images stored in the drawable folder:
- song1.png
- song2.png
- song3.png
- song4.png
These represent each song in the playlist visually and are displayed using an ImageView inside a custom layout.

Screenshots:

Android Studio: 


![image](https://github.com/user-attachments/assets/5d8b7171-e98c-46cc-a019-cad2476f5afd)

![image](https://github.com/user-attachments/assets/f0b2d86f-0f69-4942-baec-47c9e484b0fc)








	














