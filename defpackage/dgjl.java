package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjl implements dgjo {
    public final Context b;
    public final dgrs c;
    public final deyo d;
    public final eosc e;
    public final fcsu f;
    public final dgjp g;
    public final dgjq h;
    private final String k;
    private final fcsu l;
    private final eosc m;
    private final cebq n;
    private final cebf o;
    private final fcsu p;
    public final dhip a = new dhip("AsterismGoogleTosConsentApi");
    private final AtomicInteger j = new AtomicInteger();

    public dgjl(Context context, fcsu fcsuVar, dgrs dgrsVar, deyo deyoVar, dheq dheqVar, dgjp dgjpVar, dgjq dgjqVar, eosc eoscVar, cebq cebqVar, cebf cebfVar, eosc eoscVar2, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = context;
        this.c = dgrsVar;
        this.d = deyoVar;
        this.k = dheqVar.f();
        this.l = fcsuVar;
        this.g = dgjpVar;
        this.h = dgjqVar;
        this.m = eoscVar;
        this.n = cebqVar;
        this.o = cebfVar;
        this.e = eoscVar2;
        this.f = fcsuVar2;
        this.p = fcsuVar3;
    }

    private final ListenableFuture j(final cjxn cjxnVar, final ewri ewriVar, int i) {
        SetAsterismConsentRequest setAsterismConsentRequestA;
        Bundle bundle = new Bundle();
        bundle.putString("is_mo_allowed", "false");
        dblj dbljVar = new dblj();
        dbljVar.a = this.j.incrementAndGet();
        dbljVar.b = 2;
        dbljVar.h = 2;
        dbljVar.f = 2;
        dbljVar.g = bundle;
        if (i == 2) {
            dbljVar.o = i;
            setAsterismConsentRequestA = dbljVar.a();
        } else if (i == 3) {
            i = 3;
            dbljVar.o = i;
            setAsterismConsentRequestA = dbljVar.a();
        } else {
            dbljVar.c = 2;
            dbljVar.e = Long.valueOf(Instant.now().toEpochMilli());
            Context context = this.b;
            dbljVar.i = dhla.e(context, dhla.a(context), 1);
            dbljVar.j = cjxnVar.d;
            dbljVar.k = cjxnVar.e;
            setAsterismConsentRequestA = dbljVar.a();
        }
        final SetAsterismConsentRequest setAsterismConsentRequest = setAsterismConsentRequestA;
        final String strL = l();
        ListenableFuture listenableFutureA = drgi.a(((dblg) this.l.b()).a(setAsterismConsentRequest));
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: dgjk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = strL;
                SetAsterismConsentResponse setAsterismConsentResponse = (SetAsterismConsentResponse) obj;
                int i2 = setAsterismConsentRequest.a;
                Integer numValueOf = Integer.valueOf(i2);
                cjxn cjxnVar2 = cjxnVar;
                cjqp cjqpVarB = cjqp.b(cjxnVar2.c);
                if (cjqpVarB == null) {
                    cjqpVarB = cjqp.UNRECOGNIZED;
                }
                String string = cjqpVarB.toString();
                cjxj cjxjVarB = cjxj.b(cjxnVar2.h);
                if (cjxjVarB == null) {
                    cjxjVarB = cjxj.UNRECOGNIZED;
                }
                dgjl dgjlVar = this.a;
                ewri ewriVar2 = ewriVar;
                String string2 = cjxjVarB.toString();
                String str2 = setAsterismConsentResponse.b;
                dhja.l(dgjlVar.a, "setAsterismConsent for Revoke Consent succeeded: sessionId=%s requestCode=%s tosConsent=%s rcsDefaultOnConsent=%s googleToSConsentSource=%s responseHasGmscoreIidToken=%s", str, numValueOf, string, string2, ewriVar2, Boolean.valueOf(!str2.isEmpty()));
                cjqp cjqpVarB2 = cjqp.b(cjxnVar2.c);
                if (cjqpVarB2 == null) {
                    cjqpVarB2 = cjqp.UNRECOGNIZED;
                }
                cjqp cjqpVar = cjqpVarB2;
                cjxj cjxjVarB2 = cjxj.b(cjxnVar2.h);
                if (cjxjVarB2 == null) {
                    cjxjVarB2 = cjxj.UNRECOGNIZED;
                }
                dgjlVar.d.A(dgjlVar.b, str, i2, cjqpVar, cjxjVarB2, ewriVar2, false, !str2.isEmpty(), true, null, true);
                return str2;
            }
        });
        eosc eoscVar = this.e;
        return einy.a(eooq.f(listenableFutureA, ejvrVarA, eoscVar), new ejvr() { // from class: dgiz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    cjxn cjxnVar2 = cjxnVar;
                    SetAsterismConsentRequest setAsterismConsentRequest2 = setAsterismConsentRequest;
                    String str = strL;
                    dgjl dgjlVar = this.a;
                    int i2 = setAsterismConsentRequest2.a;
                    Integer numValueOf = Integer.valueOf(i2);
                    cjqp cjqpVarB = cjqp.b(cjxnVar2.c);
                    if (cjqpVarB == null) {
                        cjqpVarB = cjqp.UNRECOGNIZED;
                    }
                    dhip dhipVar = dgjlVar.a;
                    ewri ewriVar2 = ewriVar;
                    dhja.t(th, dhipVar, "setAsterismConsent failure: sessionId=%s requestCode=%s consent=%s googleToSConsentSource=%s", str, numValueOf, cjqpVarB.toString(), ewriVar2);
                    deyo deyoVar = dgjlVar.d;
                    Context context2 = dgjlVar.b;
                    cjqp cjqpVarB2 = cjqp.b(cjxnVar2.c);
                    if (cjqpVarB2 == null) {
                        cjqpVarB2 = cjqp.UNRECOGNIZED;
                    }
                    cjxj cjxjVarB = cjxj.b(cjxnVar2.h);
                    if (cjxjVarB == null) {
                        cjxjVarB = cjxj.UNRECOGNIZED;
                    }
                    deyoVar.A(context2, str, i2, cjqpVarB2, cjxjVarB, ewriVar2, false, false, false, th, true);
                    ((ckid) dgjlVar.f.b()).a(5);
                }
                return th;
            }
        }, eoscVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture k(final defpackage.cjxn r9, final defpackage.ewri r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgjl.k(cjxn, ewri):com.google.common.util.concurrent.ListenableFuture");
    }

    private final String l() {
        return ((dgsz) this.p.b()).k(this.k);
    }

    private final boolean m() {
        return dfpi.z() ? this.o.a(this.k) : dfpi.G();
    }

    private final boolean n(cjxn cjxnVar) {
        if (!m()) {
            return false;
        }
        cjxj cjxjVarB = cjxj.b(cjxnVar.h);
        if (cjxjVarB == null) {
            cjxjVarB = cjxj.UNRECOGNIZED;
        }
        return cjxjVarB.equals(cjxj.LEGAL_FYI_SEEN);
    }

    public final eiju a(final boolean z) {
        return eijx.f(new Runnable() { // from class: dgjf
            @Override // java.lang.Runnable
            public final void run() {
                cjxm cjxmVar = (cjxm) cjxn.a.createBuilder();
                cjxj cjxjVar = z ? cjxj.OOB_CONSENT : cjxj.NO_OOB_CONSENT;
                dgjl dgjlVar = this.a;
                cjxmVar.copyOnWrite();
                ((cjxn) cjxmVar.instance).h = cjxjVar.a();
                dgjlVar.h.c((cjxn) cjxmVar.build());
            }
        }, this.e);
    }

    @Override // defpackage.dgjo
    public final ListenableFuture b() {
        final GetAsterismConsentRequest getAsterismConsentRequest = new GetAsterismConsentRequest(this.j.incrementAndGet(), 2);
        final String strL = l();
        dblg dblgVar = (dblg) this.l.b();
        dciz dcizVar = new dciz();
        dcizVar.a = new dblc(getAsterismConsentRequest);
        dcizVar.b = new Feature[]{dcod.a};
        dcizVar.c = 11301;
        ListenableFuture listenableFutureA = drgi.a(dblgVar.j(dcizVar.a()));
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: dgja
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                GetAsterismConsentResponse getAsterismConsentResponse = (GetAsterismConsentResponse) obj;
                cjqp cjqpVar = getAsterismConsentResponse.b == 1 ? cjqp.GOOGLE_TOS_CONSENTED : cjqp.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
                GetAsterismConsentRequest getAsterismConsentRequest2 = getAsterismConsentRequest;
                String str = strL;
                dgjl dgjlVar = this.a;
                String str2 = getAsterismConsentResponse.c;
                dgjlVar.c.s(str2);
                int i = getAsterismConsentRequest2.a;
                dhja.k("getAsterismConsent succeeded: sessionId=%s requestCode=%s consent=%s responseHasGmscoreIidToken=%s", str, Integer.valueOf(i), cjqpVar.toString(), Boolean.valueOf(!str2.isEmpty()));
                dgjlVar.d.x(dgjlVar.b, str, i, cjqpVar, !str2.isEmpty(), true, null);
                return new dgjm(cjqpVar, str2);
            }
        });
        eoqg eoqgVar = eoqg.a;
        return einy.a(eooq.f(listenableFutureA, ejvrVarA, eoqgVar), new ejvr() { // from class: dgjb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null) {
                    GetAsterismConsentRequest getAsterismConsentRequest2 = getAsterismConsentRequest;
                    String str = strL;
                    dgjl dgjlVar = this.a;
                    int i = getAsterismConsentRequest2.a;
                    dhja.s(th, "getAsterismConsent failure: sessionId=%s requestCode=%s", str, Integer.valueOf(i));
                    dgjlVar.d.x(dgjlVar.b, str, i, cjqp.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED, false, false, th);
                }
                return th;
            }
        }, eoqgVar);
    }

    @Override // defpackage.dgjo
    public final ListenableFuture c(final ewri ewriVar, boolean z) {
        if (dfpi.M() && z) {
            return eijx.h(new eooy() { // from class: dgjh
                /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                @Override // defpackage.eooy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        r7 = this;
                        dgjl r0 = r7.a
                        dgrs r1 = r0.c
                        j$.util.Optional r2 = r1.l()
                        cjxn r1 = r1.e()
                        boolean r3 = r2.isPresent()
                        r4 = 0
                        if (r3 == 0) goto L23
                        java.lang.Object r3 = r2.get()
                        cjxn r5 = defpackage.cjxn.a
                        evsn r3 = (defpackage.evsn) r3
                        boolean r3 = r3.equals(r5)
                        if (r3 != 0) goto L23
                        r3 = 1
                        goto L24
                    L23:
                        r3 = r4
                    L24:
                        ewri r5 = r2
                        cjxn r6 = defpackage.cjxn.a
                        boolean r6 = r1.equals(r6)
                        if (r3 == 0) goto L60
                        if (r6 != 0) goto L67
                        evvp r3 = r1.g
                        if (r3 != 0) goto L36
                        evvp r3 = defpackage.evvp.a
                    L36:
                        j$.time.Instant r3 = defpackage.evwz.d(r3)
                        java.lang.Object r4 = r2.get()
                        cjxn r4 = (defpackage.cjxn) r4
                        evvp r4 = r4.g
                        if (r4 != 0) goto L46
                        evvp r4 = defpackage.evvp.a
                    L46:
                        j$.time.Instant r4 = defpackage.evwz.d(r4)
                        boolean r3 = r3.isBefore(r4)
                        if (r3 == 0) goto L5b
                        java.lang.Object r1 = r2.get()
                        cjxn r1 = (defpackage.cjxn) r1
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.e(r5, r1)
                        return r0
                    L5b:
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.d(r5, r1)
                        return r0
                    L60:
                        if (r6 != 0) goto L67
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.d(r5, r1)
                        return r0
                    L67:
                        if (r3 == 0) goto L74
                        java.lang.Object r1 = r2.get()
                        cjxn r1 = (defpackage.cjxn) r1
                        com.google.common.util.concurrent.ListenableFuture r0 = r0.e(r5, r1)
                        return r0
                    L74:
                        dhip r1 = r0.a
                        java.lang.Object[] r2 = new java.lang.Object[r4]
                        java.lang.String r3 = "Both RcsDefaultOnConsentCache's and GoogleToSConsentCache's are empty in Storage, hence not Revoking Consent"
                        defpackage.dhja.l(r1, r3, r2)
                        fcsu r0 = r0.f
                        java.lang.Object r0 = r0.b()
                        ckid r0 = (defpackage.ckid) r0
                        r1 = 3
                        r0.a(r1)
                        com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eorv.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dgjh.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.e);
        }
        Optional optionalL = this.c.l();
        if (!optionalL.isEmpty()) {
            cjqp cjqpVar = cjqp.GOOGLE_TOS_DECLINED;
            cjqp cjqpVarB = cjqp.b(((cjxn) optionalL.get()).c);
            if (cjqpVarB == null) {
                cjqpVarB = cjqp.UNRECOGNIZED;
            }
            if (cjqpVar.equals(cjqpVarB)) {
                return eooq.f(eoqt.t(k((cjxn) optionalL.get(), ewriVar)), new ejvr() { // from class: dgji
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.g.b();
                        return null;
                    }
                }, this.m);
            }
        }
        dhja.k("Google ToS config is not available from Bugle storage or not declined.", new Object[0]);
        return eorv.a;
    }

    public final ListenableFuture d(ewri ewriVar, cjxn cjxnVar) {
        int iOrdinal = this.h.a().ordinal();
        Optional optionalEmpty = iOrdinal != 1 ? iOrdinal != 2 ? Optional.empty() : Optional.of(3) : Optional.of(2);
        if (!optionalEmpty.isEmpty()) {
            return eooq.f(eoqt.t(j(cjxnVar, ewriVar, ((Integer) optionalEmpty.get()).intValue())), new ejvr() { // from class: dgjg
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dgjl dgjlVar = this.a;
                    dgjlVar.g.b();
                    dgjlVar.h.b();
                    ((ckid) dgjlVar.f.b()).a(2);
                    return null;
                }
            }, this.e);
        }
        dhja.l(this.a, "RcsDefaultOnConsentState is not LEGAL_FYI_SEEN or OOB_CONSENT", new Object[0]);
        return eorv.a;
    }

    public final ListenableFuture e(ewri ewriVar, cjxn cjxnVar) {
        return eooq.f(eoqt.t(j(cjxnVar, ewriVar, 1)), new ejvr() { // from class: dgjc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dgjl dgjlVar = this.a;
                dgjlVar.g.b();
                dgjlVar.h.b();
                ((ckid) dgjlVar.f.b()).a(2);
                return null;
            }
        }, this.e);
    }

    @Override // defpackage.dgjo
    public final ListenableFuture f(final ewri ewriVar) {
        Object obj;
        if (!h(ewriVar)) {
            Optional optionalL = this.c.l();
            if (!optionalL.isEmpty()) {
                cjqp cjqpVarB = cjqp.b(((cjxn) optionalL.get()).c);
                if (cjqpVarB == null) {
                    cjqpVarB = cjqp.UNRECOGNIZED;
                }
                if (!cjqpVarB.equals(cjqp.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED)) {
                    obj = optionalL.get();
                }
            }
            return eork.h(new IllegalStateException("Google ToS config is not available from Bugle storage."));
        }
        cjxn cjxnVarE = this.c.e();
        obj = cjxnVarE;
        if (!g()) {
            cjxj cjxjVarB = cjxj.b(cjxnVarE.h);
            if (cjxjVarB == null) {
                cjxjVarB = cjxj.UNRECOGNIZED;
            }
            obj = cjxnVarE;
            if (cjxjVarB.equals(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
                return eork.h(new IllegalStateException("RCS Default On config is not available from Bugle storage."));
            }
        }
        return eooq.g(eoqt.t(k((cjxn) obj, ewriVar)), new eooz() { // from class: dgiy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final dgjl dgjlVar = this.a;
                final String str = (String) obj2;
                dgjlVar.c.s(str);
                ewri ewriVar2 = ewriVar;
                if (dgjlVar.g() && ewriVar2.equals(ewri.RCS_DEFAULT_ON_OOB_CONSENT)) {
                    return dgjlVar.a(true).h(new ejvr() { // from class: dgjj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj3) {
                            dgjlVar.h.d();
                            return str;
                        }
                    }, dgjlVar.e);
                }
                if (dgjlVar.h(ewriVar2)) {
                    dgjlVar.h.d();
                } else {
                    dgjp dgjpVar = dgjlVar.g;
                    Instant instantNow = Instant.now();
                    evvo evvoVar = (evvo) evvp.a.createBuilder();
                    long epochSecond = instantNow.getEpochSecond();
                    evvoVar.copyOnWrite();
                    ((evvp) evvoVar.instance).b = epochSecond;
                    int nano = instantNow.getNano();
                    evvoVar.copyOnWrite();
                    ((evvp) evvoVar.instance).c = nano;
                    evvp evvpVar = (evvp) evvoVar.build();
                    try {
                        dgjpVar.a.b.o("rcsProvisioningGoogleToSServerUpdateTime", evvpVar);
                        dhja.l(dgrs.a, "putRcsProvisioningGoogleTosServerUpdateTime %s", evvpVar);
                    } catch (dhhd e) {
                        dhja.j(e, dgrs.a, "Error while putting Google ToS server update time in bugle storage", new Object[0]);
                    }
                }
                return eijx.e(str);
            }
        }, this.e);
    }

    public final boolean g() {
        return dfpi.z() ? this.o.b(this.k) : dfpi.J();
    }

    public final boolean h(ewri ewriVar) {
        if (m() && ewriVar.equals(ewri.LEGAL_FYI_SEEN)) {
            return true;
        }
        return g() && ewriVar.equals(ewri.RCS_DEFAULT_ON_OOB_CONSENT);
    }

    public final boolean i() {
        return g() && this.h.a().equals(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED);
    }
}
