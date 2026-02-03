package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class choe implements chnt {
    public final egmr a;
    public final fdjx b;
    private final cogw c;
    private final eilt d;

    public choe(egmr egmrVar, fdjx fdjxVar, cogw cogwVar, eilt eiltVar) {
        egmrVar.getClass();
        fdjxVar.getClass();
        cogwVar.getClass();
        eiltVar.getClass();
        this.a = egmrVar;
        this.b = fdjxVar;
        this.c = cogwVar;
        this.d = eiltVar;
    }

    private static final Object h(eilt eiltVar, String str, String[] strArr, final fdae fdaeVar) {
        ejxr ejxrVar = new ejxr() { // from class: chnw
            @Override // defpackage.ejxr
            public final Object get() {
                return fdaeVar.invoke();
            }
        };
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 0);
        eieh eiehVarC = eilt.c();
        if (eiehVarC == null) {
            return eiltVar.a(ejxrVar, str, strArr2);
        }
        try {
            return eiltVar.a(ejxrVar, str, strArr2);
        } finally {
            eidc.a(eiehVarC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final defpackage.chpo r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.chnx
            if (r0 == 0) goto L13
            r0 = r7
            chnx r0 = (defpackage.chnx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chnx r0 = new chnx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            eilt r7 = r5.d
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            chnv r4 = new chnv
            r4.<init>()
            java.lang.String r6 = "KeyValueProfileCacheImpl#getIfPresent"
            java.lang.Object r6 = h(r7, r6, r2, r4)
            r6.getClass()
            com.google.common.util.concurrent.ListenableFuture r6 = (com.google.common.util.concurrent.ListenableFuture) r6
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            ejwi r7 = (defpackage.ejwi) r7
            java.lang.Object r6 = r7.f()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choe.a(chpo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.chpo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.choa
            if (r0 == 0) goto L13
            r0 = r6
            choa r0 = (defpackage.choa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            choa r0 = new choa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            java.lang.Object r6 = r4.g(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choe.b(chpo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.chpo r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.chob
            if (r0 == 0) goto L13
            r0 = r8
            chob r0 = (defpackage.chob) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chob r0 = new chob
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r8)
            goto L59
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            chpo r7 = r0.d
            defpackage.fctl.b(r8)
            goto L46
        L39:
            defpackage.fctl.b(r8)
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 == r1) goto L67
        L46:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L62
            r8 = 0
            r0.d = r8
            r0.c = r4
            java.lang.Object r8 = r6.f(r7, r0)
            if (r8 == r1) goto L67
        L59:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L62
            r3 = r5
        L62:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choe.c(chpo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.chpo r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.choc
            if (r0 == 0) goto L13
            r0 = r7
            choc r0 = (defpackage.choc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            choc r0 = new choc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            chpo r6 = r0.d
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 == r1) goto L60
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5a
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L59
            goto L60
        L59:
            return r6
        L5a:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choe.d(chpo, fcxy):java.lang.Object");
    }

    @Override // defpackage.chnt
    public final Object e(final chpo chpoVar, final chpk chpkVar, fcxy fcxyVar) {
        Object objH = h(this.d, "KeyValueProfileCacheImpl#put", new String[0], new fdae() { // from class: chnu
            @Override // defpackage.fdae
            public final Object invoke() {
                chpn chpnVar = (chpn) chpo.a.createBuilder();
                chpnVar.getClass();
                String str = chpoVar.c;
                str.getClass();
                chpp.c(str, chpnVar);
                chpo chpoVarA = chpp.a(chpnVar);
                fcyi fcyiVar = fcyi.a;
                fdjz fdjzVar = fdjz.a;
                fcyh fcyhVarA = eicg.a(fcyiVar);
                chod chodVar = new chod(null, chpkVar);
                choe choeVar = this.a;
                return choeVar.a.b(chpoVarA, fdxs.b(choeVar.b, fcyhVarA, fdjzVar, chodVar));
            }
        });
        objH.getClass();
        Object objC = fdxs.c((ListenableFuture) objH, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.chpo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chny
            if (r0 == 0) goto L13
            r0 = r6
            chny r0 = (defpackage.chny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chny r0 = new chny
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            chpo r5 = r0.d
            defpackage.fctl.b(r6)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            chpo r6 = defpackage.chpo.a
            evsf r6 = r6.createBuilder()
            chpn r6 = (defpackage.chpn) r6
            r6.getClass()
            java.lang.String r2 = r5.c
            r2.getClass()
            defpackage.chpp.c(r2, r6)
            chpo r6 = defpackage.chpp.a(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 == r1) goto L79
        L55:
            egnd r6 = (defpackage.egnd) r6
            long r0 = r5.d
            r5 = 0
            if (r6 == 0) goto L73
            cogw r2 = r4.c
            j$.time.Instant r6 = r6.b
            j$.time.Instant r2 = r2.f()
            j$.time.Duration r6 = j$.time.Duration.between(r6, r2)
            j$.time.Duration r0 = j$.time.Duration.ofHours(r0)
            int r6 = r6.compareTo(r0)
            if (r6 <= 0) goto L73
            goto L74
        L73:
            r3 = r5
        L74:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choe.f(chpo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.chpo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chnz
            if (r0 == 0) goto L13
            r0 = r6
            chnz r0 = (defpackage.chnz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chnz r0 = new chnz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            chpo r6 = defpackage.chpo.a
            evsf r6 = r6.createBuilder()
            chpn r6 = (defpackage.chpn) r6
            r6.getClass()
            java.lang.String r5 = r5.c
            r5.getClass()
            defpackage.chpp.c(r5, r6)
            chpo r5 = defpackage.chpp.a(r6)
            r0.c = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 == r1) goto L5c
        L51:
            egnd r6 = (defpackage.egnd) r6
            if (r6 != 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.choe.g(chpo, fcxy):java.lang.Object");
    }
}
