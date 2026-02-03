package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyi {
    static final /* synthetic */ pyi a = new pyi();
    public static final String b = "pyj";

    private pyi() {
    }

    public final pyj a() {
        return Build.VERSION.SDK_INT >= 30 ? pyn.b : Build.VERSION.SDK_INT >= 29 ? pym.b : Build.VERSION.SDK_INT >= 28 ? pyl.b : pyk.b;
    }
}
