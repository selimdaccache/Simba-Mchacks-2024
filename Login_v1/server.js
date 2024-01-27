// server.js
const express = require('express');
const app = express();
const port = 3000; // Choose a port number

app.use(express.static('public')); // Serve static files from the 'public' directory

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
