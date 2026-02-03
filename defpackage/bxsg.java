package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsg implements bxrw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/search/appsearch/LegacyIcingIndexerImpl");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final byav e;

    public bxsg(fdjx fdjxVar, byav byavVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        byavVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.e = byavVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.bxrw
    public final eiju a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bxrx(this, null));
    }

    @Override // defpackage.bxrw
    public final eiju b(int i, Set set) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bxsa(this, set, i, null));
    }

    @Override // defpackage.bxrw
    public final eiju c(int i, Set set) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bxse(this, set, i, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bxsb
            if (r0 == 0) goto L13
            r0 = r8
            bxsb r0 = (defpackage.bxsb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bxsb r0 = new bxsb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dzub r7 = r0.d
            defpackage.fctl.b(r8)
            goto L67
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            byav r8 = r6.e
            fcsu r2 = r6.b
            dzub r8 = r8.a()
            java.lang.Object r2 = r2.b()
            esab r2 = (defpackage.esab) r2
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r7 = r7.toArray(r4)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r4 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String[] r7 = (java.lang.String[]) r7
            defn r7 = r2.a(r7)
            com.google.common.util.concurrent.ListenableFuture r7 = defpackage.drgi.a(r7)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L71
            r5 = r8
            r8 = r7
            r7 = r5
        L67:
            java.lang.Void r8 = (java.lang.Void) r8
            byav r8 = r6.e
            r8.b(r7)
            fctx r7 = defpackage.fctx.a
            return r7
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxsg.d(java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.Set r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bxsf
            if (r0 == 0) goto L13
            r0 = r8
            bxsf r0 = (defpackage.bxsf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bxsf r0 = new bxsf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dzub r7 = r0.d
            defpackage.fctl.b(r8)
            goto L67
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            byav r8 = r6.e
            fcsu r2 = r6.b
            dzub r8 = r8.a()
            java.lang.Object r2 = r2.b()
            esab r2 = (defpackage.esab) r2
            r4 = 0
            esal[] r4 = new defpackage.esal[r4]
            java.lang.Object[] r7 = r7.toArray(r4)
            esal[] r7 = (defpackage.esal[]) r7
            int r4 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            esal[] r7 = (defpackage.esal[]) r7
            defn r7 = r2.c(r7)
            com.google.common.util.concurrent.ListenableFuture r7 = defpackage.drgi.a(r7)
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L71
            r5 = r8
            r8 = r7
            r7 = r5
        L67:
            java.lang.Void r8 = (java.lang.Void) r8
            byav r8 = r6.e
            r8.c(r7)
            fctx r7 = defpackage.fctx.a
            return r7
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxsg.e(java.util.Set, fcxy):java.lang.Object");
    }
}
