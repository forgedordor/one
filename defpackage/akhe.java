package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akhe extends fcyz implements fdat {
    final /* synthetic */ akhf a;
    final /* synthetic */ aoer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akhe(akhf akhfVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akhfVar;
        this.b = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akhe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.a(this.b.h().b());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akhe(this.a, this.b, fcxyVar);
    }
}
