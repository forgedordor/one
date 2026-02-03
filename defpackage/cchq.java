package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cchq {
    public final cmfo a;
    public final int b;
    private final String c;

    public cchq(cmgk cmgkVar, String str, int i) {
        cmgkVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.c = str;
        this.b = i;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.MLS_SELF_PARTICIPANT_STATE);
        cmggVarC.g(str);
        cmggVarC.b(true);
        cmggVarC.f(cchj.a);
        this.a = cmgkVar.a(cmggVarC.a());
    }

    public static final String e(int i, int i2) {
        return ccin.a(i) + "_" + cccs.a(i2);
    }

    public final Object a(fcxy fcxyVar) {
        return c(3, fcxyVar);
    }

    public final Object b(fcxy fcxyVar) {
        return d(3, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccho
            if (r0 == 0) goto L13
            r0 = r6
            ccho r0 = (defpackage.ccho) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccho r0 = new ccho
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = e(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L68
        L46:
            cchj r6 = (defpackage.cchj) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            cchi r5 = (defpackage.cchi) r5
            if (r5 == 0) goto L66
            ccio r6 = new ccio
            evqs r0 = r5.d
            r0.getClass()
            evqs r5 = r5.e
            r5.getClass()
            r6.<init>(r0, r5)
            return r6
        L66:
            r5 = 0
            return r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cchq.c(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cchp
            if (r0 == 0) goto L13
            r0 = r6
            cchp r0 = (defpackage.cchp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cchp r0 = new cchp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            int r6 = r4.b
            java.lang.String r5 = e(r5, r6)
            cmfo r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L68
        L46:
            cchj r6 = (defpackage.cchj) r6
            evub r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            cchi r5 = (defpackage.cchi) r5
            if (r5 == 0) goto L66
            ccio r6 = new ccio
            evqs r0 = r5.b
            r0.getClass()
            evqs r5 = r5.c
            r5.getClass()
            r6.<init>(r0, r5)
            return r6
        L66:
            r5 = 0
            return r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cchq.d(int, fcxy):java.lang.Object");
    }
}
