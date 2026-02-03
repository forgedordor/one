package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmz extends pmy {
    final /* synthetic */ csq a;
    final /* synthetic */ pna b;

    public pmz(pna pnaVar, csq csqVar) {
        this.b = pnaVar;
        this.a = csqVar;
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void b(pmx pmxVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(pmxVar);
        pmxVar.I(this);
    }
}
