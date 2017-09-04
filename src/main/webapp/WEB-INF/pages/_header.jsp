<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<header>

	<h1>My To Do List</h1>
	<form action="/MyToDoList/login" method="POST">
	<div class="dropdown"> <span>Hello ${login},</span>
	<div class="dropdown-content">
	
		<button type="submit" name="logout" value="logout">Logout</button>
	
	</div>
	</form>
	</div>
</header>
