package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyu {
    public static final pyv a() {
        return Build.VERSION.SDK_INT >= 34 ? pyx.a : Build.VERSION.SDK_INT >= 30 ? pyw.a : pyy.a;
    }
}
