package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdlp implements fdap {
    final /* synthetic */ Instant a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    public cdlp(int i, Instant instant, int i2) {
        this.b = i;
        this.a = instant;
        this.c = i2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cdlb cdlbVar = (cdlb) obj;
        cdlbVar.copyOnWrite();
        cdlk cdlkVar = (cdlk) cdlbVar.instance;
        cdlk cdlkVar2 = cdlk.a;
        int i = this.b;
        if (i == 0) {
            throw null;
        }
        cdlkVar.c = i - 1;
        cdlkVar.b |= 1;
        evvp evvpVarB = evxd.b(this.a);
        cdlbVar.copyOnWrite();
        cdlk cdlkVar3 = (cdlk) cdlbVar.instance;
        cdlkVar3.d = evvpVarB;
        cdlkVar3.b |= 2;
        int i2 = this.c;
        cdlbVar.copyOnWrite();
        cdlk cdlkVar4 = (cdlk) cdlbVar.instance;
        if (i2 == 0) {
            throw null;
        }
        cdlkVar4.e = i2 - 1;
        cdlkVar4.b |= 4;
        return fctx.a;
    }
}
