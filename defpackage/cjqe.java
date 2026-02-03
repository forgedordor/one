package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjqe extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cjqg c;
    final /* synthetic */ cayy d;
    final /* synthetic */ cjpv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjqe(cjqg cjqgVar, cayy cayyVar, cjpv cjpvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cjqgVar;
        this.d = cayyVar;
        this.e = cjpvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjqe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                fctl.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r0, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            cjqg cjqgVar = this.c;
            cjpv cjpvVar = this.e;
            eieu eieuVarH = eiiy.h("MarkRcsMessagesInTelephonyWorkerHandler#processPendingWorkItemAsync");
            try {
                this.a = eieuVarH;
                this.b = 1;
                obj = cjqgVar.l(cjpvVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                r0 = eieuVarH;
            } catch (Throwable th3) {
                th = th3;
                r0 = eieuVarH;
                throw th;
            }
        }
        cbcw cbcwVar = (cbcw) obj;
        fczl.a(r0, null);
        return cbcwVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjqe(this.c, this.d, this.e, fcxyVar);
    }
}
