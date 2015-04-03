/*
 * Copyright (C) 2014-2015 Andrea Feccomandi
 *
 * Licensed under the terms of GNU GPL License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/gpl-2.0.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY. 
 * See the GNU General Public License for more details.
 * 
 */
package com.bibisco.bean;

import java.util.List;

import com.bibisco.enums.TaskStatus;

/**
 * Architecture DTO.
 * 
 * @author Andrea Feccomandi
 *
 */
public class ArchitectureDTO {
	TaskStatus premiseTaskStatus;
	TaskStatus fabulaTaskStatus;
	TaskStatus strandsTaskStatus;
	TaskStatus settingTaskStatus;
	List<StrandDTO> strandList;
	
	public TaskStatus getPremiseTaskStatus() {
		return premiseTaskStatus;
	}
	public void setPremiseTaskStatus(TaskStatus premise) {
		this.premiseTaskStatus = premise;
	}
	public TaskStatus getFabulaTaskStatus() {
		return fabulaTaskStatus;
	}
	public void setFabulaTaskStatus(TaskStatus fabula) {
		this.fabulaTaskStatus = fabula;
	}
	public TaskStatus getStrandsTaskStatus() {
		return strandsTaskStatus;
	}
	public void setStrandsTaskStatus(TaskStatus strands) {
		this.strandsTaskStatus = strands;
	}
	public TaskStatus getSettingTaskStatus() {
		return settingTaskStatus;
	}
	public void setSettingTaskStatus(TaskStatus setting) {
		this.settingTaskStatus = setting;
	}
	public List<StrandDTO> getStrandList() {
		return strandList;
	}
	public void setStrandList(List<StrandDTO> strandList) {
		this.strandList = strandList;
	}
}
