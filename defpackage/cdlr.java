package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdlr implements fdap {
    final /* synthetic */ Instant a;

    public cdlr(Instant instant) {
        this.a = instant;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cdlb cdlbVar = (cdlb) obj;
        cdlbVar.copyOnWrite();
        cdlk cdlkVar = (cdlk) cdlbVar.instance;
        cdlk cdlkVar2 = cdlk.a;
        cdlkVar.b |= 128;
        cdlkVar.j = true;
        evvp evvpVarB = evxd.b(this.a);
        cdlbVar.copyOnWrite();
        cdlk cdlkVar3 = (cdlk) cdlbVar.instance;
        cdlkVar3.k = evvpVarB;
        cdlkVar3.b |= 256;
        return fctx.a;
    }
}
