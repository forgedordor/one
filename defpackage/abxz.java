package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abxz extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ abya c;
    final /* synthetic */ efzk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abxz(abya abyaVar, efzk efzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = abyaVar;
        this.d = efzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
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
            abya abyaVar = this.c;
            efzk efzkVar = this.d;
            if (!eicg.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            eieu eieuVarH = eiiy.h("SpatulaSettingsAccountSwitchCallbacks.onAccountChanged");
            try {
                csmf csmfVar = (csmf) abyaVar.a.b();
                efwo efwoVarA = efzkVar.a();
                efwoVarA.getClass();
                this.a = eieuVarH;
                this.b = 1;
                obj = csmfVar.c(efwoVarA, this);
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
        fczl.a(r0, null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abxz(this.c, this.d, fcxyVar);
    }
}
