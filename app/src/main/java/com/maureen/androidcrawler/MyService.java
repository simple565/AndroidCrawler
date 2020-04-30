package com.maureen.androidcrawler;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;

public class MyService extends AccessibilityService {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Toast.makeText(getApplicationContext(), "服务已开启", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected boolean onGesture(int gestureId) {
        return super.onGesture(gestureId);
    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        return super.onKeyEvent(event);
    }

    @Override
    public List<AccessibilityWindowInfo> getWindows() {
        return super.getWindows();
    }

    @Override
    public AccessibilityNodeInfo getRootInActiveWindow() {
        return super.getRootInActiveWindow();
    }

    @Override
    public AccessibilityNodeInfo findFocus(int focus) {
        return super.findFocus(focus);
    }

    @Override
    public Object getSystemService(@NonNull String name) {
        return super.getSystemService(name);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (null == accessibilityEvent || !accessibilityEvent.getPackageName().toString().contains("packageinstaller")) {
            return;
        }
        Log.d(TAG, "onAccessibilityEvent: " + accessibilityEvent.getPackageName());
        AccessibilityNodeInfo nodeInfo = getRootInActiveWindow();
        findButtonAndClick(nodeInfo, "继续安装");
        findButtonAndClick(nodeInfo, "完成");
    }

    private void findButtonAndClick(AccessibilityNodeInfo nodeInfo, String keyText) {
        if (null == nodeInfo) {
            return;
        }
        List<AccessibilityNodeInfo> nodeInfoList = nodeInfo.findAccessibilityNodeInfosByText(keyText);
        if (null != nodeInfoList && !nodeInfoList.isEmpty()) {
            for (AccessibilityNodeInfo node : nodeInfoList) {
                Log.d(TAG, "onAccessibilityEvent: " + node.toString());
                if (node.isEnabled() && node.isClickable() && "android.widget.Button".equals(node.getClassName().toString())) {
                    node.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                }
            }
        }
    }

    @Override
    public void onInterrupt() {
        Toast.makeText(getApplicationContext(), "服务中断", Toast.LENGTH_SHORT).show();
    }
}
