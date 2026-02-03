package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dos {
    public static final dot a() {
        if (dnr.a()) {
            return Build.VERSION.SDK_INT == 28 ? dov.a : dox.a;
        }
        throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
    }
}
