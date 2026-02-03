package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckif implements dggz {
    private static final eksp a = eksp.c("BugleRcsProvisioning");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider");
    private final fcsu c;
    private final fcsu d;
    private final dgia e;

    public ckif(fcsu fcsuVar, fcsu fcsuVar2, dgia dgiaVar) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = dgiaVar;
    }

    @Override // defpackage.dggz
    public final Optional h(dggn dggnVar) {
        return i(dggo.a(dggnVar).a);
    }

    @Override // defpackage.dggz
    public final Optional i(String str) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 102, "CachedRcsConfigurationProvider.java")).t("CachedRcsConfiguration getConfiguration for simId:[%s]", dhiz.SIM_ID.c(str));
        Optional optional = (Optional) ((ckih) this.c.b()).get(str);
        if (optional == null) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "BugleRcsProvisioning");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.Z(eksk.FULL);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 107, "CachedRcsConfigurationProvider.java")).q("Failed to get RCS configuration from the cached provider, configuration is null.");
        } else if (optional.isEmpty()) {
            ekrw ekrwVarJ2 = b.j();
            ekrwVarJ2.X(eksq.a, "BugleRcsProvisioning");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
            ekrdVar2.Z(eksk.FULL);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 110, "CachedRcsConfigurationProvider.java")).q("Failed to get RCS configuration from the cached provider, configuration is empty.");
        }
        optional.getClass();
        return optional;
    }

    @Override // defpackage.dggz
    public final Optional j(dggk dggkVar) {
        return this.e.h(dggkVar).flatMap(new ckie(this));
    }

    @Override // defpackage.dggz
    public final Optional k(int i) {
        return this.e.q(i).flatMap(new ckie(this));
    }

    @Override // defpackage.dggz
    public final Optional l() {
        return i(((dhes) this.d.b()).l());
    }
}
