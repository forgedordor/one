package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyho extends pfa {
    final /* synthetic */ CardsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyho(CardsDatabase_Impl cardsDatabase_Impl) {
        super(4, "cf66d89d29f160a56452e1ec819be807", "c5e7d25a0e7030289897dda2ecd46001");
        this.d = cardsDatabase_Impl;
    }

    @Override // defpackage.pfa
    public final pez a(pgz pgzVar) throws Exception {
        HashMap map = new HashMap(4);
        map.put("accountIdentifier", new pij("accountIdentifier", "TEXT", true, 1, null, 1));
        map.put("storageState", new pij("storageState", "TEXT", true, 0, null, 1));
        map.put("lastDecorationConsumedTime", new pij("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        map.put("totalTimesConsumed", new pij("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        pim pimVar = new pim("StorageCardDecorationState", map, new HashSet(0), new HashSet(0));
        pim pimVarA = pih.a(pgzVar, "StorageCardDecorationState");
        if (!pip.f(pimVar, pimVarA)) {
            return new pez(false, a.S(pimVarA, pimVar, "StorageCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.StorageCardDecorationState).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(4);
        map2.put("accountIdentifier", new pij("accountIdentifier", "TEXT", true, 1, null, 1));
        map2.put("backupSyncState", new pij("backupSyncState", "TEXT", true, 0, null, 1));
        map2.put("lastDecorationConsumedTime", new pij("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        map2.put("totalTimesConsumed", new pij("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        pim pimVar2 = new pim("BackupSyncCardDecorationState", map2, new HashSet(0), new HashSet(0));
        pim pimVarA2 = pih.a(pgzVar, "BackupSyncCardDecorationState");
        return !pip.f(pimVar2, pimVarA2) ? new pez(false, a.S(pimVarA2, pimVar2, "BackupSyncCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.BackupSyncCardDecorationState).\n Expected:\n")) : new pez(true, null);
    }

    @Override // defpackage.pfa
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `StorageCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `storageState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `BackupSyncCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `backupSyncState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjk.a(pgzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf66d89d29f160a56452e1ec819be807')");
    }

    @Override // defpackage.pfa
    public final void c(pgz pgzVar) {
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `StorageCardDecorationState`");
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `BackupSyncCardDecorationState`");
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
