package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acbd implements egps<efwo, Void> {
    final /* synthetic */ acbj a;

    public acbd(acbj acbjVar) {
        this.a = acbjVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        efwo efwoVar = (efwo) obj;
        acbj acbjVar = this.a;
        acca accaVarA = ((acax) ehle.a(acbjVar.b)).a();
        efwo efwoVar2 = acbjVar.q;
        efwoVar2.getClass();
        if (efwoVar.equals(efwoVar2)) {
            acbj.a.p("No account picked from ESI");
            if (accaVarA.b().isPresent()) {
                accaVarA.b().get().apply(efwoVar);
            }
        } else if (accaVarA.c().isPresent()) {
            cqbd cqbdVarC = acbj.a.c();
            cqbdVarC.y("AccountId", efwoVar.a());
            cqbdVarC.I("An Account is picked from ESI");
            cqbdVarC.r();
            accaVarA.c().get().apply(efwoVar);
        }
        acbjVar.i.c(efwoVar);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        this.a.i.a();
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
