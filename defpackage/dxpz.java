package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpz extends phj {
    public dxpz() {
        super(3, 4);
    }

    @Override // defpackage.phj
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `sync_version` INTEGER NOT NULL DEFAULT 0");
        pjk.a(pgzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0");
        pjk.a(pgzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0");
        pjk.a(pgzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `first_registration_version` INTEGER NOT NULL DEFAULT 0");
    }
}
