package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugd {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public cugd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.d = fcsuVar3;
        this.b = fcsuVar4;
    }

    public final void a(boolean z) {
        cpdm cpdmVar = (cpdm) this.d.b();
        cpdmVar.c();
        cpdmVar.d(new Date(((cogw) this.c.b()).f().toEpochMilli()));
        cpdmVar.e(z);
    }
}
