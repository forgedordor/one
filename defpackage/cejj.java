package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache");
    public final cejk b;
    public final Object c = new Object();
    public final ConcurrentMap d = new ConcurrentHashMap();
    private final fcsu e;
    private final fcsu f;
    private final eosc g;
    private final eosc h;

    public cejj(fcsu fcsuVar, cejk cejkVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2) {
        this.f = fcsuVar;
        this.b = cejkVar;
        this.e = fcsuVar2;
        this.g = eoscVar;
        this.h = eoscVar2;
    }

    @Deprecated
    public final eiju a(cfre cfreVar) {
        return e(cfreVar.b, 11);
    }

    public final eiju b(final String str) {
        ((cfep) this.f.b()).a(str, 4);
        synchronized (this.c) {
            ConcurrentMap concurrentMap = this.d;
            eiju eijuVar = (eiju) concurrentMap.get(str);
            if (eijuVar != null) {
                ekrw ekrwVarG = a.g();
                ekrwVarG.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "getProvider", 124, "PhoneRegistrationProviderCache.java")).q("Using cached phone registration providerFuture");
                return eijuVar;
            }
            eiju eijuVarH = ((dggw) this.e.b()).f(str).h(new ejvr() { // from class: cejh
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str2 = str;
                    if (zBooleanValue) {
                        cejj cejjVar = this.a;
                        ekrw ekrwVarE = cejj.a.e();
                        ekrwVarE.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "createPhoneRegistrationProvider", 232, "PhoneRegistrationProviderCache.java")).q("Creating phone registration providerFuture by phone number.");
                        return cejjVar.b.a(new cfre(str2));
                    }
                    ekrw ekrwVarJ = cejj.a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.I, str2);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "createPhoneRegistrationProvider", 239, "PhoneRegistrationProviderCache.java")).q("The provided phone number is not RCS available. Either phone number is not in E164 format or phone number is not RCS available.");
                    throw new cefk();
                }
            }, this.h);
            eijuVarH.k(new ceji(this, str), this.g);
            concurrentMap.putIfAbsent(str, eijuVarH);
            return (eiju) concurrentMap.get(str);
        }
    }

    public final eiju c(String str) {
        synchronized (this.c) {
            ConcurrentMap concurrentMap = this.d;
            eiju eijuVar = (eiju) concurrentMap.get(str);
            if (eijuVar != null) {
                ekrw ekrwVarG = a.g();
                ekrwVarG.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "getProviderWithoutValidatingRcs", 81, "PhoneRegistrationProviderCache.java")).q("Using cached phone registration providerFuture");
                return eijuVar;
            }
            ekrw ekrwVarG2 = a.g();
            ekrwVarG2.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "getProviderWithoutValidatingRcs", 84, "PhoneRegistrationProviderCache.java")).q("Creating phone registration providerFuture by phone number without validating RCS.");
            eiju eijuVarE = eijx.e(this.b.a(new cfre(str)));
            concurrentMap.putIfAbsent(str, eijuVarE);
            return eijuVarE;
        }
    }

    public final void d() {
        synchronized (this.c) {
            this.d.clear();
        }
    }

    public final eiju e(String str, int i) {
        ((cfep) this.f.b()).a(str, i);
        return b(str);
    }
}
