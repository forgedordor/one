package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfj extends phj {
    public dxfj() {
        super(1, 2);
    }

    @Override // defpackage.phj
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `_new_chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `modified_timestamp` INTEGER NOT NULL)");
        pjk.a(pgzVar, "INSERT INTO `_new_chime_thread_states` (`id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp`) SELECT `id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp` FROM `chime_thread_states`");
        pjk.a(pgzVar, "DROP TABLE `chime_thread_states`");
        pjk.a(pgzVar, "ALTER TABLE `_new_chime_thread_states` RENAME TO `chime_thread_states`");
    }
}
