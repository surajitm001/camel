/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.braintree.springboot;

import org.apache.camel.component.braintree.BraintreeConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The braintree component is used for integrating with the Braintree Payment
 * System.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.braintree")
public class BraintreeComponentConfiguration {

    /**
     * To use the shared configuration
     */
    private BraintreeConfiguration configuration;

    public BraintreeConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(BraintreeConfiguration configuration) {
        this.configuration = configuration;
    }
}