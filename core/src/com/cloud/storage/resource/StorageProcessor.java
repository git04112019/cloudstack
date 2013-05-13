/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.cloud.storage.resource;

import org.apache.cloudstack.storage.command.AttachCommand;
import org.apache.cloudstack.storage.command.CopyCommand;
import org.apache.cloudstack.storage.command.CreateObjectCommand;
import org.apache.cloudstack.storage.command.DeleteCommand;
import org.apache.cloudstack.storage.command.DettachCommand;

import com.cloud.agent.api.Answer;
import com.cloud.agent.api.to.DataTO;
import com.cloud.agent.api.to.DiskTO;

public interface StorageProcessor {
    public Answer copyTemplateToPrimaryStorage(CopyCommand cmd);
    public Answer cloneVolumeFromBaseTemplate(CopyCommand cmd);
    public Answer copyVolumeFromImageCacheToPrimary(CopyCommand cmd);
    public Answer copyVolumeFromPrimaryToSecondary(CopyCommand cmd);
    public Answer createTemplateFromVolume(CopyCommand cmd);
    public Answer backupSnasphot(CopyCommand cmd);
    public Answer attachIso(AttachCommand cmd);
    public Answer attachVolume(AttachCommand cmd);
    public Answer dettachIso(DettachCommand cmd);
    public Answer dettachVolume(DettachCommand cmd);
    public Answer createVolume(CreateObjectCommand cmd);
    public Answer createSnapshot(CreateObjectCommand cmd);
    public Answer deleteVolume(DeleteCommand cmd);
}