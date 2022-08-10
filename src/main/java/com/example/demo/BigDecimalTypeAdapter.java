package com.example.demo;


import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalTypeAdapter extends TypeAdapter<BigDecimal> {
    public BigDecimalTypeAdapter() {
    }

    public void write(JsonWriter writer, BigDecimal value) throws IOException {
        if (value == null) {
            writer.nullValue();
        } else if (value.compareTo(BigDecimal.ZERO) == 0) {
            writer.value(0L);
        } else {
            value = value.setScale(16, 1);
            writer.value(value);
        }

    }

    public BigDecimal read(JsonReader reader) throws IOException {
        if (reader.peek().equals(JsonToken.NULL)) {
            reader.nextNull();
            return null;
        } else {
            String value = reader.nextString();
            return (new BigDecimal(value)).setScale(16, 1);
        }
    }
}
