/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jmeter.shulie.model;

import java.util.Arrays;

/**
 * 引擎参数信息
 *
 * @author lipeng
 * @date 2021-05-11 10:16 上午
 */
public class PressureEngineParams {

    private Long sceneId;

    private Long resultId;

    private Long customerId;

    private Integer sceneType;

    private String callbackUrl;

    private int samplingInterval = 1;

    private String podNumber;
    /**
     * 通知方式：http通过http请求回调cloud、message通过redis消息机制
     */
    private String notify;

    private String[] jmeterArgs;

    public String[] getJmeterArgs() {
        return jmeterArgs;
    }

    public void setJmeterArgs(String[] jmeterArgs) {
        this.jmeterArgs = jmeterArgs;
    }

    public Long getSceneId() {
        return sceneId;
    }

    public void setSceneId(Long sceneId) {
        this.sceneId = sceneId;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public int getSamplingInterval() {
        return samplingInterval;
    }

    public void setSamplingInterval(int samplingInterval) {
        this.samplingInterval = samplingInterval > 0 ? samplingInterval : 1;
    }

    public String getPodNumber() {
        return podNumber;
    }

    public void setPodNumber(String podNumber) {
        this.podNumber = podNumber;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public PressureEngineParams() {};

    public PressureEngineParams(Long sceneId, Long resultId, Long customerId, String callbackUrl, int samplingInterval, String podNumber, String notify) {
        this.sceneId = sceneId;
        this.resultId = resultId;
        this.customerId = customerId;
        this.callbackUrl = callbackUrl;
        this.samplingInterval = samplingInterval;
        this.podNumber = podNumber;
        this.notify = notify;
    }

    public static PressureEngineParams create(Long sceneId, Long resultId, Long customerId, String callbackUrl, int samplingInterval, String podNumber, String notify) {
        return new PressureEngineParams(sceneId, resultId, customerId, callbackUrl, samplingInterval,podNumber, notify);
    }

    public Integer getSceneType() {
        return sceneType;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    @Override
    public String toString() {
        return "PressureEngineParams{" +
                "sceneId=" + sceneId +
                ", resultId=" + resultId +
                ", customerId=" + customerId +
                ", sceneType=" + sceneType +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", samplingInterval=" + samplingInterval +
                ", podNumber='" + podNumber + '\'' +
                ", jmeterArgs=" + Arrays.toString(jmeterArgs) +
                '}';
    }
}
