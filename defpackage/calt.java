package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class calt {
    public static final cqce a = cqce.g("BugleCms", "CmsRestorePageExecutor");
    private static final dzfh o = new dzfh("CmsRestorePageExecutor");
    public final fdjx b;
    public final bzmo c;
    public final cogw d;
    public final Context e;
    public final fcsu f;
    public final appc g;
    public final aurx h;
    public final bzaa i;
    public final bykl j;
    public final cajw k;
    public final fcsu l;
    public final bmra m;
    public final String n;
    private final dzpl p;
    private final aikp q;

    public calt(fdjx fdjxVar, bzmo bzmoVar, cogw cogwVar, Context context, fcsu fcsuVar, appc appcVar, aurx aurxVar, dzpl dzplVar, aikp aikpVar, bzaa bzaaVar, bykl byklVar, cajw cajwVar, fcsu fcsuVar2, bmra bmraVar, String str) {
        this.b = fdjxVar;
        this.c = bzmoVar;
        this.d = cogwVar;
        this.e = context;
        this.f = fcsuVar;
        this.g = appcVar;
        this.h = aurxVar;
        this.p = dzplVar;
        this.q = aikpVar;
        this.i = bzaaVar;
        this.j = byklVar;
        this.k = cajwVar;
        this.l = fcsuVar2;
        this.m = bmraVar;
        this.n = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, j$.util.Optional r9, boolean r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.cala
            if (r0 == 0) goto L13
            r0 = r11
            cala r0 = (defpackage.cala) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cala r0 = new cala
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 16
            r4 = 10
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L2e
            defpackage.fctl.b(r11)
            goto L9f
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L3c
            goto L5e
        L3c:
            r9 = move-exception
            goto L64
        L3e:
            defpackage.fctl.b(r11)
            bykl r11 = r7.j
            boolean r2 = r11.c()
            if (r2 == 0) goto L88
            ekgb r2 = defpackage.ekfv.a(r8)     // Catch: java.lang.Exception -> L3c
            eiju r9 = r11.a(r2, r9, r10)     // Catch: java.lang.Exception -> L3c
            r9.getClass()     // Catch: java.lang.Exception -> L3c
            r0.a = r8     // Catch: java.lang.Exception -> L3c
            r0.d = r6     // Catch: java.lang.Exception -> L3c
            java.lang.Object r11 = defpackage.fdxs.c(r9, r0)     // Catch: java.lang.Exception -> L3c
            if (r11 == r1) goto Le4
        L5e:
            r11.getClass()     // Catch: java.lang.Exception -> L3c
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Exception -> L3c
            return r11
        L64:
            int r10 = defpackage.fcva.p(r8, r4)
            int r10 = defpackage.fcwa.a(r10)
            int r10 = defpackage.fddu.f(r10, r3)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L79:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L87
            java.lang.Object r10 = r8.next()
            r11.put(r10, r9)
            goto L79
        L87:
            return r11
        L88:
            fdpr r9 = new fdpr
            r9.<init>(r8)
            cakz r8 = new cakz
            r8.<init>(r9, r7)
            cakw r9 = new cakw
            r9.<init>(r8)
            r0.d = r5
            java.lang.Object r11 = defpackage.fdpn.b(r9, r0)
            if (r11 == r1) goto Le4
        L9f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            int r8 = defpackage.fcva.p(r11, r4)
            int r8 = defpackage.fcwa.a(r8)
            int r8 = defpackage.fddu.f(r8, r3)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r8)
            java.util.Iterator r8 = r11.iterator()
        Lb6:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Le3
            java.lang.Object r10 = r8.next()
            fcti r10 = (defpackage.fcti) r10
            java.lang.Object r11 = r10.a
            java.lang.Object r10 = r10.b
            fctk r10 = (defpackage.fctk) r10
            java.lang.Object r10 = r10.a
            java.lang.Throwable r10 = defpackage.fctk.c(r10)
            r10.getClass()
            boolean r0 = r10 instanceof java.lang.Exception
            if (r0 == 0) goto Le2
            fcti r0 = new fcti
            r0.<init>(r11, r10)
            java.lang.Object r10 = r0.a
            java.lang.Object r11 = r0.b
            r9.put(r10, r11)
            goto Lb6
        Le2:
            throw r10
        Le3:
            return r9
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.calt.a(java.util.List, j$.util.Optional, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r0 == r7) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3, types: [cajw] */
    /* JADX WARN: Type inference failed for: r11v0, types: [calt] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [cajn] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, j$.util.Optional r13, defpackage.cajn r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.calt.b(java.lang.String, j$.util.Optional, cajn, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.calb
            if (r0 == 0) goto L13
            r0 = r6
            calb r0 = (defpackage.calb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            calb r0 = new calb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            dzpl r6 = r4.p     // Catch: java.lang.Throwable -> L27
            dzfh r2 = defpackage.calt.o     // Catch: java.lang.Throwable -> L27
            r6.f(r2)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L44
            return r1
        L44:
            dzpl r5 = r4.p
            aikp r0 = r4.q
            dzfh r1 = defpackage.calt.o
            feeg r0 = r0.b()
            r5.k(r1, r0)
            return r6
        L52:
            dzpl r6 = r4.p
            aikp r0 = r4.q
            dzfh r1 = defpackage.calt.o
            feeg r0 = r0.b()
            r6.k(r1, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.calt.c(fdap, fcxy):java.lang.Object");
    }
}
