/*
 * Copyright 2017 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.services.query.app.assembler;

import org.activiti.services.query.app.TaskQueryController;
import org.activiti.services.query.app.model.Task;
import org.activiti.services.query.app.resources.TaskQueryResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskQueryResourceAssembler extends ResourceAssemblerSupport<Task, TaskQueryResource> {

    public TaskQueryResourceAssembler() {
        super(TaskQueryController.class,
                TaskQueryResource.class);
    }

    @Override
    public TaskQueryResource toResource(Task task) {
        List<Link> links = new ArrayList<>();

        return new TaskQueryResource(task, links);
    }
}