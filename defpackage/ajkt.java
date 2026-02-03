package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajkt implements cqew {
    final /* synthetic */ ajku a;

    public ajkt(ajku ajkuVar) {
        this.a = ajkuVar;
    }

    @Override // defpackage.cqew
    public final void x() {
        elsl elslVarI;
        cqbd cqbdVarD = ajku.a.d();
        ajku ajkuVar = this.a;
        cqbdVarD.B("Network connectivity updated", ((cqey) ajkuVar.c.a()).r());
        cqbdVarD.r();
        HashSet hashSet = new HashSet();
        synchronized (ajkuVar) {
            elslVarI = null;
            if (ajkuVar.g(ajkuVar.d)) {
                if (ajkuVar.e != 4) {
                    if (((aqsx) ajkuVar.b.b()).a()) {
                        Iterable$EL.forEach(ajkuVar.h(3), new ajkp(hashSet));
                    } else {
                        elslVarI = ajkuVar.i(Optional.empty(), 3, ajkuVar.d);
                    }
                }
            } else if (((aqsx) ajkuVar.b.b()).a()) {
                Iterable$EL.forEach(ajkuVar.h(2), new ajkp(hashSet));
            } else {
                elslVarI = ajkuVar.i(Optional.empty(), 2, ajkuVar.d);
            }
        }
        if (((aqsx) ajkuVar.b.b()).a()) {
            Iterable$EL.forEach(hashSet, new ajkq(ajkuVar));
        } else if (elslVarI != null) {
            ajkuVar.c(elslVarI);
        }
    }
}
