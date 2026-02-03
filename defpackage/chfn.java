package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfn implements cgxk {
    private final cmnp a;
    private final awxo b;
    private final asro c;
    private final cgxm d;

    public chfn(cmnp cmnpVar, awxo awxoVar, asro asroVar) {
        cmnpVar.getClass();
        awxoVar.getClass();
        asroVar.getClass();
        this.a = cmnpVar;
        this.b = awxoVar;
        this.c = asroVar;
        this.d = new cgxm("SendChatMessageInterceptor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.cgxk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.chfs r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chfn.c(chfs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.axcm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chfm
            if (r0 == 0) goto L13
            r0 = r6
            chfm r0 = (defpackage.chfm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chfm r0 = new chfm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            awxo r6 = r4.b
            r0.c = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 == r1) goto L4f
        L3c:
            alqm r6 = (defpackage.alqm) r6
            if (r6 == 0) goto L4d
            j$.util.Optional r5 = r6.e()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = defpackage.fdct.b(r5)
            aubq r5 = (defpackage.aubq) r5
            return r5
        L4d:
            r5 = 0
            return r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chfn.d(axcm, fcxy):java.lang.Object");
    }
}
