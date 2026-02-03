package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahom implements dmru {
    final /* synthetic */ ahon a;

    public ahom(ahon ahonVar) {
        this.a = ahonVar;
    }

    @Override // defpackage.dmru
    public final dmrt a(dmrm dmrmVar) {
        ahon ahonVar = this.a;
        ahkn ahknVar = ahonVar.a;
        Optional optionalOf = Optional.of((dqiz) ahknVar.b.lw.b());
        ahoo ahooVar = ahonVar.b;
        return new dmrt(optionalOf, (dmra) ahooVar.q.b(), (Executor) ahknVar.a.j.b(), (fdjx) ahooVar.n.b(), (Context) ahknVar.t.b(), dmrmVar);
    }
}
