package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chyw implements chyd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal");
    private final crnp A;
    private final fcsu B;
    private final cebq C;
    private final dgqr D;
    private final fcsu E;
    private final ctce F;
    private final fcsu G;
    private final fcsu H;
    public final fcsu b;
    public final fcsu c;
    public final cqdx d;
    public final eosc e;
    public final dhkw f;
    public final cmlb h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    private final fcsu o;
    private final Context p;
    private final fcsu q;
    private final fcsu r;
    private final chya s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final apwv z;
    private final ReadWriteLock m = new ReentrantReadWriteLock();
    public Optional g = Optional.empty();
    public boolean l = false;
    private final CopyOnWriteArraySet n = new CopyOnWriteArraySet();

    public chyw(Context context, fcsu fcsuVar, fcsu fcsuVar2, chya chyaVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cqdx cqdxVar, fcsu fcsuVar8, eosc eoscVar, fcsu fcsuVar9, fcsu fcsuVar10, dhkw dhkwVar, fcsu fcsuVar11, cmlb cmlbVar, apwv apwvVar, fcsu fcsuVar12, crnp crnpVar, fcsu fcsuVar13, cebq cebqVar, dgqr dgqrVar, fcsu fcsuVar14, ctce ctceVar, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18) {
        this.p = context;
        this.q = fcsuVar2;
        this.u = fcsuVar5;
        this.o = fcsuVar;
        this.i = fcsuVar12;
        this.b = fcsuVar3;
        this.t = fcsuVar4;
        this.v = fcsuVar6;
        this.c = fcsuVar7;
        this.s = chyaVar;
        this.d = cqdxVar;
        this.r = fcsuVar8;
        this.e = eoscVar;
        this.w = fcsuVar9;
        this.x = fcsuVar10;
        this.f = dhkwVar;
        this.y = fcsuVar11;
        this.h = cmlbVar;
        this.z = apwvVar;
        this.A = crnpVar;
        this.B = fcsuVar13;
        this.C = cebqVar;
        this.D = dgqrVar;
        this.E = fcsuVar14;
        this.F = ctceVar;
        this.j = fcsuVar15;
        this.G = fcsuVar16;
        this.H = fcsuVar17;
        this.k = fcsuVar18;
    }

    private final eiju w() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "canReshowSuccessFuture", 941, "RcsAvailabilityUpdaterLocal.java")).H("canReshowSuccessFuture: cacheReshownStatus: %s, hasReshownSuccess: %s", dfpi.A(), this.l);
        return (dfpi.A() && this.l) ? eijx.e(false) : ((cjxi) this.y.b()).d().h(new ejvr() { // from class: cjwg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cjuu) obj).o);
            }
        }, eoqg.a).h(new ejvr() { // from class: chyv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.l = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(!r3.booleanValue());
            }
        }, this.e);
    }

    @Override // defpackage.chyd
    public final eiju a(final chyx chyxVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityForAllSimsAsync", 279, "RcsAvailabilityUpdaterLocal.java")).I("updateAvailabilityForAllSimsAsync: scheduling updateAvailabilityForRcsProvisioningId call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", chyxVar, Boolean.valueOf(dfpi.O()), Boolean.valueOf(dfpi.V()));
        return (dfpi.O() && dfpi.V()) ? w().h(new ejvr() { // from class: chyh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.p(chyxVar, ((Boolean) obj).booleanValue());
                return null;
            }
        }, this.e) : eijx.f(new Runnable() { // from class: chyi
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p(chyxVar, false);
            }
        }, this.e);
    }

    @Override // defpackage.chyd
    public final eiju b(final dggn dggnVar, final chyx chyxVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityForRcsProvisioningIdAsync", 404, "RcsAvailabilityUpdaterLocal.java")).I("updateAvailabilityForRcsProvisioningIdAsync: scheduling updateAvailabilityForRcsProvisioningId call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", chyxVar, Boolean.valueOf(dfpi.O()), Boolean.valueOf(dfpi.V()));
        return (dfpi.O() && dfpi.V()) ? w().h(new ejvr() { // from class: chye
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.v(dggnVar, chyxVar, ((Boolean) obj).booleanValue());
                return null;
            }
        }, this.e) : eijx.f(new Runnable() { // from class: chyn
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(dggnVar, chyxVar);
            }
        }, this.e);
    }

    @Override // defpackage.chyd
    public final enwr c() {
        return ((chzn) this.r.b()).a();
    }

    @Override // defpackage.chyd
    public final enwr d(String str) {
        return ((chzn) this.r.b()).b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @Override // defpackage.chyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enwr e(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L3b
            fcsu r0 = r3.q
            java.lang.Object r1 = r0.b()
            crny r1 = (defpackage.crny) r1
            int r1 = r1.f()
            if (r4 != r1) goto L12
            goto L3b
        L12:
            cmlb r1 = r3.h
            r2 = 0
            j$.util.Optional r1 = r1.g(r4, r2)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L2c
            java.lang.Object r4 = r1.get()
            dggn r4 = (defpackage.dggn) r4
            dggp r4 = defpackage.dggo.a(r4)
            java.lang.String r4 = r4.a
            goto L47
        L2c:
            java.lang.Object r0 = r0.b()
            crny r0 = (defpackage.crny) r0
            crof r4 = r0.h(r4)
            java.lang.String r4 = r4.w()
            goto L47
        L3b:
            fcsu r4 = r3.o
            java.lang.Object r4 = r4.b()
            dhes r4 = (defpackage.dhes) r4
            java.lang.String r4 = r4.l()
        L47:
            if (r4 == 0) goto L56
            fcsu r0 = r3.r
            java.lang.Object r0 = r0.b()
            chzn r0 = (defpackage.chzn) r0
            enwr r4 = r0.b(r4)
            return r4
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Sim id is null."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chyw.e(int):enwr");
    }

    @Override // defpackage.chyd
    public final void f(chyy chyyVar) {
        this.g = Optional.ofNullable(chyyVar);
    }

    @Override // defpackage.chyd
    @Deprecated
    public final void h(final chyx chyxVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateAvailabilityAsync", 867, "RcsAvailabilityUpdaterLocal.java")).I("updateAvailabilityAsync: scheduling updateRcsAvailability call. Hint: %s, enableWelcomePopupWithoutGoogleTos: %s, reshowSuccessPopup: %s", chyxVar, Boolean.valueOf(dfpi.O()), Boolean.valueOf(dfpi.V()));
        if (dfpi.O() && dfpi.V()) {
            w().h(new ejvr() { // from class: chyr
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    this.a.q(chyxVar, ((Boolean) obj).booleanValue());
                    return null;
                }
            }, this.e).k(auvh.b(), eoqg.a);
        } else {
            eijx.f(new Runnable() { // from class: chys
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(chyxVar);
                }
            }, this.e).k(auvh.b(), eoqg.a);
        }
    }

    @Override // defpackage.chyd
    public final void i(dggn dggnVar, chyx chyxVar) {
        v(dggnVar, chyxVar, false);
    }

    @Override // defpackage.chyd
    @Deprecated
    public final void j(chyx chyxVar) {
        q(chyxVar, false);
    }

    @Override // defpackage.chyd
    public final enwr k(dggn dggnVar) {
        enwr enwrVarD = d(dggo.a(dggnVar).a);
        if (enwrVarD != enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return enwrVarD;
        }
        i(dggnVar, chyx.NO_HINT);
        return d(dggo.a(dggnVar).a);
    }

    @Override // defpackage.chyd
    @Deprecated
    public final enwr l() {
        enwr enwrVarC = c();
        if (enwrVarC != enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS) {
            return enwrVarC;
        }
        j(chyx.NO_HINT);
        return c();
    }

    @Override // defpackage.chyd
    @Deprecated
    public final void m() {
        j(chyx.NO_HINT);
    }

    @Override // defpackage.chyd
    public final enwr n(dggn dggnVar) {
        v(dggnVar, chyx.NO_HINT, false);
        return d(dggo.a(dggnVar).a);
    }

    public final void o(chyz chyzVar) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((chyy) it.next()).c(chyzVar);
        }
    }

    public final void p(final chyx chyxVar, final boolean z) {
        if (!this.z.a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailabilityForDefaultCallSim", 252, "RcsAvailabilityUpdaterLocal.java")).E("updateRcsAvailabilityForDefaultCallSim: hint: %s, canReshowWelcomeMessage: %s", chyxVar, z);
            this.h.h(cmla.a).ifPresent(new Consumer() { // from class: chyj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.v(new dggp(((cmmh) obj).c), chyxVar, z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "BugleRcsProvisioning");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "updateRcsAvailabilityForMultipleSims", 267, "RcsAvailabilityUpdaterLocal.java")).E("updateRcsAvailabilityForMultipleSims: hint: %s, canReshowWelcomeMessage: %s", chyxVar, z);
        Iterator it = this.h.n().iterator();
        while (it.hasNext()) {
            v((dggn) it.next(), chyxVar, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.chyx r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chyw.q(chyx, boolean):void");
    }

    public final boolean r(String str) {
        return ((cjyi) this.E.b()).j(new dggp(str));
    }

    public final boolean s(String str, dhki dhkiVar) {
        dhki dhkiVar2 = dhki.UNKNOWN;
        Configuration.InvalidConfigReason invalidConfigReason = Configuration.InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
        int iOrdinal = dhkiVar.ordinal();
        boolean zE = iOrdinal != 1 ? iOrdinal != 2 ? false : ((dgrs) this.b.b()).E(str) : ((dgrs) this.b.b()).G(str);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/availability/RcsAvailabilityUpdaterLocal", "isAvailable", 916, "RcsAvailabilityUpdaterLocal.java")).I("RcsAvailability configuration availability and enabled status: simId: %s, SipConnectionType: %s, isConfigurationAvailableAndEnabled: %s", dhiz.SIM_ID.c(str), dhkiVar, Boolean.valueOf(zE));
        return zE;
    }

    public final boolean t(String str) {
        return !((dgrs) this.b.b()).f(str).r().mChatAuth;
    }

    public final boolean u(String str) {
        return (this.z.a() || this.h.a().f.equals(str)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: all -> 0x0202, TryCatch #0 {all -> 0x0202, blocks: (B:3:0x0011, B:5:0x001b, B:7:0x0020, B:9:0x002e, B:11:0x003a, B:12:0x003d, B:14:0x004b, B:15:0x004e, B:17:0x0055, B:25:0x0080, B:27:0x0088, B:28:0x008b, B:30:0x0099, B:31:0x009c, B:64:0x017a, B:34:0x00bb, B:36:0x00c5, B:38:0x00d3, B:40:0x00e6, B:41:0x00ea, B:43:0x00f8, B:44:0x00fc, B:49:0x011b, B:51:0x0123, B:52:0x0127, B:54:0x012f, B:55:0x0133, B:57:0x013b, B:59:0x0145, B:60:0x0149, B:61:0x016e, B:62:0x0172, B:63:0x0176, B:21:0x0066, B:22:0x0069, B:24:0x007d), top: B:82:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(final defpackage.dggn r10, final defpackage.chyx r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chyw.v(dggn, chyx, boolean):void");
    }

    @Override // defpackage.chyd
    public final void g() {
    }
}
