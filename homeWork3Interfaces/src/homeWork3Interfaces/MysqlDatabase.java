package homeWork3Interfaces;

public class MysqlDatabase implements BaseDatabaseProccess{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.nickname + "Mysql veri tabanýndan silindi");		}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.nickname + "Mysql veri tabanýndan silindi");			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.nickname + "Mysql veri tabanýndan silindi");			
	}

}
