package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ailn {
    public abstract ailn a(ellg ellgVar);

    public abstract ailo b();

    public abstract aimo c();

    public abstract void d(emxt emxtVar);

    public abstract void e(aioj aiojVar);

    public abstract void f(ainn ainnVar);

    public abstract void g(Optional optional);

    public final void h(ellg ellgVar, aioj aiojVar) {
        aimo aimoVarC = c();
        ailn ailnVarA = a(ellgVar);
        ailnVarA.e(aiojVar);
        ((ailj) ailnVarA).b = 2;
        aimoVarC.c(ailnVarA.b());
    }

    public final void i(ListenableFuture listenableFuture, final aioj aiojVar) {
        f(ainm.a(((aimn) c()).c));
        g(c().b(aiojVar));
        auvh.h(eiju.g(listenableFuture).h(new ejvr() { // from class: ailm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.j((ellg) obj, aiojVar);
                return true;
            }
        }, ((aimn) c()).b));
    }

    public final void j(ellg ellgVar, aioj aiojVar) {
        aimo aimoVarC = c();
        ailn ailnVarA = a(ellgVar);
        ailnVarA.e(aiojVar);
        ((ailj) ailnVarA).b = 3;
        aimoVarC.c(ailnVarA.b());
    }
}
