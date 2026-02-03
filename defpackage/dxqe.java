package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqe extends pfa {
    final /* synthetic */ GnpRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxqe(GnpRoomDatabase_Impl gnpRoomDatabase_Impl) {
        super(9, "96ef747075977340544a7fd178d7b145", "971093f20d339fcd3f21f8ebaf20b8db");
        this.d = gnpRoomDatabase_Impl;
    }

    @Override // defpackage.pfa
    public final pez a(pgz pgzVar) throws Exception {
        HashMap map = new HashMap(16);
        map.put("id", new pij("id", "INTEGER", true, 1, null, 1));
        map.put("account_specific_id", new pij("account_specific_id", "TEXT", false, 0, null, 1));
        map.put("account_type", new pij("account_type", "INTEGER", false, 0, null, 1));
        map.put("obfuscated_gaia_id", new pij("obfuscated_gaia_id", "TEXT", false, 0, null, 1));
        map.put("actual_account_name", new pij("actual_account_name", "TEXT", false, 0, null, 1));
        map.put("actual_account_oid", new pij("actual_account_oid", "TEXT", false, 0, null, 1));
        map.put("registration_status", new pij("registration_status", "INTEGER", true, 0, null, 1));
        map.put("registration_id", new pij("registration_id", "TEXT", false, 0, null, 1));
        map.put("sync_sources", new pij("sync_sources", "TEXT", false, 0, null, 1));
        map.put("representative_target_id", new pij("representative_target_id", "TEXT", false, 0, null, 1));
        map.put("sync_version", new pij("sync_version", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_time_ms", new pij("last_registration_time_ms", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_request_hash", new pij("last_registration_request_hash", "INTEGER", true, 0, "0", 1));
        map.put("first_registration_version", new pij("first_registration_version", "INTEGER", true, 0, "0", 1));
        map.put("internal_target_id", new pij("internal_target_id", "TEXT", false, 0, null, 1));
        map.put("fitbit_decoded_id", new pij("fitbit_decoded_id", "INTEGER", true, 0, "0", 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new pil("index_gnp_accounts_account_specific_id", true, Arrays.asList("account_specific_id"), Arrays.asList("ASC")));
        pim pimVar = new pim("gnp_accounts", map, hashSet, hashSet2);
        pim pimVarA = pih.a(pgzVar, "gnp_accounts");
        return !pip.f(pimVar, pimVarA) ? new pez(false, a.S(pimVarA, pimVar, "gnp_accounts(com.google.android.libraries.notifications.platform.data.entities.GnpAccount).\n Expected:\n")) : new pez(true, null);
    }

    @Override // defpackage.pfa
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `actual_account_name` TEXT, `actual_account_oid` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT, `representative_target_id` TEXT, `sync_version` INTEGER NOT NULL DEFAULT 0, `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0, `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0, `first_registration_version` INTEGER NOT NULL DEFAULT 0, `internal_target_id` TEXT, `fitbit_decoded_id` INTEGER NOT NULL DEFAULT 0)");
        pjk.a(pgzVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_gnp_accounts_account_specific_id` ON `gnp_accounts` (`account_specific_id`)");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjk.a(pgzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96ef747075977340544a7fd178d7b145')");
    }

    @Override // defpackage.pfa
    public final void c(pgz pgzVar) {
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `gnp_accounts`");
    }

    @Override // defpackage.pfa
    public final void d(pgz pgzVar) throws Exception {
        this.d.u(pgzVar);
    }

    @Override // defpackage.pfa
    public final void e(pgz pgzVar) throws Exception {
        pho.a(pgzVar);
    }

    @Override // defpackage.pfa
    public final void f() {
    }

    @Override // defpackage.pfa
    public final void g() {
    }
}
