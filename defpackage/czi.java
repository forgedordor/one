package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czi extends fdbr implements fdap {
    final /* synthetic */ dap a;
    final /* synthetic */ dar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czi(dap dapVar, dar darVar) {
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
            dat datVar = this.a.b().a;
            return (datVar == null || (dewVar2 = datVar.b) == null) ? dae.a : dewVar2;
        }
        if (!dheVar.d(czeVar2, cze.c)) {
            return dae.a;
        }
        dat datVar2 = this.b.b().a;
        return (datVar2 == null || (dewVar = datVar2.b) == null) ? dae.a : dewVar;
    }
}
