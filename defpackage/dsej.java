package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsej implements dsed {
    private static final eksp a = eksp.c("GnpSdk");
    private final Set b;
    private final dsah c;
    private final dsbr d;

    public dsej(Set set, dsah dsahVar, dsbr dsbrVar) {
        this.b = set;
        this.c = dsahVar;
        this.d = dsbrVar;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        etom etomVar = (etom) obj;
        dsec dsecVar = (dsec) obj2;
        ArrayList arrayList = new ArrayList();
        dsbi dsbiVarA = dsecVar.a();
        if (etomVar == null) {
            ((eksl) ((eksl) a.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/CompositeTriggeringConditionsPredicate", "apply", 46, "CompositeTriggeringConditionsPredicate.java")).q("Error evaluating Triggering Conditions.");
        } else {
            boolean z = false;
            for (dsea dseaVar : this.b) {
                if (!dseaVar.b(etomVar, dsecVar)) {
                    arrayList.add(dseaVar.a());
                    this.d.c(dsbiVarA, "Failed Triggering Condition for [%s]", dseaVar.a().name());
                    z = true;
                }
            }
            this.c.c(dsbiVarA, arrayList);
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
