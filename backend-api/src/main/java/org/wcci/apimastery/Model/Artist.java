package org.wcci.apimastery.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Artist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String homeTown;
    private String recordLabel;
    private String image;
    @OneToMany(mappedBy = "artist")
    private Collection<Album> albums;

    protected Artist() {}
    public Artist(String name, int age, String homeTown, String recordLabel){
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.recordLabel = recordLabel;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (age != artist.age) return false;
        if (id != null ? !id.equals(artist.id) : artist.id != null) return false;
        if (name != null ? !name.equals(artist.name) : artist.name != null) return false;
        if (homeTown != null ? !homeTown.equals(artist.homeTown) : artist.homeTown != null) return false;
        return recordLabel != null ? recordLabel.equals(artist.recordLabel) : artist.recordLabel == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (homeTown != null ? homeTown.hashCode() : 0);
        result = 31 * result + (recordLabel != null ? recordLabel.hashCode() : 0);
        return result;
    }




}
