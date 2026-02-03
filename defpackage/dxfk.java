package defpackage;

import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfk extends pfa {
    final /* synthetic */ ChimePerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxfk(ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(2, "4dff45f02f3e689be0f6f1524b0cca0c", "557f59ae5db83868cf5aa3ce16101df1");
        this.d = chimePerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.pfa
    public final pez a(pgz pgzVar) throws Exception {
        HashMap map = new HashMap(8);
        map.put("id", new pij("id", "INTEGER", true, 1, null, 1));
        map.put("thread_id", new pij("thread_id", "TEXT", true, 0, null, 1));
        map.put("last_updated_version", new pij("last_updated_version", "INTEGER", true, 0, null, 1));
        map.put("read_state", new pij("read_state", "INTEGER", true, 0, null, 1));
        map.put("deletion_status", new pij("deletion_status", "INTEGER", true, 0, null, 1));
        map.put("count_behavior", new pij("count_behavior", "INTEGER", true, 0, null, 1));
        map.put("system_tray_behavior", new pij("system_tray_behavior", "INTEGER", true, 0, null, 1));
        map.put("modified_timestamp", new pij("modified_timestamp", "INTEGER", true, 0, null, 1));
        pim pimVar = new pim("chime_thread_states", map, new HashSet(0), new HashSet(0));
        pim pimVarA = pih.a(pgzVar, "chime_thread_states");
        return !pip.f(pimVar, pimVarA) ? new pez(false, a.S(pimVarA, pimVar, "chime_thread_states(com.google.android.libraries.notifications.internal.storage.impl.room.ChimeThreadState).\n Expected:\n")) : new pez(true, null);
    }

    @Override // defpackage.pfa
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `modified_timestamp` INTEGER NOT NULL)");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjk.a(pgzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4dff45f02f3e689be0f6f1524b0cca0c')");
    }

    @Override // defpackage.pfa
    public final void c(pgz pgzVar) {
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `chime_thread_states`");
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
