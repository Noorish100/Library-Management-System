

<body>
    <h1>Library Management System</h1>
    <p>Welcome to the Library Management System (LMS) README file. This document provides an overview of the system endpoints and basic usage instructions.</p>

 <div class="swagger-link">
        <h2>Swagger UI Documentation</h2>
        <p>To explore the API endpoints interactively, you can use the Swagger UI documentation:</p>
        <p><a href="http://13.53.189.98:8889/swagger-ui/index.html" target="_blank">Swagger UI</a></p>
    </div>
      <p><a href="http://localhost:8889/swagger-ui/index.html#/" target="_blank">Local Swagger UI</a></p>
    
   <h2>Endpoints</h2>

   <div class="endpoint">
        <h3>Save Book Data</h3>
        <p>URI: <code>api/books</code></p>
        <p>Method: <code>POST</code></p>
    </div>

   <div class="endpoint">
        <h3>Retrieve Book Data (DTO)</h3>
        <p>URI: <code>api/books</code></p>
        <p>Method: <code>GET</code></p>
    </div>

   <div class="endpoint">
        <h3>Update Book Data by ID</h3>
        <p>URI: <code>api/books/id</code></p>
        <p>Method: <code>PUT</code></p>
    </div>

   <div class="endpoint">
        <h3>Delete Book Data by ID</h3>
        <p>URI: <code>api/books/id</code></p>
        <p>Method: <code>DELETE</code></p>
    </div>

   <div class="endpoint">
        <h3>Get Book by Title</h3>
        <p>URI: <code>api/books/title/t</code></p>
        <p>Method: <code>GET</code></p>
    </div>

   <div class="endpoint">
        <h3>Get Book by Author</h3>
        <p>URI: <code>api/books/author</code></p>
        <p>Method: <code>GET</code></p>
    </div>

  <div class="endpoint">
        <h3>Get All Authors</h3>
        <p>URI: <code>api/authors</code></p>
        <p>Method: <code>GET</code></p>
   </div>

   <div class="endpoint">
       <h3>Get Authors After Specific Date</h3>
       <p>URI: <code>api/authors/date</code></p>
    <p>Method: <code>GET</code></p>
  </div>
   <h2>Authentication</h2>
   <p>Basic Authentication is applied to the endpoints.</p>
   <p>Username: <code>admin</code> or <code>user</code></p>
   <p>Password: <code>12345</code></p>

   <h2>Usage</h2>
   <p>Make requests to the provided endpoints using appropriate methods and credentials for authentication.</p>

   <h2>Example</h2>
  <p>Using cURL to retrieve book data:</p>
  <pre>
    <code>
curl -X GET -u admin:12345   13.53.189.98:8889/swagger-ui/index.html/api/books
        </code>
    </pre>

  <p>For more detailed instructions, consult the API documentation or contact the system administrator.</p>

  <footer>
        <p>Library Management System README</p>
        <p>&copy; 2024</p>
    </footer>
</body>
