package com.thoughtworks.capability.gtb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

public class TimeSerializer extends StdSerializer<Date> {

    public TimeSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date time, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        Timestamp timestamp = new Timestamp(time.getTime());
        gen.writeNumber(timestamp.getTime());
    }

}
