// server.js
const nodemailer = require('nodemailer');
const express = require('express');
const app = express();
const port = 3000; // Choose a port number
//const port2 = 3001;

app.use(express.static('public')); // Serve static files from the 'public' directory

// app.listen(port, () => {
//   console.log(`Server is running on port ${port}`);
// });


const transporter = nodemailer.createTransport({
  service: 'gmail',
  auth: {
      user: 'mcskill13@gmail.com', // your Gmail account
      pass: 'i.QF!BhDhCK:96F', // your Gmail password
  },
});

app.get('/send-email', (req, res) => {
  const mailOptions = {
      from: 'mcskill13@gmail.com',
      to: 'selimdaccache0@gmail.com',
      subject: 'Sending Email using Node.js',
      text: 'Well, that was easy!',
  };

  transporter.sendMail(mailOptions, (error, info) => {
      if (error) {
          return console.log(error);
      }
      console.log('Email sent: ' + info.response);
      res.send('Email sent: ' + info.response);
  });
});

app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
