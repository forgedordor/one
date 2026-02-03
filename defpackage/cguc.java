package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cguc extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cguc(boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cguc) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtdVar.b |= 16;
        cgtdVar.i = this.b;
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cguc cgucVar = new cguc(this.b, fcxyVar);
        cgucVar.a = obj;
        return cgucVar;
    }
}
