package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aweq extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ awer c;
    final /* synthetic */ fdae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aweq(awer awerVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = awerVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aweq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        eieu eieuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            awer awerVar = this.c;
            eieu eieuVarH = eiiy.h("logAllDuplicateConversations");
            try {
                this.a = eieuVarH;
                this.b = 2;
                if (awerVar.a(this) == fcylVar) {
                    return fcylVar;
                }
                eieuVar = eieuVarH;
                fczl.a(eieuVar, null);
            } catch (Throwable th) {
                th = th;
                r0 = eieuVarH;
                throw th;
            }
        } else if (i != 1) {
            r0 = this.a;
            try {
                fctl.b(obj);
                eieuVar = r0;
                fczl.a(eieuVar, null);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    fczl.a(r0, th);
                    throw th3;
                }
            }
        } else {
            ?? r02 = this.a;
            try {
                fctl.b(obj);
                fczl.a(r02, null);
            } finally {
            }
        }
        return this.d.invoke();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aweq(this.c, this.d, fcxyVar);
    }
}
