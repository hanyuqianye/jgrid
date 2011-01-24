/*
 * Created on Jan 22, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2011 Hendrik Ebbers
 */
package de.jgrid.demo.picviewer;

public class DummyModelObject implements IPhotoModelObject {

	private float fraction;
	
	@Override
	public Object getValueForFraction() {
		return (int)(fraction * 100) + "";
	}

	@Override
	public void setFraction(float fraction) {
		this.fraction = fraction;
	}

	@Override
	public String toString() {
		return getValueForFraction().toString();
	}
}