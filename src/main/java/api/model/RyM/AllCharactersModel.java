package api.model.RyM;

import java.lang.reflect.Array;
import java.util.List;

public class AllCharactersModel {
    private InfoModel info;
    private List<CharacterModel> results;

    public InfoModel getInfo() {
        return info;
    }

    public void setInfo(InfoModel info) {
        this.info = info;
    }

    public List<CharacterModel> getResults() {
        return results;
    }

    public void setResults(List<CharacterModel> results) {
        this.results = results;
    }
}
