package saef.presentation.tui.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseUtil {
    private static final HikariDataSource hikariDataSource;
    static {
        HikariConfig configuration = new HikariConfig();
        configuration.setDriverClassName("com.mysql.cj.jdbc.Driver");
        configuration.setUsername("root");
        configuration.setPassword("1234");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/todolist?serverTimezone=Asia/Jakarta");

        //pool
        configuration.setMaximumPoolSize(10);
        configuration.setMinimumIdle(5);
        configuration.setIdleTimeout(60_000);
        configuration.setMaxLifetime(60 * 60 * 1000);

        hikariDataSource = new HikariDataSource(configuration);
    }
    public static HikariDataSource getHikariDataSource() {
        return hikariDataSource;
    }
}
