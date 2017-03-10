CREATE TABLE `Customer` (
	`UID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`Name`	TEXT NOT NULL,
	`Salutation`	TEXT NOT NULL,
	`Username`	TEXT NOT NULL UNIQUE,
	`Birthday`	INTEGER NOT NULL,
	`Mobile`	INTEGER NOT NULL,
	`Email`	TEXT NOT NULL UNIQUE,
	`Password`	TEXT NOT NULL
);