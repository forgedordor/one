package defpackage;

import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyhp implements lvh {
    final /* synthetic */ eyhq.a a;

    public eyhp(eyhq.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar == lva.ON_DESTROY) {
            eyhq.a aVar = this.a;
            aVar.a = null;
            aVar.b = null;
            aVar.c = null;
        }
    }
}
