package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsek implements dsea {
    private static final eksp a = eksp.c("GnpSdk");
    private final dsbr b;

    public dsek(dsbr dsbrVar) {
        this.b = dsbrVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.DASHER_FILTER;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        etom etomVar = (etom) obj;
        dsec dsecVar = (dsec) obj2;
        if (etomVar == null) {
            this.b.c(dsecVar.a(), "TriggeringConditions is null in DasherFilteringPredicate", new Object[0]);
            return false;
        }
        etok etokVarB = etok.b(etomVar.i);
        if (etokVarB == null) {
            etokVarB = etok.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (etokVarB != etok.BLOCK_WHEN_DASHER_ON_DEVICE) {
            return true;
        }
        fbby fbbyVar = fbby.a;
        if (fbbyVar.get().b()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/DasherFilteringPredicate", "apply", 44, "DasherFilteringPredicate.java")).q("Promotion is shown because there is a Google account on device");
            return true;
        }
        if (!fbbyVar.get().a()) {
            return true;
        }
        this.b.c(dsecVar.a(), "Promotion blocked: Dasher account on device", new Object[0]);
        return false;
    }
}
