package app.web.pavelk.database2.repo;

import app.web.pavelk.database2.model.Book;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface BookRepo extends CassandraRepository<Book, Integer> {
}
