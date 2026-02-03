package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjs implements cfmt {
    public static final eksp a = eksp.c("BugleGDitto");
    public final Optional b;
    public final cecr c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final Context g;
    private final fdjx h;
    private final fdjx i;
    private final bvkr j;
    private final cfis k;
    private final fcsu l;
    private final fcsu m;
    private final Optional n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;

    /* compiled from: PG */
    public interface a {
        ceel dp();
    }

    public cfjs(Context context, fdjx fdjxVar, fdjx fdjxVar2, bvkr bvkrVar, cfis cfisVar, Optional optional, fcsu fcsuVar, cecr cecrVar, fcsu fcsuVar2, Optional optional2, cecp cecpVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        bvkrVar.getClass();
        cfisVar.getClass();
        cecrVar.getClass();
        fcsuVar2.getClass();
        optional2.getClass();
        cecpVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        this.g = context;
        this.h = fdjxVar;
        this.i = fdjxVar2;
        this.j = bvkrVar;
        this.k = cfisVar;
        this.b = optional;
        this.l = fcsuVar;
        this.c = cecrVar;
        this.m = fcsuVar2;
        this.n = optional2;
        this.d = fcsuVar3;
        this.o = fcsuVar4;
        this.p = fcsuVar5;
        this.q = fcsuVar6;
        this.r = fcsuVar7;
        this.e = fcsuVar8;
        this.f = fcsuVar9;
        this.s = fcsuVar10;
        this.t = fcsuVar11;
    }

    public static final ewyb l(epby epbyVar) {
        int iOrdinal = epbyVar.ordinal();
        return iOrdinal != 42 ? iOrdinal != 43 ? ewyb.UNKNOWN_EVENT_TYPE : ewyb.CREATE_GAIA_PAIRING_CLIENT_FINISHED : ewyb.CREATE_GAIA_PAIRING_CLIENT_INIT;
    }

    static /* synthetic */ Optional m(cfjs cfjsVar, String str, String str2, epnh epnhVar, exmt exmtVar, epby epbyVar) {
        ((bvio) cfjsVar.m.b()).t(l(epbyVar), 2, str2, str, epnhVar, exmtVar);
        epng epngVar = (epng) epni.a.createBuilder();
        epngVar.getClass();
        epnj.f(str, epngVar);
        epnj.d(epnhVar, epngVar);
        epnj.g(exmtVar, epngVar);
        return Optional.of(epnj.a(epngVar));
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfms.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        return eijx.c();
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        if (((cdio) this.l.b()).a()) {
            epnf epnfVar = (epnf) evsn.parseFrom(epnf.a, evqsVar, evrr.a());
            epnfVar.getClass();
            return epnfVar;
        }
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(cqnc.S, "CreateGaiaPairingDelegate");
        ekslVar.q("Gaia Pairing is disabled. Skipping parseRequest in delegate.");
        epne epneVar = (epne) epnf.a.createBuilder();
        epneVar.getClass();
        evsn evsnVarBuild = epneVar.build();
        evsnVarBuild.getClass();
        return (epnf) evsnVarBuild;
    }

    @Override // defpackage.cfmt
    public final /* bridge */ /* synthetic */ eiju d(cfmy cfmyVar, evuh evuhVar) {
        epnf epnfVar = (epnf) evuhVar;
        epnfVar.getClass();
        if (((aqpb) this.s.b()).a()) {
            auvw.c(this.i, fcyi.a, fdjz.a, new cfjt(this, null));
        }
        if (((cdio) this.l.b()).a()) {
            return auvw.c(this.h, fcyi.a, fdjz.a, new cfkb(cfmyVar, this, epnfVar, null));
        }
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(cqnc.S, "CreateGaiaPairingDelegate");
        ekslVar.q("Gaia Pairing is disabled. Skipping handleRequestInternal in delegate.");
        return auvw.c(this.i, fcyi.a, fdjz.a, new cfjz(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.exuy r8, java.lang.String r9, java.lang.String r10, defpackage.epby r11, int r12, int r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.cfju
            if (r0 == 0) goto L13
            r0 = r14
            cfju r0 = (defpackage.cfju) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cfju r0 = new cfju
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r13 = r0.b
            int r12 = r0.a
            byte[] r8 = r0.i
            epby r11 = r0.h
            java.lang.String r10 = r0.g
            java.lang.String r9 = r0.f
            defpackage.fctl.b(r14)
            goto L64
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.fctl.b(r14)
            fcsu r14 = r7.d
            java.lang.Object r2 = r14.b()
            ceco r2 = (defpackage.ceco) r2
            byte[] r8 = r2.k(r8)
            java.lang.Object r14 = r14.b()
            ceco r14 = (defpackage.ceco) r14
            r0.f = r9
            r0.g = r10
            r0.h = r11
            r0.i = r8
            r0.a = r12
            r0.b = r13
            r0.e = r3
            java.lang.Object r14 = r14.f(r0)
            if (r14 == r1) goto Lcf
        L64:
            r1 = r9
            r2 = r10
            r3 = r14
            epnh r3 = (defpackage.epnh) r3
            if (r3 == 0) goto L80
            ewyb r4 = l(r11)
            fcsu r8 = r7.d
            java.lang.Object r8 = r8.b()
            r0 = r8
            ceco r0 = (defpackage.ceco) r0
            r5 = 0
            r6 = 48
            j$.util.Optional r8 = defpackage.ceco.r(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L80:
            fcsu r9 = r7.d
            java.lang.Object r9 = r9.b()
            r0 = r9
            ceco r0 = (defpackage.ceco) r0
            ewyb r3 = l(r11)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r12)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            r6 = 32
            defpackage.ceco.m(r0, r1, r2, r3, r4, r5, r6)
            epni r9 = defpackage.epni.a
            evsf r9 = r9.createBuilder()
            epng r9 = (defpackage.epng) r9
            r9.getClass()
            exuy r10 = defpackage.exuy.a
            evsn r8 = defpackage.evsn.parseFrom(r10, r8)
            exuy r8 = (defpackage.exuy) r8
            r8.getClass()
            defpackage.epnj.h(r8, r9)
            defpackage.epnj.i(r9)
            defpackage.epnj.f(r1, r9)
            exmt r8 = defpackage.exmt.OK
            defpackage.epnj.g(r8, r9)
            defpackage.epnj.c(r12, r9)
            defpackage.epnj.b(r13, r9)
            epni r8 = defpackage.epnj.a(r9)
            j$.util.Optional r8 = j$.util.Optional.of(r8)
            return r8
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.e(exuy, java.lang.String, java.lang.String, epby, int, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(byte[] r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.f(byte[], fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fc, code lost:
    
        if (r0.b(r7) != r8) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cfmy r18, defpackage.epnf r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.g(cfmy, epnf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v11, types: [j$.util.Optional] */
    /* JADX WARN: Type inference failed for: r6v14, types: [j$.util.Optional] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3, types: [j$.util.Optional] */
    /* JADX WARN: Type inference failed for: r6v5, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cfmy r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cfjx
            if (r0 == 0) goto L13
            r0 = r7
            cfjx r0 = (defpackage.cfjx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfjx r0 = new cfjx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j$.util.Optional r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L6c
        L29:
            r7 = move-exception
            goto L70
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            bvks r6 = r6.a()
            j$.util.Optional r6 = r6.c
            j$.util.Optional r7 = r5.n
            boolean r2 = r7.isPresent()
            if (r2 == 0) goto Ldc
            boolean r2 = r6.isPresent()
            if (r2 == 0) goto Ldc
            android.content.Context r2 = r5.g
            java.lang.Object r7 = r7.get()
            efwo r7 = (defpackage.efwo) r7
            java.lang.Class<cfjs$a> r4 = cfjs.a.class
            java.lang.Object r7 = defpackage.ehlh.a(r2, r4, r7)
            cfjs$a r7 = (cfjs.a) r7
            ceel r7 = r7.dp()     // Catch: java.lang.Throwable -> L29
            eiju r7 = r7.a()     // Catch: java.lang.Throwable -> L29
            r0.d = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 == r1) goto L6f
        L6c:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L29
            goto L7d
        L6f:
            return r1
        L70:
            eksp r0 = defpackage.cfjs.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Failed to retrieve device name and geo location info"
            defpackage.a.N(r0, r1, r7)
            fcvo r7 = defpackage.fcvo.a
        L7d:
            r7.getClass()
            java.util.Iterator r7 = r7.iterator()
        L84:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r7.next()
            r1 = r0
            ezlt r1 = (defpackage.ezlt) r1
            ezpl r1 = r1.b
            if (r1 != 0) goto L97
            ezpl r1 = defpackage.ezpl.a
        L97:
            java.lang.String r1 = r1.b
            java.lang.Object r2 = r6.get()
            evqs r2 = (defpackage.evqs) r2
            java.lang.String r2 = r2.E()
            boolean r1 = defpackage.fdbq.f(r1, r2)
            if (r1 == 0) goto L84
            goto Lab
        Laa:
            r0 = 0
        Lab:
            ezlt r0 = (defpackage.ezlt) r0
            if (r0 != 0) goto Lbf
            eksp r6 = defpackage.cfjs.a
            ekrw r6 = r6.h()
            eksl r6 = (defpackage.eksl) r6
            java.lang.String r7 = "pairingClientInfo is null, skip updating location info"
            r6.q(r7)
            fctx r6 = defpackage.fctx.a
            return r6
        Lbf:
            j$.util.Optional r6 = r5.b
            java.lang.Object r6 = r6.get()
            java.lang.String r7 = r0.f
            r7.getClass()
            java.lang.String r1 = r0.d
            r1.getClass()
            java.lang.String r2 = r0.e
            r2.getClass()
            java.lang.String r0 = r0.c
            r0.getClass()
            r6.i(r7, r1, r2, r0)
        Ldc:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.h(cfmy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.cecq r21, defpackage.cfmy r22, defpackage.epnf r23, defpackage.epby r24, java.lang.String r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.i(cecq, cfmy, epnf, epby, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.epnf r17, defpackage.epby r18, java.lang.String r19, defpackage.exuy r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r21
            boolean r3 = r2 instanceof defpackage.cfkc
            if (r3 == 0) goto L19
            r3 = r2
            cfkc r3 = (defpackage.cfkc) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            cfkc r3 = new cfkc
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.c
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L49
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L32
            defpackage.fctl.b(r2)
            goto Ld4
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            byte[] r1 = r3.g
            java.lang.String r5 = r3.f
            epby r7 = r3.e
            epnf r9 = r3.d
            defpackage.fctl.b(r2)
            r11 = r5
            r5 = r1
            r1 = r9
            goto L9c
        L49:
            defpackage.fctl.b(r2)
            fcsu r2 = r0.d
            java.lang.Object r5 = r2.b()
            ceco r5 = (defpackage.ceco) r5
            epnh r12 = r5.b(r1)
            if (r12 == 0) goto L74
            ewyb r13 = l(r18)
            java.lang.Object r2 = r2.b()
            r9 = r2
            ceco r9 = (defpackage.ceco) r9
            java.lang.String r10 = r1.c
            r10.getClass()
            r14 = 0
            r15 = 48
            r11 = r19
            j$.util.Optional r1 = defpackage.ceco.r(r9, r10, r11, r12, r13, r14, r15)
            return r1
        L74:
            java.lang.Object r5 = r2.b()
            ceco r5 = (defpackage.ceco) r5
            r9 = r20
            byte[] r5 = r5.l(r9)
            java.lang.Object r2 = r2.b()
            ceco r2 = (defpackage.ceco) r2
            r3.d = r1
            r9 = r18
            r3.e = r9
            r11 = r19
            r3.f = r11
            r3.g = r5
            r3.c = r7
            java.lang.Object r2 = r2.f(r3)
            if (r2 != r4) goto L9b
            goto Ld3
        L9b:
            r7 = r9
        L9c:
            r12 = r2
            epnh r12 = (defpackage.epnh) r12
            if (r12 == 0) goto Lbb
            ewyb r13 = l(r7)
            fcsu r2 = r0.d
            java.lang.Object r2 = r2.b()
            r9 = r2
            ceco r9 = (defpackage.ceco) r9
            java.lang.String r10 = r1.c
            r10.getClass()
            r14 = 0
            r15 = 48
            j$.util.Optional r1 = defpackage.ceco.r(r9, r10, r11, r12, r13, r14, r15)
            return r1
        Lbb:
            fcsu r1 = r0.d
            java.lang.Object r1 = r1.b()
            ceco r1 = (defpackage.ceco) r1
            r3.d = r8
            r3.e = r8
            r3.f = r8
            r3.g = r8
            r3.c = r6
            java.lang.Object r1 = r1.i(r5, r3)
            if (r1 != r4) goto Ld4
        Ld3:
            return r4
        Ld4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.j(epnf, epby, java.lang.String, exuy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.epnf r19, defpackage.epby r20, java.lang.String r21, defpackage.exuy r22, defpackage.cfmy r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjs.k(epnf, epby, java.lang.String, exuy, cfmy, fcxy):java.lang.Object");
    }
}
