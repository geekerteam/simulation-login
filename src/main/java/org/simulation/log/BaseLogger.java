/**
 * Copyright (c) 2017-2019 Sekito Lv(bluetata) <sekito.lv@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the 'License'); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.simulation.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base日志处理类
 *
 * @date     12/18/2018 16:35
 * @version  simulation-login version(1.0)</br>
 * @author   bluetata / Sekito.Lv@gmail.com</br>
 * @since    JDK 1.8</br>
 */
public class BaseLogger {

    //服务状态日志
    protected static Logger infoLogger = LoggerFactory.getLogger("infoLogger");
    protected static Logger warnLogger = LoggerFactory.getLogger("warnLogger");
    protected static Logger debugLogger = LoggerFactory.getLogger("debugLogger");
    protected static Logger errorLogger = LoggerFactory.getLogger("errorLogger");

}

