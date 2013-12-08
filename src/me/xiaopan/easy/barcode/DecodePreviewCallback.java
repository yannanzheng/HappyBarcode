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

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

/**
 * 解码预览回调
 */
class DecodePreviewCallback implements PreviewCallback {
	private BarcodeDecoder barcodeDecoder;
	
	public DecodePreviewCallback(BarcodeDecoder barcodeDecoder){
		this.barcodeDecoder = barcodeDecoder;
	}
	
	@Override
	public void onPreviewFrame(byte[] data, Camera camera) {
		if(barcodeDecoder != null){
			barcodeDecoder.decode(data);
		}
	}

}