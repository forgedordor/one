package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhf {
    final Object a;

    public lhf(Object obj) {
        this.a = obj;
    }

    public static lhf a(int i, int i2, int i3, int i4, boolean z) {
        return new lhf(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
