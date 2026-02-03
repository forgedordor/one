package defpackage;

import defpackage.eygz;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eygy implements lxk {
    final /* synthetic */ ahoj a;

    public eygy(ahoj ahojVar) {
        this.a = ahojVar;
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd a(Class cls) {
        return lxj.b();
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) throws Exception {
        lxd lxdVar;
        final eyha eyhaVar = new eyha();
        ahoj ahojVar = this.a;
        ahojVar.c = lwu.a(lypVar);
        ahojVar.d = eyhaVar;
        eyij.a(ahojVar.c, lwn.class);
        eyij.a(ahojVar.d, eygo.class);
        ahoo ahooVar = new ahoo(ahojVar.a, ahojVar.b, ahojVar.c, ahojVar.d);
        fcsu fcsuVar = (fcsu) ((eygz.a) eygm.a(ahooVar, eygz.a.class)).d().get(cls);
        fdap fdapVar = (fdap) lypVar.a(eygz.a);
        Object obj = ((eygz.a) eygm.a(ahooVar, eygz.a.class)).c().get(cls);
        if (obj == null) {
            if (fdapVar != null) {
                throw new IllegalStateException(a.R(cls, "Found creation callback but class ", " does not have an assisted factory specified in @HiltViewModel."));
            }
            if (fcsuVar == null) {
                throw new IllegalStateException(a.R(cls, "Expected the @HiltViewModel-annotated class ", " to be available in the multi-binding of @HiltViewModelMap but none was found."));
            }
            lxdVar = (lxd) fcsuVar.b();
        } else {
            if (fcsuVar != null) {
                throw new AssertionError(a.R(cls, "Found the @HiltViewModel-annotated class ", " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap."));
            }
            if (fdapVar == null) {
                throw new IllegalStateException(a.R(cls, "Found @HiltViewModel-annotated class ", " using @AssistedInject but no creation callback was provided in CreationExtras."));
            }
            lxdVar = (lxd) fdapVar.invoke(obj);
        }
        lxdVar.fz(new AutoCloseable() { // from class: eygx
            @Override // java.lang.AutoCloseable
            public final void close() {
                eyhaVar.b();
            }
        });
        return lxdVar;
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
