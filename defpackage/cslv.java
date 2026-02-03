package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cslv extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cslz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslv(cslz cslzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cslzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        eieu eieuVar;
        ?? r02 = fcyl.a;
        try {
            if (this.b != 0) {
                r0 = this.a;
                try {
                    fctl.b(obj);
                    eieuVar = r0;
                    fczl.a(eieuVar, null);
                    return true;
                } catch (Exception e) {
                    e = e;
                    ekrw ekrwVarJ = cslz.a.j();
                    ekrwVarJ.X(eksq.a, "BugleSpam");
                    ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(e);
                    ekrdVar.Z(eksk.FULL);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl$isAvailable$2", "invokeSuspend", 96, "HaasProxyImpl.kt")).q("SafetyCore prewarm failed.");
                    fczl.a(r0, null);
                    return false;
                }
            }
            fctl.b(obj);
            cslz cslzVar = this.c;
            if (!eicg.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            eieu eieuVarH = eiiy.h("HaasProxyImpl.isAvailable");
            try {
                long j = fdhi.a;
                Object objE = crtr.K.e();
                objE.getClass();
                long jG = fdhk.g(((Number) objE).longValue(), fdhl.d);
                cslu csluVar = new cslu(cslzVar, null);
                this.a = eieuVarH;
                this.b = 1;
                if (fdna.b(jG, csluVar, this) == r02) {
                    return r02;
                }
                eieuVar = eieuVarH;
                fczl.a(eieuVar, null);
                return true;
            } catch (Exception e2) {
                e = e2;
                r0 = eieuVarH;
                ekrw ekrwVarJ2 = cslz.a.j();
                ekrwVarJ2.X(eksq.a, "BugleSpam");
                ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarJ2).g(e);
                ekrdVar2.Z(eksk.FULL);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/util/spam/spatula/HaasProxyImpl$isAvailable$2", "invokeSuspend", 96, "HaasProxyImpl.kt")).q("SafetyCore prewarm failed.");
                fczl.a(r0, null);
                return false;
            } catch (Throwable th) {
                th = th;
                r02 = eieuVarH;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r02, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cslv(this.c, fcxyVar);
    }
}
