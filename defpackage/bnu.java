package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnu {
    private final bns a;

    private bnu(bns bnsVar) {
        this.a = bnsVar;
    }

    public static bnu a() {
        return Build.VERSION.SDK_INT >= 30 ? new bnu(new bnr()) : new bnu(new bnt());
    }

    public final void b() {
        this.a.a();
    }

    public final void c(String str) {
        this.a.b(str);
    }

    public final void d() {
        this.a.c();
    }
}
