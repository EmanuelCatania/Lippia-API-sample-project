package api.config;

import api.model.RyM.AllEpisodesModel;
import services.RyM.*;
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
    },
    LOCATION {
        @Override
        public Class<?> getEntityService() {
            return LocationServices.class;
        }
    },
    EPISODE {
        @Override
        public Class<?> getEntityService() {
            return EpisodeServices.class;
        }
    },
    ALLCHAR {
        @Override
        public Class<?> getEntityService() {
            return AllCharacterServices.class;
        }
    },
    ALLLOC {
        @Override
        public Class<?> getEntityService() {
            return AllLocationServices.class;
        }
    },
    ALLEPI {
        @Override
        public Class<?> getEntityService() {
            return AllEpisodesServices.class;
        }
    };

    public abstract Class<?> getEntityService();
}
