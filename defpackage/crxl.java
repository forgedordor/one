package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crxl extends fcyz implements fdat {
    final /* synthetic */ crxn a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxl(crxn crxnVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crxnVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        crxn crxnVar = this.a;
        Object obj2 = crxnVar.g;
        boolean z = this.b;
        synchronized (obj2) {
            crxnVar.h = Boolean.valueOf(z);
            ((egzh) crxnVar.d.b()).a(eijx.e(crxnVar.h), crxn.a);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxl(this.a, this.b, fcxyVar);
    }
}
