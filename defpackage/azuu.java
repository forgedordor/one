package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azuu implements aytd {
    private final dqxe a;
    private final Map b;
    private final Map c;

    public azuu() {
        dqxl dqxlVar = new dqxl("(CASE $V WHEN $V THEN $V ELSE $V END)", new Object[]{ParticipantsTable.c.d, -2, 0, 1});
        this.a = dqxlVar;
        this.b = fcwa.c(new fcti(azut.c.h, dqxlVar));
        azuv azuvVar = azuv.a;
        this.c = azuv.b;
    }

    @Override // defpackage.aytd
    public final void a() {
        azuv.a.a();
    }

    @Override // defpackage.aytd
    public final void b(aytc aytcVar) {
        aytcVar.getClass();
        String[] strArr = azut.a;
        dqtq dqtqVar = new dqtq("participants_backup", "backup");
        ArrayList arrayList = new ArrayList(2);
        fdcl.a(this.c.keySet().toArray(new azto[0]), arrayList);
        Map map = this.b;
        fdcl.a(map.keySet().toArray(new azto[0]), arrayList);
        dqtqVar.b((dqpo[]) arrayList.toArray(new dqpo[arrayList.size()]));
        azuv azuvVar = azuv.a;
        bsbo bsboVarC = azuv.c();
        for (Map.Entry entry : map.entrySet()) {
            bsboVarC.n((dqxe) entry.getValue(), String.valueOf(((azto) entry.getKey()).d()).concat("_expression"));
        }
        dqtqVar.c = bsboVarC.b();
        dqtqVar.a().a();
    }
}
