package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmww implements eora {
    final /* synthetic */ String a;

    public cmww(String str) {
        this.a = str;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        cqbd cqbdVarA = cmwx.a.a();
        cqbdVarA.I("Finished executing background startup task:");
        cqbdVarA.I(this.a);
        cqbdVarA.r();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        cqbd cqbdVarB = cmwx.a.b();
        cqbdVarB.I("Failed executing background startup task:");
        cqbdVarB.I(this.a);
        cqbdVarB.s(th);
    }
}
