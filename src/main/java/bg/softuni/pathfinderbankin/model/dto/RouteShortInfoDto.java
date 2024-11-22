package bg.softuni.pathfinderbankin.model.dto;

public class RouteShortInfoDto {

    private long id;
    private String name;
    private String description;
    private String imageUrl;

    public RouteShortInfoDto() {
    }

    public long getId() {
        return id;
    }

    public RouteShortInfoDto setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteShortInfoDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteShortInfoDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public RouteShortInfoDto setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
