/*
 * Copyright (c) 2022, WSO2 Inc. (http://www.wso2.com).
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

package org.wso2.asgardeo.tag.service.api.rest.commons;

import org.wso2.identity.asgardeo.tag.service.TagManagementService;

/**
 * Service holder class for tag  manager.
 */
public class TagManagementDataHolder {

    private static TagManagementService tagManagementService;

    /**
     * Get TagManagementService.
     *
     * @return TagManagementService.
     */
    public static TagManagementService getTagManagementService() {

        return tagManagementService;
    }

    /**
     * Set TagManagementService.
     *
     * @param  tagManagementService TagManagementService
     */
    public static void setTagManagementService(TagManagementService tagManagementService) {

        TagManagementDataHolder.tagManagementService = tagManagementService;
    }
}
