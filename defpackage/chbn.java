package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chbn extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ chbr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chbn(chbr chbrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = chbrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chbn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        chbr chbrVar;
        ?? r0;
        Throwable th;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        int i = this.c;
        try {
            if (i == 0) {
                fctl.b(obj);
                chbr chbrVar2 = this.d;
                feavVar = chbrVar2.a;
                this.a = feavVar;
                this.b = chbrVar2;
                this.c = 1;
                chbrVar = chbrVar2;
                if (feavVar.b(this) != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                r0 = this.a;
                try {
                    fctl.b(obj);
                    feavVar2 = r0;
                    feavVar2.d();
                    return fctx.a;
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
            chbrVar = r1;
            this.a = feavVar;
            this.b = null;
            this.c = 2;
            if (chbrVar.j(this) != fcylVar) {
                feavVar2 = feavVar;
                feavVar2.d();
                return fctx.a;
            }
            return fcylVar;
        } catch (Throwable th3) {
            r0 = feavVar;
            th = th3;
            r0.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chbn(this.d, fcxyVar);
    }
}
