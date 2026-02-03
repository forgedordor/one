package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztg extends fcyz implements fdap {
    final /* synthetic */ alff a;
    final /* synthetic */ ztv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztg(alff alffVar, ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = alffVar;
        this.b = ztvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String str = ((bbeg) this.a).a;
        ztv ztvVar = this.b;
        auvw.k(ztvVar.f, null, null, new zsv(ztvVar, str, null), 3);
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ztg(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
