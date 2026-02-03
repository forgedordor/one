package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvmw implements bvmv {
    public final efwo a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final cfdf e;
    public final fcsu f;
    public final fcsu g;
    public final fdjx h;
    public final egej i;
    public final Context j;
    public final fcsu k;
    public final ekrg l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    /* compiled from: PG */
    public interface a {
        bvmw aJ();
    }

    public bvmw(efwo efwoVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cfdf cfdfVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fdjx fdjxVar, egej egejVar, Context context, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15) {
        efwoVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fdjxVar.getClass();
        egejVar.getClass();
        context.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        this.a = efwoVar;
        this.b = fcsuVar;
        this.m = fcsuVar2;
        this.n = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
        this.e = cfdfVar;
        this.o = fcsuVar6;
        this.p = fcsuVar9;
        this.f = fcsuVar10;
        this.g = fcsuVar11;
        this.h = fdjxVar;
        this.i = egejVar;
        this.j = context;
        this.k = fcsuVar12;
        this.q = fcsuVar13;
        this.r = fcsuVar14;
        this.s = fcsuVar15;
        this.l = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl");
    }

    public static final /* synthetic */ void x(bvmw bvmwVar, Throwable th) {
        int i;
        ekrw ekrwVarJ = bvmwVar.l.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "logGaiaPairingDisableFailure", 862, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Error when opting out Gaia device pairing");
        fcsu fcsuVar = bvmwVar.k;
        ((ains) fcsuVar.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        if (th instanceof bvpp) {
            int i2 = ((bvpp) th).b;
            if (i2 == 0) {
                throw null;
            }
            i = i2 - 1;
        } else {
            i = 0;
        }
        ((ains) fcsuVar.b()).e("Bugle.Gaia.Pairing.Disabled.When.Switching.Account.Failure.Count", i);
    }

    private static final String z(bvpe bvpeVar, boolean z) {
        int iOrdinal = bvpeVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return z ? "Bugle.Gaia.Pairing.Enabled.When.Switching.Account.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Switching.Account.Failure.Count";
        }
        if (iOrdinal == 2) {
            return z ? "Bugle.Gaia.Pairing.Enabled.When.Opening.Settings.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Opening.Settings.Failure.Count";
        }
        if (iOrdinal == 3) {
            return z ? "Bugle.Gaia.Pairing.Enabled.When.Resetting.Primary.Device.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Resetting.Primary.Device.Failure.Count";
        }
        if (iOrdinal == 4) {
            return z ? "Bugle.Gaia.Pairing.Enabled.When.Turning.On.Bnr.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Turning.On.Bnr.Failure.Count";
        }
        if (iOrdinal == 5) {
            return z ? "Bugle.Gaia.Pairing.Enabled.When.Disabling.Fi.Sync.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Disabling.Fi.Sync.Failure.Count";
        }
        throw new fctg();
    }

    @Override // defpackage.bvmv
    public final eiju a() throws IOException {
        eiju eijuVarD;
        eieu eieuVarH = eiiy.h("GaiaDevicePairingManagerImpl#bindTachyon");
        try {
            if (!((apro) this.r.b()).a() || ((cqhz) this.q.b()).a()) {
                ekrw ekrwVarH = this.l.h();
                ekrwVarH.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "bindTachyon", 564, "GaiaDevicePairingManagerDelegateImpl.kt")).q("tachyonReceiver startBind");
                eijuVarD = ((cfze) this.f.b()).d();
            } else {
                ekrw ekrwVarH2 = this.l.h();
                ekrwVarH2.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "bindTachyon", 561, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Device data over satellite, skipping start bind");
                eijuVarD = eijx.e(null);
            }
            fczl.a(eieuVarH, null);
            eijuVarD.getClass();
            return eijuVarD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.bvmv
    public final eiju b(String str) {
        str.getClass();
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvmz(str, this, null));
    }

    @Override // defpackage.bvmv
    public final eiju c() {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvod(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x026b, code lost:
    
        if (defpackage.fdxs.c(r1, r2) != r3) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [bvmw] */
    /* JADX WARN: Type inference failed for: r1v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    @Override // defpackage.bvmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.bvmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bvmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bvnf
            if (r0 == 0) goto L13
            r0 = r8
            bvnf r0 = (defpackage.bvnf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnf r0 = new bvnf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)
            goto L54
        L3b:
            defpackage.fctl.b(r8)
            fcsu r8 = r6.c
            java.lang.Object r8 = r8.b()
            bvll r8 = (defpackage.bvll) r8
            eiju r8 = r8.g()
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L89
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5e
        L5c:
            r4 = r5
            goto L84
        L5e:
            fcsu r8 = r6.c
            java.lang.Object r8 = r8.b()
            bvll r8 = (defpackage.bvll) r8
            eiju r8 = r8.e()
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L89
        L74:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5c
            int r0 = r8.length()
            if (r0 <= 0) goto L5c
            boolean r7 = defpackage.fdbq.f(r8, r7)
            if (r7 == 0) goto L5c
        L84:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.f(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (s(r2) == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        if (t(r0, r2) == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        if (v(r2) == r3) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb A[Catch: all -> 0x0082, PHI: r4 r9
      0x00bb: PHI (r4v10 boolean) = (r4v23 boolean), (r4v24 boolean) binds: [B:47:0x00b9, B:29:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r9v6 bvpe) = (r9v21 bvpe), (r9v22 bvpe) binds: [B:47:0x00b9, B:29:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0082, blocks: (B:55:0x00ea, B:57:0x00fc, B:58:0x0105, B:50:0x00d0, B:53:0x00da, B:29:0x0074, B:48:0x00bb, B:32:0x007e, B:46:0x00a5), top: B:76:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[Catch: all -> 0x0082, PHI: r0 r4 r9
      0x00d0: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v1 java.lang.Object) binds: [B:49:0x00ce, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r4v11 boolean) = (r4v21 boolean), (r4v22 boolean) binds: [B:49:0x00ce, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r9v7 bvpe) = (r9v20 bvpe), (r9v14 bvpe) binds: [B:49:0x00ce, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0082, blocks: (B:55:0x00ea, B:57:0x00fc, B:58:0x0105, B:50:0x00d0, B:53:0x00da, B:29:0x0074, B:48:0x00bb, B:32:0x007e, B:46:0x00a5), top: B:76:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:55:0x00ea, B:57:0x00fc, B:58:0x0105, B:50:0x00d0, B:53:0x00da, B:29:0x0074, B:48:0x00bb, B:32:0x007e, B:46:0x00a5), top: B:76:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v8, types: [bvpe] */
    @Override // defpackage.bvmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r17, defpackage.bvpe r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.g(boolean, bvpe, fcxy):java.lang.Object");
    }

    @Override // defpackage.bvmv
    public final Object h(String str, fcxy fcxyVar) throws Throwable {
        Object objC = bvpp.a.c(str, 8, new bvoe(this, null), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.bvmv
    public final Object i(fcxy fcxyVar) throws Throwable {
        Object objB = bvpp.a.b(9, new bvof(this, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.bvmv
    public final eiju j(int i) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvnn(this, i, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (i(r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (u(r9, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bvmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r9, java.lang.String r10, boolean r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.bvnl
            if (r0 == 0) goto L13
            r0 = r12
            bvnl r0 = (defpackage.bvnl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bvnl r0 = new bvnl
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L50
            if (r2 == r7) goto L48
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            defpackage.fctl.b(r12)
            goto La6
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.String r9 = r0.e
            defpackage.fctl.b(r12)
            goto L96
        L40:
            boolean r9 = r0.a
            java.lang.String r10 = r0.e
            defpackage.fctl.b(r12)
            goto L89
        L48:
            boolean r11 = r0.a
            java.lang.String r10 = r0.e
            defpackage.fctl.b(r12)
            goto L74
        L50:
            defpackage.fctl.b(r12)
            fcsu r12 = r8.k
            java.lang.Object r12 = r12.b()
            ains r12 = (defpackage.ains) r12
            int r2 = r9 + (-1)
            if (r9 == 0) goto Lb7
            java.lang.String r9 = "Bugle.Gaia.Pairing.Disabled.Count.By.Reasons"
            r12.e(r9, r2)
            eiju r9 = r8.b(r10)
            r0.e = r10
            r0.a = r11
            r0.d = r7
            java.lang.Object r12 = defpackage.fdxs.c(r9, r0)
            if (r12 == r1) goto Lb6
        L74:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r9 = r12.booleanValue()
            if (r9 == 0) goto Lb3
            r0.e = r10
            r0.a = r11
            r0.d = r6
            java.lang.Object r9 = r8.h(r10, r0)
            if (r9 == r1) goto Lb6
            r9 = r11
        L89:
            if (r9 == 0) goto L95
            r0.e = r10
            r0.d = r5
            java.lang.Object r9 = r8.i(r0)
            if (r9 == r1) goto Lb6
        L95:
            r9 = r10
        L96:
            int r10 = r9.length()
            if (r10 <= 0) goto La6
            r0.e = r3
            r0.d = r4
            java.lang.Object r9 = r8.u(r9, r0)
            if (r9 == r1) goto Lb6
        La6:
            fcsu r9 = r8.k
            java.lang.Object r9 = r9.b()
            ains r9 = (defpackage.ains) r9
            java.lang.String r10 = "Bugle.Gaia.Pairing.Disabled.Count"
            r9.e(r10, r7)
        Lb3:
            fctx r9 = defpackage.fctx.a
            return r9
        Lb6:
            return r1
        Lb7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.k(int, java.lang.String, boolean, fcxy):java.lang.Object");
    }

    @Override // defpackage.bvmv
    public final eiju l(egbv egbvVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvno(egbvVar, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.bvmx
            if (r0 == 0) goto L13
            r0 = r11
            bvmx r0 = (defpackage.bvmx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvmx r0 = new bvmx
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "cleanupQrPairing"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r6 = "BugleGDitto"
            java.lang.String r7 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            defpackage.fctl.b(r11)
            goto Ld5
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            defpackage.fctl.b(r11)
            fcsu r11 = r10.d
            java.lang.Object r11 = r11.b()
            bvkr r11 = (defpackage.bvkr) r11
            defpackage.ecem.b()
            bozw r2 = defpackage.bpab.a()
            java.lang.String r8 = "getQrDesktops"
            r2.A(r8)
            bvjf r8 = new bvjf
            r8.<init>()
            r2.f(r8)
            bozu r2 = r2.b()
            ekgb r2 = r2.z()
            ekgb r11 = r11.k(r2)
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L84
            ekrg r11 = r10.l
            ekrw r11 = r11.h()
            ekrz r0 = defpackage.eksq.a
            r11.X(r0, r6)
            r0 = 390(0x186, float:5.47E-43)
            ekrw r11 = r11.h(r5, r4, r0, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "No QR paired devices to cleanup"
            r11.q(r0)
            fctx r11 = defpackage.fctx.a
            return r11
        L84:
            ekrg r2 = r10.l
            ekrw r2 = r2.h()
            ekrz r8 = defpackage.eksq.a
            r2.X(r8, r6)
            r8 = 393(0x189, float:5.51E-43)
            ekrw r2 = r2.h(r5, r4, r8, r7)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r8 = "Start cleaning up existing QR paired devices"
            r2.q(r8)
            r11.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.fcva.p(r11, r8)
            r2.<init>(r8)
            ekqh r11 = r11.iterator()
        Lae:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto Lcc
            java.lang.Object r8 = r11.next()
            bvix r8 = (defpackage.bvix) r8
            cfdf r9 = r10.e
            bvks r8 = r8.c()
            eiju r8 = r9.b(r8)
            fdkf r8 = defpackage.auvw.e(r8)
            r2.add(r8)
            goto Lae
        Lcc:
            r0.c = r3
            java.lang.Object r11 = defpackage.fdii.a(r2, r0)
            if (r11 != r1) goto Ld5
            return r1
        Ld5:
            ekrg r11 = r10.l
            ekrw r11 = r11.h()
            ekrz r0 = defpackage.eksq.a
            r11.X(r0, r6)
            r0 = 399(0x18f, float:5.59E-43)
            ekrw r11 = r11.h(r5, r4, r0, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "Completed cleaning up existing QR paired devices"
            r11.q(r0)
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.m(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bvna
            if (r0 == 0) goto L13
            r0 = r9
            bvna r0 = (defpackage.bvna) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvna r0 = new bvna
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.d
            defpackage.fctl.b(r9)
            goto L4a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            fcsu r9 = r7.c
            java.lang.Object r9 = r9.b()
            bvll r9 = (defpackage.bvll) r9
            eiju r9 = r9.e()
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto Lc5
        L4a:
            java.lang.String r9 = (java.lang.String) r9
            r0 = 0
            java.lang.String r1 = "disablePairingCore"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r4 = "BugleGDitto"
            java.lang.String r5 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r9 == 0) goto La7
            int r6 = r9.length()
            if (r6 != 0) goto L5e
            goto La7
        L5e:
            boolean r8 = defpackage.fdbq.f(r9, r8)
            if (r8 != 0) goto L83
            ekrg r8 = r7.l
            ekrw r8 = r8.j()
            ekrz r9 = defpackage.eksq.a
            r8.X(r9, r4)
            r9 = 532(0x214, float:7.45E-43)
            ekrw r8 = r8.h(r2, r1, r9, r5)
            ekrd r8 = (defpackage.ekrd) r8
            efwo r9 = r7.a
            java.lang.String r1 = "Cannot disable the Gaia pairing as it is enabled for another account, accountId = %s"
            java.lang.String r9 = r9.toString()
            r8.t(r1, r9)
            goto Lbf
        L83:
            fcsu r8 = r7.c
            java.lang.Object r8 = r8.b()
            bvll r8 = (defpackage.bvll) r8
            r8.m()
            ekrg r8 = r7.l
            ekrw r8 = r8.h()
            ekrz r9 = defpackage.eksq.a
            r8.X(r9, r4)
            r9 = 540(0x21c, float:7.57E-43)
            ekrw r8 = r8.h(r2, r1, r9, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "Gaia device pairing has been disabled"
            r8.q(r9)
            goto Lc0
        La7:
            ekrg r8 = r7.l
            ekrw r8 = r8.j()
            ekrz r9 = defpackage.eksq.a
            r8.X(r9, r4)
            r9 = 526(0x20e, float:7.37E-43)
            ekrw r8 = r8.h(r2, r1, r9, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "No need to disable the Gaia pairing as it is already disabled on the device"
            r8.q(r9)
        Lbf:
            r3 = r0
        Lc0:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.n(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bvnd
            if (r0 == 0) goto L13
            r0 = r5
            bvnd r0 = (defpackage.bvnd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnd r0 = new bvnd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.n
            java.lang.Object r5 = r5.b()
            aurx r5 = (defpackage.aurx) r5
            eiju r5 = r5.r()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.o(fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(8:12|39|13|24|28|(1:34)|35|36)(2:15|16))(1:17))(3:18|(0)|37)|20|41|21|(6:23|24|28|(1:34)(0)|35|36)|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bvng
            if (r0 == 0) goto L13
            r0 = r7
            bvng r0 = (defpackage.bvng) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvng r0 = new bvng
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            auml r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: defpackage.axlg -> L62
            goto L5e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.fctl.b(r7)
            goto L43
        L38:
            defpackage.fctl.b(r7)
            r0.c = r4
            java.lang.Object r7 = r6.o(r0)
            if (r7 == r1) goto L85
        L43:
            auml r7 = (defpackage.auml) r7
            fcsu r2 = r6.m     // Catch: defpackage.axlg -> L61
            java.lang.Object r2 = r2.b()     // Catch: defpackage.axlg -> L61
            axky r2 = (defpackage.axky) r2     // Catch: defpackage.axlg -> L61
            eiju r2 = r2.a()     // Catch: defpackage.axlg -> L61
            r0.d = r7     // Catch: defpackage.axlg -> L61
            r0.c = r3     // Catch: defpackage.axlg -> L61
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)     // Catch: defpackage.axlg -> L61
            if (r0 == r1) goto L85
            r5 = r0
            r0 = r7
            r7 = r5
        L5e:
            efwo r7 = (defpackage.efwo) r7     // Catch: defpackage.axlg -> L62
            goto L63
        L61:
            r0 = r7
        L62:
            r7 = 0
        L63:
            fcsu r1 = r6.n
            java.lang.Object r1 = r1.b()
            aurx r1 = (defpackage.aurx) r1
            aurw r1 = r1.m
            boolean r0 = defpackage.aurw.f(r0)
            r1 = 0
            if (r0 == 0) goto L7f
            if (r7 == 0) goto L7f
            efwo r0 = r6.a
            boolean r7 = defpackage.fdbq.f(r7, r0)
            if (r7 == 0) goto L7f
            goto L80
        L7f:
            r4 = r1
        L80:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.p(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bvnh
            if (r0 == 0) goto L13
            r0 = r5
            bvnh r0 = (defpackage.bvnh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnh r0 = new bvnh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.g
            java.lang.Object r5 = r5.b()
            ceff r5 = (defpackage.ceff) r5
            eiju r5 = r5.p()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L54
        L46:
            ezmt r5 = (defpackage.ezmt) r5
            ezhm r5 = r5.e
            if (r5 != 0) goto L4e
            ezhm r5 = defpackage.ezhm.a
        L4e:
            evtg r5 = r5.b
            r5.getClass()
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.q(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r11.k(2, r10, true, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bvnp
            if (r0 == 0) goto L13
            r0 = r11
            bvnp r0 = (defpackage.bvnp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnp r0 = new bvnp
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.fctl.b(r11)
            goto L7b
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.String r10 = r0.d
            defpackage.fctl.b(r11)
            goto L6a
        L3c:
            java.lang.String r10 = r0.d
            defpackage.fctl.b(r11)
            goto L56
        L42:
            defpackage.fctl.b(r11)
            bvpo r11 = defpackage.bvpp.a
            bvnq r2 = new bvnq
            r2.<init>(r9, r3)
            r0.d = r10
            r0.c = r6
            java.lang.Object r11 = r11.a(r10, r4, r2, r0)
            if (r11 == r1) goto L7e
        L56:
            efwo r11 = (defpackage.efwo) r11
            bvpo r2 = defpackage.bvpp.a
            bvnr r7 = new bvnr
            r7.<init>(r9, r3)
            r0.d = r10
            r0.c = r5
            r8 = 4
            java.lang.Object r11 = r2.a(r11, r8, r7, r0)
            if (r11 == r1) goto L7e
        L6a:
            bvmw$a r11 = (bvmw.a) r11
            bvmw r11 = r11.aJ()
            r0.d = r3
            r0.c = r4
            java.lang.Object r10 = r11.k(r5, r10, r6, r0)
            if (r10 != r1) goto L7b
            goto L7e
        L7b:
            fctx r10 = defpackage.fctx.a
            return r10
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.r(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bvns
            java.lang.String r1 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r0 == 0) goto L15
            r0 = r8
            bvns r0 = (defpackage.bvns) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            bvns r0 = new bvns
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            bvpk r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L5b
        L2b:
            r8 = move-exception
            goto L83
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            bvpk r8 = new bvpk
            r3 = 7
            r8.<init>(r3)
            fcsu r3 = r7.p     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L7f
            bvit r3 = (defpackage.bvit) r3     // Catch: java.lang.Throwable -> L7f
            r5 = 2
            eiju r3 = r3.q(r5)     // Catch: java.lang.Throwable -> L7f
            r3.getClass()     // Catch: java.lang.Throwable -> L7f
            r0.d = r8     // Catch: java.lang.Throwable -> L7f
            r0.c = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = defpackage.fdxs.c(r3, r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == r2) goto L7e
            r6 = r0
            r0 = r8
            r8 = r6
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2b
            ekrg r2 = r7.l     // Catch: java.lang.Throwable -> L2b
            ekrw r2 = r2.h()     // Catch: java.lang.Throwable -> L2b
            ekrz r3 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "BugleGDitto"
            r2.X(r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r4 = "pauseQrPush"
            r5 = 647(0x287, float:9.07E-43)
            ekrw r1 = r2.h(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L2b
            ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "PausePush before opting into Gaia pairing, result = %s"
            r1.t(r2, r8)     // Catch: java.lang.Throwable -> L2b
            fctx r8 = defpackage.fctx.a
            return r8
        L7e:
            return r2
        L7f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L83:
            java.lang.Throwable r8 = r0.initCause(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.s(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bvnt
            java.lang.String r1 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r0 == 0) goto L15
            r0 = r11
            bvnt r0 = (defpackage.bvnt) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            bvnt r0 = new bvnt
            r0.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            bvpk r10 = r0.d
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L2b
            goto L79
        L2b:
            r11 = move-exception
            goto L83
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.fctl.b(r11)
            bvpk r11 = new bvpk
            r3 = 9
            r11.<init>(r3)
            ekrg r3 = r9.l     // Catch: java.lang.Throwable -> L7f
            ekrw r3 = r3.h()     // Catch: java.lang.Throwable -> L7f
            ekrz r5 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = "BugleGDitto"
            r3.X(r5, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r6 = "pushGaiaOptIn"
            r7 = 659(0x293, float:9.23E-43)
            ekrw r1 = r3.h(r5, r6, r7, r1)     // Catch: java.lang.Throwable -> L7f
            ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "Push gaia opt in to all active desktops"
            r1.q(r3)     // Catch: java.lang.Throwable -> L7f
            fcsu r1 = r9.p     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L7f
            bvit r1 = (defpackage.bvit) r1     // Catch: java.lang.Throwable -> L7f
            eiju r10 = r1.f(r10, r4)     // Catch: java.lang.Throwable -> L7f
            r10.getClass()     // Catch: java.lang.Throwable -> L7f
            r0.d = r11     // Catch: java.lang.Throwable -> L7f
            r0.c = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)     // Catch: java.lang.Throwable -> L7f
            if (r10 == r2) goto L7e
            r8 = r11
            r11 = r10
            r10 = r8
        L79:
            java.lang.Void r11 = (java.lang.Void) r11     // Catch: java.lang.Throwable -> L2b
            fctx r10 = defpackage.fctx.a
            return r10
        L7e:
            return r2
        L7f:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L83:
            java.lang.Throwable r10 = r10.initCause(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.t(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.bvnu
            if (r0 == 0) goto L13
            r0 = r13
            bvnu r0 = (defpackage.bvnu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnu r0 = new bvnu
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "pushGaiaOptOutAndResumeQr"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "BugleGDitto"
            r6 = 1
            r7 = 2
            java.lang.String r8 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r2 == 0) goto L49
            if (r2 == r6) goto L40
            if (r2 != r7) goto L38
            bvpp r12 = r0.d
            defpackage.fctl.b(r13)     // Catch: java.lang.Throwable -> L35
            goto Laa
        L35:
            r13 = move-exception
            goto Lc7
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            bvpp r12 = r0.d
            defpackage.fctl.b(r13)     // Catch: java.lang.Throwable -> L46
            goto L88
        L46:
            r13 = move-exception
            goto Ld1
        L49:
            defpackage.fctl.b(r13)
            ekrg r13 = r11.l
            ekrw r13 = r13.h()
            ekrz r2 = defpackage.eksq.a
            r13.X(r2, r5)
            r2 = 288(0x120, float:4.04E-43)
            ekrw r13 = r13.h(r4, r3, r2, r8)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r2 = "Pushing Gaia opt out to all active desktops"
            r13.q(r2)
            bvpp r13 = new bvpp
            r2 = 10
            r13.<init>(r2)
            fcsu r2 = r11.p     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lcd
            bvit r2 = (defpackage.bvit) r2     // Catch: java.lang.Throwable -> Lcd
            r9 = 0
            eiju r12 = r2.f(r12, r9)     // Catch: java.lang.Throwable -> Lcd
            r12.getClass()     // Catch: java.lang.Throwable -> Lcd
            r0.d = r13     // Catch: java.lang.Throwable -> Lcd
            r0.c = r6     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r12 = defpackage.fdxs.c(r12, r0)     // Catch: java.lang.Throwable -> Lcd
            if (r12 == r1) goto Lcc
            r10 = r13
            r13 = r12
            r12 = r10
        L88:
            java.lang.Void r13 = (java.lang.Void) r13     // Catch: java.lang.Throwable -> L46
            bvpp r12 = new bvpp
            r13 = 11
            r12.<init>(r13)
            fcsu r13 = r11.p     // Catch: java.lang.Throwable -> L35
            java.lang.Object r13 = r13.b()     // Catch: java.lang.Throwable -> L35
            bvit r13 = (defpackage.bvit) r13     // Catch: java.lang.Throwable -> L35
            eiju r13 = r13.r(r7)     // Catch: java.lang.Throwable -> L35
            r13.getClass()     // Catch: java.lang.Throwable -> L35
            r0.d = r12     // Catch: java.lang.Throwable -> L35
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            java.lang.Object r13 = defpackage.fdxs.c(r13, r0)     // Catch: java.lang.Throwable -> L35
            if (r13 == r1) goto Lcc
        Laa:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L35
            ekrg r0 = r11.l     // Catch: java.lang.Throwable -> L35
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> L35
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L35
            r0.X(r1, r5)     // Catch: java.lang.Throwable -> L35
            r1 = 311(0x137, float:4.36E-43)
            ekrw r0 = r0.h(r4, r3, r1, r8)     // Catch: java.lang.Throwable -> L35
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "ResumePush after opting out of Gaia pairing, result = %s"
            r0.t(r1, r13)     // Catch: java.lang.Throwable -> L35
            fctx r12 = defpackage.fctx.a
            return r12
        Lc7:
            java.lang.Throwable r12 = r12.initCause(r13)
            throw r12
        Lcc:
            return r1
        Lcd:
            r12 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        Ld1:
            java.lang.Throwable r12 = r12.initCause(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.u(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.bvnw
            if (r0 == 0) goto L13
            r0 = r9
            bvnw r0 = (defpackage.bvnw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnw r0 = new bvnw
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "resumeQrPush"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "BugleGDitto"
            r6 = 1
            java.lang.String r7 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L2f:
            r9 = move-exception
            goto L70
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            defpackage.fctl.b(r9)
            fcsu r9 = r8.p     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> L2f
            bvit r9 = (defpackage.bvit) r9     // Catch: java.lang.Throwable -> L2f
            r2 = 2
            eiju r9 = r9.r(r2)     // Catch: java.lang.Throwable -> L2f
            r9.getClass()     // Catch: java.lang.Throwable -> L2f
            r0.c = r6     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2f
            ekrg r0 = r8.l     // Catch: java.lang.Throwable -> L2f
            ekrw r0 = r0.h()     // Catch: java.lang.Throwable -> L2f
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2f
            r0.X(r1, r5)     // Catch: java.lang.Throwable -> L2f
            r1 = 676(0x2a4, float:9.47E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)     // Catch: java.lang.Throwable -> L2f
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "ResumePush on Gaia pairing opt in error, result = %s"
            r0.t(r1, r9)     // Catch: java.lang.Throwable -> L2f
            goto L8e
        L70:
            ekrg r0 = r8.l
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r9 = r0.g(r9)
            r0 = 678(0x2a6, float:9.5E-43)
            ekrw r9 = r9.h(r4, r3, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Failed to resume QR push on Gaia pairing opt in"
            r9.q(r0)
        L8e:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.v(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r9, java.lang.String r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bvnx
            if (r0 == 0) goto L13
            r0 = r11
            bvnx r0 = (defpackage.bvnx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvnx r0 = new bvnx
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "skipDisablingGaiaPairing"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "BugleGDitto"
            r6 = 1
            java.lang.String r7 = "GaiaDevicePairingManagerDelegateImpl.kt"
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            defpackage.fctl.b(r11)
            goto L70
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            defpackage.fctl.b(r11)
            java.lang.String r11 = "pseudonymous"
            boolean r9 = defpackage.fdbq.f(r9, r11)
            if (r9 == 0) goto L5f
            ekrg r9 = r8.l
            ekrw r9 = r9.j()
            ekrz r10 = defpackage.eksq.a
            r9.X(r10, r5)
            r10 = 844(0x34c, float:1.183E-42)
            ekrw r9 = r9.h(r4, r3, r10, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "No need to opt out Gaia pairing for pseudonymous account"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L5f:
            bvpo r9 = defpackage.bvpp.a
            bvny r11 = new bvny
            r2 = 0
            r11.<init>(r8, r2)
            r0.c = r6
            r2 = 6
            java.lang.Object r11 = r9.a(r10, r2, r11, r0)
            if (r11 == r1) goto L9b
        L70:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 != 0) goto L95
            ekrg r9 = r8.l
            ekrw r9 = r9.h()
            ekrz r10 = defpackage.eksq.a
            r9.X(r10, r5)
            r10 = 855(0x357, float:1.198E-42)
            ekrw r9 = r9.h(r4, r3, r10, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "No need to opt out Gaia pairing as it is already off"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L95:
            r9 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvmw.w(java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }

    public final Object y(String str) throws IOException {
        bvmt bvmtVar;
        eieu eieuVarH = eiiy.h("GaiaDevicePairingManagerImpl#findExistingPairingType");
        try {
            fcsu fcsuVar = this.d;
            if (((bvkr) fcsuVar.b()).a() == 0) {
                ekrw ekrwVarE = this.l.e();
                ekrwVarE.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 789, "GaiaDevicePairingManagerDelegateImpl.kt")).q("No existing pairing.");
                bvmtVar = bvmt.a;
            } else if (str != null && ((bvkr) fcsuVar.b()).p(Optional.of(str))) {
                ekrw ekrwVarE2 = this.l.e();
                ekrwVarE2.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 794, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Existing pairings are Gaia pairings");
                bvmtVar = bvmt.c;
            } else if (((bvkr) fcsuVar.b()).q()) {
                ekrw ekrwVarE3 = this.l.e();
                ekrwVarE3.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 798, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Existing pairings are QR pairings");
                bvmtVar = bvmt.b;
            } else {
                ekrw ekrwVarE4 = this.l.e();
                ekrwVarE4.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarE4.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 802, "GaiaDevicePairingManagerDelegateImpl.kt")).q("No existing pairing for the current account.");
                bvmtVar = bvmt.a;
            }
            fczl.a(eieuVarH, null);
            return bvmtVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }
}
