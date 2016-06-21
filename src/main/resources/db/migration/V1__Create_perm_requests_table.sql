CREATE TABLE `perm_requests` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `entity_id` INT(11) NOT NULL,
    `request` blob,
    `response` blob,
    PRIMARY KEY (`id`),
    KEY (`entity_id`)
)  ENGINE=MyISAM DEFAULT CHARSET=LATIN1;
