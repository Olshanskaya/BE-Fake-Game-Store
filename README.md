# Fake Game Store App - Backend 

This project was created as an assignment at the [Integrify Academy](https://www.integrify.io/). 

Backend is created by 3 students in 2 weeks.

### Collaborators:
- [Danila](https://github.com/Redmoor19)
- [Uladzislau](https://github.com/GreeeenGoo)


## Description

This is a `Backend part` of `Full-Stack project`. 
The project is a `Fake Game Store App` where users can browse games, add them to the cart, and make a purchase (game keys).

Frontend part of the project is [here](https://github.com/Olshanskaya/FE-Fake-Game-Store).

### Deployment

The project is deployed on Render. Link To API: https://fs18-java-backend-2myd.onrender.com.

Database is hosted on Supabase.

## About the Project

### Users Perspective

This website is a place where users can explore and buy games easily. 
Users can `browse` a list of games and `search` by genre, player support, or part of the game’s name.
Each game has a detailed page with more information.

New users can `create an account` using their email. 
After `signing up`, they must `confirm email` by clicking a link sent to their inbox.
If a user forgets their password, they can always `reset password` by following the instructions sent to their email.

Once registered, users can `edit personal information`. 
Users can `add games to their cart` and `buy game keys`, which will be `sent to their email`. 
They can also `view order history`.
Additionally, users can add games to their `favorites` and remove them at any time. 
They can leave a `review` with a rating (1 to 5) and an `optional text comment`. 
The overall game `rating` of each game is `calculated on user reviews`.

### Admin Perspective

Administrators have special permissions.
They can `add`, `edit`, and `delete games`. 
Administrators can also add new `game keys` that users purchase.
Furthermore, they can `assign new administrators` from registered users.



## Technologies Used

### Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- Lombok
- Maven
- Modelmapper
- JavaMail
- Thymeleaf-spring


### Frontend

- TypeScript
- React
- React Router
- React Hook Form
- Axios
- Tanstack Query
- Tailwind CSS
- Shadcn/ui
- Zod

## API 

Base URL: https://fs18-java-backend-2myd.onrender.com/api/v1

### User 

<span style="color:green">**GET**</span>. `/users` - Get all users

<span style="color:green">**GET**</span>. `/users/b3b40ba5-577c-4412-be06-b41e2040cf54` - Get User by Id

<span style="color:#d4aa00">**POST**</span>. `/users` - Create a User

<span style="color:blue">**PATCH**</span>. `/users/7ab87644-ee9c-424e-bbf9-8733c55d8bd6` - Update User  
`{
"name" : "Inna",
"email": "inna@example.com",
"address": "Somekatu 2",
"phone": "213124125"
}`

<span style="color:green">**GET**</span>. `/users/me/games/favourites` - Get User Favourites

<span style="color:blue">**PATCH**</span>. `/users/role/8a46766d-3681-44bd-bf3e-8fdbbcb373ac` - Update User Role  
`{
"role": "ADMIN"
}
`

<span style="color:red">**DELETE**</span>. `/users/86ddd61b-7194-4b05-9dbd-162db0c09440` - Delete User by Id

<span style="color:#d4aa00">**POST**</span>. `/users/activate/86ddd61b-7194-4b05-9dbd-162db0c09440` - Activate User

<span style="color:green">**GET**</span>. `/users/me` - Get Current User

<span style="color:red">**DELETE**</span>. `/users/me` - Delete Current User

<span style="color:blue">**PATCH**</span>. `/users/me` - Update Current User  
`{
"name" : "Viktoria",
"email": "vik@gmail.com",
"address": "Somekatu 2",
"phone": "0465564758"
}`

<span style="color:#d4aa00">**POST**</span>. `/users/me/games/favourites/6456c6a4-0938-4650-9d29-6f562c6a03f9` - Add User Favourite

<span style="color:red">**DELETE**</span>. `/users/me/games/favourites/268209e6-ecbe-46f5-98e0-c3b4b95874e6` - Delete User Favourite Game

<span style="color:green">**GET**</span>. `/users/me/games` - Get Current User Games



### Game

### Order

### Authentication




