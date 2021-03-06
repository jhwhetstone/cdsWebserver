/*
 * Copyright (c) 2017. California Community Colleges Technology Center
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pesc;

import org.springframework.http.HttpHeaders;

/**
 * Created by james on 8/15/16.
 */
public class Utils {

    public static void addCSRFHeaders(HttpHeaders headers) {
        final String clientSecret = "csrf-secret-token";
        headers.set("X-CSRF-TOKEN", clientSecret);
        headers.set("Cookie", "CSRF-TOKEN=" + clientSecret);
    }

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public static HttpHeaders createHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");

        return headers;
    }



}
