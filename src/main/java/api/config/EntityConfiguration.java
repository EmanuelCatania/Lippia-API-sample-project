package api.config;

import services.CharacterServices;
import services.ErrorServices;
import services.ResponseHeadersService;
import services.UserService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    CHARACTER {
        @Override
        public Class<?> getEntityService() {
            return CharacterServices.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorServices.class;
        }
    };

    public abstract Class<?> getEntityService();
}
