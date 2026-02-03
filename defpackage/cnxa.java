package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxa {
    public static final cczi a = cdag.h(cdag.b, "enable_forward_sync_manager_prefs_migration_to_settings_store", false);
    public static final cqce b = cqce.g("BugleDataModel", "ForwardSyncManagerSettingsService");
    public static final Instant c = Instant.ofEpochMilli(-1);
    public static final Instant d = Instant.ofEpochMilli(-1);
    public final crqv e;
    public final fcsu f;
    public final cmfo g;
    public final eosc h;

    public cnxa(crqv crqvVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.e = crqvVar;
        this.f = fcsuVar;
        cmgk cmgkVar = (cmgk) fcsuVar2.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.FORWARD_SYNC_MANAGER);
        cmggVarC.f(cnwl.a);
        cmggVarC.e(new cnwz(this));
        this.g = cmgkVar.a(cmggVarC.a());
        this.h = eoscVar;
    }

    public final eiju a() {
        return !((Boolean) a.e()).booleanValue() ? eijx.e(Instant.ofEpochMilli(this.e.e("last_full_sync_time_millis", -1L))) : this.g.h().h(new ejvr() { // from class: cnww
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cnwl cnwlVar = (cnwl) obj;
                cczi ccziVar = cnxa.a;
                if ((cnwlVar.b & 2) == 0) {
                    return cnxa.c;
                }
                evvp evvpVar = cnwlVar.d;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                return evwz.d(evvpVar);
            }
        }, this.h);
    }

    public final eiju b(final boolean z) {
        this.e.g("bugle_full_sync_in_progress", z);
        return this.g.j(new ejvr() { // from class: cnwn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczi ccziVar = cnxa.a;
                cnwk cnwkVar = (cnwk) ((cnwl) obj).toBuilder();
                cnwkVar.copyOnWrite();
                cnwl cnwlVar = (cnwl) cnwkVar.instance;
                cnwlVar.b |= 1;
                cnwlVar.c = z;
                return (cnwl) cnwkVar.build();
            }
        }).h(new ejvr() { // from class: cnwo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczi ccziVar = cnxa.a;
                return null;
            }
        }, this.h);
    }

    public final boolean c() {
        return this.e.q("bugle_full_sync_in_progress", false);
    }
}
