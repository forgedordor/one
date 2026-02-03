package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class autm {
    public final cpuw a;
    public final cqce b;
    private final cpmc c;
    private final fdjx d;

    public autm(cpmc cpmcVar, cpuw cpuwVar, fdjx fdjxVar, auso ausoVar, aurx aurxVar, cpmd cpmdVar, ceqp ceqpVar, crmx crmxVar, alrj alrjVar) {
        cpmcVar.getClass();
        fdjxVar.getClass();
        ausoVar.getClass();
        aurxVar.getClass();
        cpmdVar.getClass();
        ceqpVar.getClass();
        crmxVar.getClass();
        alrjVar.getClass();
        this.c = cpmcVar;
        this.a = cpuwVar;
        this.d = fdjxVar;
        this.b = cqce.g("BugleCmsFolsom", "CmsInitialRestoreEncryptionStatusChecker");
    }

    public final eiju a(efwo efwoVar, boolean z, Context context) {
        efwoVar.getClass();
        context.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new autl(this, context, efwoVar, z, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2.a(r9, r10, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdau r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.autj
            if (r0 == 0) goto L13
            r0 = r10
            autj r0 = (defpackage.autj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            autj r0 = new autj
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r10)
            goto L9a
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Boolean r9 = r0.d
            autk r2 = r0.e
            defpackage.fctl.b(r10)
            goto L75
        L3e:
            autk r9 = r0.e
            defpackage.fctl.b(r10)
            goto L5a
        L44:
            defpackage.fctl.b(r10)
            cpmc r10 = r8.c
            eiju r10 = r10.x()
            r2 = r9
            autk r2 = (defpackage.autk) r2
            r0.e = r2
            r0.c = r5
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto L9d
        L5a:
            cpmc r2 = r8.c
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            eiju r2 = r2.w()
            r6 = r9
            autk r6 = (defpackage.autk) r6
            r0.e = r6
            r0.d = r10
            r0.c = r4
            java.lang.Object r2 = defpackage.fdxs.c(r2, r0)
            if (r2 == r1) goto L9d
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L75:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L85
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L84
            goto L85
        L84:
            r5 = 0
        L85:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            r10.getClass()
            r4 = 0
            r0.e = r4
            r0.d = r4
            r0.c = r3
            java.lang.Object r9 = r2.a(r9, r10, r0)
            if (r9 != r1) goto L9a
            goto L9d
        L9a:
            fctx r9 = defpackage.fctx.a
            return r9
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.autm.b(fdau, fcxy):java.lang.Object");
    }
}
