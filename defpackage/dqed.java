package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqed extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dqee d;
    final /* synthetic */ fdap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqed(dqee dqeeVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dqeeVar;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqed) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [feav] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        fdap fdapVar;
        ?? r0;
        Throwable th;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        int i = this.c;
        try {
            if (i == 0) {
                fctl.b(obj);
                dqee dqeeVar = this.d;
                fdap fdapVar2 = this.e;
                feavVar = dqeeVar.j;
                this.a = feavVar;
                this.b = fdapVar2;
                this.c = 1;
                fdapVar = fdapVar2;
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
                    return obj;
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
            fdapVar = r1;
            this.a = feavVar;
            this.b = null;
            this.c = 2;
            Object objInvoke = fdapVar.invoke(this);
            if (objInvoke != fcylVar) {
                feavVar2 = feavVar;
                obj = objInvoke;
                feavVar2.d();
                return obj;
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
        return new dqed(this.d, this.e, fcxyVar);
    }
}
