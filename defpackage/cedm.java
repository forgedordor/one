package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cedm extends ceku {
    public static final cqce a = cqce.g("BugleNetwork", "AnonymousRegistrationProvider");
    public final fcsu b;
    public final eygg c;
    private final fcsu d;
    private final cezz e;
    private final ceop f;
    private final eosc g;

    public cedm(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, cezv cezvVar, cenj cenjVar, fcsu fcsuVar, cogw cogwVar, cezz cezzVar, Optional optional, eygg eyggVar, fcsu fcsuVar2, ceop ceopVar, fcsu fcsuVar3) {
        super(eoscVar, eoscVar2, cezvVar, cogwVar, cenjVar, optional, fcsuVar3);
        this.e = cezzVar;
        this.c = eyggVar;
        this.f = ceopVar;
        this.d = fcsuVar2;
        this.b = fcsuVar;
        this.g = eoscVar3;
    }

    @Override // defpackage.ceku
    protected final cesd a() {
        return (cesd) this.b.b();
    }

    @Override // defpackage.ceku
    protected final cffr b(long j) {
        a.m("Creating anonymous register refresh RPC handler");
        final ceop ceopVar = this.f;
        Optional optionalEmpty = Optional.empty();
        ceopVar.getClass();
        Callable callable = new Callable() { // from class: cedi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ceop ceopVar2 = ceopVar;
                return ((ceuk) ceopVar2.b.b()).a.h().h(new ejvr() { // from class: ceoh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cetc cetcVar = (cetc) obj;
                        byte[] bArrI = cetcVar.f.I();
                        byte[] bArrI2 = cetcVar.e.I();
                        if (bArrI == null || bArrI2 == null || bArrI.length <= 0 || bArrI2.length <= 0) {
                            ekrw ekrwVarJ = ceop.a.j();
                            ekrwVarJ.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 119, "CryptoHelper.java")).q("Missing stored KeyPair");
                            return Optional.empty();
                        }
                        ekrw ekrwVarE = ceop.a.e();
                        ekrwVarE.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 108, "CryptoHelper.java")).q("Returning stored KeyPair");
                        try {
                            return Optional.of(new fgwc(fgvz.b(bArrI2), new fgwa(bArrI)));
                        } catch (fgvy e) {
                            ekrw ekrwVarI = ceop.a.i();
                            ekrwVarI.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPreviousAnonymousKeyPair", 's', "CryptoHelper.java")).q("Cannot find valid Curve25519 key pair");
                            return Optional.empty();
                        }
                    }
                }, ceopVar2.c);
            }
        };
        eiju eijuVarH = ((ceuk) this.b.b()).a.h().h(new ejvr() { // from class: cett
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cetc) obj).b;
            }
        }, eoqg.a).h(new ejvr() { // from class: cede
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optionalOfNullable = Optional.ofNullable((String) obj);
                ezok ezokVar = (ezok) ezol.a.createBuilder();
                felm felmVar = felm.DEVICE_ID;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).b = felmVar.a();
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).d = "Bugle";
                if (optionalOfNullable.isEmpty()) {
                    cedm.a.p("Tachyon Anonymous registration Id is not available");
                } else {
                    String str = (String) optionalOfNullable.get();
                    ezokVar.copyOnWrite();
                    ((ezol) ezokVar.instance).c = str;
                }
                return (ezol) ezokVar.build();
            }
        }, this.r);
        cezz cezzVar = this.e;
        fcsu fcsuVar = cezzVar.a;
        cfrh cfrhVar = cfrh.d;
        cffq cffqVar = (cffq) fcsuVar.b();
        cffqVar.getClass();
        eosc eoscVar = (eosc) cezzVar.b.b();
        eoscVar.getClass();
        return new cezy(cffqVar, eoscVar, j, optionalEmpty, callable, eijuVarH, cfrhVar);
    }

    @Override // defpackage.ceku
    protected final cfrh c() {
        return cfrh.d;
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final synchronized eiju d() {
        return ((ceuk) this.b.b()).a();
    }

    @Override // defpackage.ceku
    protected final eiju e() {
        a.m("doing first time anonymous tachyon registration");
        final cfrj cfrjVar = (cfrj) this.d.b();
        return eiju.g(cfrjVar.c((ezpp) this.u.a("Bugle").build())).i(new eooz() { // from class: cedj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cfrjVar.d(this.a.s, (ezlf) obj);
            }
        }, this.g).i(new eooz() { // from class: cedk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cfrjVar.e((ezlh) obj);
            }
        }, this.r).i(new eooz() { // from class: cedl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ezlh ezlhVar = (ezlh) obj;
                cqce cqceVar = cedm.a;
                cqceVar.m("Received Tachyon registration");
                if (ezlhVar == null) {
                    cqceVar.n("Tachyon anonymous register response was null");
                    throw new IllegalArgumentException("Tachyon anonymous register response was null");
                }
                final cedm cedmVar = this.a;
                if ((ezlhVar.b & 4) != 0) {
                    ezpj ezpjVar = ezlhVar.e;
                    if (ezpjVar == null) {
                        ezpjVar = ezpj.a;
                    }
                    cedm.H(ezpjVar);
                }
                if ((ezlhVar.b & 2) == 0) {
                    cqceVar.n("Tachyon anonymous register response has no auth token");
                    throw new IllegalArgumentException("Tachyon anonymous register response has no auth token");
                }
                final ezns eznsVar = ezlhVar.d;
                if (eznsVar == null) {
                    eznsVar = ezns.a;
                }
                return cedmVar.C(eznsVar).i(new eooz() { // from class: cedg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ezlh ezlhVar2 = ezlhVar;
                        if ((ezlhVar2.b & 8) == 0) {
                            cedm.a.p("Anonymous registration response does not contain Id.");
                            return eijx.e(null);
                        }
                        ezol ezolVar = ezlhVar2.f;
                        if (ezolVar == null) {
                            ezolVar = ezol.a;
                        }
                        final String str = ezolVar.c;
                        if (TextUtils.isEmpty(str)) {
                            cedm.a.p("Anonymous registration response contains empty Id.");
                            return eijx.e(null);
                        }
                        final cedm cedmVar2 = cedmVar;
                        ceuk ceukVar = (ceuk) cedmVar2.b.b();
                        ceukVar.b.l("tachyon_registration_id", str);
                        return ceukVar.a.j(new ejvr() { // from class: ceuc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cetb cetbVar = (cetb) ((cetc) obj3).toBuilder();
                                cetbVar.copyOnWrite();
                                cetc cetcVar = (cetc) cetbVar.instance;
                                String str2 = str;
                                str2.getClass();
                                cetcVar.b = str2;
                                return (cetc) cetbVar.build();
                            }
                        }).h(new ejvr() { // from class: ceud
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, eoqg.a).h(new ejvr() { // from class: cedf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Iterator it = ((Set) cedmVar2.c.b()).iterator();
                                while (it.hasNext()) {
                                    ((cfsd) it.next()).c(str);
                                }
                                return null;
                            }
                        }, cedmVar2.q);
                    }
                }, cedmVar.r).h(new ejvr() { // from class: cedh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return eznsVar;
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju f() {
        return ((ceuk) this.b.b()).c();
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju g() {
        return ((ceuk) this.b.b()).b();
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju h(byte[] bArr) {
        return ((ceuk) this.b.b()).e(bArr);
    }

    @Override // defpackage.ceku
    @Deprecated
    protected final eiju i(long j) {
        return ((ceuk) this.b.b()).d(j);
    }

    @Override // defpackage.ceku
    protected final eiju j(ezln ezlnVar) {
        ezns eznsVar = ezlnVar.d;
        if (eznsVar == null) {
            eznsVar = ezns.a;
        }
        return C(eznsVar);
    }

    @Override // defpackage.cedp
    public final String k() {
        return "Bugle";
    }
}
