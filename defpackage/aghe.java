package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghe implements afyw {
    public final Optional a;
    private final fdjx b;
    private final ddnn c;
    private final dnhb d;
    private final crma e;

    public aghe(Optional optional, fdjx fdjxVar, ddnn ddnnVar, dnhb dnhbVar, crma crmaVar) {
        optional.getClass();
        fdjxVar.getClass();
        ddnnVar.getClass();
        crmaVar.getClass();
        this.a = optional;
        this.b = fdjxVar;
        this.c = ddnnVar;
        this.d = dnhbVar;
        this.e = crmaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aghb
            if (r0 == 0) goto L13
            r0 = r6
            aghb r0 = (defpackage.aghb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aghb r0 = new aghb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            ddnn r6 = r5.c
            r2 = 100
            defn r6 = r6.c(r2)
            aggz r2 = new aggz
            r2.<init>()
            agha r4 = new agha
            r4.<init>()
            r6.a(r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.febo.a(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            android.location.Location r6 = (android.location.Location) r6
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghe.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r7.invoke(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.afyw
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aggy r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aghc
            if (r0 == 0) goto L13
            r0 = r8
            aghc r0 = (defpackage.aghc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aghc r0 = new aghc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            aggy r7 = r0.d
            defpackage.fctl.b(r8)
            goto L5a
        L38:
            defpackage.fctl.b(r8)
            j$.util.Optional r8 = r6.a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L44
            goto L86
        L44:
            boolean r8 = r7.a
            if (r8 == 0) goto L61
            dnhb r8 = r6.d
            dngy r2 = defpackage.dngy.b
            java.util.List r2 = defpackage.fcva.b(r2)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 == r1) goto L85
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L67
        L61:
            crma r8 = r6.e
            boolean r8 = r8.i()
        L67:
            if (r8 == 0) goto L86
            fdjx r8 = r6.b
            aghd r2 = new aghd
            r4 = 0
            r2.<init>(r6, r4)
            r5 = 3
            defpackage.auvw.k(r8, r4, r4, r2, r5)
            boolean r8 = r7.a
            if (r8 == 0) goto L86
            fdap r7 = r7.b
            r0.d = r4
            r0.c = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghe.a(aggy, fcxy):java.lang.Object");
    }
}
