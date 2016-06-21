CREATE TABLE `entities` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `request` blob,
    `response` blob,
    PRIMARY KEY (`id`)
)  ENGINE=MyISAM DEFAULT CHARSET=LATIN1;
