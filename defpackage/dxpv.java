package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpv extends pfa {
    final /* synthetic */ GnpPerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxpv(GnpPerAccountRoomDatabase_Impl gnpPerAccountRoomDatabase_Impl) {
        super(1, "448fa2df507764c816e7bbb286fadc75", "d44e4be256518704d4e3ee4b6b089c9f");
        this.d = gnpPerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.pfa
    public final pez a(pgz pgzVar) throws Exception {
        HashMap map = new HashMap(17);
        map.put("id", new pij("id", "INTEGER", true, 1, null, 1));
        map.put("thread_id", new pij("thread_id", "TEXT", true, 0, null, 1));
        map.put("read_state", new pij("read_state", "INTEGER", true, 0, null, 1));
        map.put("deletion_status", new pij("deletion_status", "INTEGER", true, 0, null, 1));
        map.put("count_behavior", new pij("count_behavior", "INTEGER", true, 0, null, 1));
        map.put("system_tray_behavior", new pij("system_tray_behavior", "INTEGER", true, 0, null, 1));
        map.put("last_updated_version", new pij("last_updated_version", "INTEGER", true, 0, null, 1));
        map.put("last_notification_version", new pij("last_notification_version", "INTEGER", true, 0, null, 1));
        map.put("creation_id", new pij("creation_id", "INTEGER", true, 0, null, 1));
        map.put("payload_type", new pij("payload_type", "TEXT", false, 0, null, 1));
        map.put("payload", new pij("payload", "BLOB", false, 0, null, 1));
        map.put("insertion_time_ms", new pij("insertion_time_ms", "INTEGER", true, 0, null, 1));
        map.put("storage_mode", new pij("storage_mode", "INTEGER", true, 0, null, 1));
        map.put("opaque_backend_data", new pij("opaque_backend_data", "BLOB", true, 0, null, 1));
        map.put("thread_type", new pij("thread_type", "INTEGER", true, 0, null, 1));
        map.put("type_specific_data", new pij("type_specific_data", "BLOB", true, 0, null, 1));
        map.put("external_experiment_ids", new pij("external_experiment_ids", "TEXT", true, 0, null, 1));
        pim pimVar = new pim("threads", map, new HashSet(0), new HashSet(0));
        pim pimVarA = pih.a(pgzVar, "threads");
        return !pip.f(pimVar, pimVarA) ? new pez(false, a.S(pimVarA, pimVar, "threads(com.google.android.libraries.notifications.platform.internal.room.ChimeThreadEntity).\n Expected:\n")) : new pez(true, null);
    }

    @Override // defpackage.pfa
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `threads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `last_updated_version` INTEGER NOT NULL, `last_notification_version` INTEGER NOT NULL, `creation_id` INTEGER NOT NULL, `payload_type` TEXT, `payload` BLOB, `insertion_time_ms` INTEGER NOT NULL, `storage_mode` INTEGER NOT NULL, `opaque_backend_data` BLOB NOT NULL, `thread_type` INTEGER NOT NULL, `type_specific_data` BLOB NOT NULL, `external_experiment_ids` TEXT NOT NULL)");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjk.a(pgzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '448fa2df507764c816e7bbb286fadc75')");
    }

    @Override // defpackage.pfa
    public final void c(pgz pgzVar) {
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `threads`");
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
