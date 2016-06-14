CREATE TABLE `users` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `age` INT NULL,
    `gender` INT NULL,
    PRIMARY KEY (`id`)
)  ENGINE=MyISAM DEFAULT CHARSET=LATIN1;
