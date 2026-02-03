package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyln extends pfa {
    final /* synthetic */ EducationDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyln(EducationDatabase_Impl educationDatabase_Impl) {
        super(2, "eeffbce3bfbd69ea1ae982695ce17aa1", "8748339cfd9b753a6ac6868ce101ce6c");
        this.d = educationDatabase_Impl;
    }

    @Override // defpackage.pfa
    public final pez a(pgz pgzVar) throws Exception {
        HashMap map = new HashMap(8);
        map.put("name", new pij("name", "TEXT", true, 1, null, 1));
        map.put("enabled", new pij("enabled", "INTEGER", true, 0, null, 1));
        map.put("numEducationImpressions", new pij("numEducationImpressions", "INTEGER", true, 0, null, 1));
        map.put("numEducationInteractions", new pij("numEducationInteractions", "INTEGER", true, 0, null, 1));
        map.put("activatedTimestampMs", new pij("activatedTimestampMs", "INTEGER", true, 0, null, 1));
        map.put("lastImpressionTimestampMs", new pij("lastImpressionTimestampMs", "INTEGER", true, 0, null, 1));
        map.put("lastInteractionTimestampMs", new pij("lastInteractionTimestampMs", "INTEGER", true, 0, null, 1));
        map.put("educationCompleted", new pij("educationCompleted", "INTEGER", true, 0, null, 1));
        pim pimVar = new pim("EducationState", map, new HashSet(0), new HashSet(0));
        pim pimVarA = pih.a(pgzVar, "EducationState");
        if (!pip.f(pimVar, pimVarA)) {
            return new pez(false, a.S(pimVarA, pimVar, "EducationState(com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationState).\n Expected:\n"));
        }
        HashMap map2 = new HashMap(5);
        map2.put("educationName", new pij("educationName", "TEXT", true, 1, null, 1));
        map2.put("highlightId", new pij("highlightId", "TEXT", true, 2, null, 1));
        map2.put("numHighlightImpressions", new pij("numHighlightImpressions", "INTEGER", true, 0, null, 1));
        map2.put("numHighlightInteractions", new pij("numHighlightInteractions", "INTEGER", true, 0, null, 1));
        map2.put("highlightCompleted", new pij("highlightCompleted", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new pik("EducationState", "CASCADE", "NO ACTION", Arrays.asList("educationName"), Arrays.asList("name")));
        pim pimVar2 = new pim("HighlightState", map2, hashSet, new HashSet(0));
        pim pimVarA2 = pih.a(pgzVar, "HighlightState");
        return !pip.f(pimVar2, pimVarA2) ? new pez(false, a.S(pimVarA2, pimVar2, "HighlightState(com.google.android.libraries.onegoogle.accountmenu.features.education.db.HighlightState).\n Expected:\n")) : new pez(true, null);
    }

    @Override // defpackage.pfa
    public final void b(pgz pgzVar) {
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `EducationState` (`name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `numEducationImpressions` INTEGER NOT NULL, `numEducationInteractions` INTEGER NOT NULL, `activatedTimestampMs` INTEGER NOT NULL, `lastImpressionTimestampMs` INTEGER NOT NULL, `lastInteractionTimestampMs` INTEGER NOT NULL, `educationCompleted` INTEGER NOT NULL, PRIMARY KEY(`name`))");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS `HighlightState` (`educationName` TEXT NOT NULL, `highlightId` TEXT NOT NULL, `numHighlightImpressions` INTEGER NOT NULL, `numHighlightInteractions` INTEGER NOT NULL, `highlightCompleted` INTEGER NOT NULL, PRIMARY KEY(`educationName`, `highlightId`), FOREIGN KEY(`educationName`) REFERENCES `EducationState`(`name`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        pjk.a(pgzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjk.a(pgzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eeffbce3bfbd69ea1ae982695ce17aa1')");
    }

    @Override // defpackage.pfa
    public final void c(pgz pgzVar) {
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `EducationState`");
        pjk.a(pgzVar, "DROP TABLE IF EXISTS `HighlightState`");
    }

    @Override // defpackage.pfa
    public final void d(pgz pgzVar) throws Exception {
        pjk.a(pgzVar, "PRAGMA foreign_keys = ON");
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
