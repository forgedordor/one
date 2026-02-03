package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avco implements cldt, cldy, cldw {
    public static final eksp a = eksp.c("BugleContacts");
    public final fdjx b;
    public final fcsu c;
    public final crnp d;
    public final fcsu e;
    public final fcsu f;
    public final AtomicBoolean g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;

    public avco(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, crnp crnpVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        crnpVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        this.b = fdjxVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.c = fcsuVar3;
        this.d = crnpVar;
        this.j = fcsuVar4;
        this.e = fcsuVar5;
        this.k = fcsuVar6;
        this.f = fcsuVar7;
        this.l = fcsuVar8;
        this.m = fcsuVar9;
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
    
        if (r12 != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
    
        if (r11.b(r0) == r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
    
        if (r11.b(r0) == r1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avco.a(boolean, fcxy):java.lang.Object");
    }

    @Override // defpackage.cldt
    public final void b() {
        auvw.k(this.b, null, null, new avch(this, null), 3);
    }

    @Override // defpackage.cldy
    public final void c() {
        auvw.k(this.b, null, null, new avck(this, null), 3);
    }

    @Override // defpackage.cldw
    public final eiju d(boolean z) {
        if (z) {
            auvw.k(this.b, null, null, new avcj(this, null), 3);
        } else {
            ((eksl) a.h()).q("Default SMS app is not bugle.");
            auvw.k(this.b, null, null, new avci(this, null), 3);
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.avcm
            if (r0 == 0) goto L13
            r0 = r6
            avcm r0 = (defpackage.avcm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avcm r0 = new avcm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r0 = r0.d
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r6 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            fcyh r6 = r0.u()
            boolean r6 = defpackage.eicg.b(r6)
            if (r6 == 0) goto L63
            java.lang.String r6 = "ContactsSyncScheduler#scheduleOneOffImport"
            eieu r6 = defpackage.eiiy.h(r6)
            r0.d = r6     // Catch: java.lang.Throwable -> L59
            r0.c = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r5.a(r3, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == r1) goto L58
            r0 = r6
        L51:
            r6 = 0
            defpackage.fczl.a(r0, r6)
            fctx r6 = defpackage.fctx.a
            return r6
        L58:
            return r1
        L59:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L5d:
            throw r6     // Catch: java.lang.Throwable -> L5e
        L5e:
            r1 = move-exception
            defpackage.fczl.a(r0, r6)
            throw r1
        L63:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avco.e(fcxy):java.lang.Object");
    }

    public final Object f(fcxy fcxyVar) {
        if (((avbt) this.j.b()).a()) {
            egsj egsjVarN = egsn.n(avby.class);
            egsjVarN.g(new egsb("ContactsSyncPeriodicImportScheduler", pzy.c));
            pzh pzhVar = new pzh();
            pzhVar.a = true;
            egsjVarN.d(pzhVar.a());
            Object objB = this.k.b();
            objB.getClass();
            egsjVarN.e(new egrz(new egsa(((Number) objB).longValue(), TimeUnit.HOURS), ejud.a));
            egsn egsnVarH = egsjVarN.h();
            ((eksl) a.h()).q("Enqueueing periodic contacts import work.");
            Object objC = fdxs.c(((egsh) this.e.b()).c(egsnVarH), fcxyVar);
            if (objC == fcyl.a) {
                return objC;
            }
        }
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (defpackage.fdxs.c(r8, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.avcn
            if (r0 == 0) goto L13
            r0 = r8
            avcn r0 = (defpackage.avcn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avcn r0 = new avcn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r8)
            goto Lab
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.fctl.b(r8)
            goto L4a
        L37:
            defpackage.fctl.b(r8)
            fcsu r8 = r7.m
            java.lang.Object r8 = r8.b()
            avlr r8 = (defpackage.avlr) r8
            r0.c = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 == r1) goto Lae
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L53
            goto Lab
        L53:
            java.lang.Class<avmk> r8 = defpackage.avmk.class
            egsj r8 = defpackage.egsn.n(r8)
            pzy r2 = defpackage.pzy.c
            egsb r4 = new egsb
            java.lang.String r5 = "WorkProfileContactsPeriodicSync"
            r4.<init>(r5, r2)
            r8.g(r4)
            fcsu r2 = r7.l
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            egsa r6 = new egsa
            r6.<init>(r4, r2)
            egrz r2 = new egrz
            ejud r4 = defpackage.ejud.a
            r2.<init>(r6, r4)
            r8.e(r2)
            egsn r8 = r8.h()
            eksp r2 = defpackage.avco.a
            ekrw r2 = r2.h()
            eksl r2 = (defpackage.eksl) r2
            java.lang.String r4 = "Enqueueing work profile contacts sync work."
            r2.q(r4)
            fcsu r2 = r7.e
            java.lang.Object r2 = r2.b()
            egsh r2 = (defpackage.egsh) r2
            com.google.common.util.concurrent.ListenableFuture r8 = r2.c(r8)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto Lab
            goto Lae
        Lab:
            fctx r8 = defpackage.fctx.a
            return r8
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avco.g(fcxy):java.lang.Object");
    }
}
