package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuc {
    public static final cqce a = cqce.g("Bugle", "VerifiedSmsRegistrationHelper");
    public final csve b;
    public final ceru c;
    public final cswj d;
    public final fcsu e;
    public final eosc f;
    public final ains g;
    public final fcsu h;
    private final cssx i;
    private final eosc j;
    private volatile eiju k = eijx.e(false);

    public csuc(csve csveVar, cssx cssxVar, ceru ceruVar, cswj cswjVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, ains ainsVar, fcsu fcsuVar2) {
        this.b = csveVar;
        this.i = cssxVar;
        this.c = ceruVar;
        this.d = cswjVar;
        this.e = fcsuVar;
        this.f = eoscVar;
        this.j = eoscVar2;
        this.g = ainsVar;
        this.h = fcsuVar2;
    }

    public final eiju a(final String str, final String str2, String str3) {
        if (byew.a().booleanValue()) {
            return eijx.e(false);
        }
        if (!this.i.c()) {
            a.p("Verified SMS is disabled or not supported, not storing RCS token.");
            return eijx.e(null);
        }
        if (!this.k.isDone()) {
            a.p("Received a registration request for RCS but something else is already running.");
            return this.k;
        }
        try {
            final evqs evqsVarX = evqs.x(Base64.decode(str3, 8));
            eiju eijuVarG = eijx.g(new Callable() { // from class: cstw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.g.c("Bugle.VerifiedSms.Registration.RcsTokenReceived.Counts");
                    return null;
                }
            }, this.j);
            eooz eoozVar = new eooz() { // from class: cstx
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (byew.a().booleanValue()) {
                        return eijx.e(null);
                    }
                    final evqs evqsVar = evqsVarX;
                    final String str4 = str2;
                    final String str5 = str;
                    csuc csucVar = this.a;
                    csve.b.p("Storing vsms rcs token");
                    final csve csveVar = csucVar.b;
                    return csveVar.d(new Function() { // from class: csvc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            csup csupVar = (csup) obj2;
                            if (byew.a().booleanValue()) {
                                throw new IllegalStateException();
                            }
                            String str6 = str4;
                            csul csulVar = (csul) csupVar.toBuilder();
                            csuk csukVar = csuk.a;
                            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((csup) csulVar.instance).e);
                            csuk csukVar2 = mapUnmodifiableMap.containsKey(str6) ? (csuk) mapUnmodifiableMap.get(str6) : csukVar;
                            evqs evqsVar2 = evqsVar;
                            String str7 = str5;
                            cqce cqceVar = csve.b;
                            cqbd cqbdVarC = cqceVar.c();
                            cqbdVarC.I("Adding new RCS token for msisdn");
                            cqbdVarC.x("msisdn", str6, 2);
                            cqbdVarC.M("imsi", str7);
                            cqbdVarC.B("new entry", csukVar.equals(csukVar2));
                            cqbdVarC.r();
                            csui csuiVar = (csui) csukVar2.toBuilder();
                            csuiVar.copyOnWrite();
                            ((csuk) csuiVar.instance).d = evqsVar2;
                            csuk csukVar3 = (csuk) csuiVar.build();
                            cqceVar.p("Associating msisdn with updated registration data");
                            csulVar.b(str6, csukVar3);
                            str7.getClass();
                            boolean zContainsKey = DesugarCollections.unmodifiableMap(((csup) csulVar.instance).d).containsKey(str7);
                            cqbd cqbdVarC2 = cqceVar.c();
                            cqbdVarC2.I("Associating IMSI with msisdn");
                            cqbdVarC2.B("new association", !zContainsKey);
                            cqbdVarC2.r();
                            csulVar.a(str7, str6);
                            if (csupVar.f) {
                                csuf csufVar = ((csup) csulVar.instance).h;
                                if (csufVar == null) {
                                    csufVar = csuf.a;
                                }
                                csud csudVar = (csud) csufVar.toBuilder();
                                csudVar.copyOnWrite();
                                ((csuf) csudVar.instance).d = csuf.emptyProtobufList();
                                csuf csufVar2 = csupVar.h;
                                if (csufVar2 == null) {
                                    csufVar2 = csuf.a;
                                }
                                Collection collectionE = csve.e(csufVar2.d, evxc.c(csveVar.e.f().toEpochMilli()));
                                csudVar.copyOnWrite();
                                csuf csufVar3 = (csuf) csudVar.instance;
                                evtg evtgVar = csufVar3.d;
                                if (!evtgVar.c()) {
                                    csufVar3.d = evsn.mutableCopy(evtgVar);
                                }
                                evpz.addAll(collectionE, csufVar3.d);
                                csulVar.copyOnWrite();
                                csup csupVar2 = (csup) csulVar.instance;
                                csuf csufVar4 = (csuf) csudVar.build();
                                csufVar4.getClass();
                                csupVar2.h = csufVar4;
                                csupVar2.b |= 2;
                            }
                            return csulVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            };
            eosc eoscVar = this.f;
            eiju eijuVarI = eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: csty
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.b.c();
                }
            }, eoscVar).i(new eooz() { // from class: cstz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final String str4 = str;
                    csup csupVar = (csup) obj;
                    str4.getClass();
                    evub evubVar = csupVar.d;
                    String str5 = evubVar.containsKey(str4) ? (String) evubVar.get(str4) : "";
                    final String str6 = str2;
                    boolean zEquals = TextUtils.equals(str5, str6);
                    final csuk csukVar = csuk.a;
                    evub evubVar2 = csupVar.e;
                    if (evubVar2.containsKey(str6)) {
                        csukVar = (csuk) evubVar2.get(str6);
                    }
                    cqce cqceVar = csuc.a;
                    cqceVar.p("Checking if vsms key registration is necessary");
                    if (zEquals && !csukVar.b.isEmpty()) {
                        cqceVar.p("Not registering, keys already present");
                        return eijx.e(false);
                    }
                    final csuc csucVar = this.a;
                    if (!csukVar.b.isEmpty() && !zEquals) {
                        cqceVar.p("Associating new imsi with existing keys for same msisdn");
                        return csucVar.b.b(str4, str6).h(new ejvr() { // from class: csub
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return true;
                            }
                        }, csucVar.f);
                    }
                    if (csukVar.d.H() && csukVar.e.isEmpty()) {
                        cqceVar.p("No Vsms RCS or C11N token stored after all");
                        return eijx.e(false);
                    }
                    cqbd cqbdVarC = cqceVar.c();
                    cqbdVarC.I("Generating KeyPair for vsms registration");
                    cqbdVarC.x("msisdn", str6, 2);
                    cqbdVarC.r();
                    cswj cswjVar = csucVar.d;
                    if (byew.a().booleanValue()) {
                        throw new IllegalStateException();
                    }
                    return eijx.g(new Callable() { // from class: cswf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return cswj.b();
                        }
                    }, cswjVar.c).i(new eooz() { // from class: cstr
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final KeyPair keyPair = (KeyPair) obj2;
                            eqra eqraVar = eqra.a;
                            eqqz eqqzVar = (eqqz) eqraVar.createBuilder();
                            evqs evqsVarX2 = evqs.x(keyPair.getPublic().getEncoded());
                            eqqzVar.copyOnWrite();
                            eqra eqraVar2 = (eqra) eqqzVar.instance;
                            evtg evtgVar = eqraVar2.f;
                            if (!evtgVar.c()) {
                                eqraVar2.f = evsn.mutableCopy(evtgVar);
                            }
                            csuk csukVar2 = csukVar;
                            eqraVar2.f.add(evqsVarX2);
                            if (!csukVar2.d.H()) {
                                csuc.a.p("Creating register request with RCS token...");
                                evqs evqsVar = csukVar2.d;
                                eqqzVar.copyOnWrite();
                                eqra eqraVar3 = (eqra) eqqzVar.instance;
                                evqsVar.getClass();
                                eqraVar3.d = evqsVar;
                            }
                            if (!csukVar2.e.isEmpty()) {
                                csuc.a.p("Creating register request with C11N token...");
                                String str7 = csukVar2.e;
                                eqqzVar.copyOnWrite();
                                eqra eqraVar4 = (eqra) eqqzVar.instance;
                                str7.getClass();
                                eqraVar4.e = str7;
                            }
                            final String str8 = str6;
                            final csuc csucVar2 = csucVar;
                            final eqra eqraVar5 = (eqra) eqqzVar.build();
                            final alqm alqmVarN = ((alrj) csucVar2.h.b()).n(str8);
                            eqraVar5.getClass();
                            eqqz eqqzVar2 = (eqqz) eqraVar5.toBuilder();
                            eqrr eqrrVar = (eqrr) eqrs.a.createBuilder();
                            eqrrVar.copyOnWrite();
                            ((eqrs) eqrrVar.instance).b = "replace_me";
                            eqrs eqrsVar = (eqrs) eqrrVar.build();
                            eqqzVar2.copyOnWrite();
                            eqra eqraVar6 = (eqra) eqqzVar2.instance;
                            eqrsVar.getClass();
                            eqraVar6.c = eqrsVar;
                            eqraVar6.b |= 1;
                            eqra eqraVar7 = (eqra) eqqzVar2.build();
                            eqqx eqqxVar = (eqqx) csucVar2.c.a.a().k(((Long) cerv.a.e()).longValue(), TimeUnit.MILLISECONDS);
                            fbnd fbndVar = eqqxVar.a;
                            fbrk fbrkVar = eqqy.a;
                            if (fbrkVar == null) {
                                synchronized (eqqy.class) {
                                    fbrkVar = eqqy.a;
                                    if (fbrkVar == null) {
                                        fbrh fbrhVarA = fbrk.a();
                                        fbrhVarA.c = fbrj.UNARY;
                                        fbrhVarA.d = fbrk.c("google.communications.verifiedsms.v1.MessageVerificationService", "Register");
                                        fbrhVarA.b();
                                        evrr evrrVar = fcrj.a;
                                        fbrhVarA.a = new fcrh(eqraVar);
                                        fbrhVarA.b = new fcrh(eqrc.a);
                                        fbrk fbrkVarA = fbrhVarA.a();
                                        eqqy.a = fbrkVarA;
                                        fbrkVar = fbrkVarA;
                                    }
                                }
                            }
                            final String str9 = str4;
                            eiju eijuVarG2 = eiju.g(eiju.g(fcrw.a(fbndVar.a(fbrkVar, eqqxVar.b), eqraVar7)));
                            eooz eoozVar2 = new eooz() { // from class: cstm
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    final Throwable th = (Throwable) obj3;
                                    csuc.a.s("Key pair registration on server failed", th);
                                    csuc csucVar3 = csucVar2;
                                    return csucVar3.b(eqraVar5, 4, th).i(new eooz() { // from class: csts
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            return eijx.d(th);
                                        }
                                    }, csucVar3.f);
                                }
                            };
                            eosc eoscVar2 = csucVar2.f;
                            return eijuVarG2.f(Throwable.class, eoozVar2, eoscVar2).i(new eooz() { // from class: cstn
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    eiju eijuVarF;
                                    eiju eijuVarI2;
                                    eqrc eqrcVar = (eqrc) obj3;
                                    eqrcVar.getClass();
                                    cqbd cqbdVarC2 = csuc.a.c();
                                    cqbdVarC2.I("Successful vsms registration. Saving key pairs.");
                                    cqbdVarC2.x("msisdn", str8, 2);
                                    cqbdVarC2.r();
                                    ekfk ekfkVar = csve.a;
                                    int i = eqrcVar.b;
                                    eqrd eqrdVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : eqrd.C11N_RCS : eqrd.C11N : eqrd.RCS : eqrd.REGISTRATION_TYPE_UNSPECIFIED;
                                    if (eqrdVar == null) {
                                        eqrdVar = eqrd.UNRECOGNIZED;
                                    }
                                    final csuc csucVar3 = csucVar2;
                                    final csuj csujVar = (csuj) ekfkVar.getOrDefault(eqrdVar, csuj.UNKNOWN_TYPE);
                                    if (byew.a().booleanValue()) {
                                        eijuVarI2 = eijx.e(null);
                                    } else {
                                        final cswj cswjVar2 = csucVar3.d;
                                        if (byew.a().booleanValue()) {
                                            eijuVarF = eijx.e(csvg.a);
                                        } else {
                                            final csvt csvtVar = cswjVar2.b;
                                            final KeyPair keyPair2 = keyPair;
                                            cqbd cqbdVarC3 = csvt.a.c();
                                            cqbdVarC3.I("Encrypting VSMS key pair...");
                                            cqbdVarC3.r();
                                            eijuVarF = csvtVar.c().h(new ejvr() { // from class: csvj
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj4) {
                                                    return csvtVar.a(keyPair2, (erdf) obj4);
                                                }
                                            }, csvtVar.c).f(Exception.class, new csvk(csvtVar), csvtVar.d);
                                        }
                                        final alqm alqmVar = alqmVarN;
                                        eijuVarI2 = eijuVarF.i(new eooz() { // from class: cswc
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj4) {
                                                final csvg csvgVar = (csvg) obj4;
                                                cczv cczvVar = alvx.a;
                                                final String strP = alqmVar.p(((Boolean) new ejxr() { // from class: alvh
                                                    @Override // defpackage.ejxr
                                                    public final Object get() {
                                                        return Boolean.valueOf(eotp.a("bugle.enable_mi_in_verified_sms_key_service", "bugle"));
                                                    }
                                                }.get()).booleanValue());
                                                strP.getClass();
                                                if (byew.a().booleanValue()) {
                                                    return eijx.e(null);
                                                }
                                                cswj cswjVar3 = cswjVar2;
                                                final csuj csujVar2 = csujVar;
                                                boolean zBooleanValue = ((Boolean) csve.c.e()).booleanValue();
                                                final csve csveVar = cswjVar3.a;
                                                if (!zBooleanValue) {
                                                    return csveVar.d(new Function() { // from class: csuz
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            return csveVar.a((csup) obj5, strP, csvgVar, csujVar2);
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    });
                                                }
                                                eiju eijuVarD = csveVar.d(new Function() { // from class: csuw
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        return csveVar.a((csup) obj5, strP, csvgVar, csujVar2);
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                eooz eoozVar3 = new eooz() { // from class: csux
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj5) {
                                                        return csveVar.c();
                                                    }
                                                };
                                                eosc eoscVar3 = csveVar.g;
                                                return eijuVarD.i(eoozVar3, eoscVar3).h(new ejvr() { // from class: csuy
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj5) {
                                                        ekfk ekfkVar2 = csve.a;
                                                        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((csup) obj5).e);
                                                        String str10 = strP;
                                                        if (((csuk) Map.EL.getOrDefault(mapUnmodifiableMap, str10, csuk.a)).b.contains(csvgVar)) {
                                                            return null;
                                                        }
                                                        throw new IllegalStateException("Keypair was not saved for: " + str10.hashCode());
                                                    }
                                                }, eoscVar3);
                                            }
                                        }, cswjVar2.c);
                                    }
                                    final eqra eqraVar8 = eqraVar5;
                                    return eijuVarI2.f(Throwable.class, new eooz() { // from class: cstl
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            final Throwable th = (Throwable) obj4;
                                            csuc.a.s("Key pair registration on client failed", th);
                                            csuc csucVar4 = csucVar3;
                                            return csucVar4.b(eqraVar8, 5, th).i(new eooz() { // from class: csua
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj5) {
                                                    return eijx.d(th);
                                                }
                                            }, csucVar4.f);
                                        }
                                    }, csucVar3.f);
                                }
                            }, eoscVar2).i(new eooz() { // from class: csto
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    Void r7 = (Void) obj3;
                                    String str10 = str9;
                                    if (str10 == null) {
                                        return eijx.e(r7);
                                    }
                                    final eqra eqraVar8 = eqraVar5;
                                    String str11 = str8;
                                    final csuc csucVar3 = csucVar2;
                                    cqbd cqbdVarC2 = csuc.a.c();
                                    cqbdVarC2.I("Mapping given IMSI to phone number");
                                    cqbdVarC2.M("imsi", str10);
                                    cqbdVarC2.x("msisdn", str11, 2);
                                    cqbdVarC2.r();
                                    return csucVar3.b.b(str10, str11).f(Throwable.class, new eooz() { // from class: cstt
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            final Throwable th = (Throwable) obj4;
                                            csuc.a.s("Key pair registration on client failed", th);
                                            csuc csucVar4 = csucVar3;
                                            return csucVar4.b(eqraVar8, 6, th).i(new eooz() { // from class: cstv
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj5) {
                                                    return eijx.d(th);
                                                }
                                            }, csucVar4.f);
                                        }
                                    }, csucVar3.f);
                                }
                            }, eoscVar2).h(new ejvr() { // from class: cstp
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    return true;
                                }
                            }, eoscVar2).f(Throwable.class, new eooz() { // from class: cstq
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    Throwable th = (Throwable) obj3;
                                    csuc.a.s("Vsms registration failed", th);
                                    return eijx.d(th);
                                }
                            }, eoscVar2);
                        }
                    }, csucVar.f);
                }
            }, eoscVar);
            this.k = eijuVarI;
            return eijuVarI;
        } catch (IllegalArgumentException e) {
            a.s("Cannot decode RCS token.", e);
            return eijx.d(e);
        }
    }

    public final eiju b(final eqra eqraVar, final int i, final Throwable th) {
        if (((Boolean) cssx.b.e()).booleanValue()) {
            return (byew.a().booleanValue() ? eijx.e(false) : this.b.c().h(new ejvr() { // from class: csuu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((csup) obj).f);
                }
            }, eoqg.a)).i(new eooz() { // from class: cstu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (Boolean.FALSE.equals((Boolean) obj)) {
                        return eijx.e(null);
                    }
                    csuc csucVar = this.a;
                    csuc.a.r("Sending diagnostic report for the failed registration");
                    final cstk cstkVar = (cstk) csucVar.e.b();
                    if (byew.a().booleanValue()) {
                        return eijx.e(null);
                    }
                    final cswj cswjVar = cstkVar.c;
                    csve csveVar = cswjVar.a;
                    final eiju eijuVarC = csveVar.c();
                    cswjVar.getClass();
                    eooz eoozVar = new eooz() { // from class: cstc
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ekgb ekgbVarN;
                            final csup csupVar = (csup) obj2;
                            if (byew.a().booleanValue()) {
                                throw new IllegalStateException();
                            }
                            final ekgb ekgbVarN2 = ekgb.n(DesugarCollections.unmodifiableMap(csupVar.e).keySet());
                            if (!csupVar.f || (csupVar.b & 2) == 0) {
                                ekgbVarN = ekoe.a;
                            } else {
                                csuf csufVar = csupVar.h;
                                if (csufVar == null) {
                                    csufVar = csuf.a;
                                }
                                ekgbVarN = ekgb.n(DesugarCollections.unmodifiableMap(csufVar.f).keySet());
                            }
                            final ekgb ekgbVar = ekgbVarN;
                            final cswj cswjVar2 = cswjVar;
                            Stream map = Collection.EL.stream(ekgbVarN2).map(new Function() { // from class: csvv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    String str = (String) obj3;
                                    str.getClass();
                                    evub evubVar = csupVar.e;
                                    if (!evubVar.containsKey(str)) {
                                        throw new IllegalArgumentException();
                                    }
                                    cswj cswjVar3 = cswjVar2;
                                    return cswjVar3.b.b(((csuk) evubVar.get(str)).b);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            Collector collector = ekcv.a;
                            final eiju eijuVarA = eijx.a((Iterable) map.collect(collector));
                            final eiju eijuVarA2 = eijx.a((Iterable) Collection.EL.stream(ekgbVar).map(new Function() { // from class: csvw
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    String str = (String) obj3;
                                    csuf csufVar2 = csupVar.h;
                                    if (csufVar2 == null) {
                                        csufVar2 = csuf.a;
                                    }
                                    str.getClass();
                                    evub evubVar = csufVar2.f;
                                    if (!evubVar.containsKey(str)) {
                                        throw new IllegalArgumentException();
                                    }
                                    cswj cswjVar3 = cswjVar2;
                                    return cswjVar3.b.b(((csuh) evubVar.get(str)).b);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(collector));
                            return eijx.m(eijuVarA, eijuVarA2).a(new Callable() { // from class: csvx
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    List list = (List) eork.q(eijuVarA);
                                    List list2 = (List) eork.q(eijuVarA2);
                                    if (byew.a().booleanValue()) {
                                        throw new IllegalStateException();
                                    }
                                    HashMap map2 = new HashMap();
                                    int i2 = 0;
                                    while (true) {
                                        ekgb ekgbVar2 = ekgbVarN2;
                                        csup csupVar2 = csupVar;
                                        if (i2 >= ekgbVar2.size()) {
                                            ekgi ekgiVar = new ekgi();
                                            for (Map.Entry entry : map2.entrySet()) {
                                                ekgiVar.i((String) entry.getKey(), ekgb.n((java.util.Collection) entry.getValue()));
                                            }
                                            ekgb ekgbVar3 = ekgbVar;
                                            if (ekgbVar3.isEmpty()) {
                                                return new csvi(csupVar2, ekgiVar.c(), ekoj.a);
                                            }
                                            HashMap map3 = new HashMap();
                                            for (int i3 = 0; i3 < ekgbVar3.size(); i3++) {
                                                String str = (String) ekgbVar3.get(i3);
                                                csuf csufVar2 = csupVar2.h;
                                                if (csufVar2 == null) {
                                                    csufVar2 = csuf.a;
                                                }
                                                str.getClass();
                                                evub evubVar = csufVar2.f;
                                                if (!evubVar.containsKey(str)) {
                                                    throw new IllegalArgumentException();
                                                }
                                                csuh csuhVar = (csuh) evubVar.get(str);
                                                List list3 = (List) Map.EL.computeIfAbsent(map3, str, new Function() { // from class: cswa
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj3) {
                                                        return new ArrayList();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                ekgb ekgbVar4 = (ekgb) list2.get(i3);
                                                for (int i4 = 0; i4 < ekgbVar4.size(); i4++) {
                                                    list3.add(cswj.a((KeyPair) ekgbVar4.get(i4), (csvg) csuhVar.b.get(i4)));
                                                }
                                            }
                                            ekgi ekgiVar2 = new ekgi();
                                            for (Map.Entry entry2 : map3.entrySet()) {
                                                ekgiVar2.i((String) entry2.getKey(), ekgb.n((java.util.Collection) entry2.getValue()));
                                            }
                                            return new csvi(csupVar2, ekgiVar.c(), ekgiVar2.c());
                                        }
                                        String str2 = (String) ekgbVar2.get(i2);
                                        str2.getClass();
                                        evub evubVar2 = csupVar2.e;
                                        if (!evubVar2.containsKey(str2)) {
                                            throw new IllegalArgumentException();
                                        }
                                        csuk csukVar = (csuk) evubVar2.get(str2);
                                        List list4 = (List) Map.EL.computeIfAbsent(map2, str2, new Function() { // from class: csvz
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                return new ArrayList();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        ekgb ekgbVar5 = (ekgb) list.get(i2);
                                        for (int i5 = 0; i5 < ekgbVar5.size(); i5++) {
                                            list4.add(cswj.a((KeyPair) ekgbVar5.get(i5), (csvg) csukVar.b.get(i5)));
                                        }
                                        i2++;
                                    }
                                }
                            }, cswjVar2.c);
                        }
                    };
                    eosc eoscVar = cstkVar.f;
                    final eiju eijuVarI = eijuVarC.i(eoozVar, eoscVar);
                    final eiju eijuVarE = byew.a().booleanValue() ? eijx.e(ekoj.a) : csveVar.c().i(new eooz() { // from class: cswg
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final csup csupVar = (csup) obj2;
                            final ekgb ekgbVarN = ekgb.n(DesugarCollections.unmodifiableMap(csupVar.e).keySet());
                            Stream stream = Collection.EL.stream(ekgbVarN);
                            final cswj cswjVar2 = cswjVar;
                            return eijx.a((Iterable) stream.map(new Function() { // from class: cswd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    String str = (String) obj3;
                                    str.getClass();
                                    evub evubVar = csupVar.e;
                                    if (!evubVar.containsKey(str)) {
                                        throw new IllegalArgumentException();
                                    }
                                    cswj cswjVar3 = cswjVar2;
                                    Stream stream2 = Collection.EL.stream(((csuk) evubVar.get(str)).b);
                                    final csvt csvtVar = cswjVar3.b;
                                    csvtVar.getClass();
                                    Stream map = stream2.map(new Function() { // from class: cswb
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            final csvg csvgVar = (csvg) obj4;
                                            if (byew.a().booleanValue()) {
                                                throw new IllegalStateException();
                                            }
                                            csvt csvtVar2 = csvtVar;
                                            csvt.a.p("Decrypting VSMS key pair...");
                                            return csvtVar2.c().h(new ejvr() { // from class: csvo
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj5) {
                                                    return csvt.e(csvgVar, (erdf) obj5);
                                                }
                                            }, csvtVar2.c).f(Exception.class, new csvk(csvtVar2), csvtVar2.d);
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i2 = ekgb.d;
                                    return eijx.a((Iterable) map.collect(ekcv.a));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(ekcv.a)).h(new ejvr() { // from class: cswe
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    List list = (List) obj3;
                                    ekgi ekgiVar = new ekgi();
                                    int i2 = 0;
                                    while (true) {
                                        ekgb ekgbVar = ekgbVarN;
                                        if (i2 >= ekgbVar.size()) {
                                            return ekgiVar.c();
                                        }
                                        ekgiVar.i((String) ekgbVar.get(i2), (List) Collection.EL.stream((List) list.get(i2)).map(new Function() { // from class: csvy
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                return evqs.x(((KeyPair) obj4).getPublic().getEncoded());
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(ekcv.a));
                                        i2++;
                                    }
                                }
                            }, cswjVar2.c);
                        }
                    }, cswjVar.c);
                    final Throwable th2 = th;
                    final int i2 = i;
                    final eqra eqraVar2 = eqraVar;
                    eijw eijwVarK = eijx.k(eijuVarC, eijuVarI, eijuVarE);
                    Callable callable = new Callable() { // from class: cstd
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String str;
                            csup csupVar;
                            boolean zBooleanValue = byew.a().booleanValue();
                            eiju eijuVar = eijuVarC;
                            eiju eijuVar2 = eijuVarE;
                            eiju eijuVar3 = eijuVarI;
                            if (zBooleanValue) {
                                throw new IllegalStateException();
                            }
                            final int i3 = i2;
                            cstk cstkVar2 = cstkVar;
                            final eqre eqreVar = (eqre) eqro.a.createBuilder();
                            String str2 = cswl.a(cstkVar2.e).a;
                            eqreVar.copyOnWrite();
                            eqro eqroVar = (eqro) eqreVar.instance;
                            str2.getClass();
                            eqroVar.e = str2;
                            String string = Integer.toString(Build.VERSION.SDK_INT);
                            eqreVar.copyOnWrite();
                            eqro eqroVar2 = (eqro) eqreVar.instance;
                            string.getClass();
                            eqroVar2.f = string;
                            eqreVar.copyOnWrite();
                            eqro eqroVar3 = (eqro) eqreVar.instance;
                            Throwable th3 = th2;
                            eqroVar3.j = i3 - 2;
                            String str3 = th3.getClass().getName() + ": " + th3.getMessage();
                            eqreVar.copyOnWrite();
                            ((eqro) eqreVar.instance).l = str3;
                            if (th3.getCause() != null) {
                                String str4 = th3.getCause().getClass().getName() + ": " + th3.getCause().getMessage();
                                eqreVar.copyOnWrite();
                                ((eqro) eqreVar.instance).m = str4;
                            }
                            eqra eqraVar3 = eqraVar2;
                            if (eqraVar3.f.size() > 0) {
                                evqs evqsVar = (evqs) eqraVar3.f.get(0);
                                eqreVar.copyOnWrite();
                                eqro eqroVar4 = (eqro) eqreVar.instance;
                                evqsVar.getClass();
                                eqroVar4.k = evqsVar;
                            }
                            if (!byew.a().booleanValue()) {
                                csup csupVar2 = csup.a;
                                final ekgp ekgpVar = ekoj.a;
                                try {
                                    csupVar = (csup) eork.q(eijuVar);
                                    str = "";
                                } catch (ExecutionException e) {
                                    str = String.valueOf(e.getClass()) + ": " + e.getMessage();
                                    csupVar = csupVar2;
                                }
                                try {
                                    ekgpVar = (ekgp) eork.q(eijuVar2);
                                } catch (ExecutionException e2) {
                                    str = str + ";keys: " + String.valueOf(e2.getClass()) + ": " + e2.getMessage();
                                }
                                ekgp ekgpVarC = ekoj.a;
                                try {
                                    ekgpVarC = ((cswi) eork.q(eijuVar3)).c();
                                } catch (ExecutionException e3) {
                                    str = str + ";evicted-keys: " + String.valueOf(e3.getClass()) + ": " + e3.getMessage();
                                }
                                int size = csupVar.d.size();
                                eqreVar.copyOnWrite();
                                ((eqro) eqreVar.instance).d = size;
                                evvp evvpVar = csupVar.g;
                                if (evvpVar == null) {
                                    evvpVar = evvp.a;
                                }
                                eqreVar.copyOnWrite();
                                eqro eqroVar5 = (eqro) eqreVar.instance;
                                evvpVar.getClass();
                                eqroVar5.g = evvpVar;
                                eqroVar5.b |= 4;
                                csuf csufVar = csupVar.h;
                                if (csufVar == null) {
                                    csufVar = csuf.a;
                                }
                                boolean z = csufVar.b;
                                eqreVar.copyOnWrite();
                                ((eqro) eqreVar.instance).h = z;
                                csuf csufVar2 = csupVar.h;
                                if (csufVar2 == null) {
                                    csufVar2 = csuf.a;
                                }
                                boolean z2 = csufVar2.c;
                                eqreVar.copyOnWrite();
                                ((eqro) eqreVar.instance).i = z2;
                                csuf csufVar3 = csupVar.h;
                                if (csufVar3 == null) {
                                    csufVar3 = csuf.a;
                                }
                                evtg evtgVar = csufVar3.d;
                                eqreVar.copyOnWrite();
                                eqro eqroVar6 = (eqro) eqreVar.instance;
                                evtg evtgVar2 = eqroVar6.p;
                                if (!evtgVar2.c()) {
                                    eqroVar6.p = evsn.mutableCopy(evtgVar2);
                                }
                                evpz.addAll(evtgVar, eqroVar6.p);
                                csuf csufVar4 = csupVar.h;
                                if (csufVar4 == null) {
                                    csufVar4 = csuf.a;
                                }
                                evtg evtgVar3 = csufVar4.e;
                                eqreVar.copyOnWrite();
                                eqro eqroVar7 = (eqro) eqreVar.instance;
                                evtg evtgVar4 = eqroVar7.q;
                                if (!evtgVar4.c()) {
                                    eqroVar7.q = evsn.mutableCopy(evtgVar4);
                                }
                                evpz.addAll(evtgVar3, eqroVar7.q);
                                eqreVar.copyOnWrite();
                                ((eqro) eqreVar.instance).n = str;
                                long j = csupVar.i;
                                eqreVar.copyOnWrite();
                                ((eqro) eqreVar.instance).o = j;
                                Map.EL.forEach(DesugarCollections.unmodifiableMap(csupVar.e), new BiConsumer() { // from class: csti
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        String str5 = (String) obj2;
                                        csuk csukVar = (csuk) obj3;
                                        ekgp ekgpVar2 = cstk.a;
                                        if (byew.a().booleanValue()) {
                                            return;
                                        }
                                        String strA = cstk.a(str5);
                                        eqrl eqrlVar = (eqrl) eqrn.a.createBuilder();
                                        evqs evqsVar2 = csukVar.d;
                                        eqrlVar.copyOnWrite();
                                        eqrn eqrnVar = (eqrn) eqrlVar.instance;
                                        evqsVar2.getClass();
                                        eqrnVar.e = evqsVar2;
                                        String str6 = csukVar.e;
                                        eqrlVar.copyOnWrite();
                                        eqrn eqrnVar2 = (eqrn) eqrlVar.instance;
                                        str6.getClass();
                                        eqrnVar2.f = str6;
                                        evvp evvpVarC = evxc.c(csukVar.c);
                                        eqrlVar.copyOnWrite();
                                        eqrn eqrnVar3 = (eqrn) eqrlVar.instance;
                                        evvpVarC.getClass();
                                        eqrnVar3.d = evvpVarC;
                                        eqrnVar3.b |= 1;
                                        ekgp ekgpVar3 = cstk.a;
                                        int i4 = csukVar.f;
                                        csuj csujVar = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? null : csuj.C11N_RCS : csuj.C11N : csuj.RCS : csuj.NOT_YET_KNOWN : csuj.UNKNOWN_TYPE;
                                        if (csujVar == null) {
                                            csujVar = csuj.UNRECOGNIZED;
                                        }
                                        ekgp ekgpVar4 = ekgpVar;
                                        eqrm eqrmVar = (eqrm) ekgpVar3.getOrDefault(csujVar, eqrm.UNKNOWN_TYPE);
                                        eqrlVar.copyOnWrite();
                                        ((eqrn) eqrlVar.instance).g = eqrmVar.a();
                                        int i5 = ekgb.d;
                                        Iterable iterable = (Iterable) ekgpVar4.getOrDefault(str5, ekoe.a);
                                        eqrlVar.copyOnWrite();
                                        eqrn eqrnVar4 = (eqrn) eqrlVar.instance;
                                        evtg evtgVar5 = eqrnVar4.c;
                                        if (!evtgVar5.c()) {
                                            eqrnVar4.c = evsn.mutableCopy(evtgVar5);
                                        }
                                        evpz.addAll(iterable, eqrnVar4.c);
                                        Iterable iterable2 = (Iterable) Collection.EL.stream(csukVar.b).map(new Function() { // from class: csth
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                evvp evvpVar2 = ((csvg) obj4).e;
                                                return evvpVar2 == null ? evvp.a : evvpVar2;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(ekcv.a);
                                        eqrlVar.copyOnWrite();
                                        eqrn eqrnVar5 = (eqrn) eqrlVar.instance;
                                        evtg evtgVar6 = eqrnVar5.h;
                                        if (!evtgVar6.c()) {
                                            eqrnVar5.h = evsn.mutableCopy(evtgVar6);
                                        }
                                        eqre eqreVar2 = eqreVar;
                                        evpz.addAll(iterable2, eqrnVar5.h);
                                        eqrn eqrnVar6 = (eqrn) eqrlVar.build();
                                        eqrnVar6.getClass();
                                        eqreVar2.copyOnWrite();
                                        eqro eqroVar8 = (eqro) eqreVar2.instance;
                                        eqro eqroVar9 = eqro.a;
                                        evub evubVar = eqroVar8.c;
                                        if (!evubVar.b) {
                                            eqroVar8.c = evubVar.a();
                                        }
                                        eqroVar8.c.put(strA, eqrnVar6);
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                });
                                Map.EL.forEach(ekgpVarC, new BiConsumer() { // from class: cstj
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        String str5 = (String) obj2;
                                        ekgb ekgbVar = (ekgb) obj3;
                                        ekgp ekgpVar2 = cstk.a;
                                        if (byew.a().booleanValue() || ekgbVar.isEmpty()) {
                                            return;
                                        }
                                        eqre eqreVar2 = eqreVar;
                                        String strA = cstk.a(str5);
                                        eqri eqriVar = eqri.a;
                                        java.util.Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((eqro) eqreVar2.instance).r);
                                        if (mapUnmodifiableMap.containsKey(strA)) {
                                            eqriVar = (eqri) mapUnmodifiableMap.get(strA);
                                        }
                                        eqrh eqrhVar = (eqrh) eqriVar.toBuilder();
                                        int size2 = ekgbVar.size();
                                        for (int i4 = 0; i4 < size2; i4++) {
                                            cswh cswhVar = (cswh) ekgbVar.get(i4);
                                            eqrf eqrfVar = (eqrf) eqrg.a.createBuilder();
                                            evqs evqsVarA = cswhVar.a();
                                            eqrfVar.copyOnWrite();
                                            ((eqrg) eqrfVar.instance).c = evqsVarA;
                                            evvp evvpVarB = cswhVar.b();
                                            eqrfVar.copyOnWrite();
                                            eqrg eqrgVar = (eqrg) eqrfVar.instance;
                                            eqrgVar.d = evvpVarB;
                                            eqrgVar.b |= 1;
                                            eqrg eqrgVar2 = (eqrg) eqrfVar.build();
                                            eqrhVar.copyOnWrite();
                                            eqri eqriVar2 = (eqri) eqrhVar.instance;
                                            eqrgVar2.getClass();
                                            evtg evtgVar5 = eqriVar2.b;
                                            if (!evtgVar5.c()) {
                                                eqriVar2.b = evsn.mutableCopy(evtgVar5);
                                            }
                                            eqriVar2.b.add(eqrgVar2);
                                        }
                                        eqri eqriVar3 = (eqri) eqrhVar.build();
                                        eqriVar3.getClass();
                                        eqreVar2.copyOnWrite();
                                        eqro eqroVar8 = (eqro) eqreVar2.instance;
                                        evub evubVar = eqroVar8.r;
                                        if (!evubVar.b) {
                                            eqroVar8.r = evubVar.a();
                                        }
                                        eqroVar8.r.put(strA, eqriVar3);
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                });
                            }
                            return (eqro) eqreVar.build();
                        }
                    };
                    eosc eoscVar2 = cstkVar.g;
                    eiju eijuVarA = eijwVarK.a(callable, eoscVar2);
                    final ceru ceruVar = cstkVar.d;
                    return eijuVarA.i(new eooz() { // from class: cste
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            eqro eqroVar = (eqro) obj2;
                            eqqx eqqxVar = (eqqx) ceruVar.a.a().k(((Long) cepb.h.e()).longValue(), TimeUnit.MILLISECONDS);
                            fbnd fbndVar = eqqxVar.a;
                            fbrk fbrkVarA = eqqy.b;
                            if (fbrkVarA == null) {
                                synchronized (eqqy.class) {
                                    fbrkVarA = eqqy.b;
                                    if (fbrkVarA == null) {
                                        fbrh fbrhVarA = fbrk.a();
                                        fbrhVarA.c = fbrj.UNARY;
                                        fbrhVarA.d = fbrk.c("google.communications.verifiedsms.v1.MessageVerificationService", "ReportDiagnosticInfo");
                                        fbrhVarA.b();
                                        eqro eqroVar2 = eqro.a;
                                        evrr evrrVar = fcrj.a;
                                        fbrhVarA.a = new fcrh(eqroVar2);
                                        fbrhVarA.b = new fcrh(eqrq.a);
                                        fbrkVarA = fbrhVarA.a();
                                        eqqy.b = fbrkVarA;
                                    }
                                }
                            }
                            return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eqqxVar.b), eqroVar));
                        }
                    }, eoscVar).f(Throwable.class, new eooz() { // from class: cstf
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            cstk.b.s("Error while creating/saving diagnostic report.", (Throwable) obj2);
                            return eijx.e(null);
                        }
                    }, eoscVar2).h(new ejvr() { // from class: cstg
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekgp ekgpVar = cstk.a;
                            return null;
                        }
                    }, eoscVar2);
                }
            }, this.f);
        }
        return eijx.e(null);
    }
}
