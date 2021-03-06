package com.github.marsor.mars.ui.camera;

import android.net.Uri;

import com.github.marsor.mars.delegates.PermissionCheckerDelegate;
import com.github.marsor.mars.util.file.FileUtil;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */

//相机调用类
public class MarsCamera {

    public static Uri createCropFile() {
        return Uri.parse(
                FileUtil.createFile("crop_image", FileUtil.getFileNameByTime("IMG", "jpg")).getPath());
    }

    public static void start(PermissionCheckerDelegate delegate) {
        new CameraHandler(delegate).beginCameraDialog();
    }
}
