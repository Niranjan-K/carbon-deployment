/*
* Copyright 2004,2013 The Apache Software Foundation.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.carbon.javaee.tomee.osgi.internal;

import org.osgi.framework.ServiceRegistration;
import org.wso2.carbon.javaee.tomee.osgi.ASServiceManagerExtender;

public class DataHolder {

    private static ASServiceManagerExtender serviceManager;
    private static ServiceRegistration serviceRegistration;

    public static ASServiceManagerExtender getServiceManager() {
        return serviceManager;
    }

    public static void setServiceManager(ASServiceManagerExtender serviceManager) {
        DataHolder.serviceManager = serviceManager;
    }

    public static ServiceRegistration getServiceRegistration() {
        return serviceRegistration;
    }

    public static void setServiceRegistration(ServiceRegistration serviceRegistration) {
        DataHolder.serviceRegistration = serviceRegistration;
    }
}
