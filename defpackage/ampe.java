package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ampe extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ampk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampe(ampk ampkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ampkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ampe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        ampk ampkVar;
        ?? r0;
        Throwable th;
        eupd eupdVar;
        fcyl fcylVar = fcyl.a;
        int i = this.c;
        try {
            if (i == 0) {
                fctl.b(obj);
                ampk ampkVar2 = this.d;
                feavVar = ampkVar2.c;
                this.a = feavVar;
                this.b = ampkVar2;
                this.c = 1;
                ampkVar = ampkVar2;
                if (feavVar.b(this) != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                r0 = this.a;
                try {
                    fctl.b(obj);
                    r0 = r0;
                    eupdVar = (eupd) obj;
                    feavVar = r0;
                    feavVar.d();
                    return eupdVar;
                } catch (Throwable th2) {
                    th = th2;
                    r0.d();
                    throw th;
                }
            }
            ?? r1 = this.b;
            ?? r2 = this.a;
            fctl.b(obj);
            feavVar = r2;
            ampkVar = r1;
            eupdVar = (eupd) ampkVar.e.get();
            if (eupdVar == null) {
                this.a = feavVar;
                this.b = null;
                this.c = 2;
                Object objD = ampkVar.d(this);
                if (objD != fcylVar) {
                    r0 = feavVar;
                    obj = objD;
                    eupdVar = (eupd) obj;
                    feavVar = r0;
                }
                return fcylVar;
            }
            feavVar.d();
            return eupdVar;
        } catch (Throwable th3) {
            r0 = feavVar;
            th = th3;
            r0.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ampe(this.d, fcxyVar);
    }
}
