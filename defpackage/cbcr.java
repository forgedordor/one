package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcr {
    public static final cczv a = cdag.k(cdag.b, "network_callback_no_network_timeout_millis", 400);
    public final askl b;
    public final fduf c;
    public final fdue d;
    private final cbcq e;

    public cbcr(ConnectivityManager connectivityManager, askl asklVar, fdjx fdjxVar) {
        connectivityManager.getClass();
        fdjxVar.getClass();
        this.b = asklVar;
        this.c = fdvf.a(fcvp.a);
        this.d = fdun.e(1, 0, 0, 6);
        cbcq cbcqVar = new cbcq(this, connectivityManager);
        this.e = cbcqVar;
        connectivityManager.registerDefaultNetworkCallback(cbcqVar);
        auvw.k(fdjxVar, null, null, new cbcm(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbcn
            if (r0 == 0) goto L13
            r0 = r6
            cbcn r0 = (defpackage.cbcn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbcn r0 = new cbcn
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            fdue r6 = r5.d
            r0.c = r4
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L5a
        L43:
            fduf r6 = r5.c
            r0.c = r3
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 != r1) goto L4e
            goto L5a
        L4e:
            java.util.Map r6 = (java.util.Map) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbcr.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbco
            if (r0 == 0) goto L13
            r0 = r6
            cbco r0 = (defpackage.cbco) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbco r0 = new cbco
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            fdue r6 = r5.d
            r0.c = r4
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L7f
        L43:
            fduf r6 = r5.c
            r0.c = r3
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L7f
        L4d:
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L58
        L56:
            r4 = r1
            goto L7a
        L58:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.net.NetworkCapabilities r0 = (android.net.NetworkCapabilities) r0
            r2 = 18
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L60
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbcr.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbcp
            if (r0 == 0) goto L13
            r0 = r6
            cbcp r0 = (defpackage.cbcp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbcp r0 = new cbcp
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            fdue r6 = r5.d
            r0.c = r4
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L7f
        L43:
            fduf r6 = r5.c
            r0.c = r3
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L7f
        L4d:
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L58
        L56:
            r4 = r1
            goto L7a
        L58:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.net.NetworkCapabilities r0 = (android.net.NetworkCapabilities) r0
            r2 = 11
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L60
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbcr.c(fcxy):java.lang.Object");
    }
}
