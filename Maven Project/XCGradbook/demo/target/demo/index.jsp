<html>
<head>
    <link rel="stylesheet" href="WebStyle.css">
</head>
<body>
    <div class="nav">
        <a href="index.jsp">Home</a>
        <a href="about.html">About</a>
        <a href="contact.html">Contact</a>
    </div>
    <img src="laverngibson.jpg" alt="homepage" height="200" width="300"> 
    <h1>XCGradebook</h1>
    <p>XCGradebook (Cross Country Gradebook) is a center for cross country althetes to post, comment, 
        and rate cross country courses. XCGradebook serves as a database of xc courses with in-depth analysis
        and advice from athletes who've ran respective courses before. Enhance you pre-race day and feel fully prepared by
        reviewing relevant qualitative and quantitative data. hello
    </p>
    <div>
    <h2>Create a new post</h2>
    <form action="browse">
        Course name: <input type="text" name="CourseName"><br>
        Course Difficulty (1-10): <input type="text" name="dif"><br>
        Course Distance: <input type="text" name="dist"><br>
        <input type="submit">
    </form>
    </div>
    <div>
    <h3>Browse XC Courses</h3>
    <form action="post">
        <input type="submit" value="Search">
    </form>
    </div>
    <div>
    <h4>Delete Post<h4>
    <form action ="delete">
        Course Name: <input type="text" name="Xpost">
        <input type="submit" value="Delete">
    </form>
    </div>
</body>
</html>
