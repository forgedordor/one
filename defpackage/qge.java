package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qge extends fdbr implements fdap {
    final /* synthetic */ fdlr a;
    final /* synthetic */ fdos b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qge(fdlr fdlrVar, fdos fdosVar) {
        super(1);
        this.a = fdlrVar;
        this.b = fdosVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        qga qgaVar = (qga) obj;
        qgaVar.getClass();
        this.a.t(null);
        this.b.b(qgaVar);
        return fctx.a;
    }
}
