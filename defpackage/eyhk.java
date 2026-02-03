package defpackage;

import defpackage.eyhl;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyhk implements lxk {
    final /* synthetic */ ea a;

    public eyhk(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd a(Class cls) {
        return lxj.b();
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        ea eaVar = this.a;
        if (!(eaVar.X() instanceof eyhy)) {
            throw new IllegalStateException("FragmentRetainedComponent cannot be instantiated without a host");
        }
        ((eyhl.a) eygm.a(((eyhc) ((eyhy) eaVar.X()).ba()).b(), eyhl.a.class)).Q();
        return new eyhm(new ahid());
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
