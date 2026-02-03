package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajvg implements akcy {
    final /* synthetic */ cidt a;

    public ajvg(cidt cidtVar) {
        this.a = cidtVar;
    }

    @Override // defpackage.akcy
    public final Instant a() {
        evvp evvpVar = this.a.d;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        return evwz.d(evvpVar);
    }

    @Override // defpackage.akcy
    public final Integer b() {
        cidt cidtVar = this.a;
        if ((cidtVar.b & 1) != 0) {
            return Integer.valueOf(cidtVar.c);
        }
        return null;
    }
}
