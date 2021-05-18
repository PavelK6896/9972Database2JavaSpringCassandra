package app.web.pavelk.database2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @PrimaryKey(value = "id")
    private Integer id;
    @Column(value = "title")
    private String title;
}
