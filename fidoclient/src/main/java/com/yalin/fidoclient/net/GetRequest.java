/*
 * Copyright 2016 YaLin Jin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yalin.fidoclient.net;


import com.android.volley.Request;
import com.android.volley.Response;
import com.yalin.fidoclient.net.response.BaseResponse;

import java.util.Map;

/**
 * Created by 雅麟 on 2015/3/21.
 */
public class GetRequest<T extends BaseResponse> extends BaseRequest<T> {

    public GetRequest(String url, Class<T> cls, Map<String, String> header, Response.Listener listener, Response.ErrorListener errorListener) {
        super(Request.Method.GET, url, cls, header, listener, errorListener);
    }

    public GetRequest(String url, Class<T> cls, Response.Listener listener, Response.ErrorListener errorListener) {
        this(url, cls, null, listener, errorListener);
    }

}