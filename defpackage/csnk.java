package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnk implements csng {
    public final fcsu a;
    private final Context b;
    private final ecjh c;
    private final csme d;

    public csnk(Context context, ecjh ecjhVar, csme csmeVar, fcsu fcsuVar) {
        context.getClass();
        ecjhVar.getClass();
        csmeVar.getClass();
        this.b = context;
        this.c = ecjhVar;
        this.d = csmeVar;
        this.a = fcsuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (defpackage.crrj.b(r10, r2, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.csng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.csni
            if (r0 == 0) goto L13
            r0 = r10
            csni r0 = (defpackage.csni) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csni r0 = new csni
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r10)
            goto La2
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            defpackage.fctl.b(r10)
            goto L8a
        L38:
            defpackage.fctl.b(r10)
            csme r10 = r9.d
            boolean r10 = r10.b()
            if (r10 == 0) goto Lad
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6b
            r2 = 33
            java.lang.String r6 = "com.google.android.safetycore"
            if (r10 < r2) goto L5b
            android.content.Context r10 = r9.b     // Catch: java.lang.Throwable -> L6b
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L6b
            r7 = 0
            android.content.pm.PackageManager$PackageInfoFlags r2 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m549m(r7)     // Catch: java.lang.Throwable -> L6b
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r10, r6, r2)     // Catch: java.lang.Throwable -> L6b
            goto L66
        L5b:
            android.content.Context r10 = r9.b     // Catch: java.lang.Throwable -> L6b
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L6b
            r2 = 128(0x80, float:1.794E-43)
            r10.getPackageInfo(r6, r2)     // Catch: java.lang.Throwable -> L6b
        L66:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L6b
            goto L70
        L6b:
            r10 = move-exception
            java.lang.Object r10 = defpackage.fctl.a(r10)
        L70:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r6 = r10 instanceof defpackage.fctj
            if (r5 != r6) goto L79
            r10 = r2
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L82
            goto Lad
        L82:
            r0.c = r5
            java.lang.Object r10 = r9.b(r0)
            if (r10 == r1) goto Lac
        L8a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La7
            ecjh r10 = r9.c
            csnh r2 = new csnh
            r2.<init>()
            r0.c = r3
            java.lang.Object r10 = defpackage.crrj.b(r10, r2, r0)
            if (r10 != r1) goto La2
            goto Lac
        La2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            return r10
        La7:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            return r10
        Lac:
            return r1
        Lad:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnk.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.csnj
            if (r0 == 0) goto L13
            r0 = r6
            csnj r0 = (defpackage.csnj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csnj r0 = new csnj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Instant r0 = r0.d
            defpackage.fctl.b(r6)
            goto L56
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r5.a
            java.lang.Object r6 = r6.b()
            cogw r6 = (defpackage.cogw) r6
            j$.time.Instant r6 = r6.f()
            ecjh r2 = r5.c
            com.google.common.util.concurrent.ListenableFuture r2 = r2.a()
            r2.getClass()
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L82
            r4 = r0
            r0 = r6
            r6 = r4
        L56:
            csnm r6 = (defpackage.csnm) r6
            long r1 = r6.b
            j$.time.Instant r6 = j$.time.Instant.ofEpochMilli(r1)
            j$.time.Duration r6 = j$.time.Duration.between(r6, r0)
            cczv r0 = defpackage.crtr.D
            java.lang.Object r0 = r0.e()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            j$.time.Duration r0 = defpackage.eoob.b(r0)
            int r6 = r6.compareTo(r0)
            if (r6 <= 0) goto L7c
            goto L7d
        L7c:
            r3 = 0
        L7d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnk.b(fcxy):java.lang.Object");
    }
}
