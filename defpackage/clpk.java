package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clpk implements clox {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/session/SatelliteSessionManagerImpl");
    public final bxjn a;
    private final clhq c;
    private final clhc d;
    private final fdjx e;
    private final fdjx f;
    private final feav g;
    private final CopyOnWriteArrayList h;
    private final AtomicReference i;

    public clpk(clhq clhqVar, clhc clhcVar, fdjx fdjxVar, fdjx fdjxVar2, bxjn bxjnVar) {
        clhcVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        bxjnVar.getClass();
        this.c = clhqVar;
        this.d = clhcVar;
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.a = bxjnVar;
        this.g = new feaz();
        this.h = new CopyOnWriteArrayList();
        clob clobVar = (clob) clod.a.createBuilder();
        clobVar.getClass();
        cloe.b(cloc.SESSION_STATUS_UNKNOWN, clobVar);
        this.i = new AtomicReference(cloe.a(clobVar));
    }

    @Override // defpackage.clox
    public final eiju a() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new clpe(this, null));
    }

    @Override // defpackage.clox
    public final eiju b() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new clpi(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003e, B:35:0x00a6, B:37:0x00ac, B:38:0x00ae, B:25:0x007d, B:27:0x008d, B:28:0x008f, B:30:0x0093, B:33:0x009a), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [feav, int] */
    @Override // defpackage.clox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clpk.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (h(r11, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.clox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.clod r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clpk.d(clod, fcxy):java.lang.Object");
    }

    @Override // defpackage.clox
    public final void e(clpl clplVar) {
        this.h.add(clplVar);
    }

    @Override // defpackage.clox
    public final void f(clpl clplVar) {
        this.h.remove(clplVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6.d(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.clpb
            if (r0 == 0) goto L13
            r0 = r6
            clpb r0 = (defpackage.clpb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clpb r0 = new clpb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            clhq r6 = r5.c
            r0.c = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L51
        L43:
            clhq r6 = r5.c
            r0.c = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4e
            goto L51
        L4e:
            fctx r6 = defpackage.fctx.a
            return r6
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clpk.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (g(r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (i(r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r2.d(r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (defpackage.fctx.a != r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6 A[LOOP:0: B:40:0x00e0->B:42:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cloc r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clpk.h(cloc, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r6.c(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.clpg
            if (r0 == 0) goto L13
            r0 = r6
            clpg r0 = (defpackage.clpg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clpg r0 = new clpg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L48
        L36:
            defpackage.fctl.b(r6)
            clhq r6 = r5.c
            r0.c = r4
            r2 = 0
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 == r1) goto L46
            fctx r6 = defpackage.fctx.a
        L46:
            if (r6 == r1) goto L56
        L48:
            clhq r6 = r5.c
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L53
            goto L56
        L53:
            fctx r6 = defpackage.fctx.a
            return r6
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clpk.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003e, B:27:0x0089, B:29:0x008f, B:30:0x0091, B:25:0x007d), top: B:42:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v8, types: [feav] */
    /* JADX WARN: Type inference failed for: r9v0, types: [clpk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.clph
            if (r0 == 0) goto L13
            r0 = r10
            clph r0 = (defpackage.clph) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            clph r0 = new clph
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.a
            clod r0 = (defpackage.clod) r0
            defpackage.fctl.b(r10)
            goto Lbc
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            java.lang.Object r2 = r0.a
            feav r2 = (defpackage.feav) r2
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L42
            goto L89
        L42:
            r10 = move-exception
            goto Lc0
        L45:
            java.lang.Object r2 = r0.a
            feav r2 = (defpackage.feav) r2
            defpackage.fctl.b(r10)
            goto L7d
        L4d:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.clpk.b
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r6 = "BugleSatellite"
            r10.X(r2, r6)
            r2 = 161(0xa1, float:2.26E-43)
            java.lang.String r6 = "SatelliteSessionManagerImpl.kt"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/satelliteapi/session/SatelliteSessionManagerImpl"
            java.lang.String r8 = "syncCurrentSessionStatus"
            ekrw r10 = r10.h(r7, r8, r2, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "Syncing and updating cached session status from Stargate"
            r10.q(r2)
            feav r10 = r9.g
            r0.a = r10
            r0.d = r5
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto Lc4
            r2 = r10
        L7d:
            clhc r10 = r9.d     // Catch: java.lang.Throwable -> L42
            r0.a = r2     // Catch: java.lang.Throwable -> L42
            r0.d = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r10.b(r0)     // Catch: java.lang.Throwable -> L42
            if (r10 == r1) goto Lc4
        L89:
            clnd r10 = (defpackage.clnd) r10     // Catch: java.lang.Throwable -> L42
            clod r10 = r10.d     // Catch: java.lang.Throwable -> L42
            if (r10 != 0) goto L91
            clod r10 = defpackage.clod.a     // Catch: java.lang.Throwable -> L42
        L91:
            r10.getClass()     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.atomic.AtomicReference r4 = r9.i     // Catch: java.lang.Throwable -> L42
            clpa r5 = new clpa     // Catch: java.lang.Throwable -> L42
            r5.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(r4, r5)     // Catch: java.lang.Throwable -> L42
            clod r10 = (defpackage.clod) r10     // Catch: java.lang.Throwable -> L42
            r2.d()
            int r2 = r10.c
            cloc r2 = defpackage.cloc.b(r2)
            if (r2 != 0) goto Lae
            cloc r2 = defpackage.cloc.UNRECOGNIZED
        Lae:
            r2.getClass()
            r0.a = r10
            r0.d = r3
            java.lang.Object r0 = r9.h(r2, r0)
            if (r0 == r1) goto Lc4
            r0 = r10
        Lbc:
            r0.getClass()
            return r0
        Lc0:
            r2.d()
            throw r10
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clpk.j(fcxy):java.lang.Object");
    }
}
