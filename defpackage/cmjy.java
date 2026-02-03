package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjy implements cmkj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore");
    private final dhes b;
    private final fcsu c;

    public cmjy(dhes dhesVar, fcsu fcsuVar) {
        dhesVar.getClass();
        fcsuVar.getClass();
        this.b = dhesVar;
        this.c = fcsuVar;
    }

    private final String p(cmmh cmmhVar, cmla cmlaVar) {
        String str;
        return (cmmhVar == null || (str = cmmhVar.c) == null) ? q(b(cmlaVar)) : str;
    }

    private static final String q(cmmh cmmhVar) {
        String str;
        if (cmmhVar != null && (str = cmmhVar.c) != null) {
            return str;
        }
        ((ekrd) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimIdOrEmpty", 51, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: can't get simId for null SimSubscriptionInfo when setting PhoneDefaults.");
        return "";
    }

    @Override // defpackage.cmkj
    public final cmmb a() {
        cmma cmmaVar = (cmma) cmmb.a.createBuilder();
        cmmaVar.getClass();
        dhes dhesVar = this.b;
        cmmc.b(q(dhesVar.d()), cmmaVar);
        cmmc.e(q(dhesVar.e()), cmmaVar);
        cmmc.c(q(dhesVar.c()), cmmaVar);
        cmmc.d(q(dhesVar.d()), cmmaVar);
        return cmmc.a(cmmaVar);
    }

    @Override // defpackage.cmkj
    public final cmmh b(cmla cmlaVar) {
        cmlaVar.getClass();
        int iOrdinal = cmlaVar.ordinal();
        if (iOrdinal == 0) {
            return this.b.d();
        }
        if (iOrdinal == 1) {
            return this.b.e();
        }
        if (iOrdinal == 2) {
            return this.b.c();
        }
        throw new fctg();
    }

    @Override // defpackage.cmkj
    public final cmmh c(dggn dggnVar) {
        dggnVar.getClass();
        cmmh cmmhVarF = this.b.f(dggo.a(dggnVar).a);
        if (cmmhVarF == null) {
            ((ekrd) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimSubscriptionInfoSync", 63, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No sim subscription info found for RCS provisioning id");
        }
        return cmmhVarF;
    }

    @Override // defpackage.cmkj
    public final cmmh d(int i) {
        cmmh cmmhVarU = dhes.u(this.b.o(a.g(i, "sim_subscription_info_sub_id_")));
        if (cmmhVarU == null) {
            ((ekrd) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimSubscriptionInfoSync-0jkzt_0", 77, "SharedPreferencesSimStateStore.kt")).r("SharedPreferencesSimStateStore: No sim subscription info found for subscription id: %s", i);
        }
        return cmmhVarU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.cmkj
    public final Set e() {
        dhes dhesVar = this.b;
        ?? D = dhesVar.q.d();
        D.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = D.iterator();
        while (it.hasNext()) {
            cmmh cmmhVarF = dhesVar.f((String) it.next());
            if (cmmhVarF == null) {
                ((ekrd) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getActiveSimSubscriptionInfosSync", 103, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No sim subscription info found for active sim id");
            }
            if (cmmhVarF != null) {
                arrayList.add(cmmhVarF);
            }
        }
        return fcva.av(arrayList);
    }

    @Override // defpackage.cmkj
    public final Object f(cmlz cmlzVar) {
        this.b.s("sim_loggable_guid_".concat(String.valueOf(cmlzVar.c)), cmlzVar.d);
        return fctx.a;
    }

    @Override // defpackage.cmkj
    public final Object g() {
        return e();
    }

    @Override // defpackage.cmkj
    public final Object h(cmla cmlaVar) {
        return b(cmlaVar);
    }

    @Override // defpackage.cmkj
    public final Object i(String str) {
        String strO = this.b.o("sim_loggable_guid_".concat(str));
        if (true == strO.isEmpty()) {
            strO = null;
        }
        if (strO != null) {
            return strO;
        }
        ((ekrd) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getLoggableGuidSync", 115, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No loggable guid found for sim id");
        return null;
    }

    @Override // defpackage.cmkj
    public final Object j() {
        return a();
    }

    @Override // defpackage.cmkj
    public final Object k(dggn dggnVar) {
        return c(dggnVar);
    }

    @Override // defpackage.cmkj
    public final Object l(int i) {
        return d(i);
    }

    @Override // defpackage.cmkj
    public final Object m(cmmb cmmbVar) {
        cmmbVar.getClass();
        dhes dhesVar = this.b;
        cmmh cmmhVarF = dhesVar.f(cmmbVar.c);
        cmmh cmmhVarF2 = dhesVar.f(cmmbVar.d);
        cmmh cmmhVarF3 = dhesVar.f(cmmbVar.e);
        if (cmmhVarF != null) {
            dhesVar.n.e(dhes.v(cmmhVarF));
        }
        if (cmmhVarF2 != null) {
            dhesVar.o.e(dhes.v(cmmhVarF2));
        }
        if (cmmhVarF3 != null) {
            dhesVar.p.e(dhes.v(cmmhVarF3));
        }
        cmma cmmaVar = (cmma) cmmb.a.createBuilder();
        cmmaVar.getClass();
        cmla cmlaVar = cmla.a;
        cmmc.b(p(cmmhVarF, cmlaVar), cmmaVar);
        cmmc.e(p(cmmhVarF2, cmla.b), cmmaVar);
        cmmc.c(p(cmmhVarF3, cmla.c), cmmaVar);
        cmmc.d(p(cmmhVarF, cmlaVar), cmmaVar);
        return cmmc.a(cmmaVar);
    }

    @Override // defpackage.cmkj
    public final Object n(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.r((cmmh) it.next());
        }
        dhes dhesVar = this.b;
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cmmh) it2.next()).c);
        }
        dhesVar.q(fcva.av(arrayList));
        return fctx.a;
    }

    @Override // defpackage.cmkj
    public final Object o(Set set, boolean z, eoaz eoazVar, Set set2) {
        eoazVar.getClass();
        if (z) {
            ((cmls) this.c.b()).c(set, eoazVar, set2);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.r((cmmh) it.next());
        }
        dhes dhesVar = this.b;
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cmmh) it2.next()).c);
        }
        dhesVar.q(fcva.av(arrayList));
        return fctx.a;
    }
}
