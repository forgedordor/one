package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqeg extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dqex e;
    final /* synthetic */ fdat f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqeg(dqex dqexVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dqexVar;
        this.f = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqeg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [feav] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdat fdatVar;
        feav feavVar;
        dqex dqexVar;
        ?? r0;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        int i = this.d;
        try {
            if (i == 0) {
                fctl.b(obj);
                dqex dqexVar2 = this.e;
                fdat fdatVar2 = this.f;
                feav feavVar3 = dqexVar2.c;
                this.a = feavVar3;
                this.b = fdatVar2;
                this.c = dqexVar2;
                this.d = 1;
                if (feavVar3.b(this) != fcylVar) {
                    fdatVar = fdatVar2;
                    dqexVar = dqexVar2;
                    feavVar = feavVar3;
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
                } catch (Throwable th) {
                    th = th;
                    r0.d();
                    throw th;
                }
            }
            ?? r1 = this.c;
            ?? r2 = this.b;
            ?? r3 = this.a;
            fctl.b(obj);
            dqexVar = r1;
            fdatVar = r2;
            feavVar = r3;
            dqee dqeeVar = dqexVar.b;
            this.a = feavVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (fdatVar.a(dqeeVar, this) != fcylVar) {
                feavVar2 = feavVar;
                feavVar2.d();
                return fctx.a;
            }
            return fcylVar;
        } catch (Throwable th2) {
            th = th2;
            r0 = feavVar;
            r0.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqeg(this.e, this.f, fcxyVar);
    }
}
