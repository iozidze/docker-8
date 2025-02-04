import http from 'http';

const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/plain');
    res.end('Hello from Node.js Docker container!');
});

server.listen(3000, () => {
    console.log('Server running at http://localhost:3000/');
});
