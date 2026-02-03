package defpackage;

import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffm implements cfrj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler");
    public static final cepp b = cepp.c("Bugle.PhoneRegistrationRpc.Response");
    public static final cczi c = cdag.h(cdag.b, "tachyon_fail_invalid_rcs_token", true);
    public static final cczi d = cdag.h(cdag.b, "skip_rcs_token", false);
    public static final ejxr e = ejxx.a(new ejxr() { // from class: cffk
        @Override // defpackage.ejxr
        public final Object get() {
            ekrg ekrgVar = cffm.a;
            return Pattern.compile((String) cefs.e.e());
        }
    });
    public final cepq f;
    public final fcsu g;
    private final cfgs h;
    private final ceop i;
    private final eosc j;
    private final cexn k;
    private final alrj l;
    private final fcsu m;
    private final cfre n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private String r = "";
    private long s = 0;

    public cffm(cfgs cfgsVar, ceop ceopVar, eosc eoscVar, cepq cepqVar, cexn cexnVar, alrj alrjVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cfre cfreVar) {
        this.h = cfgsVar;
        this.i = ceopVar;
        this.j = eoscVar;
        this.f = cepqVar;
        this.k = cexnVar;
        this.l = alrjVar;
        this.m = fcsuVar;
        this.n = cfreVar;
        this.q = fcsuVar5;
        this.o = fcsuVar2;
        this.p = fcsuVar3;
        this.g = fcsuVar4;
    }

    public static eiju n(String str) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "failRegisterRequest", 416, "RegisterPhoneRpcHandler.java")).t("RegisterRequest failed to be created due to %s", str);
        return eijx.d(new fbtf(Status.l.d(new IllegalStateException(str))));
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.s;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.n;
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(final ezpp ezppVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createRequest", 184, "RegisterPhoneRpcHandler.java")).t("Phone registration request id: %s", ezppVar.c);
        this.r = ezppVar.c;
        alqm alqmVarM = m();
        ceop ceopVar = this.i;
        String strQ = q();
        final eiju eijuVarA = ceopVar.a(strQ);
        cfgr cfgrVarA = this.h.a();
        cfgrVarA.m(new Callable() { // from class: cffg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekrg ekrgVar = cffm.a;
                return eijuVarA;
            }
        });
        cfgrVarA.j();
        cfgrVarA.i();
        cfgrVarA.k = Optional.of(strQ);
        cfgrVarA.h();
        cfgrVarA.g(alqmVarM, 1);
        cfgrVarA.e(alqmVarM);
        cfgrVarA.f(alqmVarM);
        final ListenableFuture listenableFutureB = cfgrVarA.b();
        final ListenableFuture listenableFutureSubmit = this.j.submit(eiid.l(new Callable() { // from class: cffh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Optional optionalO = this.a.o();
                if (optionalO.isEmpty()) {
                    ekrw ekrwVarJ = cffm.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getRcsTachyonAuthToken", 425, "RegisterPhoneRpcHandler.java")).q("getRcsTachyonAuthToken: Unable to retrieve tachyon auth token, configuration is empty.");
                    return "";
                }
                String strZ = ((dgiq) optionalO.get()).z();
                if (strZ == null) {
                    ekrw ekrwVarJ2 = cffm.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getRcsTachyonAuthToken", 431, "RegisterPhoneRpcHandler.java")).q("getRcsTachyonAuthToken: Unable to retrieve tachyon auth token, token is null.");
                    return strZ;
                }
                if (strZ.isEmpty()) {
                    ekrw ekrwVarJ3 = cffm.a.j();
                    ekrwVarJ3.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getRcsTachyonAuthToken", 434, "RegisterPhoneRpcHandler.java")).q("getRcsTachyonAuthToken: Unable to retrieve tachyon auth token, token is empty.");
                }
                return strZ;
            }
        }));
        return eika.d(listenableFutureB, listenableFutureSubmit).b(new eooy() { // from class: cffi
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ezli ezliVar = (ezli) eork.q(listenableFutureB);
                String str = (String) eork.q(listenableFutureSubmit);
                ezok ezokVar = (ezok) ezol.a.createBuilder();
                felm felmVar = felm.PHONE_NUMBER;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).b = felmVar.a();
                cffm cffmVar = this.a;
                String strQ2 = cffmVar.q();
                ezokVar.copyOnWrite();
                ezol ezolVar = (ezol) ezokVar.instance;
                strQ2.getClass();
                ezolVar.c = strQ2;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).d = "RCS";
                ezol ezolVar2 = (ezol) ezokVar.build();
                ezlo ezloVar = (ezlo) ezlp.a.createBuilder();
                ezloVar.copyOnWrite();
                ezlp ezlpVar = (ezlp) ezloVar.instance;
                ezpp ezppVar2 = ezppVar;
                ezppVar2.getClass();
                ezlpVar.c = ezppVar2;
                ezlpVar.b |= 1;
                ezloVar.copyOnWrite();
                ezlp ezlpVar2 = (ezlp) ezloVar.instance;
                ezolVar2.getClass();
                ezlpVar2.d = ezolVar2;
                ezlpVar2.b |= 2;
                ezloVar.copyOnWrite();
                ezlp ezlpVar3 = (ezlp) ezloVar.instance;
                ezlj ezljVar = (ezlj) ezliVar.build();
                ezljVar.getClass();
                ezlpVar3.e = ezljVar;
                ezlpVar3.b |= 4;
                if (((Boolean) cffm.d.e()).booleanValue()) {
                    ekrw ekrwVarE = cffm.a.e();
                    ekrwVarE.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createPhoneRegisterRequest", 289, "RegisterPhoneRpcHandler.java")).q("Configured to omit RCS token");
                    return eijx.e((ezlp) ezloVar.build());
                }
                if (TextUtils.isEmpty(str)) {
                    ekrg ekrgVar = cffm.a;
                    ekrw ekrwVarE2 = ekrgVar.e();
                    ekrz ekrzVar = eksq.a;
                    ekrwVarE2.X(ekrzVar, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "createPhoneRegisterRequest", 293, "RegisterPhoneRpcHandler.java")).q("No RCS token in RegisterRequest");
                    Optional optionalP = cffmVar.p();
                    if (optionalP.isEmpty()) {
                        if (((aptv) cffmVar.g.b()).a()) {
                            cffmVar.r(cffl.UNKNOWN_BACKEND_NO_TOKEN);
                            return eijx.e((ezlp) ezloVar.build());
                        }
                        cffmVar.r(cffl.UNKNOWN_BACKEND_NO_TOKEN_BLOCKED);
                        return cffm.n("Missing RCS token for unknown backend");
                    }
                    if (((Boolean) optionalP.get()).booleanValue()) {
                        cffmVar.r(cffl.JIBE_NO_TOKEN_BLOCKED);
                        return cffm.n("Missing RCS token for Jibe");
                    }
                    ekrw ekrwVarH2 = ekrgVar.h();
                    ekrwVarH2.X(ekrzVar, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "buildRequestWithoutIdentityProof", 332, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest without RCS token for 3P");
                    cffmVar.r(cffl.THIRD_PARTY_NO_TOKEN);
                    return eijx.e((ezlp) ezloVar.build());
                }
                Optional optionalP2 = cffmVar.p();
                if (optionalP2.isEmpty()) {
                    ekrw ekrwVarH3 = cffm.a.h();
                    ekrwVarH3.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 403, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token. Backend type is unknown.");
                    cffmVar.r(cffl.UNKNOWN_BACKEND_HAS_TOKEN);
                } else if (((Boolean) optionalP2.get()).booleanValue()) {
                    ekrw ekrwVarH4 = cffm.a.h();
                    ekrwVarH4.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 406, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token for Jibe");
                    cffmVar.r(cffl.JIBE_HAS_TOKEN);
                } else {
                    ekrw ekrwVarJ = cffm.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 410, "RegisterPhoneRpcHandler.java")).q("Creating RegisterRequest with RCS token for 3P");
                    cffmVar.r(cffl.THIRD_PARTY_HAS_TOKEN);
                }
                Boolean bool = (Boolean) cffm.c.e();
                boolean zBooleanValue = bool.booleanValue();
                ekrw ekrwVarH5 = cffm.a.h();
                ekrwVarH5.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "buildRequestWithIdentityProof", 340, "RegisterPhoneRpcHandler.java")).t("Using RCS token in RegisterRequest, failInvalidToken: %b", bool);
                ezje ezjeVar = (ezje) ezjf.a.createBuilder();
                ezjeVar.copyOnWrite();
                ezjf ezjfVar = (ezjf) ezjeVar.instance;
                str.getClass();
                ezjfVar.b = str;
                if (zBooleanValue) {
                    ezjeVar.copyOnWrite();
                    ((ezjf) ezjeVar.instance).c = 1;
                }
                ezloVar.copyOnWrite();
                ezlp ezlpVar4 = (ezlp) ezloVar.instance;
                ezjf ezjfVar2 = (ezjf) ezjeVar.build();
                ezjfVar2.getClass();
                ezlpVar4.f = ezjfVar2;
                ezlpVar4.b |= 64;
                return eijx.e((ezlp) ezloVar.build());
            }
        }, eoqg.a);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(final cezv cezvVar, evuh evuhVar) {
        final ezlp ezlpVar = (ezlp) evuhVar;
        cexm cexmVarA = this.k.a(q());
        ezlj ezljVar = ezlpVar.e;
        if (ezljVar == null) {
            ezljVar = ezlj.a;
        }
        return cexmVarA.o(cfes.m(ezljVar), cfes.p(ezljVar), cfes.n(ezljVar), cfes.o(ezljVar)).i(new eooz() { // from class: cfff
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cffm cffmVar = this.a;
                alqm alqmVarM = cffmVar.m();
                cczv cczvVar = alvx.a;
                String strI = alqmVarM.i(((Boolean) new ejxr() { // from class: alvl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return Boolean.valueOf(eotp.a("bugle.enable_mi_in_tachygram", "bugle"));
                    }
                }.get()).booleanValue());
                strI.getClass();
                ezok ezokVarA = cnln.a();
                ezokVarA.copyOnWrite();
                ezol ezolVar = (ezol) ezokVarA.instance;
                ezol ezolVar2 = ezol.a;
                ezolVar.c = strI;
                felm felmVar = felm.PHONE_NUMBER;
                ezokVarA.copyOnWrite();
                ((ezol) ezokVarA.instance).b = felmVar.a();
                ezol ezolVar3 = (ezol) ezokVarA.build();
                cezv cezvVar2 = cezvVar;
                return cffmVar.f.a(cffm.b, cezvVar2.d(ezolVar3).e(ezlpVar));
            }
        }, this.j);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezlr ezlrVar = (ezlr) evuhVar;
        if (ezlrVar != null) {
            ezpr ezprVar = ezlrVar.c;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.s = j;
        return eork.i(ezlrVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RegisterPhoneRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.r;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    public final alqm m() {
        return this.l.r(q());
    }

    public final Optional o() {
        fcsu fcsuVar = this.p;
        return ((dggz) this.o.b()).j(((dggl) fcsuVar.b()).a(q()));
    }

    public final Optional p() {
        Optional optionalO = o();
        if (optionalO.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "isJibeBackendOrEmpty", 352, "RegisterPhoneRpcHandler.java")).q("Can not determine backend type due to missing RCS configuration.");
        }
        return optionalO.flatMap(new Function() { // from class: cffj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = cffm.a;
                ImsConfiguration imsConfigurationN = ((dgiq) obj).n();
                if (imsConfigurationN == null) {
                    ekrw ekrwVarJ2 = cffm.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 377, "RegisterPhoneRpcHandler.java")).q("Null IMS config");
                    return Optional.empty();
                }
                String str = imsConfigurationN.mPcscfAddress;
                if (TextUtils.isEmpty(str)) {
                    ekrw ekrwVarJ3 = cffm.a.j();
                    ekrwVarJ3.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 383, "RegisterPhoneRpcHandler.java")).q("Empty PCSCF address");
                    return Optional.empty();
                }
                boolean zMatches = ((Pattern) cffm.e.get()).matcher(str).matches();
                ekrw ekrwVarE = cffm.a.e();
                ekrwVarE.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ekrwVarE;
                ekrdVar.X(cqnc.V, str);
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "getIsJibe", 391, "RegisterPhoneRpcHandler.java");
                Boolean boolValueOf = Boolean.valueOf(zMatches);
                ekrdVar2.t("Backend isJibe:%b", boolValueOf);
                return Optional.of(boolValueOf);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final String q() {
        cfep cfepVar = (cfep) this.q.b();
        String str = this.n.b;
        cfepVar.a(str, 1);
        return str;
    }

    public final void r(cffl cfflVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/RegisterPhoneRpcHandler", "logRcsTokenStatus", 396, "RegisterPhoneRpcHandler.java")).t("RCS token status: %s", cfflVar);
        ((ains) this.m.b()).e("Bugle.PhoneRegistrationRpc.RcsTokenStatus", cfflVar.i);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
