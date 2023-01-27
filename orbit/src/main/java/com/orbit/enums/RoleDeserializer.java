package com.orbit.enums;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.orbit.models.auth.EnumRole;
import com.orbit.models.auth.Role;

import java.io.IOException;

public class RoleDeserializer extends StdDeserializer<Role> {
    public RoleDeserializer() {
        this(null);
    }

    public RoleDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Role deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        EnumRole name = EnumRole.valueOf(node.asText());
        return new Role(name);
    }
}
