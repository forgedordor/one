package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dode implements dpyb {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/gifsticker/ui/screen/search/GifStickerSearchRenderer");
    public final fdjx b;
    public final doam c;
    public final dobm d;
    public final fdat e;
    public final fdat f;
    public final fdap g;
    public final fdae h;
    public fdlr i;
    public fdlr j;
    public final dpxz k;
    public final docs l;
    private final fcsu m;
    private final int n;
    private final fdap o = new fdap() { // from class: doct
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return fctx.a;
        }
    };
    private final dpxy p;
    private final fctc q;

    public dode(fdjx fdjxVar, doam doamVar, fcsu fcsuVar, dobm dobmVar, int i, docs docsVar, fdat fdatVar, fdat fdatVar2, fdap fdapVar, fdae fdaeVar) {
        this.b = fdjxVar;
        this.c = doamVar;
        this.m = fcsuVar;
        this.d = dobmVar;
        this.l = docsVar;
        this.e = fdatVar;
        this.f = fdatVar2;
        this.g = fdapVar;
        this.h = fdaeVar;
        this.n = i;
        this.p = dobmVar.e() ? (dpxy) fcsuVar.b() : new docx();
        this.k = new dodd(this);
        this.q = fctd.a(new fdae() { // from class: docu
            @Override // defpackage.fdae
            public final Object invoke() {
                dode dodeVar = this.a;
                if (dodeVar.d.c()) {
                    return new docv(dodeVar);
                }
                return null;
            }
        });
    }

    @Override // defpackage.dpyb
    public final int a() {
        return this.n;
    }

    @Override // defpackage.dpyb
    public final dpxt b() {
        return (dpxt) this.q.a();
    }

    @Override // defpackage.dpyb
    public final dpxy c() {
        return this.p;
    }

    @Override // defpackage.dpyb
    public final dpxz d() {
        return this.k;
    }

    @Override // defpackage.dpyb
    public final fdap e() {
        return this.o;
    }

    @Override // defpackage.dpyb
    public final /* synthetic */ void f() {
        dpya.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.docw
            if (r0 == 0) goto L13
            r0 = r7
            docw r0 = (defpackage.docw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            docw r0 = new docw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4c
        L36:
            defpackage.fctl.b(r7)
            boolean r7 = defpackage.fdgn.H(r6)
            if (r4 != r7) goto L40
            r6 = 0
        L40:
            if (r6 == 0) goto L52
            doam r7 = r5.c
            r0.c = r4
            java.lang.Object r7 = r7.f(r6, r0)
            if (r7 == r1) goto L80
        L4c:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L51
            goto L52
        L51:
            return r7
        L52:
            doam r6 = r5.c
            r0.c = r3
            java.lang.Object r7 = r6.d(r0)
            if (r7 == r1) goto L80
        L5c:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.fcva.p(r7, r0)
            r6.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L6d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r7.next()
            doan r0 = (defpackage.doan) r0
            java.lang.String r0 = r0.a
            r6.add(r0)
            goto L6d
        L7f:
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dode.g(java.lang.String, fcxy):java.lang.Object");
    }
}
