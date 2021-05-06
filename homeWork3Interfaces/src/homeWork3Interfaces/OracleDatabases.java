package homeWork3Interfaces;

public class OracleDatabases implements BaseDatabaseProccess {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.nickname + " Oracle veri tabanýna eklendi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.nickname + " Oracle veri tabanýna güncellendi");		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.nickname + " Oracle veri tabanýndan silindi");		
	}
	

}
