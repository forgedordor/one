package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyda {
    public final Optional c;
    public final fdjx d;
    public String e;
    public final cpgl f;
    private final egyt h;
    private final egbf i;
    private final fcsu j;
    public static final cqce a = cqce.g("BugleCms", "KeyRetrievalClientData");
    private static final Map g = fcwa.g(new fcti(0, "UNKNOWN"), new fcti(1, "CANNOT_GENERATE_KEY_UNSUPPORTED_FRAMEWORK"), new fcti(2, "CANNOT_GENERATE_MISSING_LSKF"), new fcti(3, "WAITING_FOR_KEY_GENERATION"), new fcti(4, "WAITING_FOR_KEY_SNAPSHOT"), new fcti(5, "WAITING_FOR_CONSENT"), new fcti(6, "SYNC_IN_PROGRESS"), new fcti(7, "SYNCED"), new fcti(8, "PERMANENT_FAILURE"));
    public static final Map b = fcwa.g(new fcti(0, "UNSPECIFIED"), new fcti(1, "PHYSICAL_DEVICE"), new fcti(2, "LOCKSCREEN_KNOWLEDGE_FACTOR"), new fcti(3, "GAIA_PASSWORD"));

    public cyda(egyt egytVar, egbf egbfVar, egej egejVar, Optional optional, fcsu fcsuVar, fdjx fdjxVar) {
        egytVar.getClass();
        egbfVar.getClass();
        egejVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.h = egytVar;
        this.i = egbfVar;
        this.c = optional;
        this.j = fcsuVar;
        this.d = fdjxVar;
        this.e = "";
        this.f = ((cpgn) fcsuVar.b()).a(cpgm.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cycq
            if (r0 == 0) goto L13
            r0 = r6
            cycq r0 = (defpackage.cycq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cycq r0 = new cycq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            egyt r6 = r5.h
            egbf r2 = r5.i
            egyi r2 = r2.b()
            egzr r4 = defpackage.egzr.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r6 = r6.a(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L7b
        L4b:
            java.util.List r6 = (java.util.List) r6
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r6.next()
            r2 = r1
            egbe r2 = (defpackage.egbe) r2
            if (r2 == 0) goto L59
            egbs r2 = r2.b()
            java.lang.String r2 = r2.k
            java.lang.String r3 = "pseudonymous"
            boolean r2 = defpackage.fdbq.f(r2, r3)
            if (r2 != 0) goto L59
            r0.add(r1)
            goto L59
        L7a:
            return r0
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cyct
            if (r0 == 0) goto L13
            r0 = r5
            cyct r0 = (defpackage.cyct) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cyct r0 = new cyct
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r5)     // Catch: defpackage.dcff -> L27
            goto L45
        L27:
            r5 = move-exception
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            cpgl r5 = r4.f     // Catch: defpackage.dcff -> L27
            java.lang.String r2 = r4.e     // Catch: defpackage.dcff -> L27
            eiju r5 = r5.b(r2)     // Catch: defpackage.dcff -> L27
            r0.c = r3     // Catch: defpackage.dcff -> L27
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)     // Catch: defpackage.dcff -> L27
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: defpackage.dcff -> L27
            java.util.Map r0 = defpackage.cyda.g     // Catch: defpackage.dcff -> L27
            java.lang.Object r0 = r0.get(r5)     // Catch: defpackage.dcff -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: defpackage.dcff -> L27
            r1.<init>()     // Catch: defpackage.dcff -> L27
            r1.append(r5)     // Catch: defpackage.dcff -> L27
            java.lang.String r5 = " "
            r1.append(r5)     // Catch: defpackage.dcff -> L27
            r1.append(r0)     // Catch: defpackage.dcff -> L27
            java.lang.String r5 = r1.toString()     // Catch: defpackage.dcff -> L27
            return r5
        L62:
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r5 = r0.concat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "Recovered security domains size "
            boolean r1 = r9 instanceof defpackage.cycu
            if (r1 == 0) goto L15
            r1 = r9
            cycu r1 = (defpackage.cycu) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cycu r1 = new cycu
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            defpackage.fctl.b(r9)     // Catch: defpackage.dcff -> L29
            goto L8c
        L29:
            r9 = move-exception
            goto Lb2
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            defpackage.fctl.b(r9)
            cpgl r9 = r8.f     // Catch: defpackage.dcff -> L29
            java.lang.String r3 = r8.e     // Catch: defpackage.dcff -> L29
            r3.getClass()     // Catch: defpackage.dcff -> L29
            dciz r5 = new dciz     // Catch: defpackage.dcff -> L29
            r5.<init>()     // Catch: defpackage.dcff -> L29
            dbut r6 = new dbut     // Catch: defpackage.dcff -> L29
            cphq r9 = (defpackage.cphq) r9     // Catch: defpackage.dcff -> L29
            dbuu r9 = r9.d     // Catch: defpackage.dcff -> L29
            r6.<init>(r3)     // Catch: defpackage.dcff -> L29
            r5.a = r6     // Catch: defpackage.dcff -> L29
            com.google.android.gms.common.Feature[] r3 = new com.google.android.gms.common.Feature[r4]     // Catch: defpackage.dcff -> L29
            com.google.android.gms.common.Feature r6 = defpackage.dbwc.b     // Catch: defpackage.dcff -> L29
            r7 = 0
            r3[r7] = r6     // Catch: defpackage.dcff -> L29
            r5.b = r3     // Catch: defpackage.dcff -> L29
            r3 = 1583(0x62f, float:2.218E-42)
            r5.c = r3     // Catch: defpackage.dcff -> L29
            dcja r3 = r5.a()     // Catch: defpackage.dcff -> L29
            defn r9 = r9.j(r3)     // Catch: defpackage.dcff -> L29
            cpgw r3 = new cpgw     // Catch: defpackage.dcff -> L29
            r3.<init>()     // Catch: defpackage.dcff -> L29
            cpgx r5 = new cpgx     // Catch: defpackage.dcff -> L29
            r5.<init>()     // Catch: defpackage.dcff -> L29
            r9.a(r5)     // Catch: defpackage.dcff -> L29
            cpgy r3 = new cpgy     // Catch: defpackage.dcff -> L29
            r3.<init>()     // Catch: defpackage.dcff -> L29
            r9.t(r3)     // Catch: defpackage.dcff -> L29
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.drgi.a(r9)     // Catch: defpackage.dcff -> L29
            eiju r9 = defpackage.eiju.g(r9)     // Catch: defpackage.dcff -> L29
            r9.getClass()     // Catch: defpackage.dcff -> L29
            r1.c = r4     // Catch: defpackage.dcff -> L29
            java.lang.Object r9 = defpackage.fdxs.c(r9, r1)     // Catch: defpackage.dcff -> L29
            if (r9 != r2) goto L8c
            return r2
        L8c:
            java.util.List r9 = (java.util.List) r9     // Catch: defpackage.dcff -> L29
            int r1 = r9.size()     // Catch: defpackage.dcff -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: defpackage.dcff -> L29
            r2.<init>(r0)     // Catch: defpackage.dcff -> L29
            r2.append(r1)     // Catch: defpackage.dcff -> L29
            java.lang.String r0 = "\n\n"
            r2.append(r0)     // Catch: defpackage.dcff -> L29
            r2.append(r9)     // Catch: defpackage.dcff -> L29
            java.lang.String r9 = r2.toString()     // Catch: defpackage.dcff -> L29
            cqce r0 = defpackage.cyda.a     // Catch: defpackage.dcff -> L29
            java.lang.String r1 = "Recovered Security Domains: \n\n"
            java.lang.String r1 = defpackage.a.v(r9, r1)     // Catch: defpackage.dcff -> L29
            r0.p(r1)     // Catch: defpackage.dcff -> L29
            return r9
        Lb2:
            r9.toString()
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r9 = r0.concat(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "Security domain members size "
            boolean r1 = r8 instanceof defpackage.cycv
            if (r1 == 0) goto L15
            r1 = r8
            cycv r1 = (defpackage.cycv) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cycv r1 = new cycv
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L29
            goto L48
        L29:
            r0 = move-exception
            r8 = r0
            goto L81
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.fctl.b(r8)
            cpgl r8 = r7.f     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r7.e     // Catch: java.lang.Exception -> L29
            eiju r8 = r8.c(r3)     // Catch: java.lang.Exception -> L29
            r1.c = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = defpackage.fdxs.c(r8, r1)     // Catch: java.lang.Exception -> L29
            if (r8 != r2) goto L48
            return r2
        L48:
            r1 = r8
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L29
            int r8 = r1.size()     // Catch: java.lang.Exception -> L29
            r1.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "\n***********************************\n\n"
            cyco r5 = new cyco     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r4 = 0
            r6 = 30
            r3 = 0
            java.lang.String r1 = defpackage.fcva.aF(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r2.<init>(r0)     // Catch: java.lang.Exception -> L29
            r2.append(r8)     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = "\n***********************************\n\n"
            r2.append(r8)     // Catch: java.lang.Exception -> L29
            r2.append(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L29
            cqce r0 = defpackage.cyda.a     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "Security Domain Members: \n\n"
            java.lang.String r1 = defpackage.a.v(r8, r1)     // Catch: java.lang.Exception -> L29
            r0.p(r1)     // Catch: java.lang.Exception -> L29
            return r8
        L81:
            r8.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r8 = r0.concat(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "vaults size "
            boolean r1 = r9 instanceof defpackage.cycw
            if (r1 == 0) goto L15
            r1 = r9
            cycw r1 = (defpackage.cycw) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cycw r1 = new cycw
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L29
            goto L8d
        L29:
            r0 = move-exception
            r9 = r0
            goto Lc6
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.fctl.b(r9)
            cpgl r9 = r8.f     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r8.e     // Catch: java.lang.Exception -> L29
            r3.getClass()     // Catch: java.lang.Exception -> L29
            dciz r5 = new dciz     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            dbue r6 = new dbue     // Catch: java.lang.Exception -> L29
            cphq r9 = (defpackage.cphq) r9     // Catch: java.lang.Exception -> L29
            dbuu r9 = r9.d     // Catch: java.lang.Exception -> L29
            r6.<init>(r3)     // Catch: java.lang.Exception -> L29
            r5.a = r6     // Catch: java.lang.Exception -> L29
            com.google.android.gms.common.Feature[] r3 = new com.google.android.gms.common.Feature[r4]     // Catch: java.lang.Exception -> L29
            com.google.android.gms.common.Feature r6 = defpackage.dbwc.c     // Catch: java.lang.Exception -> L29
            r7 = 0
            r3[r7] = r6     // Catch: java.lang.Exception -> L29
            r5.b = r3     // Catch: java.lang.Exception -> L29
            r3 = 1641(0x669, float:2.3E-42)
            r5.c = r3     // Catch: java.lang.Exception -> L29
            dcja r3 = r5.a()     // Catch: java.lang.Exception -> L29
            defn r9 = r9.j(r3)     // Catch: java.lang.Exception -> L29
            cpha r3 = new cpha     // Catch: java.lang.Exception -> L29
            r3.<init>()     // Catch: java.lang.Exception -> L29
            cphb r5 = new cphb     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r9.a(r5)     // Catch: java.lang.Exception -> L29
            cphc r3 = new cphc     // Catch: java.lang.Exception -> L29
            r3.<init>()     // Catch: java.lang.Exception -> L29
            r9.t(r3)     // Catch: java.lang.Exception -> L29
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.drgi.a(r9)     // Catch: java.lang.Exception -> L29
            eiju r9 = defpackage.eiju.g(r9)     // Catch: java.lang.Exception -> L29
            r9.getClass()     // Catch: java.lang.Exception -> L29
            r1.c = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = defpackage.fdxs.c(r9, r1)     // Catch: java.lang.Exception -> L29
            if (r9 != r2) goto L8d
            return r2
        L8d:
            r1 = r9
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L29
            int r9 = r1.size()     // Catch: java.lang.Exception -> L29
            r1.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "\n***********************************\n\n"
            cycp r5 = new cycp     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r4 = 0
            r6 = 30
            r3 = 0
            java.lang.String r1 = defpackage.fcva.aF(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r2.<init>(r0)     // Catch: java.lang.Exception -> L29
            r2.append(r9)     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = "\n***********************************\n\n"
            r2.append(r9)     // Catch: java.lang.Exception -> L29
            r2.append(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Exception -> L29
            cqce r0 = defpackage.cyda.a     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "vaults: \n\n"
            java.lang.String r1 = defpackage.a.v(r9, r1)     // Catch: java.lang.Exception -> L29
            r0.p(r1)     // Catch: java.lang.Exception -> L29
            return r9
        Lc6:
            r9.toString()
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r9 = r0.concat(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cycx
            if (r0 == 0) goto L13
            r0 = r8
            cycx r0 = (defpackage.cycx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cycx r0 = new cycx
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r8)     // Catch: defpackage.dcff -> L27
            goto L88
        L27:
            r8 = move-exception
            goto L8c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.fctl.b(r8)
            cpgl r8 = r7.f     // Catch: defpackage.dcff -> L27
            java.lang.String r2 = r7.e     // Catch: defpackage.dcff -> L27
            r2.getClass()     // Catch: defpackage.dcff -> L27
            dciz r4 = new dciz     // Catch: defpackage.dcff -> L27
            r4.<init>()     // Catch: defpackage.dcff -> L27
            dbur r5 = new dbur     // Catch: defpackage.dcff -> L27
            cphq r8 = (defpackage.cphq) r8     // Catch: defpackage.dcff -> L27
            dbuu r8 = r8.d     // Catch: defpackage.dcff -> L27
            r5.<init>(r2)     // Catch: defpackage.dcff -> L27
            r4.a = r5     // Catch: defpackage.dcff -> L27
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r3]     // Catch: defpackage.dcff -> L27
            com.google.android.gms.common.Feature r5 = defpackage.dbwc.a     // Catch: defpackage.dcff -> L27
            r6 = 0
            r2[r6] = r5     // Catch: defpackage.dcff -> L27
            r4.b = r2     // Catch: defpackage.dcff -> L27
            r2 = 1582(0x62e, float:2.217E-42)
            r4.c = r2     // Catch: defpackage.dcff -> L27
            dcja r2 = r4.a()     // Catch: defpackage.dcff -> L27
            defn r8 = r8.j(r2)     // Catch: defpackage.dcff -> L27
            cpgo r2 = new cpgo     // Catch: defpackage.dcff -> L27
            r2.<init>()     // Catch: defpackage.dcff -> L27
            cpgs r4 = new cpgs     // Catch: defpackage.dcff -> L27
            r4.<init>()     // Catch: defpackage.dcff -> L27
            r8.a(r4)     // Catch: defpackage.dcff -> L27
            cpgz r2 = new cpgz     // Catch: defpackage.dcff -> L27
            r2.<init>()     // Catch: defpackage.dcff -> L27
            r8.t(r2)     // Catch: defpackage.dcff -> L27
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.drgi.a(r8)     // Catch: defpackage.dcff -> L27
            eiju r8 = defpackage.eiju.g(r8)     // Catch: defpackage.dcff -> L27
            r8.getClass()     // Catch: defpackage.dcff -> L27
            r0.c = r3     // Catch: defpackage.dcff -> L27
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: defpackage.dcff -> L27
            if (r8 == r1) goto L8b
        L88:
            java.lang.String r8 = "markLocalKeysAsStale succeeded."
            return r8
        L8b:
            return r1
        L8c:
            r8.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "markLocalKeysAsStale failed. "
            java.lang.String r8 = r0.concat(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cycy
            if (r0 == 0) goto L13
            r0 = r5
            cycy r0 = (defpackage.cycy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cycy r0 = new cycy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r5)     // Catch: defpackage.dcff -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            cpgl r5 = r4.f     // Catch: defpackage.dcff -> L27
            java.lang.String r2 = r4.e     // Catch: defpackage.dcff -> L27
            eiju r5 = r5.d(r2)     // Catch: defpackage.dcff -> L27
            r0.c = r3     // Catch: defpackage.dcff -> L27
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)     // Catch: defpackage.dcff -> L27
            if (r5 == r1) goto L47
        L44:
            java.lang.String r5 = "Success"
            return r5
        L47:
            return r1
        L48:
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r5 = r0.concat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cycz
            if (r0 == 0) goto L13
            r0 = r6
            cycz r0 = (defpackage.cycz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cycz r0 = new cycz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: defpackage.dcff -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cpgl r6 = r4.f     // Catch: defpackage.dcff -> L27
            java.lang.String r2 = r4.e     // Catch: defpackage.dcff -> L27
            eiju r5 = r6.e(r2, r5)     // Catch: defpackage.dcff -> L27
            r0.c = r3     // Catch: defpackage.dcff -> L27
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)     // Catch: defpackage.dcff -> L27
            if (r5 == r1) goto L47
        L44:
            java.lang.String r5 = "Success"
            return r5
        L47:
            return r1
        L48:
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Failed. "
            java.lang.String r5 = r6.concat(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyda.h(boolean, fcxy):java.lang.Object");
    }
}
