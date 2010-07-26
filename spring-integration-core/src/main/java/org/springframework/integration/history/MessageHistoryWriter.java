/*
 * Copyright 2002-2010 the original author or authors.
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

package org.springframework.integration.history;

import org.springframework.integration.context.NamedComponent;
import org.springframework.integration.core.Message;

/**
 * @author Oleg Zhurakousky
 * @since 2.0
 */
public class MessageHistoryWriter {

	public final static String HISTORY_WRITER_BEAN_NAME = "historyWriter";

	public void writeHistory(NamedComponent component, Message<?> message) {
		if (message != null) {
			message.getHeaders().getHistory().addEvent(component);
		}
	}

}
