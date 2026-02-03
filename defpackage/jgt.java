package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgt {
    private final AccessibilityManager a;

    public jgt(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }

    public final long a(long j, boolean z) {
        if (j < 2147483647L) {
            int i = z ? 7 : 3;
            if (Build.VERSION.SDK_INT >= 29) {
                int recommendedTimeoutMillis = this.a.getRecommendedTimeoutMillis((int) j, i);
                if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return recommendedTimeoutMillis;
            }
            if (z && this.a.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j;
    }
}
