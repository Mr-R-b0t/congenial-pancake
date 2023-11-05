package dev.toxicsed.train;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainRepository extends MongoRepository<Train, ObjectId> {

}
