package api.model.RyM;

import java.util.List;

public class AllLocationModel {
    private InfoModel info;
    private List<LocationModel> results;

    public InfoModel getInfo() {
        return info;
    }

    public void setInfo(InfoModel info) {
        this.info = info;
    }

    public List<LocationModel> getResults() {
        return results;
    }

    public void setResults(List<LocationModel> results) {
        this.results = results;
    }
}
