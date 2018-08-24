package io.github.crawlerbot.models.crawl;


import io.github.crawlerbot.domain.enumeration.PostType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Channel.
 */
@Document(collection = "channel")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "channel")
public class Channel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("allow_external_url")
    private Boolean allowExternalUrl;

    @Field("archive_level")
    private Integer archiveLevel;

    @Field("total_level")
    private Integer totalLevel;

    @Field("destination")
    private String destination;

    @Field("url")
    private String url;

    @Field("post_type")
    private PostType postType;

   // @Field("configFetchEngines")
    @DBRef
    private Set<FetchEngine> configFetchEngines = new HashSet<>();

    //@Field("meta")
    @DBRef
    private Set<Meta> metas = new HashSet<>();


   // @Field("siteActionConfigs")
    @DBRef
    private Set<SiteAction> siteActionConfigs = new HashSet<>();

    //@Field("configMappings")
    @DBRef
    private Set<MappingConfig> configMappings = new HashSet<>();

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean isAllowExternalUrl() {
        return allowExternalUrl;
    }

    public Channel allowExternalUrl(Boolean allowExternalUrl) {
        this.allowExternalUrl = allowExternalUrl;
        return this;
    }

    public void setAllowExternalUrl(Boolean allowExternalUrl) {
        this.allowExternalUrl = allowExternalUrl;
    }

    public Integer getArchiveLevel() {
        return archiveLevel;
    }

    public Channel archiveLevel(Integer archiveLevel) {
        this.archiveLevel = archiveLevel;
        return this;
    }

    public void setArchiveLevel(Integer archiveLevel) {
        this.archiveLevel = archiveLevel;
    }

    public Integer getTotalLevel() {
        return totalLevel;
    }

    public Channel totalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
        return this;
    }

    public void setTotalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
    }

    public String getDestination() {
        return destination;
    }

    public Channel destination(String destination) {
        this.destination = destination;
        return this;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getUrl() {
        return url;
    }

    public Channel url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PostType getPostType() {
        return postType;
    }

    public Channel postType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public Set<FetchEngine> getConfigFetchEngines() {
        return configFetchEngines;
    }

    public Channel configFetchEngines(Set<FetchEngine> fetchEngines) {
        this.configFetchEngines = fetchEngines;
        return this;
    }

    public Channel addConfigFetchEngine(FetchEngine fetchEngine) {
        this.configFetchEngines.add(fetchEngine);
        return this;
    }

    public Channel removeConfigFetchEngine(FetchEngine fetchEngine) {
        this.configFetchEngines.remove(fetchEngine);
        return this;
    }

    public void setConfigFetchEngines(Set<FetchEngine> fetchEngines) {
        this.configFetchEngines = fetchEngines;
    }

    public Set<Meta> getMetas() {
        return metas;
    }

    public Channel metas(Set<Meta> metas) {
        this.metas = metas;
        return this;
    }

    public Channel addMeta(Meta meta) {
        this.metas.add(meta);
        return this;
    }

    public Channel removeMeta(Meta meta) {
        this.metas.remove(meta);
        return this;
    }

    public void setMetas(Set<Meta> metas) {
        this.metas = metas;
    }

    public Set<SiteAction> getSiteActionConfigs() {
        return siteActionConfigs;
    }

    public Channel siteActionConfigs(Set<SiteAction> siteActions) {
        this.siteActionConfigs = siteActions;
        return this;
    }

    public Channel addSiteActionConfig(SiteAction siteAction) {
        this.siteActionConfigs.add(siteAction);
        return this;
    }

    public Channel removeSiteActionConfig(SiteAction siteAction) {
        this.siteActionConfigs.remove(siteAction);
        return this;
    }

    public void setSiteActionConfigs(Set<SiteAction> siteActions) {
        this.siteActionConfigs = siteActions;
    }

    public Set<MappingConfig> getConfigMappings() {
        return configMappings;
    }

    public Channel configMappings(Set<MappingConfig> mappingConfigs) {
        this.configMappings = mappingConfigs;
        return this;
    }

    public Channel addConfigMapping(MappingConfig mappingConfig) {
        this.configMappings.add(mappingConfig);
        return this;
    }

    public Channel removeConfigMapping(MappingConfig mappingConfig) {
        this.configMappings.remove(mappingConfig);
        return this;
    }

    public void setConfigMappings(Set<MappingConfig> mappingConfigs) {
        this.configMappings = mappingConfigs;
    }
    // simlife-needle-entity-add-getters-setters - Simlife will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Channel channel = (Channel) o;
        if (channel.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), channel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Channel{" +
            "id=" + getId() +
            ", allowExternalUrl='" + isAllowExternalUrl() + "'" +
            ", archiveLevel=" + getArchiveLevel() +
            ", totalLevel=" + getTotalLevel() +
            ", destination='" + getDestination() + "'" +
            ", url='" + getUrl() + "'" +
            ", postType='" + getPostType() + "'" +
            "}";
    }
}
