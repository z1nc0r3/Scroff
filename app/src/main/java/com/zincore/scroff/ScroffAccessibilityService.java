package com.zincore.scroff;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;

public class ScroffAccessibilityService extends AccessibilityService {
    private static ScroffAccessibilityService a;

    public static void a() {
        ScroffAccessibilityService scroffService = a;
        if (scroffService != null)
            a.performGlobalAction(8);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {

    }

    @Override
    public void onInterrupt() {

    }

    protected void onServiceConnected() {
        super.onServiceConnected();
        a = this;
    }

    public boolean onUnbind(Intent paramIntent) {
        a = null;
        return super.onUnbind(paramIntent);
    }
}