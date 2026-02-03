package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyxv implements cqew {
    final /* synthetic */ cyxw a;

    public cyxv(cyxw cyxwVar) {
        this.a = cyxwVar;
    }

    @Override // defpackage.cqew
    public final void x() {
        final cyxw cyxwVar = this.a;
        if (cyxwVar.d()) {
            cyxwVar.c();
            return;
        }
        eooy eooyVar = new eooy() { // from class: cyxs
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cyxw cyxwVar2 = cyxwVar;
                if (cyxwVar2.d()) {
                    return eijx.c();
                }
                cyxwVar2.g = true;
                return eiju.g(((cqey) cyxwVar2.c.a()).i());
            }
        };
        eosd eosdVar = cyxwVar.e;
        eijx.h(eooyVar, eosdVar).h(new ejvr() { // from class: cyxt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cyxw cyxwVar2 = cyxwVar;
                Boolean bool = (Boolean) obj;
                if (!cyxwVar2.d() && bool.booleanValue()) {
                    cyxwVar2.c();
                    cyxwVar2.b();
                }
                cyxwVar2.g = false;
                return true;
            }
        }, eosdVar).k(auvh.b(), cyxwVar.f);
    }
}
