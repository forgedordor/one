package defpackage;

import android.graphics.PorterDuff;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wy extends cub {
    public wy() {
        super(6);
    }

    public static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
