package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cihf implements cjpn {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final cihe b;

    public cihf(cihe ciheVar) {
        this.b = ciheVar;
    }

    @Override // defpackage.cjpn
    public final void a() {
        if (!((Boolean) ((cczi) cihb.b.get()).e()).booleanValue()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationScheduler", "onRcsReady", 39, "RcsGroupIdentifiersTelephonyMigrationScheduler.java")).q("Skipping RCS group identifiers telephony batch migration. Disabled by phenotype.");
            return;
        }
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationScheduler", "onRcsReady", 44, "RcsGroupIdentifiersTelephonyMigrationScheduler.java")).q("Scheduling RCS group identifiers telephony batch migration.");
        ((cazj) this.b.a.b()).g(cbcu.f("rcs_group_identifiers_telephony_migration", cihd.a));
    }
}
