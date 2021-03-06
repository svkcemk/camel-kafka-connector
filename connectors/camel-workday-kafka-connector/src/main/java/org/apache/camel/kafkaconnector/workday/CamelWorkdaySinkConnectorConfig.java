/*
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
package org.apache.camel.kafkaconnector.workday;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWorkdaySinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_WORKDAY_PATH_ENTITY_CONF = "camel.sink.path.entity";
    public static final String CAMEL_SINK_WORKDAY_PATH_ENTITY_DOC = "The entity to be requested or subscribed via API. One of: [report] [commonAPI]";
    public static final String CAMEL_SINK_WORKDAY_PATH_ENTITY_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_PATH_PATH_CONF = "camel.sink.path.path";
    public static final String CAMEL_SINK_WORKDAY_PATH_PATH_DOC = "The API path to access an entity structure.";
    public static final String CAMEL_SINK_WORKDAY_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WORKDAY_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_HTTP_CONNECTION_MANAGER_CONF = "camel.sink.endpoint.httpConnectionManager";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_HTTP_CONNECTION_MANAGER_DOC = "Pool connection manager for advanced configuration.";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_HTTP_CONNECTION_MANAGER_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_WORKDAY_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_REPORT_FORMAT_CONF = "camel.sink.endpoint.reportFormat";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_REPORT_FORMAT_DOC = "Workday Report as a service output format. One of: [json]";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_REPORT_FORMAT_DEFAULT = "json";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_HOST_CONF = "camel.sink.endpoint.host";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_HOST_DOC = "Workday Host name.";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_ID_CONF = "camel.sink.endpoint.clientId";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_ID_DOC = "Workday client Id generated by API client for integrations.";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_SECRET_CONF = "camel.sink.endpoint.clientSecret";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_SECRET_DOC = "Workday client Secret generated by API client for integrations.";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_TOKEN_REFRESH_CONF = "camel.sink.endpoint.tokenRefresh";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_TOKEN_REFRESH_DOC = "Workday token Refresh generated for integrations system user.";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_TOKEN_REFRESH_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_TENANT_CONF = "camel.sink.endpoint.tenant";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_TENANT_DOC = "Workday Tenant name.";
    public static final String CAMEL_SINK_WORKDAY_ENDPOINT_TENANT_DEFAULT = null;
    public static final String CAMEL_SINK_WORKDAY_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.workday.lazyStartProducer";
    public static final String CAMEL_SINK_WORKDAY_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WORKDAY_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WORKDAY_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.workday.autowiredEnabled";
    public static final String CAMEL_SINK_WORKDAY_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_WORKDAY_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelWorkdaySinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWorkdaySinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_WORKDAY_PATH_ENTITY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_PATH_ENTITY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_PATH_ENTITY_DOC);
        conf.define(CAMEL_SINK_WORKDAY_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_PATH_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_PATH_PATH_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORKDAY_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORKDAY_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_HTTP_CONNECTION_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_HTTP_CONNECTION_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORKDAY_ENDPOINT_HTTP_CONNECTION_MANAGER_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORKDAY_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORKDAY_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_REPORT_FORMAT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_REPORT_FORMAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORKDAY_ENDPOINT_REPORT_FORMAT_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_ENDPOINT_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_TOKEN_REFRESH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_TOKEN_REFRESH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_ENDPOINT_TOKEN_REFRESH_DOC);
        conf.define(CAMEL_SINK_WORKDAY_ENDPOINT_TENANT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORKDAY_ENDPOINT_TENANT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORKDAY_ENDPOINT_TENANT_DOC);
        conf.define(CAMEL_SINK_WORKDAY_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORKDAY_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORKDAY_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WORKDAY_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORKDAY_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORKDAY_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}