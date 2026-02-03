package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgua extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ efwo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgua(efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgua) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        int i = ((cgtd) cgtaVar.instance).d;
        int i2 = ((efwq) this.b).a;
        if (i2 != i) {
            cgun.c(cgtaVar);
        }
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtdVar.b |= 1;
        cgtdVar.d = i2;
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgua cguaVar = new cgua(this.b, fcxyVar);
        cguaVar.a = obj;
        return cguaVar;
    }
}
