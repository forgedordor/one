package defpackage;

import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceni implements efaq {
    public final cejj c;
    public final RcsProfileService d;
    public final fcsu e;
    public final eosc f;
    public final eosc g;
    public final fcsu h;
    public final AtomicBoolean i = new AtomicBoolean();
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private static final String j = RcsProfileService.class.getName();
    public static final cqce a = cqce.g("BugleNetwork", "TachyonPhoneRegistration");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager");

    public ceni(cejj cejjVar, RcsProfileService rcsProfileService, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.c = cejjVar;
        this.d = rcsProfileService;
        this.k = fcsuVar;
        this.e = fcsuVar2;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.h = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
    }

    final eiju a(aubq aubqVar) {
        if (!i()) {
            return eijx.d(new IllegalStateException("Tachyon phone registration flag disabled"));
        }
        a.p("Ensuring Tachyon phone registration");
        eiju eijuVarI = this.c.e(aubqVar.d, 12).i(new cemv(this), this.g);
        ejvr ejvrVar = new ejvr() { // from class: cemz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = ceni.a;
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).e(fbtf.class, new ejvr() { // from class: cena
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ceni.a.s("Failed to ensure Tachyon registration", (fbtf) obj);
                return null;
            }
        }, eoqgVar);
    }

    public final eiju b() {
        return ((dggw) this.k.b()).e().h(new ejvr() { // from class: cenh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream stream = Collection.EL.stream((Set) obj);
                final ceni ceniVar = this.a;
                Stream map = stream.map(new Function() { // from class: cemx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((asqx) ceniVar.e.b()).c(((dggk) obj2).a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: cemy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ceniVar.a((aubq) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        }, this.g).h(new ejvr() { // from class: cemw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = ceni.a;
                return null;
            }
        }, eoqg.a);
    }

    public final eiju c(final aubq aubqVar) {
        if (!i()) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 174, "TachyonPhoneRegistrationManager.java")).q("Tachyon phone registration flag disabled.");
            return eijx.e(null);
        }
        ekrg ekrgVar = b;
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH2.X(ekrzVar, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 177, "TachyonPhoneRegistrationManager.java")).q("Tachyon phone registration flag enabled.");
        this.i.set(true);
        if (!aubqVar.d.isEmpty()) {
            return eijx.h(new eooy() { // from class: cenc
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return this.a.a(aubqVar);
                }
            }, this.g);
        }
        ekrw ekrwVarJ = ekrgVar.j();
        ekrwVarJ.X(ekrzVar, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 181, "TachyonPhoneRegistrationManager.java")).q("No chat endpoint provided for registration. Attempting to acquire from profile service.");
        if (this.d.isConnected()) {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 190, "TachyonPhoneRegistrationManager.java")).q("Forcing Tachyon phone registration for all self identities");
            return b();
        }
        ekrw ekrwVarJ3 = ekrgVar.j();
        ekrwVarJ3.X(ekrzVar, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 186, "TachyonPhoneRegistrationManager.java")).q("Config update received but no chat endpoint could be acquired");
        return eijx.e(null);
    }

    @Override // defpackage.efaq
    public final void e(String str) {
        if (!h()) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleNetwork");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "handleServiceConnected", 107, "TachyonPhoneRegistrationManager.java")).q("TachyonPhoneRegistrationManager#handleServiceConnected called when jibe SIP is disabled. No JibeService should be attempting to connect.");
            return;
        }
        eieu eieuVarK = eiiy.k("TachyonPhoneRegistrationManager#handleServiceConnected");
        try {
            if (i()) {
                cqce cqceVar = a;
                cqceVar.m("Tachyon phone registration flag enabled");
                if (j.equals(str)) {
                    if (this.d.isConnected()) {
                        cqnx.c(b(), "BugleNetwork", "Failed to ensure Tachyon phone registration.");
                    } else {
                        cqceVar.r("Profile service is not connected at service connected callback.");
                    }
                }
            } else {
                a.m("Tachyon phone registration flag disabled");
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju g(cejg cejgVar) {
        return cejgVar.m(cedo.FORCE_REFRESH).h(new ejvr() { // from class: cenf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezns eznsVar = (ezns) obj;
                ceni.a.m("Completed ensuring Tachyon phone registration");
                this.a.i.set(false);
                return eznsVar;
            }
        }, eoqg.a);
    }

    @Deprecated
    public final boolean h() {
        return dfog.L() || !((arhd) this.m.b()).a();
    }

    public final boolean i() {
        return cezu.a();
    }

    @Override // defpackage.efaq
    public final void f(String str) {
    }

    @Override // defpackage.efaq
    public final void d(String str, efap efapVar) {
    }
}
