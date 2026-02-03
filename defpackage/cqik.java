package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqik implements cqic, cqib, cmiv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl");
    public final AtomicReference b;
    public final AtomicBoolean c;
    public final Map d;
    public final Map e;
    public final fduf f;
    private final fdjx g;
    private final fcsu h;
    private final Set i;

    public cqik(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.g = fdjxVar;
        this.h = fcsuVar2;
        clie clieVar = clie.a;
        this.b = new AtomicReference(clieVar);
        new AtomicReference(clieVar);
        this.c = new AtomicBoolean(false);
        new AtomicInteger(4);
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.i = keySetViewNewKeySet;
        this.f = fdvf.a(cqia.b);
        auvw.m(fdjxVar, null, new cqih(this, null), 3);
    }

    @Override // defpackage.cmiv
    public final void a(Set set) {
        set.getClass();
        c("SIM loaded");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cmmh cmmhVar = (cmmh) it.next();
            if (!this.i.contains(Integer.valueOf(cmmhVar.d))) {
                int i = cmmhVar.d;
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleConnectivity");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "registerWithSatelliteManager", 164, "ManualSatelliteEligibilityTrackerImpl.kt")).r("Registering CarrierRoamingNtnModeChangedListener for subId %d", i);
                ((clhx) this.h.b()).a(i, new cqij(this));
            }
        }
    }

    @Override // defpackage.cmiv
    public final void b(Set set) {
        c("SIM removed");
        boolean zD = d();
        final ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((cmmh) it.next()).d));
        }
        Set setKeySet = this.e.keySet();
        final fdap fdapVar = new fdap() { // from class: cqid
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.intValue();
                return Boolean.valueOf(arrayList.contains(num));
            }
        };
        Collection.EL.removeIf(setKeySet, new Predicate() { // from class: cqie
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) fdapVar.invoke(obj)).booleanValue();
            }
        });
        Set set2 = this.i;
        final fdap fdapVar2 = new fdap() { // from class: cqif
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.intValue();
                return Boolean.valueOf(arrayList.contains(num));
            }
        };
        Collection.EL.removeIf(set2, new Predicate() { // from class: cqig
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) fdapVar2.invoke(obj)).booleanValue();
            }
        });
        if (!zD || d() || this.c.get()) {
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleConnectivity");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "handleSimRemoved", 109, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Previously eligible SIM is no longer available and no other SIMs are satellite eligible. Notifying listeners of lost manual satellite eligibility.");
        e(false);
    }

    public final void c(String str) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleConnectivity");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "logConnectionStateOnEvent", 361, "ManualSatelliteEligibilityTrackerImpl.kt")).J("Connection state change: %s, data connection: %s, manual connection eligibility: %b, ntn roaming: %b", str, this.b, Boolean.valueOf(d()), Boolean.valueOf(this.c.get()));
    }

    public final boolean d() {
        return this.e.containsValue(true);
    }

    public final void e(boolean z) {
        auvw.m(this.g, null, new cqii(z, this, null), 3);
    }
}
