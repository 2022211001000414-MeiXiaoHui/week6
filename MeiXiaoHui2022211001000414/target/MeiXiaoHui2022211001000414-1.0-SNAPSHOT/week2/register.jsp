<%--
  Created by IntelliJ IDEA.
  User: 梅晓辉
  Date: 2024/3/10
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>


<%@include file="header.jsp"%>
This is my register JSP page. <br>
<form id="registrationForm"  method="post" action="/register">
    <!-- Username -->
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" placeholder="Username" required><br>

    <!-- Password -->
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="password" required><br>

    <!-- Email -->
    <label for="email">Email:</label>
    <input type="text" id="email" name="email" placeholder="Email" required><br>
    <!--Gender-->
        <label>Gender:</label>
        <input type="radio" id="genderMale" name="gender" value="Male" required>
        <label for="genderMale">Male</label>

        <input type="radio" id="genderFemale" name="gender" value="Female" required>
        <label for="genderFemale">Female</label><br>

    <!-- Birthdate -->
    <label for="birthdate">Birthdate:</label>
    <input type="text" id="birthdate" name="birthdate" placeholder="Date of Birth(yyyy-mm-dd)" required ><br>

    <!-- Submit button -->
    <input type="submit" value="Register" style="background-color: orange; color: white;width: 120px;height: 30px;margin-left: 50px;margin-top: 10px">
</form>
<%@include file="footer.jsp"%>
