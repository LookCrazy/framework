/*
 * Copyright 2015-2017 the original author or authors.
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

package com.funtl.framework.tencent.wechat.response;

import javax.xml.bind.annotation.XmlElement;

/**
 * 图文消息体
 *
 * @author ChengNing
 * @date 2014年12月7日
 */
public class ArticleResponse {

	private String Title;        //图文消息标题
	private String Description;  //图文消息描述
	private String PicUrl;       //图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	private String Url;          //点击图文消息跳转链接

	@XmlElement(name = "Title")
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@XmlElement(name = "Description")
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@XmlElement(name = "PicUrl")
	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	@XmlElement(name = "Url")
	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}


}
