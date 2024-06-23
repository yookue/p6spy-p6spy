/*
 * Copyright (c) 2022 Yookue Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.p6spy.engine.spy.appender;


import com.p6spy.engine.logging.Category;


/**
 * {@link com.p6spy.engine.spy.appender.P6Logger} with no operations
 *
 * @author David Hsing
 * @reference "https://forum.sentry.io/t/java-sdk-p6spy-log-file/16040/2"
 */
@SuppressWarnings({"unused", "JavadocDeclaration", "JavadocLinkAsPlainText"})
public class NoopLogger implements P6Logger {
    @Override
    public void logSQL(int connectionId, String now, long elapsed, Category category, String prepared, String sql, String url) {
    }

    @Override
    public void logException(Exception ex) {
    }

    @Override
    public void logText(String text) {
    }

    @Override
    public boolean isCategoryEnabled(Category category) {
        return false;
    }
}
