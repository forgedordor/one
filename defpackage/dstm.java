package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstm implements dbyj, dstf {
    private static final eksp c = eksp.c("GnpSdk");
    public final diep a;
    public final dsml b;
    private final eosc d;
    private final String e;
    private final dxgk f;
    private final fdjx g;
    private final fcyh h;

    public dstm(dskl dsklVar, eosc eoscVar, diep diepVar, dxgk dxgkVar, fdjx fdjxVar, fcyh fcyhVar) {
        dsklVar.getClass();
        eoscVar.getClass();
        diepVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.d = eoscVar;
        this.e = "ANDROID_MESSAGING";
        this.a = diepVar;
        this.f = dxgkVar;
        this.g = fdjxVar;
        this.h = fcyhVar;
        this.b = new dsml(dsklVar, eoscVar, dxgkVar);
        dbyl.m.add(0, this);
        fdil.d(fdjxVar, null, null, new dsti(this, null), 3);
    }

    @Override // defpackage.dbyj
    public final void a(dbyk dbykVar) throws IOException {
        if (fbcz.b() && !((dbyl) dbykVar.a).e() && fdbq.f(this.e, dbykVar.k)) {
            dxgk dxgkVar = this.f;
            eifp eifpVarA = dxgkVar.a("GrowthKitRastaPlugin_apply");
            try {
                dxgkVar.b();
                String str = dbykVar.j;
                try {
                    ListenableFuture listenableFutureD = this.b.d(str, this.a.f().toEpochMilli());
                    if (listenableFutureD.isDone()) {
                        Object objQ = ((eooi) listenableFutureD).q();
                        objQ.getClass();
                        Iterable iterable = (Iterable) objQ;
                        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((ethm) ((dsmz) it.next()).a).c));
                        }
                        int[] iArrAC = fcva.aC(arrayList);
                        dbykVar.i(iArrAC);
                        ekrw ekrwVarO = c.o();
                        String string = Arrays.toString(iArrAC);
                        string.getClass();
                        ekrwVarO.t("RastaPlugin added %s to log event", string);
                    }
                } catch (InterruptedException e) {
                    ((eksl) ((eksl) c.j()).g(e)).t("Could not retrieve experiments for account %s, continuing without adding experiments to log", str);
                } catch (ExecutionException e2) {
                    ((eksl) ((eksl) c.j()).g(e2)).t("Could not retrieve experiments for account %s, continuing without adding experiments to log", str);
                }
                fczl.a(eifpVarA, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(eifpVarA, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.dstf
    public final Object b(String str, ethn ethnVar, fcxy fcxyVar) {
        return fdin.a(this.h, new dstk(this, str, ethnVar, null), fcxyVar);
    }

    @Override // defpackage.dstf
    public final Object c(fcxy fcxyVar) {
        return fdin.a(this.h, new dstj(this, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dstl
            if (r0 == 0) goto L13
            r0 = r5
            dstl r0 = (defpackage.dstl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dstl r0 = new dstl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L27
            goto L42
        L27:
            r5 = move-exception
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            dsml r5 = r4.b     // Catch: java.lang.Exception -> L27
            com.google.common.util.concurrent.ListenableFuture r5 = r5.e()     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 == r1) goto L4e
        L42:
            eksp r5 = defpackage.dstm.c     // Catch: java.lang.Exception -> L27
            ekrw r5 = r5.o()     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "RastaPlugin cache warmed up"
            r5.q(r0)     // Catch: java.lang.Exception -> L27
            goto L5a
        L4e:
            return r1
        L4f:
            eksp r0 = defpackage.dstm.c
            ekrw r0 = r0.j()
            java.lang.String r1 = "Failed to warm up RastaPlugin cache"
            defpackage.a.N(r0, r1, r5)
        L5a:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dstm.d(fcxy):java.lang.Object");
    }
}
