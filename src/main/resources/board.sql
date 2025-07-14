create sequence seq_board;

drop sequence seq_board;

create table tbl_board(
	bno number(10,0),
	title varchar2(200) not null,
	content varchar2(2000) not null,
	writer varchar2(50) not null,
	regdate date default sysdate,
	updatedate date default sysdate
);

alter table tbl_board add constraint pk_board primary key (bno);

insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목1', '테스트내용1', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목2', '테스트내용2', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목3', '테스트내용3', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목4', '테스트내용4', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목5', '테스트내용5', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목6', '테스트내용6', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목7', '테스트내용7', 'user00');
insert into TBL_BOARD (bno, title, content, writer) values (seq_board.nextval, '테스트제목8', '테스트내용8', 'user00');

select * from tbl_board;