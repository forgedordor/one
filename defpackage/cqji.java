package defpackage;

import android.app.ActivityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqji {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public cqji(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final void a(String str) {
        fcsu fcsuVar = this.b;
        ((ains) fcsuVar.b()).c(str);
        ((ains) fcsuVar.b()).a();
        ((ActivityManager) this.c.b()).clearApplicationUserData();
        crrf.a();
    }
}
