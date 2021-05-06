package api.model.RyM;

import java.util.List;

public class AllEpisodesModel {
    private InfoModel info;
    private List<EpisodeModel> results;

    public InfoModel getInfo() {
        return info;
    }

    public void setInfo(InfoModel info) {
        this.info = info;
    }

    public List<EpisodeModel> getResults() {
        return results;
    }

    public void setResults(List<EpisodeModel> results) {
        this.results = results;
    }
}
