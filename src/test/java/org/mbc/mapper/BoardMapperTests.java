package org.mbc.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mbc.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		
		mapper.getList().forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testGetListXML() {
		
		mapper.getList2().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("너무 어려워요");
		board.setContent("오류가 왜 뜨는지 모르겠어요");
		board.setWriter("이은진");
		
		mapper.insert(board);
		
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("오타 좀 주의하자");
		board.setContent("내 게시물의 번호는?");
		board.setWriter("이은진");
		
		mapper.insertSelectKey(board);
		
		log.info(board);
		log.info("내가만든 게시물의 번호는 : " + board.getBno());
		
	}
	
	@Test
	public void testRead() {
		
		BoardVO board = mapper.read(1L);
		
		log.info(board);
		
	}
	
	@Test
	public void testDelete() {
		
		int count = mapper.delete(3L);
		log.info("삭제된 갯수 출력 : " + count + "건");
		
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		board.setBno(5L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("이수정");
		
		int count = mapper.update(board);
		log.info("수정된 갯수 : " + count + "건");
		log.info("수정도니 객체 출력 : " + board);
		
	}
	
}
