package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyq implements awxo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityCoroutineAccessor");
    private final awzf b;
    private final awyu c;
    private final fcsu d;
    private final arpf e;
    private final dghj f;
    private final dggl g;
    private final ahlu h;

    public awyq(awzf awzfVar, awyu awyuVar, ahlu ahluVar, fcsu fcsuVar, arpf arpfVar, dghj dghjVar, dggl dgglVar) {
        awzfVar.getClass();
        awyuVar.getClass();
        ahluVar.getClass();
        fcsuVar.getClass();
        dghjVar.getClass();
        dgglVar.getClass();
        this.b = awzfVar;
        this.c = awyuVar;
        this.h = ahluVar;
        this.d = fcsuVar;
        this.e = arpfVar;
        this.f = dghjVar;
        this.g = dgglVar;
    }

    private static final awxn k(Iterable iterable, String str) {
        Object next;
        Iterator it = fcva.al(iterable, new awyf()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            awxn awxnVar = (awxn) next;
            if (awxnVar.a() == awxl.a) {
                Optional optionalD = awxnVar.d();
                optionalD.getClass();
                if (fdbq.f(fdct.b(optionalD), str)) {
                    break;
                }
            }
        }
        return (awxn) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [awyq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aubq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aubq r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.awyh
            if (r0 == 0) goto L13
            r0 = r9
            awyh r0 = (defpackage.awyh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awyh r0 = new awyh
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.a
            java.io.Closeable r8 = (java.io.Closeable) r8
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L45
            goto L8a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            eieu r8 = r0.e
            java.lang.Object r2 = r0.a
            aubq r2 = (defpackage.aubq) r2
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L45
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L6c
        L45:
            r9 = move-exception
            goto La2
        L47:
            defpackage.fctl.b(r9)
            int r9 = r8.c
            aubp r9 = defpackage.aubp.b(r9)
            if (r9 != 0) goto L54
            aubp r9 = defpackage.aubp.UNKNOWN_TYPE
        L54:
            aubp r2 = defpackage.aubp.PHONE
            if (r9 != r2) goto La8
            java.lang.String r9 = "MyIdentityCoroutineAccessor#getActiveMyIdentityByChatEndpoint"
            eieu r9 = defpackage.eiiy.a(r9)
            awzf r2 = r7.b     // Catch: java.lang.Throwable -> L9e
            r0.a = r8     // Catch: java.lang.Throwable -> L9e
            r0.e = r9     // Catch: java.lang.Throwable -> L9e
            r0.d = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r2.e(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 == r1) goto L9d
        L6c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L9e
            arpf r4 = r7.e     // Catch: java.lang.Throwable -> L9e
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L90
            java.lang.String r8 = r8.d     // Catch: java.lang.Throwable -> L9e
            r8.getClass()     // Catch: java.lang.Throwable -> L9e
            r0.a = r9     // Catch: java.lang.Throwable -> L9e
            r0.e = r5     // Catch: java.lang.Throwable -> L9e
            r0.d = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r8 = r7.i(r2, r8, r0)     // Catch: java.lang.Throwable -> L9e
            if (r8 == r1) goto L9d
            r6 = r9
            r9 = r8
            r8 = r6
        L8a:
            awxn r9 = (defpackage.awxn) r9     // Catch: java.lang.Throwable -> L45
            r6 = r9
            r9 = r8
            r8 = r6
            goto L99
        L90:
            java.lang.String r8 = r8.d     // Catch: java.lang.Throwable -> L9e
            r8.getClass()     // Catch: java.lang.Throwable -> L9e
            awxn r8 = k(r2, r8)     // Catch: java.lang.Throwable -> L9e
        L99:
            defpackage.fczl.a(r9, r5)
            return r8
        L9d:
            return r1
        L9e:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        La2:
            throw r9     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.a(aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.Collection] */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.awyj
            if (r0 == 0) goto L13
            r0 = r8
            awyj r0 = (defpackage.awyj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awyj r0 = new awyj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.a
            eieu r0 = r0.e
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L81
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "MyIdentityCoroutineAccessor#getAllActiveMyIdentities"
            eieu r8 = defpackage.eiiy.a(r8)
            awzf r2 = r6.b     // Catch: java.lang.Throwable -> L7f
            r0.e = r8     // Catch: java.lang.Throwable -> L7f
            r0.a = r7     // Catch: java.lang.Throwable -> L7f
            r0.d = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r2.e(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == r1) goto L7e
            r5 = r0
            r0 = r8
            r8 = r5
        L4f:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2b
        L5a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L2b
            r3 = r2
            awxn r3 = (defpackage.awxn) r3     // Catch: java.lang.Throwable -> L2b
            ekhx r3 = r3.j()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L5a
            r1.add(r2)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L7a:
            r7 = 0
            defpackage.fczl.a(r0, r7)
        L7e:
            return r1
        L7f:
            r7 = move-exception
            r0 = r8
        L81:
            throw r7     // Catch: java.lang.Throwable -> L82
        L82:
            r8 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.b(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awyk
            if (r0 == 0) goto L13
            r0 = r6
            awyk r0 = (defpackage.awyk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awyk r0 = new awyk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 == r1) goto L4d
        L3a:
            alqm r6 = (defpackage.alqm) r6
            if (r6 == 0) goto L4b
            j$.util.Optional r5 = r6.e()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = defpackage.fdct.b(r5)
            aubq r5 = (defpackage.aubq) r5
            return r5
        L4b:
            r5 = 0
            return r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.c(axcm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awyl
            if (r0 == 0) goto L13
            r0 = r6
            awyl r0 = (defpackage.awyl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awyl r0 = new awyl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            awzf r6 = r4.b
            r0.c = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            awyu r5 = r4.c
            awxn r6 = (defpackage.awxn) r6
            awyv r5 = r5.a(r6)
            ahlu r6 = r4.h
            awzm r5 = r6.a(r5)
            alqm r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.d(axcm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:13:0x002c, B:31:0x0072, B:34:0x0081, B:35:0x0098, B:18:0x003c), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r7v0, types: [awyq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aubq] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aubq r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "No MyIdentity found for the chatEndpoint: "
            boolean r1 = r9 instanceof defpackage.awym
            if (r1 == 0) goto L15
            r1 = r9
            awym r1 = (defpackage.awym) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            awym r1 = new awym
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.b
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L46
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            java.lang.Object r8 = r1.a
            aubq r1 = r1.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L44
            goto L72
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r1.a
            aubq r3 = r1.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L44
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
            goto L5c
        L44:
            r9 = move-exception
            goto La3
        L46:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "MyIdentityCoroutineAccessor#getMyIdentityByChatEndpoint"
            eieu r9 = defpackage.eiiy.a(r9)
            r1.e = r8     // Catch: java.lang.Throwable -> L9f
            r1.a = r9     // Catch: java.lang.Throwable -> L9f
            r1.d = r5     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r7.a(r8, r1)     // Catch: java.lang.Throwable -> L9f
            if (r3 != r2) goto L5c
            goto L99
        L5c:
            awxn r3 = (defpackage.awxn) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto L9a
            awzf r3 = r7.b     // Catch: java.lang.Throwable -> L9f
            r1.e = r8     // Catch: java.lang.Throwable -> L9f
            r1.a = r9     // Catch: java.lang.Throwable -> L9f
            r1.d = r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r3.f(r1)     // Catch: java.lang.Throwable -> L9f
            if (r1 == r2) goto L99
            r6 = r1
            r1 = r8
            r8 = r9
            r9 = r6
        L72:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r1.d     // Catch: java.lang.Throwable -> L44
            r2.getClass()     // Catch: java.lang.Throwable -> L44
            awxn r3 = k(r9, r2)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L81
            r9 = r8
            goto L9a
        L81:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.d     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = defpackage.cqcv.b(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L44
            r2.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L44
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L44
            throw r9     // Catch: java.lang.Throwable -> L44
        L99:
            return r2
        L9a:
            r8 = 0
            defpackage.fczl.a(r9, r8)
            return r3
        L9f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        La3:
            throw r9     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.e(aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:13:0x002b, B:34:0x0072, B:35:0x0078, B:37:0x007e, B:41:0x0096, B:44:0x009d, B:45:0x00a8), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:13:0x002b, B:34:0x0072, B:35:0x0078, B:37:0x007e, B:41:0x0096, B:44:0x009d, B:45:0x00a8), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [awyq] */
    @Override // defpackage.awxo
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.awyn
            if (r0 == 0) goto L13
            r0 = r9
            awyn r0 = (defpackage.awyn) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            awyn r0 = new awyn
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            int r8 = r0.a
            java.lang.Object r0 = r0.b
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto Lb0
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            int r8 = r0.a
            java.lang.Object r2 = r0.b
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L42
            goto L5f
        L42:
            r8 = move-exception
            r0 = r2
            goto Lb0
        L46:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "MyIdentityCoroutineAccessor#getMyIdentityBySubId"
            eieu r9 = defpackage.eiiy.a(r9)
            r0.b = r9     // Catch: java.lang.Throwable -> Lae
            r0.a = r8     // Catch: java.lang.Throwable -> Lae
            r0.e = r5     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r2 = r7.j(r8, r0)     // Catch: java.lang.Throwable -> Lae
            if (r2 != r1) goto L5c
            goto La9
        L5c:
            r6 = r2
            r2 = r9
            r9 = r6
        L5f:
            awxn r9 = (defpackage.awxn) r9     // Catch: java.lang.Throwable -> L42
            if (r9 != 0) goto Laa
            awzf r9 = r7.b     // Catch: java.lang.Throwable -> L42
            r0.b = r2     // Catch: java.lang.Throwable -> L42
            r0.a = r8     // Catch: java.lang.Throwable -> L42
            r0.e = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L42
            if (r9 == r1) goto La9
            r0 = r2
        L72:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2f
        L78:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L95
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L2f
            r2 = r1
            awxn r2 = (defpackage.awxn) r2     // Catch: java.lang.Throwable -> L2f
            ekhx r2 = r2.j()     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L78
            goto L96
        L95:
            r1 = r3
        L96:
            r9 = r1
            awxn r9 = (defpackage.awxn) r9     // Catch: java.lang.Throwable -> L2f
            if (r9 == 0) goto L9d
            r2 = r0
            goto Laa
        L9d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "No MyIdentity found for the subId: "
            java.lang.String r8 = defpackage.a.g(r8, r1)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        La9:
            return r1
        Laa:
            defpackage.fczl.a(r2, r3)
            return r9
        Lae:
            r8 = move-exception
            r0 = r9
        Lb0:
            throw r8     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r9 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.f(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.awyo
            java.lang.String r1 = "MyIdentityCoroutineAccessor.kt"
            if (r0 == 0) goto L15
            r0 = r12
            awyo r0 = (defpackage.awyo) r0
            int r2 = r0.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.e = r2
            goto L1a
        L15:
            awyo r0 = new awyo
            r0.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r0.c
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.e
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L49
            if (r3 == r6) goto L3b
            if (r3 != r5) goto L33
            java.lang.Object r11 = r0.b
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L30
            goto Lc0
        L30:
            r12 = move-exception
            goto Lc5
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            int r11 = r0.a
            java.lang.Object r3 = r0.b
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L43 java.lang.IllegalArgumentException -> L47
            goto L62
        L43:
            r12 = move-exception
            r11 = r3
            goto Lc5
        L47:
            r12 = r3
            goto L6b
        L49:
            defpackage.fctl.b(r12)
            java.lang.String r12 = "MyIdentityCoroutineAccessor#getMyIdentityBySubIdForIncomingXms"
            eieu r12 = defpackage.eiiy.a(r12)
            awzf r3 = r10.b     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L6b
            r0.b = r12     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L6b
            r0.a = r11     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L6b
            r0.e = r6     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L6b
            java.lang.Object r11 = r3.h(r11, r0)     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L6b
            if (r11 == r2) goto Lc4
            r3 = r12
            r12 = r11
        L62:
            defpackage.fczl.a(r3, r4)
            return r12
        L66:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
            goto Lc5
        L6b:
            ekrg r3 = defpackage.awyq.a     // Catch: java.lang.Throwable -> L66
            ekrw r3 = r3.j()     // Catch: java.lang.Throwable -> L66
            ekrz r6 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = "BugleCME"
            r3.X(r6, r7)     // Catch: java.lang.Throwable -> L66
            ekrd r3 = (defpackage.ekrd) r3     // Catch: java.lang.Throwable -> L66
            eksk r6 = defpackage.eksk.SMALL     // Catch: java.lang.Throwable -> L66
            r3.Z(r6)     // Catch: java.lang.Throwable -> L66
            ekrz r6 = defpackage.cqnc.w     // Catch: java.lang.Throwable -> L66
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L66
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L66
            r3.X(r6, r7)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "com/google/android/apps/messaging/shared/core/myidentity/MyIdentityCoroutineAccessor"
            java.lang.String r7 = "getMyIdentityBySubIdForIncomingXms"
            r8 = 63
            ekrw r1 = r3.h(r6, r7, r8, r1)     // Catch: java.lang.Throwable -> L66
            ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "getMyIdentityBySubIdForIncomingXms: force creation of MyIdentity"
            r1.q(r3)     // Catch: java.lang.Throwable -> L66
            fcsu r1 = r10.d     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L66
            axfu r1 = (defpackage.axfu) r1     // Catch: java.lang.Throwable -> L66
            axcy r11 = r1.g(r11)     // Catch: java.lang.Throwable -> L66
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r11 = r11.a()     // Catch: java.lang.Throwable -> L66
            axcm r11 = r11.A()     // Catch: java.lang.Throwable -> L66
            awzf r1 = r10.b     // Catch: java.lang.Throwable -> L66
            r11.getClass()     // Catch: java.lang.Throwable -> L66
            r0.b = r12     // Catch: java.lang.Throwable -> L66
            r0.e = r5     // Catch: java.lang.Throwable -> L66
            java.lang.Object r11 = r1.g(r11, r0)     // Catch: java.lang.Throwable -> L66
            if (r11 == r2) goto Lc4
            r9 = r12
            r12 = r11
            r11 = r9
        Lc0:
            defpackage.fczl.a(r11, r4)
            return r12
        Lc4:
            return r2
        Lc5:
            throw r12     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            defpackage.fczl.a(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.g(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x002b, B:35:0x008b, B:42:0x00a0, B:43:0x00a7, B:18:0x003d), top: B:56:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ezol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [awyq] */
    @Override // defpackage.awxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ezol r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.h(ezol, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Iterable r5, java.lang.String r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.awyg
            if (r0 == 0) goto L13
            r0 = r7
            awyg r0 = (defpackage.awyg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awyg r0 = new awyg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            awxn r7 = k(r5, r6)
            if (r7 != 0) goto La8
            dghj r7 = r4.f
            dggl r2 = r4.g
            dggk r6 = r2.a(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = r7.l(r6, r0)
            if (r7 == r1) goto La7
        L4c:
            dggr r7 = (defpackage.dggr) r7
            r6 = 0
            if (r7 == 0) goto La6
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r0 = r5.hasNext()
            int r1 = r7.a
            if (r0 == 0) goto L73
            java.lang.Object r0 = r5.next()
            r2 = r0
            awxn r2 = (defpackage.awxn) r2
            ekhx r2 = r2.j()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L55
            goto L74
        L73:
            r0 = r6
        L74:
            awxn r0 = (defpackage.awxn) r0
            if (r0 != 0) goto La5
            ekrg r5 = defpackage.awyq.a
            ekrw r5 = r5.j()
            ekrz r7 = defpackage.eksq.a
            java.lang.String r0 = "BugleCME"
            r5.X(r7, r0)
            ekrd r5 = (defpackage.ekrd) r5
            ekrz r7 = defpackage.cqnc.w
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r5.X(r7, r0)
            r7 = 229(0xe5, float:3.21E-43)
            java.lang.String r0 = "MyIdentityCoroutineAccessor.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/core/myidentity/MyIdentityCoroutineAccessor"
            java.lang.String r2 = "findByPhoneNumberWithFallbackToProvisioning"
            ekrw r5 = r5.h(r1, r2, r7, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r7 = "MyIdentity not found for subId from RcsProvisioningIdentityMappingAccessor"
            r5.q(r7)
            return r6
        La5:
            return r0
        La6:
            return r6
        La7:
            return r1
        La8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.i(java.lang.Iterable, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.awyi
            if (r0 == 0) goto L13
            r0 = r8
            awyi r0 = (defpackage.awyi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awyi r0 = new awyi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.a
            eieu r0 = r0.e
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L7c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "MyIdentityCoroutineAccessor#getActiveMyIdentityBySubId"
            eieu r8 = defpackage.eiiy.a(r8)
            awzf r2 = r6.b     // Catch: java.lang.Throwable -> L7a
            r0.e = r8     // Catch: java.lang.Throwable -> L7a
            r0.a = r7     // Catch: java.lang.Throwable -> L7a
            r0.d = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r2.e(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == r1) goto L79
            r5 = r0
            r0 = r8
            r8 = r5
        L4f:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2b
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r1 == 0) goto L73
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L2b
            r3 = r1
            awxn r3 = (defpackage.awxn) r3     // Catch: java.lang.Throwable -> L2b
            ekhx r3 = r3.j()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L55
            goto L74
        L73:
            r1 = r2
        L74:
            awxn r1 = (defpackage.awxn) r1     // Catch: java.lang.Throwable -> L2b
            defpackage.fczl.a(r0, r2)
        L79:
            return r1
        L7a:
            r7 = move-exception
            r0 = r8
        L7c:
            throw r7     // Catch: java.lang.Throwable -> L7d
        L7d:
            r8 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyq.j(int, fcxy):java.lang.Object");
    }
}
