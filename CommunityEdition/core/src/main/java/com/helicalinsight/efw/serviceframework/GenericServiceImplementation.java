/**
 *    Copyright (C) 2013-2017 Helical IT Solutions (http://www.helicalinsight.com).
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.helicalinsight.efw.serviceframework;

/**
 * Created by author on 08-09-2015.
 *
 * @author Rajasekhar
 */
@SuppressWarnings("unused")
public class GenericServiceImplementation implements IService {

    @Override
    public boolean isThreadSafeToCache() {
        return true;
    }

    @Override
    public String doService(String type, String serviceType, String service, String formData) {
        return ServiceUtils.execute(type, serviceType, service, formData);
    }
}