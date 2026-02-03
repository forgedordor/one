package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhe {
    public final Object a;

    public lhe(Object obj) {
        this.a = obj;
    }

    public static lhe a(int i, int i2, int i3) {
        return new lhe(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
