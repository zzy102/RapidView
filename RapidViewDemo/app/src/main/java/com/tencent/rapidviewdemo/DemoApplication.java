/***************************************************************************************************
 Tencent is pleased to support the open source community by making RapidView available.
 Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 Licensed under the MITLicense (the "License"); you may not use this file except in compliance
 withthe License. You mayobtain a copy of the License at

 http://opensource.org/licenses/MIT

 Unless required by applicable law or agreed to in writing, software distributed under the License is
 distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 implied. See the License for the specific language governing permissions and limitations under the
 License.
 ***************************************************************************************************/
package com.tencent.rapidviewdemo;

import android.app.Application;

import com.tencent.RapidView;
import com.tencent.custom.SVGViewProvider;
import com.tencent.rapidview.framework.RapidPool;


public class DemoApplication extends Application {

    public static DemoApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        RapidView.registerProvider(new SVGViewProvider());
        RapidPool.getInstance().initialize(this, null);

    }

    public static Application getInstance() {
        if(mInstance == null) {
            return null;
        }

        return mInstance;
    }
}
