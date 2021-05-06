package homeWork3Interfaces;

public class OracleDatabases implements BaseDatabaseProccess {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.nickname + " Oracle veri taban�na eklendi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.nickname + " Oracle veri taban�na g�ncellendi");		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.nickname + " Oracle veri taban�ndan silindi");		
	}
	

}
