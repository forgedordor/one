package defpackage;

import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjv {
    public static final void a(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}
