/*
 * Copyright 2013 Peng fei Pan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.easy.barcode;

import com.google.zxing.Result;
import com.google.zxing.ResultPoint;

/**
 * 解码监听器
 */
public interface DecodeListener {
	/**
	 * 当找到可能的结果点
	 * @param resultPoint
	 */
	public void foundPossibleResultPoint(ResultPoint resultPoint);
	
	/**
	 * 解码成功
	 * @param result
	 * @param bitmapByteArray
	 * @param scaleFactor
	 */
	public void onDecodeSuccess(Result result, byte[] bitmapByteArray, float scaleFactor);
	
	/**
	 * 解码失败
	 */
	public void onDecodeFailure();
}
