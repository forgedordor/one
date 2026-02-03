package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcf implements cbbl {
    public static final cczi a = cdag.b("force_scheduler_v2_for_tests", false);
    private static final cqce f = cqce.g("BugleWorkQueue", "WorkQueueMigrationLatchImpl");
    public final fcsu b;
    public final fcsu c;
    public final fdjx d;
    public final fdjx e;
    private final fctc g;
    private final fctc h;

    public cbcf(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fdjx fdjxVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fdjxVar;
        this.e = fdjxVar2;
        this.g = fctd.a(new fdae() { // from class: cbbo
            @Override // defpackage.fdae
            public final Object invoke() {
                ecem.b();
                cmgk cmgkVar = (cmgk) this.a.c.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.PWQ_SCHEDULER_MIGRATION);
                cmggVarC.f(cbcl.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
        this.h = fctd.a(new fdae() { // from class: cbbp
            @Override // defpackage.fdae
            public final Object invoke() {
                fduf fdufVarA = fdvf.a(fcvp.a);
                cbcf cbcfVar = this.a;
                auvw.k(cbcfVar.e, null, null, new cbcb(cbcfVar, fdufVarA, null), 3);
                return fdufVarA;
            }
        });
    }

    private final fdvc i() {
        return (fdvc) this.h.a();
    }

    @Override // defpackage.cbbl
    public final cbbk a(String str) {
        str.getClass();
        if (((Boolean) a.e()).booleanValue()) {
            return cbbk.b;
        }
        Map map = (Map) i().c();
        if (map == null) {
            return null;
        }
        return (cbbk) map.get(str);
    }

    @Override // defpackage.cbbl
    public final cbbk b(final String str) {
        if (!((Boolean) a.e()).booleanValue()) {
            fcsu fcsuVarH = (fcsu) ((Map) this.b.b()).get(str);
            if (fcsuVarH == null) {
                fcsuVarH = h(str);
            }
            if (((caxl) ((cazg) fcsuVarH.b()).a()).j) {
                if (!((cbcl) e().l()).b.contains(str)) {
                    if (!cbbr.a(str)) {
                        cqbd cqbdVarC = f.c();
                        cqbdVarC.I("Migrated to Scheduler V2 in transaction");
                        cqbdVarC.A("handlerKey", str);
                        cqbdVarC.r();
                        return cbbk.b;
                    }
                }
            }
            return cbbk.a;
        }
        return cbbk.b;
    }

    @Override // defpackage.cbbl
    public final eiju c(cbbk cbbkVar) {
        cbbkVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbbt(this, cbbkVar, null));
    }

    @Override // defpackage.cbbl
    public final Object d(String str, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d.hE()), new cbce(null, this, str), fcxyVar);
    }

    public final cmfo e() {
        return (cmfo) this.g.a();
    }

    public final Object f(fcxy fcxyVar) {
        return fdtc.a(new cbbw(i()), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (defpackage.fdtc.b(r8, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(final java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cbcc
            if (r0 == 0) goto L13
            r0 = r8
            cbcc r0 = (defpackage.cbcc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbcc r0 = new cbcc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "handlerKey"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)
            goto L78
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.String r7 = r0.d
            defpackage.fctl.b(r8)
            goto L52
        L3c:
            defpackage.fctl.b(r8)
            cmfo r8 = r6.e()
            cbbn r2 = new cbbn
            r2.<init>()
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r8.d(r2, r0)
            if (r8 == r1) goto L8c
        L52:
            cqce r8 = defpackage.cbcf.f
            cqbd r8 = r8.c()
            java.lang.String r2 = "Migrated to Scheduler V2. Waiting for sync"
            r8.I(r2)
            r8.A(r3, r7)
            r8.r()
            fdvc r8 = r6.i()
            cbcd r2 = new cbcd
            r5 = 0
            r2.<init>(r7, r5)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fdtc.b(r8, r2, r0)
            if (r8 != r1) goto L78
            goto L8c
        L78:
            cqce r8 = defpackage.cbcf.f
            cqbd r8 = r8.d()
            java.lang.String r0 = "Migration synced"
            r8.I(r0)
            r8.A(r3, r7)
            r8.r()
            fctx r7 = defpackage.fctx.a
            return r7
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbcf.g(java.lang.String, fcxy):java.lang.Object");
    }

    public final fcsu h(String str) {
        fcsu fcsuVar = (fcsu) ((Map) this.b.b()).get("__UNHANDLED_HANDLER");
        if (fcsuVar != null) {
            return fcsuVar;
        }
        throw new IllegalArgumentException("Invalid handler key and no unhandled handler: ".concat(str));
    }
}
