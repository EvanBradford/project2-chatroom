CREATE TABLE AE_USERS(
	AEID NUMBER(10) PRIMARY KEY,
	EMAIL varchar2(255) NOT NULL check(LENGTH(EMAIL) > 1),
	PASSWORD varchar2(255) NOT NULL check(LENGTH(PASSWORD) > 1),
	ADMINLVL NUMBER(1) NOT NULL,
	STATUS NUMBER(2) NOT NULL
);

CREATE SEQUENCE AE_user_seq
	START WITH 1
	INCREMENT BY 1;
	
CREATE OR REPLACE TRIGGER AE_user_seq_trigger
BEFORE INSERT ON AE_USERS
FOR EACH ROW
BEGIN
	IF : NEW.AEID IS NULL THEN
	SELECT AEuser_seq.nextval INTO : NEW.AEID FROM dual;
	END IF;
END;

CREATE TABLE AE_USERINFO(
	INFOID NUMBER(10) PRIMARY KEY,
	NICKNAME varchar2(255),
	BIRTHDATE varchar2(255),
	REGION varchar2(255),
	PROFILEPIC varchar2(4000),
	USER_INFOID NUMBER(10) NOT NULL,
	CONSTRAINT USERINFO_USERS FOREIGN KEY (USER_INFOID)
		REFERENCES AE_USERS (AEID) ON DELETE CASCADE
);

CREATE SEQUENCE AE_userinfo_seq
	START WITH 1
	INCREMENT BY 1;

CREATE TABLE AE_BLOCKED(
	BLOCKID NUMBER(10) PRIMARY KEY,
	BLOCKEDUSERID NUMBER(10) NOT NULL,
	AE_ID NUMBER(10) NOT NULL,
	CONSTRAINT BLOCKED_USERS FOREIGN KEY (AE_ID)
		REFERENCES AE_USERS (AEID) ON DELETE CASCADE
);

CREATE SEQUENCE AE_block_seq
	START WITH 1
	INCREMENT BY 1;
	
CREATE OR REPLACE TRIGGER AE_block_seq_trigger
BEFORE INSERT ON AE_BLOCKED
FOR EACH ROW
BEGIN
	IF : NEW.BLOCKID IS NULL THEN
	SELECT AE_block_seq.nextval INTO : NEW.BLOCKID FROM dual;
	END IF;
END;

CREATE TABLE AE_CHANNELS(
	CHANNELID NUMBER(10) PRIMARY KEY,
	CHANNELNAME varchar2(255) NOT NULL CHECK(LENGTH(CHANNELNAME) > 1),
	CHANNELTYPE varchar2(255) NOT NULL CHECK(LENGTH(CHANNELTYPE) > 1)
);

CREATE SEQUENCE AE_CHANNEL_seq
	START WITH 1
	INCREMENT BY 1;
	
CREATE OR REPLACE TRIGGER AE_CHANNEL_seq_trigger
BEFORE INSERT ON AE_CHANNELS
FOR EACH ROW
BEGIN
	IF : NEW.CHANNELID IS NULL THEN
	SELECT AE_CHANNEL_seq.nextval INTO : NEW.CHANNELID FROM dual;
	END IF;
END;

DROP TABLE AE_COMMENTS;

CREATE TABLE AE_COMMENTS(
	COMMENTID NUMBER(10) PRIMARY KEY,
	CONTENT varchar2(4000) NOT NULL CHECK(LENGTH(CONTENT) > 1),
	POSTDATE varchar2(255) NOT NULL CHECK(LENGTH(POSTDATE) > 1),
	USER_ID NUMBER(10) NOT NULL,
	CONSTRAINT COMMENTS_USERS FOREIGN KEY (USER_ID)
		REFERENCES AE_USERS (AEID) ON DELETE CASCADE,
	CHANNEL_ID NUMBER(10) NOT NULL,
	CONSTRAINT COMMENTS_CHANNELS FOREIGN KEY (CHANNEL_ID)
		REFERENCES AE_CHANNELS (CHANNELID) ON DELETE CASCADE
);

CREATE SEQUENCE AE_COMMENTS_seq
	START WITH 1
	INCREMENT BY 1;
	
CREATE OR REPLACE TRIGGER AE_CHANNEL_seq_trigger
BEFORE INSERT ON AE_CHANNELS
FOR EACH ROW
BEGIN
	IF : NEW.CHANNELID IS NULL THEN
	SELECT AE_CHANNEL_seq.nextval INTO : NEW.CHANNELID FROM dual;
	END IF;
END;
DROP TABLE AE_BANNED;

CREATE TABLE AE_BANNED(
	BANID NUMBER(10) PRIMARY KEY,
	BANNEDUSERID NUMBER(10) NOT NULL,
	CHANNEL_BID NUMBER(10) NOT NULL,
	CONSTRAINT BANNED_CHANNELS FOREIGN KEY (CHANNEL_BID)
		REFERENCES AE_CHANNELS (CHANNELID) ON DELETE CASCADE
);

CREATE SEQUENCE AE_BANNED_seq
	START WITH 1
	INCREMENT BY 1;
	
CREATE OR REPLACE TRIGGER AE_BANNED_seq_trigger
BEFORE INSERT ON AE_BANNED
FOR EACH ROW
BEGIN
	IF : NEW.BANID IS NULL THEN
	SELECT AE_BANNED_seq.nextval INTO : NEW.BANID FROM dual;
	END IF;
END;

DROP TABLE AE_ALLOWED;

CREATE TABLE AE_ALLOWED(
	ALLOWID NUMBER(10) PRIMARY KEY,
	ALLOWEDID NUMBER(10) NOT NULL,
	CHANNEL_AID NUMBER(10) NOT NULL,
	CONSTRAINT ALLOWED_CHANNELS FOREIGN KEY (CHANNEL_AID)
		REFERENCES AE_CHANNELS (CHANNELID) ON DELETE CASCADE
);

CREATE SEQUENCE AE_ALLOWED_seq
	START WITH 1
	INCREMENT BY 1;
	
CREATE OR REPLACE TRIGGER AE_ALLOWED_seq_trigger
BEFORE INSERT ON AE_ALLOWED
FOR EACH ROW
BEGIN
	IF : NEW.ALLOWID IS NULL THEN
	SELECT AE_ALLOWED_seq.nextval INTO : NEW.ALLOWID FROM dual;
	END IF;
END;

