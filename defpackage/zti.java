package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zti extends fcyz implements fdap {
    final /* synthetic */ ztv a;
    final /* synthetic */ alff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zti(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ztvVar;
        this.b = alffVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((vwg) this.a.o.b()).c(new vwb(vvy.b, ((bbea) this.b).a));
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zti(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
