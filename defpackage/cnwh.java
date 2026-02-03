package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnwh implements cmqf {
    private static final cqce e = cqce.g("Bugle", "ForwardSyncManager");
    public final fcsu c;
    public final fcsu d;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final Context k;
    private final fdjx l;
    private boolean m;

    public cnwh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, Context context, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        context.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = context;
        this.l = fdjxVar;
        this.m = true;
    }

    public final List A() {
        ArrayList arrayList = new ArrayList();
        if (!this.m) {
            e.p("Forward Sync manually disabled");
        }
        if (!this.m) {
            arrayList.add(enqm.SYNC_DISABLED);
        }
        ArrayList arrayList2 = new ArrayList();
        Optional optional = (Optional) ((eyig) this.g).a;
        if (optional.isPresent() && !((crnp) this.f.b()).e()) {
            arrayList2.add(enqm.NON_SMS_CAPABLE_WEAR_DEVICE);
        }
        fcsu fcsuVar = this.f;
        if (!((crnp) fcsuVar.b()).d()) {
            arrayList2.add(enqm.BUGLE_NOT_DEFAULT_SMS_APP);
        }
        if (!arrayList2.isEmpty()) {
            cqbd cqbdVarD = e.d();
            cqbdVarD.I("Can't sync with Telephony");
            cqbdVarD.B("isWearable", optional.isPresent());
            cqbdVarD.B("isSmsCapable", ((crnp) fcsuVar.b()).e());
            cqbdVarD.B("isDefaultSmsApp", ((crnp) fcsuVar.b()).d());
            cqbdVarD.r();
        }
        arrayList.addAll(fcva.ao(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        if (((asfb) this.j.b()).a()) {
            if (!((crma) this.h.b()).j()) {
                arrayList3.add(enqm.MISSING_PERMISSIONS);
            }
        } else if (!((crma) this.h.b()).p()) {
            arrayList3.add(enqm.MISSING_PERMISSIONS);
        }
        Context context = this.k;
        if (!craf.j(context)) {
            arrayList3.add(enqm.SMS_NOT_ALLOWED_FOR_USER);
        }
        if (!arrayList3.isEmpty()) {
            cqbd cqbdVarE = e.e();
            cqbdVarE.I("Missing required permissions for Forward Sync.");
            fcsu fcsuVar2 = this.h;
            cqbdVarE.B("hasSmsPermission", ((crma) fcsuVar2.b()).p());
            cqbdVarE.B("hasContactsPermission", ((crma) fcsuVar2.b()).h());
            cqbdVarE.B("hasPhoneStatePermission", ((crma) fcsuVar2.b()).k());
            cqbdVarE.B("smsAllowedForUser", craf.j(context));
            cqbdVarE.r();
        }
        arrayList.addAll(fcva.ao(arrayList3));
        return arrayList;
    }

    @Override // defpackage.cmqf
    @fcsv
    public final long a(long j) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    @fcsv
    public final cnvx b(long j) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    @fcsv
    public final eiju c(boolean z, long j, long j2, long j3, UUID uuid) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    @fcsv
    public final eiju d() {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    public final eiju e() {
        cnxa cnxaVar = (cnxa) this.d.b();
        return cnxaVar.g.h().h(new ejvr() { // from class: cnws
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cnwl) obj).c);
            }
        }, cnxaVar.h);
    }

    @Override // defpackage.cmqf
    public final eiju f(enqq enqqVar) {
        enqqVar.getClass();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.l, eicg.a(fcyiVar), fdjzVar, new cnwc(null, this, enqqVar)));
    }

    @Override // defpackage.cmqf
    @fcsv
    public final void g() {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    @fcsv
    public final void h() {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    public final void i(long j) throws IOException {
        eieu eieuVarH = eiiy.h("ForwardSyncManager::onNewMessageInserted");
        try {
            cnyi cnyiVar = (cnyi) this.c.b();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
            instantOfEpochMilli.getClass();
            cnyiVar.c(instantOfEpochMilli);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.cmqf
    @fcsv
    public final void j(long j, enqq enqqVar) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    public final void k(enqq enqqVar) {
        enqqVar.getClass();
        auvw.k(this.l, null, null, new cnwd(this, enqqVar, null), 3);
    }

    @Override // defpackage.cmqf
    public final void l(enqq enqqVar) {
        enqqVar.getClass();
        auvw.k(this.l, null, null, new cnwe(this, enqqVar, null), 3);
    }

    @Override // defpackage.cmqf
    public final void m(Uri uri, Instant instant) {
        uri.getClass();
        instant.getClass();
        auvw.k(this.l, null, null, new cnwf(this, uri, instant, null), 3);
    }

    @Override // defpackage.cmqf
    public final void n() {
        auvw.k(this.l, null, null, new cnwg(this, null), 3);
    }

    @Override // defpackage.cmqf
    @fcsv
    public final void o(ctz ctzVar) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    @fcsv
    public final void p(boolean z) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    public final void q(boolean z) {
        this.m = z;
    }

    @Override // defpackage.cmqf
    @fcsv
    public final void r(long j) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    public final boolean s() {
        Instant instantD;
        cmfo cmfoVar;
        cnxa cnxaVar = (cnxa) this.d.b();
        Instant instant = cnxa.d;
        if (((Boolean) cnxa.a.e()).booleanValue()) {
            try {
                cmfoVar = cnxaVar.g;
            } catch (evtj e2) {
                cnxa.b.s("Unable to retrieve data.", e2);
            }
            if ((((cnwl) cmfoVar.l()).b & 4) != 0) {
                evvp evvpVar = ((cnwl) cmfoVar.l()).e;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                instantD = evwz.d(evvpVar);
            } else {
                instantD = cnxa.d;
            }
        } else {
            instantD = Instant.ofEpochMilli(cnxaVar.e.e("last_sync_time_millis", -1L));
        }
        boolean z = !instant.equals(instantD);
        Boolean.valueOf(z).getClass();
        return z;
    }

    @Override // defpackage.cmqf
    @fcsv
    public final boolean t(long j) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    @Override // defpackage.cmqf
    public final boolean u() {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((cnwl) ((cnxa) this.d.b()).g.l()).c);
        } catch (evtj e2) {
            cnxa.b.s("Unable to retrieve data.", e2);
            boolValueOf = false;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.cmqf
    public final boolean v() {
        return ((cnyi) this.c.b()).d();
    }

    @Override // defpackage.cmqf
    @fcsv
    public final boolean w(long j) {
        throw new fcth("This method is internal to the Forward Sync process and should not be called via SyncManager.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (y(r9, r8, true, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r2.a(r9, r8, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.enqq r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cnvz
            if (r0 == 0) goto L13
            r0 = r9
            cnvz r0 = (defpackage.cnvz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnvz r0 = new cnvz
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L38
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            enqq r8 = r0.d
            defpackage.fctl.b(r9)
            goto L6d
        L38:
            defpackage.fctl.b(r9)
            goto Lc9
        L3d:
            defpackage.fctl.b(r9)
            java.util.List r9 = r7.A()
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L54
            r0.c = r5
            java.lang.Object r8 = r7.y(r9, r8, r5, r0)
            if (r8 != r1) goto Lc9
            goto Lcc
        L54:
            fcsu r9 = r7.d
            java.lang.Object r9 = r9.b()
            cnxa r9 = (defpackage.cnxa) r9
            eiju r9 = r9.a()
            r9.getClass()
            r0.d = r8
            r0.c = r4
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 == r1) goto Lcc
        L6d:
            j$.time.Instant r9 = (j$.time.Instant) r9
            cnyz r2 = defpackage.cnyz.a
            evsf r2 = r2.createBuilder()
            cnyu r2 = (defpackage.cnyu) r2
            r2.getClass()
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r4.getClass()
            evqs r4 = defpackage.cobs.a(r4)
            defpackage.cnzi.g(r4, r2)
            cnyn r4 = defpackage.cnyn.a
            evsf r4 = r4.createBuilder()
            cnym r4 = (defpackage.cnym) r4
            r4.getClass()
            if (r9 == 0) goto La7
            j$.time.Instant r6 = j$.time.Instant.EPOCH
            int r9 = r9.compareTo(r6)
            if (r9 >= 0) goto L9e
            goto La0
        L9e:
            r9 = 0
            r5 = r9
        La0:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            r9.getClass()
        La7:
            defpackage.cnzf.b(r5, r4)
            cnyn r9 = defpackage.cnzf.a(r4)
            defpackage.cnzi.d(r9, r2)
            cnyz r9 = defpackage.cnzi.c(r2)
            fcsu r2 = r7.c
            java.lang.Object r2 = r2.b()
            cnyi r2 = (defpackage.cnyi) r2
            r4 = 0
            r0.d = r4
            r0.c = r3
            java.lang.Object r8 = r2.a(r9, r8, r0)
            if (r8 != r1) goto Lc9
            goto Lcc
        Lc9:
            fctx r8 = defpackage.fctx.a
            return r8
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnwh.x(enqq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[LOOP:0: B:22:0x008b->B:24:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.util.List r6, defpackage.enqq r7, boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cnwa
            if (r0 == 0) goto L13
            r0 = r9
            cnwa r0 = (defpackage.cnwa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cnwa r0 = new cnwa
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            enqq r7 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r9)
            goto L55
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r9)
            if (r8 == 0) goto L6b
            fcsu r8 = r5.d
            java.lang.Object r8 = r8.b()
            cnxa r8 = (defpackage.cnxa) r8
            eiju r8 = r8.a()
            r8.getClass()
            r0.a = r6
            r0.e = r7
            r0.d = r4
            java.lang.Object r9 = defpackage.fdxs.c(r8, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            j$.time.Instant r8 = defpackage.cnxa.c
            boolean r8 = defpackage.fdbq.f(r9, r8)
            fcsu r9 = r5.i
            java.lang.Object r9 = r9.b()
            cnut r9 = (defpackage.cnut) r9
            ekgb r0 = defpackage.ekfv.a(r6)
            r9.b(r7, r3, r8, r0)
            goto L7a
        L6b:
            fcsu r8 = r5.i
            java.lang.Object r8 = r8.b()
            cnut r8 = (defpackage.cnut) r8
            ekgb r9 = defpackage.ekfv.a(r6)
            r8.c(r7, r3, r9)
        L7a:
            cqce r7 = defpackage.cnwh.e
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.fcva.p(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L8b:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r6.next()
            enqm r9 = (defpackage.enqm) r9
            java.lang.String r9 = r9.name()
            r8.add(r9)
            goto L8b
        L9f:
            r8.toString()
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = "Sync request failed: "
            java.lang.String r6 = r8.concat(r6)
            r7.p(r6)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnwh.y(java.util.List, enqq, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (y(r10, r9, false, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
    
        if (r2.a(r10, r9, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.enqq r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnwh.z(enqq, fcxy):java.lang.Object");
    }
}
