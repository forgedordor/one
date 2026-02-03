package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahoe implements dmru {
    final /* synthetic */ ahoh a;

    public ahoe(ahoh ahohVar) {
        this.a = ahohVar;
    }

    @Override // defpackage.dmru
    public final dmrt a(dmrm dmrmVar) {
        ahoh ahohVar = this.a;
        ahkn ahknVar = ahohVar.a;
        Optional optionalOf = Optional.of((dqiz) ahknVar.b.lw.b());
        ahoi ahoiVar = ahohVar.c;
        return new dmrt(optionalOf, (dmra) ahoiVar.cq.b(), (Executor) ahknVar.a.j.b(), (fdjx) ahoiVar.e.b(), (Context) ahknVar.t.b(), dmrmVar);
    }
}
