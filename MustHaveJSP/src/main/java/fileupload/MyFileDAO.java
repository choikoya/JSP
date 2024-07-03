package fileupload;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import common.JDBConnect;

public class MyFileDAO extends JDBConnect {
	
//	public static void main(String[] args) {
//
////		작동되는지 테스트하는 방법1
//		MyFileDAO m = new MyFileDAO();
//		
//		MyFileDTO dto = new MyFileDTO();
//		
//		dto.setTitle("title");
//		dto.setOfile("aa");
//		dto.setSfile("bb");
//				
//		m.insertFile(dto);
//		
//		작동되는지 테스트하는 방법2
//		System.out.println("Test");
//	}
	
	public int insertFile(MyFileDTO dto) {
		PreparedStatement psmt = null;
		int applyResult = 0;
		try {
			String query = "INSERT INTO myfile (title, cate, ofile, sfile) "
					+ " VALUES (?, ?, ?, ?)";
			
			psmt = getCon().prepareStatement(query);
			psmt.setString(1,  dto.getTitle());
			psmt.setString(2,  dto.getCate());
			psmt.setString(3,  dto.getOfile());
			psmt.setString(4,  dto.getSfile());
			
			applyResult = psmt.executeUpdate();
			
			
		}
		catch(Exception e) {
			System.out.println("INSERT 중 예외 발생");
			e.printStackTrace();
		}
		return applyResult;
	}
	
	//파일 목록 반환
	public List<MyFileDTO> myFileList(){
		List<MyFileDTO> fileList = new Vector<MyFileDTO>();
		
		String query = "select * from myfile order by idx desc";
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = getCon().createStatement();
			rs = stmt.executeQuery(query); //쿼리실행
			
			while(rs.next()) { //목록안의 파일 수만큼 반복
				MyFileDTO dto = new MyFileDTO(); //DTO에 저장
				dto.setIdx(rs.getString(1));
				dto.setTitle(rs.getString(2));
				dto.setCate(rs.getString(3));
				dto.setOfile(rs.getString(4));
				dto.setSfile(rs.getString(5));
				dto.setPostdate(rs.getString(6));
				
				fileList.add(dto);
			}
		}
		catch(Exception e) {
			System.out.println("select 시 예외 발생");
			e.printStackTrace();
			
		}
		return fileList;
	}

}
