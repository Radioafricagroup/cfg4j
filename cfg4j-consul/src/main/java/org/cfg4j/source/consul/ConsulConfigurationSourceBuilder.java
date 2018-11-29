/*
 * Copyright 2015-2016 Norbert Potocki (norbert.potocki@nort.pl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cfg4j.source.consul;

/**
 * Builder for {@link ConsulConfigurationSource}.
 */
public class ConsulConfigurationSourceBuilder {

  private String url;

  /**
   * Construct {@link ConsulConfigurationSource}s builder
   * <p>
   * Default setup (override using with*() methods)
   * <ul>
   * <li>url: http://localhost:8500</li>
   * </ul>
   */
  public ConsulConfigurationSourceBuilder() {
    url = "http://localhost:8500";
  }

  /**
   * Set Consul url for {@link ConsulConfigurationSource}s built by this builder.
   *
   * @param url url to use
   * @return this builder with Consul url set to provided parameter
   */
  public ConsulConfigurationSourceBuilder withUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * Build a {@link ConsulConfigurationSource} using this builder's configuration
   *
   * @return new {@link ConsulConfigurationSource}
   */
  public ConsulConfigurationSource build() {
    return new ConsulConfigurationSource(url);
  }

  @Override
  public String toString() {
    return "ConsulConfigurationSource{ url=" + url +" }";
  }
}
