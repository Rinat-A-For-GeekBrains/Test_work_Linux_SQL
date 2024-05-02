CREATE TABLE `animals` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	-- домашние/вьючные
	`kindOfAnimal` TEXT(65535),
	PRIMARY KEY(`id`)
);

CREATE TABLE `Cats` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` TEXT(65535),
	`dateOfBirth` DATE,
	-- Id группы животных(домашние или вьючные)
	`group_id` INT,
	PRIMARY KEY(`id`)
);


CREATE INDEX `id_index`
ON `Cats` (`id`);
CREATE TABLE `animalCommands` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`command` VARCHAR(255),
	PRIMARY KEY(`id`)
);

CREATE TABLE `Dogs` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` TEXT(65535),
	`dateOfBirth` DATE,
	-- Id группы животных(домашние или вьючные)
	`group_id` INT,
	PRIMARY KEY(`id`)
);


CREATE INDEX `id_index`
ON `Dogs` (`id`);
CREATE TABLE `Hamsters` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` TEXT(65535),
	`dateOfBirth` DATE,
	-- Id группы животных(домашние или вьючные)
	`group_id` INT,
	PRIMARY KEY(`id`)
);


CREATE INDEX `id_index`
ON `Hamsters` (`id`);
CREATE TABLE `Horses` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` TEXT(65535),
	`dateOfBirth` DATE,
	-- Id группы животных(домашние или вьючные)
	`group_id` INT,
	PRIMARY KEY(`id`)
);


CREATE INDEX `id_index`
ON `Horses` (`id`);
CREATE TABLE `Donkeys` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` TEXT(65535),
	`dateOfBirth` DATE,
	-- Id группы животных(домашние или вьючные)
	`group_id` INT,
	PRIMARY KEY(`id`)
);


CREATE INDEX `id_index`
ON `Donkeys` (`id`);
CREATE TABLE `Camels` (
	`id` INT NOT NULL AUTO_INCREMENT UNIQUE,
	`name` TEXT(65535),
	`dateOfBirth` DATE,
	-- Id группы животных(домашние или вьючные)
	`group_id` INT,
	PRIMARY KEY(`id`)
);


CREATE INDEX `id_index`
ON `Camels` (`id`);
ALTER TABLE `Cats`
ADD FOREIGN KEY(`group_id`) REFERENCES `animals`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `Dogs`
ADD FOREIGN KEY(`group_id`) REFERENCES `animals`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `Hamsters`
ADD FOREIGN KEY(`group_id`) REFERENCES `animals`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `Horses`
ADD FOREIGN KEY(`group_id`) REFERENCES `animals`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animals`
ADD FOREIGN KEY(`id`) REFERENCES `Donkeys`(`group_id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animals`
ADD FOREIGN KEY(`id`) REFERENCES `Camels`(`group_id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animalCommands`
ADD FOREIGN KEY(`id`) REFERENCES `Camels`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animalCommands`
ADD FOREIGN KEY(`id`) REFERENCES `Hamsters`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animalCommands`
ADD FOREIGN KEY(`id`) REFERENCES `Donkeys`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animalCommands`
ADD FOREIGN KEY(`id`) REFERENCES `Dogs`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animalCommands`
ADD FOREIGN KEY(`id`) REFERENCES `Horses`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE `animalCommands`
ADD FOREIGN KEY(`id`) REFERENCES `Cats`(`id`)
ON UPDATE NO ACTION ON DELETE NO ACTION;