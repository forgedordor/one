package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aamp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aani c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamp(aani aaniVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aaniVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aamp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
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
        aani aaniVar = this.c;
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("ForkedConversationReporterV2#evaluate");
        try {
            aipo aipoVar = aaniVar.e;
            aamo aamoVar = new aamo(aaniVar, null);
            this.a = eieuVarH;
            this.b = 1;
            if (aipq.a(aipoVar, "Bugle.Custodian.ForkedConversationReporterV2.Duration", aamoVar, this) == fcylVar) {
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
        return new aamp(this.c, fcxyVar);
    }
}
