package io.mika.rs.sample;

import javax.ws.rs.ApplicationPath;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import io.mika.rs.ProtobufMessageBodyReader;
import io.mika.rs.ProtobufMessageBodyWriter;
import io.mika.rs.AvroMessageBodyReader;
import io.mika.rs.AvroMessageBodyWriter;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

/**
 * @author Mickaël GREGORI (mickael.gregori at sfr.com)
 * @version $Id$
 */
@ApplicationPath("/webapi/*")
public class ApplicationConfig extends javax.ws.rs.core.Application {

    private final Set<Class<?>> classes;

    public ApplicationConfig() {
        final Set<Class<?>> _classes = new HashSet<>(2);
        _classes.add(CommentResource.class);
        _classes.add(MOXyJsonProvider.class);
        _classes.add(ProtobufMessageBodyReader.class);
        _classes.add(ProtobufMessageBodyWriter.class);
        _classes.add(AvroMessageBodyReader.class);
        _classes.add(AvroMessageBodyWriter.class);
        classes = Collections.unmodifiableSet(_classes);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
