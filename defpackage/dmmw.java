package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmw extends fcyz implements fdat {
    final /* synthetic */ dmng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmw(dmng dmngVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dmngVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.f.b();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmmw(this.a, fcxyVar);
    }
}
