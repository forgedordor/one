package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyf {
    public static final fdzi a = new fdzi("UNDEFINED");
    public static final fdzi b = new fdzi("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x0097, DONT_GENERATE, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x003c, B:15:0x004a, B:17:0x0050, B:28:0x0080, B:18:0x005c, B:20:0x006c, B:25:0x0077, B:27:0x007d, B:34:0x008d, B:37:0x0096, B:36:0x0093, B:23:0x0072), top: B:47:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.fcxy r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof defpackage.fdye
            if (r0 == 0) goto La4
            fdye r6 = (defpackage.fdye) r6
            java.lang.Object r0 = defpackage.fdji.b(r7)
            fdjq r1 = r6.a
            fcyh r2 = r6.u()
            boolean r2 = c(r1, r2)
            r3 = 1
            if (r2 == 0) goto L23
            r6.c = r0
            r6.e = r3
            fcyh r7 = r6.u()
            b(r1, r7, r6)
            return
        L23:
            boolean r1 = defpackage.fdkb.a
            java.lang.ThreadLocal r1 = defpackage.fdmw.a
            fdkw r1 = defpackage.fdmw.a()
            boolean r2 = r1.q()
            if (r2 == 0) goto L39
            r6.c = r0
            r6.e = r3
            r1.o(r6)
            return
        L39:
            r1.p(r3)
            fcyh r0 = r6.u()     // Catch: java.lang.Throwable -> L97
            fdlq r2 = defpackage.fdlr.c     // Catch: java.lang.Throwable -> L97
            fcyf r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L97
            fdlr r0 = (defpackage.fdlr) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L5c
            boolean r2 = r0.v()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L5c
            java.util.concurrent.CancellationException r7 = r0.p()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r7 = defpackage.fctl.a(r7)     // Catch: java.lang.Throwable -> L97
            r6.w(r7)     // Catch: java.lang.Throwable -> L97
            goto L80
        L5c:
            fcxy r0 = r6.b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r6.d     // Catch: java.lang.Throwable -> L97
            fcyh r4 = r0.u()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = defpackage.fdzp.b(r4, r2)     // Catch: java.lang.Throwable -> L97
            fdzi r5 = defpackage.fdzp.a     // Catch: java.lang.Throwable -> L97
            if (r2 == r5) goto L71
            fdnc r5 = defpackage.fdjn.c(r0, r4, r2)     // Catch: java.lang.Throwable -> L97
            goto L72
        L71:
            r5 = 0
        L72:
            r0.w(r7)     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L7d
            boolean r7 = r5.W()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L80
        L7d:
            defpackage.fdzp.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L80:
            boolean r7 = r1.s()     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L80
            r1.n(r3)
            return
        L8a:
            r7 = move-exception
            if (r5 == 0) goto L93
            boolean r0 = r5.W()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L96
        L93:
            defpackage.fdzp.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r7 = move-exception
            r6.K(r7)     // Catch: java.lang.Throwable -> L9f
            r1.n(r3)
            return
        L9f:
            r6 = move-exception
            r1.n(r3)
            throw r6
        La4:
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdyf.a(fcxy, java.lang.Object):void");
    }

    public static final void b(fdjq fdjqVar, fcyh fcyhVar, Runnable runnable) {
        try {
            fdjqVar.a(fcyhVar, runnable);
        } catch (Throwable th) {
            throw new fdkl(th, fdjqVar, fcyhVar);
        }
    }

    public static final boolean c(fdjq fdjqVar, fcyh fcyhVar) throws fdkl {
        try {
            return fdjqVar.ey(fcyhVar);
        } catch (Throwable th) {
            throw new fdkl(th, fdjqVar, fcyhVar);
        }
    }
}
