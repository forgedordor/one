package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdlt implements fdap {
    final /* synthetic */ Instant a;

    public cdlt(Instant instant) {
        this.a = instant;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cdlb cdlbVar = (cdlb) obj;
        cdlbVar.copyOnWrite();
        cdlk cdlkVar = (cdlk) cdlbVar.instance;
        cdlk cdlkVar2 = cdlk.a;
        cdlkVar.b |= 512;
        cdlkVar.l = true;
        evvp evvpVarB = evxd.b(this.a);
        cdlbVar.copyOnWrite();
        cdlk cdlkVar3 = (cdlk) cdlbVar.instance;
        cdlkVar3.m = evvpVarB;
        cdlkVar3.b |= 1024;
        return fctx.a;
    }
}
