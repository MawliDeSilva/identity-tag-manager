/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.com).
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.tag.manager.api.rest.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.tag.manager.api.rest.v1.model.TagTypeListItem;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class TagTypeListResponse  {
  
    private Integer totalResults;
    private Integer startIndex;
    private Integer count;
    private List<TagTypeListItem> tags = null;


    /**
    * Number of results that matches the list operation.
    **/
    public TagTypeListResponse totalResults(Integer totalResults) {

        this.totalResults = totalResults;
        return this;
    }
    
    @ApiModelProperty(example = "1", value = "Number of results that matches the list operation.")
    @JsonProperty("totalResults")
    @Valid
    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
    * Index of the first element of the page, which will be equal to offset + 1.
    **/
    public TagTypeListResponse startIndex(Integer startIndex) {

        this.startIndex = startIndex;
        return this;
    }
    
    @ApiModelProperty(example = "1", value = "Index of the first element of the page, which will be equal to offset + 1.")
    @JsonProperty("startIndex")
    @Valid
    public Integer getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    /**
    * Number of elements in the returned page.
    **/
    public TagTypeListResponse count(Integer count) {

        this.count = count;
        return this;
    }
    
    @ApiModelProperty(example = "10", value = "Number of elements in the returned page.")
    @JsonProperty("count")
    @Valid
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
    **/
    public TagTypeListResponse tags(List<TagTypeListItem> tags) {

        this.tags = tags;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("tags")
    @Valid
    public List<TagTypeListItem> getTags() {
        return tags;
    }
    public void setTags(List<TagTypeListItem> tags) {
        this.tags = tags;
    }

    public TagTypeListResponse addTagsItem(TagTypeListItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagTypeListResponse tagTypeListResponse = (TagTypeListResponse) o;
        return Objects.equals(this.totalResults, tagTypeListResponse.totalResults) &&
            Objects.equals(this.startIndex, tagTypeListResponse.startIndex) &&
            Objects.equals(this.count, tagTypeListResponse.count) &&
            Objects.equals(this.tags, tagTypeListResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResults, startIndex, count, tags);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class TagTypeListResponse {\n");
        
        sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}
