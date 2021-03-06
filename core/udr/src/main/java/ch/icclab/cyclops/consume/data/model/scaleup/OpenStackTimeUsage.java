package ch.icclab.cyclops.consume.data.model.scaleup;
/*
 * Copyright (c) 2016. Zuercher Hochschule fuer Angewandte Wissenschaften
 *  All Rights Reserved.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License"); you may
 *     not use this file except in compliance with the License. You may obtain
 *     a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *     WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *     License for the specific language governing permissions and limitations
 *     under the License.
 */

import ch.icclab.cyclops.consume.data.DataMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Author: Oleksii
 * Created: 01/06/16
 * Description: OpenStackEvent UDR measurement definition
 */
public class OpenStackTimeUsage implements DataMapping {
    @Override
    public String getTimeField() { return "time"; }

    @Override
    public TimeUnit getTimeUnit() { return TimeUnit.MILLISECONDS; }

    @Override
    public List<String> getTagNames() {
        List<String> list = new ArrayList<>();
        list.add("account");
        list.add("metadata.source");
        return list;
    }

    @Override
    public Map preProcess(Map original) { return original; }

    @Override
    public Boolean shouldPublish() { return false; }

    @Override
    public Boolean doNotBroadcastButRoute() { return false; }
}
