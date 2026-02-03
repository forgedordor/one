package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.LocalDate;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbk implements cjzq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl");
    public static final egyj b = new egyb("RCS_SETTINGS_DATA_SOURCE_KEY");
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final cqtq E;
    public final fdjx c;
    public final fcyh d;
    public final eosc e;
    public final cmfo f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final ctce m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    private final Context q;
    private final fcsu r;
    private final egzh s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final cqtp y;
    private final fcsu z;

    public ckbk(Context context, fcsu fcsuVar, fdjx fdjxVar, fcyh fcyhVar, eosc eoscVar, cmfo cmfoVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, egzh egzhVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, cqtp cqtpVar, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, ctce ctceVar, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        eoscVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        egzhVar.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        cqtpVar.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        ctceVar.getClass();
        fcsuVar16.getClass();
        fcsuVar17.getClass();
        fcsuVar18.getClass();
        fcsuVar19.getClass();
        fcsuVar20.getClass();
        fcsuVar21.getClass();
        this.q = context;
        this.r = fcsuVar;
        this.c = fdjxVar;
        this.d = fcyhVar;
        this.e = eoscVar;
        this.f = cmfoVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar5;
        this.s = egzhVar;
        this.j = fcsuVar6;
        this.t = fcsuVar7;
        this.k = fcsuVar8;
        this.u = fcsuVar9;
        this.v = fcsuVar10;
        this.w = fcsuVar11;
        this.x = fcsuVar12;
        this.y = cqtpVar;
        this.z = fcsuVar13;
        this.l = fcsuVar14;
        this.A = fcsuVar15;
        this.m = ctceVar;
        this.B = fcsuVar16;
        this.n = fcsuVar17;
        this.o = fcsuVar18;
        this.p = fcsuVar19;
        this.C = fcsuVar20;
        this.D = fcsuVar21;
        this.E = cqtpVar.a(new ckae());
    }

    private final ckce F() {
        return (ckce) this.f.l();
    }

    public final Object A(ckbz ckbzVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new ckbg(null, this, ckbzVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final String B(dggn dggnVar) {
        String str = dggo.a(dggnVar).a;
        LocalDate localDate = ((cogw) this.j.b()).g().toLocalDate();
        Objects.toString(localDate);
        return str.concat(String.valueOf(localDate));
    }

    public final void C(ckbz ckbzVar) {
        if (ckbzVar != ckbz.TOGGLE_STATE_UNSPECIFIED) {
            return;
        }
        ckbz ckbzVar2 = ((crqv) this.r.b()).q(this.q.getString(R.string.enable_rcs_pref_key), true) ? ckbz.TOGGLE_STATE_ENABLED : ckbz.TOGGLE_STATE_USER_DISABLED;
        n(ckbzVar2);
        ((ekrd) a.e().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "backfillGlobalToggleFromBuglePrefs", 181, "RcsSettingsDataServiceImpl.kt")).t("backfillGlobalToggleFromBuglePrefs: setting global toggle to %s", ckbzVar2);
    }

    public final void D(ckbz ckbzVar) {
        if (ckbzVar == ckbz.TOGGLE_STATE_ENABLED) {
            ((crqv) this.r.b()).h(this.q.getString(R.string.enable_rcs_pref_key), true);
        } else if (ckbzVar == ckbz.TOGGLE_STATE_USER_DISABLED || ckbzVar == ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED) {
            ((crqv) this.r.b()).h(this.q.getString(R.string.enable_rcs_pref_key), false);
        }
    }

    public final boolean E() {
        boolean z;
        Set setO = ((cmlb) this.g.b()).o();
        if (setO.isEmpty()) {
            z = false;
        } else {
            Iterator it = setO.iterator();
            while (it.hasNext()) {
                if (((cebf) this.u.b()).b(dggo.a((dggn) it.next()).a)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        cjxj cjxjVarB = cjxj.b(((dgrs) this.w.b()).e().h);
        if (cjxjVarB == null) {
            cjxjVarB = cjxj.UNRECOGNIZED;
        }
        cjxjVarB.getClass();
        boolean z2 = cjxjVarB == cjxj.LEGAL_FYI_SEEN || (z && cjxjVarB == cjxj.OOB_CONSENT);
        boolean z3 = ((crqv) this.r.b()).d("rcs_tos_state", 0) == 2;
        ((ekrd) a.e().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "getRcsDefaultOnConsent", 938, "RcsSettingsDataServiceImpl.kt")).H("rcsDefaultOnConsent: %s, googleTosConsent: %s", z2, z3);
        return z2 || z3;
    }

    @Override // defpackage.cjzq
    public final ckbz a() {
        ckbz ckbzVarB = ckbz.b(F().e);
        if (ckbzVarB == null) {
            ckbzVarB = ckbz.TOGGLE_STATE_UNSPECIFIED;
        }
        ckbzVarB.getClass();
        C(ckbzVarB);
        ckbz ckbzVarB2 = ckbz.b(F().e);
        if (ckbzVarB2 == null) {
            ckbzVarB2 = ckbz.TOGGLE_STATE_UNSPECIFIED;
        }
        ckbzVarB2.getClass();
        return ckbzVarB2;
    }

    @Override // defpackage.cjzq
    public final ckcc b(dggn dggnVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new evtf(F().c, ckce.f));
        mapUnmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(mapUnmodifiableMap.size()));
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new dggp((String) key), entry.getValue());
        }
        Object objP = linkedHashMap.get(dggnVar);
        if (objP == null) {
            objP = p(dggnVar);
        }
        return (ckcc) objP;
    }

    @Override // defpackage.cjzq
    public final cquc c(cqtk cqtkVar) {
        return this.E.a(cqtkVar, "RCS settings register", "RCS settings callback", "RCS settings unregister");
    }

    @Override // defpackage.cjzq
    public final ehaw d(lvc lvcVar) {
        lvcVar.getClass();
        lvcVar.c(new ckay(this, new cqew() { // from class: cjzv
            @Override // defpackage.cqew
            public final void x() {
                this.a.l();
            }
        }, new chyy() { // from class: cjzw
            @Override // defpackage.chyy
            public final void c(chyz chyzVar) {
                this.a.l();
            }
        }, new cjpn() { // from class: cjzx
            @Override // defpackage.cjpn
            public final void a() {
                this.a.l();
            }
        }));
        return new ckaq(this);
    }

    @Override // defpackage.cjzq
    public final eiju e(dggn dggnVar) {
        return auvw.c(this.c, fcyi.a, fdjz.a, new ckax(this, dggnVar, null));
    }

    @Override // defpackage.cjzq
    public final eiju f(dggn dggnVar, ckcc ckccVar) {
        ckccVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new ckbf(this, dggnVar, ckccVar, null));
    }

    @Override // defpackage.cjzq
    public final eiju g(ckbz ckbzVar) {
        ckbzVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new ckbi(this, ckbzVar, null));
    }

    @Override // defpackage.cjzq
    public final eiju h(ckbz ckbzVar) {
        ckbzVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new ckbj(this, ckbzVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cjzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ckan
            if (r0 == 0) goto L13
            r0 = r6
            ckan r0 = (defpackage.ckan) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckan r0 = new ckan
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.d
            fcyh r6 = defpackage.eicg.a(r6)
            ckam r2 = new ckam
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.i(fcxy):java.lang.Object");
    }

    @Override // defpackage.cjzq
    public final Object j(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ckau(null, this), fcxyVar);
    }

    @Override // defpackage.cjzq
    public final void k() {
        auvw.k(this.c, null, null, new ckaf(this, null), 3);
    }

    @Override // defpackage.cjzq
    public final void l() {
        this.s.a(eijx.e(null), b);
        this.E.c(new Supplier() { // from class: cjzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RcsSettingsDataService::notifyDataChanged");
    }

    @Override // defpackage.cjzq
    public final void m(final dggn dggnVar, final ckcc ckccVar) {
        dggnVar.getClass();
        ckccVar.getClass();
        final fdap fdapVar = new fdap() { // from class: cjzz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ckbx ckbxVar = (ckbx) ((ckce) obj).toBuilder();
                ckbxVar.a(dggo.a(dggnVar).a, ckccVar);
                return (ckce) ckbxVar.build();
            }
        };
        this.f.m(new ejvr() { // from class: ckaa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        });
    }

    @Override // defpackage.cjzq
    public final void n(final ckbz ckbzVar) {
        ckbzVar.getClass();
        final fdap fdapVar = new fdap() { // from class: ckab
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ckbx ckbxVar = (ckbx) ((ckce) obj).toBuilder();
                ckbxVar.copyOnWrite();
                ckce ckceVar = (ckce) ckbxVar.instance;
                ckceVar.e = ckbzVar.e;
                ckceVar.b |= 2;
                return (ckce) ckbxVar.build();
            }
        };
        this.f.m(new ejvr() { // from class: ckac
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        });
        D(ckbzVar);
        l();
    }

    @Override // defpackage.cjzq
    public final boolean o() {
        return a().equals(ckbz.TOGGLE_STATE_ENABLED);
    }

    public final ckcc p(dggn dggnVar) {
        int iB = ((cjpl) this.x.b()).b(dggnVar) - 1;
        ckcc ckccVar = iB != 0 ? iB != 1 ? ckcc.PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED : ckcc.PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED : ckcc.PER_SIM_TOGGLE_STATE_ENABLED;
        ((ekrd) a.e().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "getDefaultSimLevelToggleStateForProvisioningRule", 356, "RcsSettingsDataServiceImpl.kt")).D("Default sim level toggle state for rcsProvisioningId: %s is %s", dhiz.SIM_ID.c(dggo.a(dggnVar).a), ckccVar);
        if (ckccVar == ckcc.PER_SIM_TOGGLE_STATE_ENABLED) {
            m(dggnVar, ckccVar);
        }
        return ckccVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r8 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (A(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:32:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ckad
            if (r0 == 0) goto L13
            r0 = r8
            ckad r0 = (defpackage.ckad) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ckad r0 = new ckad
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r8)
            goto Lb3
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r8)
            goto L81
        L3c:
            defpackage.fctl.b(r8)
            goto L53
        L40:
            defpackage.fctl.b(r8)
            fcsu r8 = r7.g
            java.lang.Object r8 = r8.b()
            cmlb r8 = (defpackage.cmlb) r8
            r0.d = r5
            java.lang.Object r8 = r8.t()
            if (r8 == r1) goto Lb6
        L53:
            java.util.Set r8 = (java.util.Set) r8
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto Lb3
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L66
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L66
            goto L8a
        L66:
            java.util.Iterator r8 = r8.iterator()
            r2 = r8
        L6b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L8a
            java.lang.Object r8 = r2.next()
            dggn r8 = (defpackage.dggn) r8
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r7.v(r8, r0)
            if (r8 == r1) goto Lb6
        L81:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            r5 = 0
        L8a:
            if (r5 == 0) goto Lb3
            ekrg r8 = defpackage.ckbk.a
            ekrw r8 = r8.h()
            r2 = 427(0x1ab, float:5.98E-43)
            java.lang.String r4 = "RcsSettingsDataServiceImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl"
            java.lang.String r6 = "automaticallyDisableGlobalToggle"
            ekrw r8 = r8.h(r5, r6, r2, r4)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r2 = "All sim level toggles disabled, automatically disabling global toggle"
            r8.q(r2)
            ckbz r8 = defpackage.ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r7.A(r8, r0)
            if (r8 != r1) goto Lb3
            goto Lb6
        Lb3:
            fctx r8 = defpackage.fctx.a
            return r8
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.q(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ckag
            if (r0 == 0) goto L13
            r0 = r11
            ckag r0 = (defpackage.ckag) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ckag r0 = new ckag
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r11)
            goto L51
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L34:
            defpackage.fctl.b(r11)
            goto L4b
        L38:
            defpackage.fctl.b(r11)
            fcsu r11 = r10.g
            java.lang.Object r11 = r11.b()
            cmlb r11 = (defpackage.cmlb) r11
            r0.d = r4
            java.lang.Object r11 = r11.t()
            if (r11 == r1) goto Lbc
        L4b:
            java.util.Set r11 = (java.util.Set) r11
            java.util.Iterator r2 = r11.iterator()
        L51:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto Lb9
            java.lang.Object r11 = r2.next()
            dggn r11 = (defpackage.dggn) r11
            fcsu r5 = r10.x
            java.lang.Object r5 = r5.b()
            cjpl r5 = (defpackage.cjpl) r5
            int r5 = r5.b(r11)
            dggp r6 = defpackage.dggo.a(r11)
            java.lang.String r6 = r6.a
            fcsu r7 = r10.g
            java.lang.Object r7 = r7.b()
            cmlb r7 = (defpackage.cmlb) r7
            cmmb r7 = r7.a()
            java.lang.String r7 = r7.c
            boolean r6 = defpackage.fdbq.f(r6, r7)
            if (r5 == r4) goto L87
            if (r5 != r3) goto L51
            if (r6 == 0) goto L51
        L87:
            ekrg r5 = defpackage.ckbk.a
            ekrw r5 = r5.h()
            r6 = 258(0x102, float:3.62E-43)
            java.lang.String r7 = "RcsSettingsDataServiceImpl.kt"
            java.lang.String r8 = "com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl"
            java.lang.String r9 = "enableProvisioningRuleEligibleSims"
            ekrw r5 = r5.h(r8, r9, r6, r7)
            ekrd r5 = (defpackage.ekrd) r5
            dhiz r6 = defpackage.dhiz.SIM_ID
            dggp r7 = defpackage.dggo.a(r11)
            java.lang.String r7 = r7.a
            java.lang.String r6 = r6.c(r7)
            java.lang.String r7 = "Enabling RCS for provisioning rule eligible SIM: %s"
            r5.t(r7, r6)
            ckcc r5 = defpackage.ckcc.PER_SIM_TOGGLE_STATE_ENABLED
            r0.a = r2
            r0.d = r3
            java.lang.Object r11 = r10.z(r11, r5, r0)
            if (r11 != r1) goto L51
            goto Lbc
        Lb9:
            fctx r11 = defpackage.fctx.a
            return r11
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.r(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.dggn r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ckai
            if (r0 == 0) goto L13
            r0 = r7
            ckai r0 = (defpackage.ckai) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckai r0 = new ckai
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.d
            fcyh r7 = defpackage.eicg.a(r7)
            ckah r2 = new ckah
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.s(dggn, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.dggn r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ckak
            if (r0 == 0) goto L13
            r0 = r7
            ckak r0 = (defpackage.ckak) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckak r0 = new ckak
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.d
            fcyh r7 = defpackage.eicg.a(r7)
            ckaj r2 = new ckaj
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.t(dggn, fcxy):java.lang.Object");
    }

    public final Object u(fcxy fcxyVar) {
        return this.f.c(fcxyVar);
    }

    public final Object v(dggn dggnVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ckal(null, this, dggnVar), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ckao
            if (r0 == 0) goto L13
            r0 = r5
            ckao r0 = (defpackage.ckao) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckao r0 = new ckao
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.u(r0)
            if (r5 == r1) goto L84
        L3a:
            ckce r5 = (defpackage.ckce) r5
            evtf r0 = new evtf
            evub r5 = r5.c
            evtb r1 = defpackage.ckce.f
            r0.<init>(r5, r1)
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r0)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.size()
            int r1 = defpackage.fcwa.a(r1)
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L61:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            dggp r2 = new dggp
            java.lang.Object r3 = r1.getKey()
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L61
        L83:
            return r0
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.w(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x06cb, code lost:
    
        r0 = r3;
        ((defpackage.ekrd) r8.e().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "getRcsSettingsSimInfo", 447, "RcsSettingsDataServiceImpl.kt")).t("Provisioning rule disabled, skipping RcsSettingsSimInfo for rcsProvisioningId: %s", r10.c(defpackage.dggo.a(r7).a));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:102:0x0593, B:106:0x05a1], limit reached: 140 */
    /* JADX WARN: Path cross not found for [B:54:0x0326, B:56:0x0334], limit reached: 140 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x052c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x062f -> B:16:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x020d -> B:135:0x06cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.util.Set r44, defpackage.fcxy r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.x(java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r1 != r3) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0137 -> B:14:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbk.y(fcxy):java.lang.Object");
    }

    public final Object z(dggn dggnVar, ckcc ckccVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new ckbd(null, this, dggnVar, ckccVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
