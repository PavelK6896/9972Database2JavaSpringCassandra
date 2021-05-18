package app.web.pavelk.database2.config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfig {
    @Bean
    public CqlSession session() {
        CqlSession cqlSession = CqlSession.builder().withKeyspace("test2").build();
        cqlSession.execute(
                "create table IF NOT EXISTS book (" +
                        "id int primary key," +
                        "title text" +
                        ");"
        );
        return cqlSession;
    }
}
