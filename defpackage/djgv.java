package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgv extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public djgv(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djgv) c((hps) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((hps) this.a).b(true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        djgv djgvVar = new djgv(fcxyVar);
        djgvVar.a = obj;
        return djgvVar;
    }
}
