package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjj extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cfjk e;
    final /* synthetic */ epna f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfjj(cfjk cfjkVar, epna epnaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = cfjkVar;
        this.f = epnaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfjj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [feav] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        feav feavVar;
        ?? r0;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        int i = this.d;
        try {
            if (i == 0) {
                fctl.b(obj);
                feav feavVar3 = cecs.a;
                cfjk cfjkVar = this.e;
                obj2 = this.f;
                feav feavVar4 = cecs.a;
                this.a = feavVar4;
                this.b = cfjkVar;
                this.c = obj2;
                this.d = 1;
                if (feavVar4.b(this) != fcylVar) {
                    obj3 = cfjkVar;
                    feavVar = feavVar4;
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
                } catch (Throwable th) {
                    th = th;
                    r0.d();
                    throw th;
                }
            }
            obj2 = this.c;
            obj3 = this.b;
            ?? r3 = this.a;
            fctl.b(obj);
            feavVar = r3;
            this.a = feavVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            obj = ((cfjk) obj3).d((epna) obj2, this);
            if (obj != fcylVar) {
                feavVar2 = feavVar;
                feavVar2.d();
                return obj;
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
        return new cfjj(this.e, this.f, fcxyVar);
    }
}
