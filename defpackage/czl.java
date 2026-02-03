package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czl extends fdbr implements fdap {
    final /* synthetic */ dap a;
    final /* synthetic */ dar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czl(dap dapVar, dar darVar) {
        super(1);
        this.a = dapVar;
        this.b = darVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dew dewVar;
        dew dewVar2;
        dhe dheVar = (dhe) obj;
        cze czeVar = cze.a;
        cze czeVar2 = cze.b;
        if (dheVar.d(czeVar, czeVar2)) {
            daz dazVar = this.a.b().d;
            return (dazVar == null || (dewVar2 = dazVar.c) == null) ? dae.a : dewVar2;
        }
        if (!dheVar.d(czeVar2, cze.c)) {
            return dae.a;
        }
        daz dazVar2 = this.b.b().d;
        return (dazVar2 == null || (dewVar = dazVar2.c) == null) ? dae.a : dewVar;
    }
}
