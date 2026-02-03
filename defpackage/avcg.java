package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avcg extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ avco d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avcg(avco avcoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = avcoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        avco avcoVar;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.c;
        try {
            if (r1 == 0) {
                fctl.b(obj);
                avco avcoVar2 = this.d;
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieu eieuVarH = eiiy.h("ContactsSyncScheduler");
                this.a = avcoVar2;
                this.b = eieuVarH;
                this.c = 1;
                if (avcoVar2.a(false, this) != fcylVar) {
                    avcoVar = avcoVar2;
                    r1 = eieuVarH;
                }
                return fcylVar;
            }
            if (r1 != 1) {
                closeable = (Closeable) this.a;
                try {
                    fctl.b(obj);
                    fczl.a(closeable, null);
                    return fctx.a;
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(closeable, th);
                        throw th2;
                    }
                }
            }
            Object obj2 = this.b;
            avcoVar = (avco) this.a;
            fctl.b(obj);
            r1 = obj2;
            this.a = r1;
            this.b = null;
            this.c = 2;
            eksp ekspVar = avco.a;
            if (avcoVar.g(this) != fcylVar) {
                closeable = r1;
                fczl.a(closeable, null);
                return fctx.a;
            }
            return fcylVar;
        } catch (Throwable th3) {
            th = th3;
            closeable = r1;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avcg(this.d, fcxyVar);
    }
}
