package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acns {
    private final Context a;

    public acns(Context context) {
        context.getClass();
        this.a = context;
    }

    public final void a(String str) {
        AccessibilityEvent accessibilityEventObtain;
        str.getClass();
        Context context = this.a;
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityEventObtain = new AccessibilityEvent();
            } else {
                accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.getClass();
            }
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.getText().add(str);
            accessibilityEventObtain.setClassName(getClass().getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }
}
