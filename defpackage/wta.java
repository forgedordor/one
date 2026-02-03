package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wta implements wsl {
    public final fdat a;
    public final fdap b;
    private final fcyh c;
    private final fdap d;
    private final fdat e;
    private final fdat f;

    public wta(fcyh fcyhVar, fdap fdapVar, fdat fdatVar, fdap fdapVar2, fdat fdatVar2, fdat fdatVar3) {
        this.c = fcyhVar;
        this.d = fdapVar;
        this.a = fdatVar;
        this.b = fdapVar2;
        this.e = fdatVar2;
        this.f = fdatVar3;
    }

    @Override // defpackage.wsl
    public final Object a(vvv vvvVar, bpbj bpbjVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.c), new wsz(null, this, vvvVar, bpbjVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.wsl
    public final void c(bpbl bpblVar, vvw vvwVar) {
        vvwVar.getClass();
        this.e.a(bpblVar, this.d.invoke(vvwVar));
    }

    @Override // defpackage.wsl
    public final void d(bpcv bpcvVar, vvw vvwVar) {
        this.f.a(bpcvVar, this.d.invoke(vvwVar));
    }

    @Override // defpackage.wsl
    public final boolean e(wsa wsaVar) {
        return wsaVar.a(this.d);
    }
}
