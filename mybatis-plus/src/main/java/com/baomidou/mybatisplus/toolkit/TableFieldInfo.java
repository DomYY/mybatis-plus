/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.toolkit;

import com.baomidou.mybatisplus.annotations.FieldStrategy;

/**
 * <p>
 * 数据库表字段反射信息
 * </p>
 *
 * @author hubin sjy
 * @Date 2016-09-09
 */
public class TableFieldInfo {

	/**
	 * <p>
	 * 是否有存在字段名与属性名关联
	 * </p>
	 * true , false
	 */
	private boolean related;

	/**
	 * 字段名
	 */
	private String column;

	/**
	 * 属性名
	 */
	private String property;

	/**
	 * 属性表达式#{property}, 可以指定jdbcType, typeHandler等
	 */
	private String el;

	/**
	 * 字段策略【 默认，自判断 null 】
	 */
	private FieldStrategy fieldStrategy = FieldStrategy.NOT_NULL;

	public TableFieldInfo(boolean related, String column, String property, String el, FieldStrategy fieldStrategy) {
		this.related = related;
		this.setColumn(column);
		this.property = property;
		this.el = el;
		this.fieldStrategy = fieldStrategy;
	}

	public TableFieldInfo(boolean related, String column, String property) {
		this.related = related;
		this.setColumn(column);
		this.property = property;
		this.el = property;
	}

	public TableFieldInfo(String column) {
		this.related = false;
		this.setColumn(column);
		this.property = column;
		this.el = column;
	}

	public boolean isRelated() {
		return related;
	}

	public void setRelated(boolean related) {
		this.related = related;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = DBKeywordsProcessor.convert(column);
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getEl() {
		return el;
	}

	public void setEl(String el) {
		this.el = el;
	}

	public FieldStrategy getFieldStrategy() {
		return fieldStrategy;
	}

	public void setFieldStrategy(FieldStrategy fieldStrategy) {
		this.fieldStrategy = fieldStrategy;
	}

}
