package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzg extends fcyz implements fdat {
    /* synthetic */ Object a;

    public cgzg(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgzg) c((chah) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((chah) this.a) == chah.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgzg cgzgVar = new cgzg(fcxyVar);
        cgzgVar.a = obj;
        return cgzgVar;
    }
}
