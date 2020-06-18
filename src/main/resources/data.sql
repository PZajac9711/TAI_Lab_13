DROP TABLE IF EXISTS posts;

CREATE TABLE posts(
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title varchar(100),
  url varchar(100),
  content text
);


INSERT INTO posts (title, url, content) VALUES ('title','http://osnews.pl/wp-content/uploads/2016/06/it-grafika.jpg','Bacon ipsum dolor amet filet mignon drumstick picanha ribeye jerky pork belly cupim tail boudin\" +\n" +
                "           \t\" turducken porchetta kielbasa hamburger pancetta pork chop. Doner meatball kielbasa kevin swine.\" +\n" +
                "           \t\" Andouille shankle brisket filet mignon ball tip, cupim chicken swine tail shank t-bone. \" +\n" +
                "           \t\"Drumstick pig tenderloin, chicken pork belly ribeye picanha pork chop alcatra t-bone strip \" +\n" +
                "           \t\"steak salami shankle boudin. Swine porchetta shankle rump spare ribs kielbasa landjaeger \" +\n" +
                "           \t\"brisket sirloin turducken. Shoulder alcatra chuck fatback bacon cow ribeye tail frankfurter \" +\n" +
                "           \t\"chicken ham short ribs pork belly tenderloin kielbasa. Pig capicola short loin, ham hock \" +\n" +
                "           \t\"swine frankfurter doner pork belly pork drumstick ham.');
