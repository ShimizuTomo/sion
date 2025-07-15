package sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* アプリケーションのエントリポイント
*/
@SpringBootApplication
@MapperScan("sample.common.dao.mapper")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}