CREATE TABLE `comments` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `id_user` INT(11) NOT NULL,
    `id_post` INT(11) NOT NULL,
    `content` TEXT NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`id_user`)
        REFERENCES users (`id`)
        ON DELETE CASCADE ON UPDATE NO ACTION,
    FOREIGN KEY (`id_post`)
        REFERENCES `posts` (`id`)
        ON DELETE CASCADE ON UPDATE NO ACTION
)  ENGINE=MYISAM DEFAULT CHARSET=LATIN1;
