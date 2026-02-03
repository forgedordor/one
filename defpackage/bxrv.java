package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrv implements bxrp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/search/appsearch/AppSearchIndexerImpl");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final fcsu e;
    private final eizx f;

    public bxrv(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.d = fdjxVar;
        this.e = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.f = new eizx();
    }

    public static final int f(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1859676397) {
            if (iHashCode != -1675388953) {
                if (iHashCode == 904474787 && str.equals("Conversation")) {
                    return 2;
                }
            } else if (str.equals("Message")) {
                return 1;
            }
        } else if (str.equals("Participant")) {
            return 3;
        }
        throw new IllegalStateException("Unsupported namespace: ".concat(str));
    }

    @Override // defpackage.bxrp
    public final eiju a(bxsi bxsiVar) {
        if (!craf.f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        fdjx fdjxVar = this.d;
        return auvw.a(ejaa.a(fdjy.b(eicg.a(fdjxVar.hE())), this.f, new bxrq(null, this, bxsiVar)));
    }

    @Override // defpackage.bxrp
    public final eiju b(bxsh bxshVar) {
        if (!craf.f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        fdjx fdjxVar = this.d;
        return auvw.a(ejaa.a(fdjy.b(eicg.a(fdjxVar.hE())), this.f, new bxrs(null, this, bxshVar)));
    }

    @Override // defpackage.bxrp
    public final eiju c() {
        if (!craf.f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        fdjx fdjxVar = this.d;
        return auvw.a(ejaa.a(fdjy.b(eicg.a(fdjxVar.hE())), this.f, new bxrt(null, this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r8, defpackage.fcxy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bxrr
            if (r0 == 0) goto L13
            r0 = r9
            bxrr r0 = (defpackage.bxrr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bxrr r0 = new bxrr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.a
            dzub r8 = (defpackage.dzub) r8
            defpackage.fctl.b(r9)
            goto Lac
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            dzub r8 = r0.e
            java.lang.Object r2 = r0.a
            agh r2 = (defpackage.agh) r2
            defpackage.fctl.b(r9)
            goto L96
        L42:
            defpackage.fctl.b(r9)
            agg r9 = new agg
            r9.<init>()
            defpackage.lcg.i(r8)
            r9.b()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r8.size()
            r2.<init>(r6)
            java.util.Iterator r8 = r8.iterator()
        L5d:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r8.next()
            afv r6 = defpackage.afv.f(r6)
            r2.add(r6)
            goto L5d
        L6f:
            r9.c(r2)
            agh r2 = r9.a()
            fcsu r8 = r7.e
            java.lang.Object r8 = r8.b()
            byav r8 = (defpackage.byav) r8
            dzub r8 = r8.a()
            fcsu r9 = r7.b
            java.lang.Object r9 = r9.b()
            bxtq r9 = (defpackage.bxtq) r9
            r0.a = r2
            r0.e = r8
            r0.d = r5
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Lcb
        L96:
            dvbf r9 = (defpackage.dvbf) r9
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a(r2)
            r9.getClass()
            r0.a = r8
            r0.e = r3
            r0.d = r4
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto Lac
            goto Lcb
        Lac:
            fcsu r0 = r7.e
            aet r9 = (defpackage.aet) r9
            java.lang.Object r0 = r0.b()
            byav r0 = (defpackage.byav) r0
            r8.getClass()
            dzuc r0 = r0.a
            dzfh r1 = new dzfh
            java.lang.String r2 = "AppSearchIndexablesUpdateLatency"
            r1.<init>(r2)
            dzua r2 = defpackage.dzua.SUCCESS
            r0.f(r8, r1, r3, r2)
            r9.getClass()
            return r9
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxrv.d(java.util.Collection, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bxsh r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bxru
            if (r0 == 0) goto L13
            r0 = r8
            bxru r0 = (defpackage.bxru) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bxru r0 = new bxru
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.a
            dzub r7 = (defpackage.dzub) r7
            defpackage.fctl.b(r8)
            goto L87
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            dzub r7 = r0.e
            java.lang.Object r2 = r0.a
            agj r2 = (defpackage.agj) r2
            defpackage.fctl.b(r8)
            goto L74
        L41:
            defpackage.fctl.b(r8)
            java.lang.String r8 = r7.a
            agi r2 = new agi
            r2.<init>(r8)
            java.util.Collection r7 = r7.b
            r2.b(r7)
            agj r2 = r2.a()
            fcsu r7 = r6.e
            java.lang.Object r7 = r7.b()
            byav r7 = (defpackage.byav) r7
            dzub r7 = r7.a()
            fcsu r8 = r6.b
            java.lang.Object r8 = r8.b()
            bxtq r8 = (defpackage.bxtq) r8
            r0.a = r2
            r0.e = r7
            r0.d = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto La6
        L74:
            dvbf r8 = (defpackage.dvbf) r8
            com.google.common.util.concurrent.ListenableFuture r8 = r8.b(r2)
            r0.a = r7
            r0.e = r3
            r0.d = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 != r1) goto L87
            goto La6
        L87:
            fcsu r0 = r6.e
            aet r8 = (defpackage.aet) r8
            java.lang.Object r0 = r0.b()
            byav r0 = (defpackage.byav) r0
            r7.getClass()
            dzuc r0 = r0.a
            dzfh r1 = new dzfh
            java.lang.String r2 = "AppSearchIndexablesRemoveLatency"
            r1.<init>(r2)
            dzua r2 = defpackage.dzua.SUCCESS
            r0.f(r7, r1, r3, r2)
            r8.getClass()
            return r8
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxrv.e(bxsh, fcxy):java.lang.Object");
    }
}
