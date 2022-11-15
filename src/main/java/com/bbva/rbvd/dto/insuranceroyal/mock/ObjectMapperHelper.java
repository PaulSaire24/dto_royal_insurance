package com.bbva.rbvd.dto.insuranceroyal.mock;

import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.map.ObjectMapper;

public class ObjectMapperHelper {
	
	private static final ObjectMapperHelper INSTANCE = new ObjectMapperHelper();
	
	private ObjectMapper mapper;

	private ObjectMapperHelper() {
		this.mapper = new ObjectMapper();
	}

	public static ObjectMapperHelper getInstance() { return INSTANCE; }

	public <T> T readValue(final InputStream src, final Class<T> valueType) throws IOException {
        return this.mapper.readValue(src, valueType);
    }
	

}
