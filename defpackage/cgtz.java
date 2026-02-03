package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgtz extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgtz(String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgtz) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtdVar.b |= 8;
        cgtdVar.g = this.b;
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgtz cgtzVar = new cgtz(this.b, fcxyVar);
        cgtzVar.a = obj;
        return cgtzVar;
    }
}
