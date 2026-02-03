package defpackage;

import android.os.Bundle;
import defpackage.ehnf;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehne implements lxk {
    final /* synthetic */ ehnf a;
    final /* synthetic */ ahns b;

    public ehne(ehnf ehnfVar, ahns ahnsVar) {
        this.b = ahnsVar;
        this.a = ehnfVar;
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd a(Class cls) {
        return lxj.b();
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) throws Exception {
        lxq lxqVar = (lxq) lypVar.a(lwu.b);
        boolean z = lxqVar instanceof ea;
        ehnf ehnfVar = this.a;
        if (z) {
            ea eaVar = ehnfVar.a;
            ejwl.r(lxqVar == eaVar, "Cannot use AccountViewModelFactory on a different fragment than the fragment the factory is from. Found: %s, Factory fragment: %s", lxqVar, eaVar);
        } else {
            ea eaVar2 = ehnfVar.a;
            if (eaVar2.Q == null || lxqVar != eaVar2.Q()) {
                if (!(lxqVar instanceof oip)) {
                    throw new IllegalStateException("AccountViewModels can only use account fragments and account-based Navigation back stack entries as the owner. Found the owner: ".concat(String.valueOf(String.valueOf(lxqVar))));
                }
                Bundle bundleA = ((oip) lxqVar).a();
                ejwl.r(bundleA != null && bundleA.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID"), "Cannot use a non-account NavBackStackEntry as an owner for an AccountViewModel. Owner: %s AccountViewModel class: %s", lxqVar, cls);
                ejwl.m(bundleA.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID") == eaVar2.m.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"), "Account id stored in the NavBackStackEntry owner does not match the account id in the fragment AccountViewModelFactory");
            }
        }
        lwn lwnVarA = lwu.a(lypVar);
        final eyha eyhaVar = new eyha();
        ahns ahnsVar = this.b;
        ahnsVar.d = lwnVarA;
        ahnsVar.e = eyhaVar;
        eyij.a(ahnsVar.d, lwn.class);
        eyij.a(ahnsVar.e, eygo.class);
        fcsu fcsuVar = (fcsu) ((ehnf.a) eygm.a(new ahoi(ahnsVar.a, ahnsVar.b, ahnsVar.c, ahnsVar.d, ahnsVar.e), ehnf.a.class)).bj().get(cls.getName());
        if (fcsuVar == null) {
            throw new IllegalStateException(a.R(cls, "Expected the @AccountViewModel-annotated class '", "' to be available in the multi-binding of @AccountViewModelMap but none was found."));
        }
        lxd lxdVar = (lxd) fcsuVar.b();
        lxdVar.fz(new AutoCloseable() { // from class: ehnd
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
