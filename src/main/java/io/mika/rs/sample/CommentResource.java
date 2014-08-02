package io.mika.rs.sample;

import io.mika.rs.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by mickael on 26/07/14.
 */
@Path("/comment")
public class CommentResource {

    @GET
    @Produces(MediaType.APPLICATION_PROTOBUF)
    public io.mika.rs.sample.model.pb.Comment.CommentType getItAsProtobuf() {
        return io.mika.rs.sample.model.pb.Comment.CommentType.newBuilder()
                .setFrom("Mickael")
                .setTxt("This is a comment")
                .build();
    }

    @GET
    @Produces(MediaType.AVRO_BINARY)
    public io.mika.rs.sample.model.avro.Comment getItAsAvro() {
        return io.mika.rs.sample.model.avro.Comment.newBuilder()
                .setFrom("Mickael")
                .setTxt("This is a comment")
                .build();
    }
}
