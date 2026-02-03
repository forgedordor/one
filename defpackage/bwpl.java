package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwpl extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bwps c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpl(bwps bwpsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bwpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        eieu eieuVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                fctl.b(obj);
                eieuVar = r0;
                fczl.a(eieuVar, null);
                return fctx.a;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r0, th);
                    throw th2;
                }
            }
        }
        fctl.b(obj);
        bwps bwpsVar = this.c;
        eieu eieuVarH = eiiy.h("DetailsPageE2eeInfoDataSource#fetchAndStoreData");
        try {
            this.a = eieuVarH;
            this.b = 1;
            if (bwpsVar.d(this) == fcylVar) {
                return fcylVar;
            }
            eieuVar = eieuVarH;
            fczl.a(eieuVar, null);
            return fctx.a;
        } catch (Throwable th3) {
            th = th3;
            r0 = eieuVarH;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwpl(this.c, fcxyVar);
    }
}
