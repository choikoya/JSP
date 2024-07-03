package model2.mvcboard;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnect;

public class MVCBoardDAO extends JDBConnect {
	public MVCBoardDAO() {
		super();
		
	}
	
	
	//검색 조건에 맞는 게시물의 개수 반환
	public int selectCount(Map<String, Object>map) {
		int totalCount = 0;
		//쿼리문
		String query = "select count(*) from mvcboard"; //count는 함수
		
		if(map.get("searchWord") != null) {
			query += " where " + map.get("searchField") + " "
				+ " LIKE '%" + map.get("searchWord") + "%' ";
		}
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = getCon().createStatement(); //쿼리문 생성
			rs = stmt.executeQuery(query); //쿼리문 실행
			rs.next();
			totalCount = rs.getInt(1); //검색된 게시물 개수 저장
		}
		catch(Exception e) {
			System.out.println("게시물 카운트 중 예외 발생");
			e.printStackTrace();
		}
		
		return totalCount;
		
		
	}
	
	//검색 조건에 맞는 게시물의 목록 반환
	public List<MVCBoardDTO> selectListPage(Map<String, Object> map){
		List<MVCBoardDTO> board = new Vector<MVCBoardDTO>();
		
		String query = "select * from mvcboard ";
		
		//쿼리문 오라클이랑 다름. mysql식으로 작성할 것(OracleToMySQL.pdf 참고)
		if (map.get("searchWord") != null){
			query += " where " + map.get("searchField")
					+ " like '%" + map.get("searchWord") + "%' ";
		}
		
		query += " order by idx desc limit ?,? "; // ?,? 에 start, pageSize부분 들어오게됨
				
		
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		
		try {
			psmt = getCon().prepareStatement(query);
			psmt.setInt(1, (Integer)map.get("start"));
			psmt.setInt(2, (Integer)map.get("pageSize"));
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				board.add(dto);
				
			}
			
		}
		catch(Exception e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		
		
		
		
		return board;
	}
	
	 // 글쓰기 폼에서 입력한 게시글 데이터를 받아 DB에 추가(파일 업로드 지원).
    public int insertWrite(MVCBoardDTO dto) {
        int result = 0;
        try {
            String query = "INSERT INTO mvcboard ( "
                         + " name, title, content, ofile, sfile, pass) "
                         + " VALUES ( "
                         + " ?,?,?,?,?,?)";
            
            PreparedStatement psmt = null;
            
            
            psmt = getCon().prepareStatement(query);
            psmt.setString(1, dto.getName());
            psmt.setString(2, dto.getTitle());
            psmt.setString(3, dto.getContent());
            psmt.setString(4, dto.getOfile());
            psmt.setString(5, dto.getSfile());
            psmt.setString(6, dto.getPass());
            result = psmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("게시물 입력 중 예외 발생");
            e.printStackTrace();
        }
        return result;
    }
    
    // 주어진 일련번호에 해당하는 게시물을 DTO에 담아 반환합니다.
    public MVCBoardDTO selectView(String idx) {
        MVCBoardDTO dto = new MVCBoardDTO();  // DTO 객체 생성
        String query = "SELECT * FROM mvcboard WHERE idx=?";  // 쿼리문 템플릿 준비
        
        PreparedStatement psmt = null;
        ResultSet rs = null;
        
        try {
            psmt = getCon().prepareStatement(query);  // 쿼리문 준비
            psmt.setString(1, idx);  // 인파라미터 설정
            rs = psmt.executeQuery();  // 쿼리문 실행

            if (rs.next()) {  // 결과를 DTO 객체에 저장
                dto.setIdx(rs.getString(1));
                dto.setName(rs.getString(2));
                dto.setTitle(rs.getString(3));
                dto.setContent(rs.getString(4));
                dto.setPostdate(rs.getDate(5));
                dto.setOfile(rs.getString(6));
                dto.setSfile(rs.getString(7));
                dto.setDowncount(rs.getInt(8));
                dto.setPass(rs.getString(9));
                dto.setVisitcount(rs.getInt(10));
            }
        }
        catch (Exception e) {
            System.out.println("게시물 상세보기 중 예외 발생");
            e.printStackTrace();
        }
        return dto;  // 결과 반환
    }

    // 주어진 일련번호에 해당하는 게시물의 조회수를 1 증가시킵니다.
    public void updateVisitCount(String idx) {
        String query = "UPDATE mvcboard SET "
                     + " visitcount=visitcount+1 "
                     + " WHERE idx=? "; 
        
        PreparedStatement psmt = null;
        
        
        try {
            psmt = getCon().prepareStatement(query);
            psmt.setString(1, idx);
            psmt.executeQuery();
        }
        catch (Exception e) {
            System.out.println("게시물 조회수 증가 중 예외 발생");
            e.printStackTrace();
        }
    }
    
	
	
	
	

}
