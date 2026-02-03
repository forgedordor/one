package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llo implements lkb {
    public final lmw a;
    public final fdjx b;
    public final lkl d;
    public final lmq f;
    private final ljs g;
    private int j;
    private fdlr k;
    private final fdpl h = new fdui(new lkt(this, null));
    private final feav i = new feaz();
    public final llp c = new llp();
    public final fctc e = fctd.a(new fdae() { // from class: lkd
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lmg] */
        @Override // defpackage.fdae
        public final Object invoke() throws IOException {
            llx llxVar = (llx) this.a.a;
            final File canonicalFile = ((File) llxVar.d.invoke()).getCanonicalFile();
            synchronized (llx.b) {
                String absolutePath = canonicalFile.getAbsolutePath();
                Set set = llx.a;
                if (set.contains(absolutePath)) {
                    throw new IllegalStateException(a.a(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                }
                absolutePath.getClass();
                set.add(absolutePath);
            }
            canonicalFile.getClass();
            return new lma(canonicalFile, llxVar.e, llxVar.c.invoke(canonicalFile), new fdae() { // from class: llv
                @Override // defpackage.fdae
                public final Object invoke() {
                    File file = canonicalFile;
                    synchronized (llx.b) {
                        llx.a.remove(file.getAbsolutePath());
                    }
                    return fctx.a;
                }
            });
        }
    });
    private final fctc l = fctd.a(new fdae() { // from class: lke
        @Override // defpackage.fdae
        public final Object invoke() {
            return this.a.d().b();
        }
    });

    public llo(lmw lmwVar, List list, ljs ljsVar, fdjx fdjxVar) {
        this.a = lmwVar;
        this.g = ljsVar;
        this.b = fdjxVar;
        this.d = new lkl(this, list);
        this.f = new lmq(fdjxVar, new fdap() { // from class: lkf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                llo lloVar = this.a;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    lloVar.c.b(new lmf(th));
                }
                if (lloVar.e.b()) {
                    lloVar.d().a();
                }
                return fctx.a;
            }
        }, new fdat() { // from class: lkg
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                lmh lmhVar = (lmh) obj;
                Throwable cancellationException = (Throwable) obj2;
                lmhVar.getClass();
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                lmhVar.b.a(cancellationException);
                return fctx.a;
            }
        }, new lll(this, null));
    }

    private final Object m(fdat fdatVar, fcyh fcyhVar, fcxy fcxyVar) {
        return c().a(new llj(this, fcyhVar, fdatVar, null), fcxyVar);
    }

    @Override // defpackage.lkb
    public final Object a(fdat fdatVar, fcxy fcxyVar) {
        lnc lncVar = (lnc) fcxyVar.u().get(lnb.a);
        if (lncVar != null) {
            lncVar.a(this);
        }
        return fdin.a(new lnc(lncVar, this), new llk(this, fdatVar, null), fcxyVar);
    }

    @Override // defpackage.lkb
    public final fdpl b() {
        return this.h;
    }

    public final lmg c() {
        return (lmg) this.l.a();
    }

    public final lmx d() {
        return (lmx) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lku
            if (r0 == 0) goto L13
            r0 = r5
            lku r0 = (defpackage.lku) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lku r0 = new lku
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            feaz r0 = r0.d
            defpackage.fctl.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            feav r5 = r4.i
            r2 = r5
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L61
            r0 = r5
        L44:
            int r5 = r4.j     // Catch: java.lang.Throwable -> L5c
            int r5 = r5 + (-1)
            r4.j = r5     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L56
            fdlr r5 = r4.k     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L53
            defpackage.fdlp.a(r5)     // Catch: java.lang.Throwable -> L5c
        L53:
            r5 = 0
            r4.k = r5     // Catch: java.lang.Throwable -> L5c
        L56:
            r0.d()
            fctx r5 = defpackage.fctx.a
            return r5
        L5c:
            r5 = move-exception
            r0.d()
            throw r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11, types: [fdjc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v13, types: [fdjc] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.lmh r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.f(lmh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lkx
            if (r0 == 0) goto L13
            r0 = r5
            lkx r0 = (defpackage.lkx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lkx r0 = new lkx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            feaz r0 = r0.d
            defpackage.fctl.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            feav r5 = r4.i
            r2 = r5
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L65
            r0 = r5
        L44:
            int r5 = r4.j     // Catch: java.lang.Throwable -> L60
            int r5 = r5 + r3
            r4.j = r5     // Catch: java.lang.Throwable -> L60
            if (r5 != r3) goto L5a
            fdjx r5 = r4.b     // Catch: java.lang.Throwable -> L60
            lkz r1 = new lkz     // Catch: java.lang.Throwable -> L60
            r2 = 0
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L60
            r3 = 3
            fdlr r5 = defpackage.fdil.d(r5, r2, r2, r1, r3)     // Catch: java.lang.Throwable -> L60
            r4.k = r5     // Catch: java.lang.Throwable -> L60
        L5a:
            r0.d()
            fctx r5 = defpackage.fctx.a
            return r5
        L60:
            r5 = move-exception
            r0.d()
            throw r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r2.b(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lla
            if (r0 == 0) goto L13
            r0 = r7
            lla r0 = (defpackage.lla) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lla r0 = new lla
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.a
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            defpackage.fctl.b(r7)
            goto L49
        L3a:
            defpackage.fctl.b(r7)
            lmg r7 = r6.c()
            r0.d = r4
            java.lang.Object r7 = r7.d()
            if (r7 == r1) goto L6e
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            lkl r2 = r6.d     // Catch: java.lang.Throwable -> L5f
            r0.a = r7     // Catch: java.lang.Throwable -> L5f
            r0.d = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r2.b(r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r1) goto L5c
            goto L6e
        L5c:
            fctx r7 = defpackage.fctx.a
            return r7
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            llp r1 = r6.c
            lmk r2 = new lmk
            r2.<init>(r7, r0)
            r1.b(r2)
            throw r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.h(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r9 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r9 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.llb
            if (r0 == 0) goto L13
            r0 = r9
            llb r0 = (defpackage.llb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            llb r0 = new llb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r9)
            goto La2
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.fctl.b(r9)
            goto L8c
        L3a:
            boolean r8 = r0.a
            java.lang.Object r2 = r0.b
            defpackage.fctl.b(r9)
            goto L5f
        L42:
            defpackage.fctl.b(r9)
            llp r9 = r7.c
            lmv r2 = r9.a()
            boolean r9 = r2 instanceof defpackage.lmz
            if (r9 != 0) goto Lb9
            lmg r9 = r7.c()
            r0.b = r2
            r0.a = r8
            r0.e = r5
            java.lang.Object r9 = r9.d()
            if (r9 == r1) goto Lb8
        L5f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            boolean r5 = r2 instanceof defpackage.ljt
            if (r5 == 0) goto L6f
            r6 = r2
            ljt r6 = (defpackage.ljt) r6
            int r6 = r6.c
            goto L70
        L6f:
            r6 = -1
        L70:
            if (r5 == 0) goto L76
            if (r9 == r6) goto L75
            goto L76
        L75:
            return r2
        L76:
            r9 = 0
            if (r8 == 0) goto L8f
            lmg r8 = r7.c()
            llc r2 = new llc
            r2.<init>(r7, r9)
            r0.b = r9
            r0.e = r4
            java.lang.Object r9 = r8.a(r2, r0)
            if (r9 == r1) goto Lb8
        L8c:
            fcti r9 = (defpackage.fcti) r9
            goto La4
        L8f:
            lmg r8 = r7.c()
            lld r2 = new lld
            r2.<init>(r7, r6, r9)
            r0.b = r9
            r0.e = r3
            java.lang.Object r9 = r8.b(r2, r0)
            if (r9 == r1) goto Lb8
        La2:
            fcti r9 = (defpackage.fcti) r9
        La4:
            java.lang.Object r8 = r9.a
            lmv r8 = (defpackage.lmv) r8
            java.lang.Object r9 = r9.b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb7
            llp r9 = r7.c
            r9.b(r8)
        Lb7:
            return r8
        Lb8:
            return r1
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.i(boolean, fcxy):java.lang.Object");
    }

    public final Object j(fcxy fcxyVar) {
        return d().c(new lmy(null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088 A[Catch: ljr -> 0x0073, TryCatch #1 {ljr -> 0x0073, blocks: (B:19:0x0053, B:56:0x00e4, B:22:0x005a, B:53:0x00c9, B:30:0x006f, B:40:0x0088, B:42:0x008e, B:37:0x007c, B:50:0x00b8), top: B:80:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119 A[Catch: all -> 0x013f, TryCatch #4 {all -> 0x013f, blocks: (B:62:0x0109, B:64:0x0119, B:65:0x011e), top: B:85:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #4 {all -> 0x013f, blocks: (B:62:0x0109, B:64:0x0119, B:65:0x011e), top: B:85:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(boolean r10, defpackage.fcxy r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.k(boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r11, boolean r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.llm
            if (r0 == 0) goto L13
            r0 = r13
            llm r0 = (defpackage.llm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            llm r0 = new llm
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fdcg r11 = r0.d
            defpackage.fctl.b(r13)
            goto L51
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.fctl.b(r13)
            fdcg r5 = new fdcg
            r5.<init>()
            lmx r13 = r10.d()
            lln r4 = new lln
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r5
            r0.c = r3
            java.lang.Object r11 = r13.d(r4, r0)
            if (r11 == r1) goto L59
            r11 = r5
        L51:
            int r11 = r11.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llo.l(java.lang.Object, boolean, fcxy):java.lang.Object");
    }
}
