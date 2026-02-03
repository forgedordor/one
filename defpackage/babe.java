package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babe {
    public static final dqxe a;
    public static final dqxe b;
    public static final dqxe c;
    public static final dqxe d;

    static {
        String[] strArr = PartsTable.a;
        bsgs bsgsVar = PartsTable.d.b;
        a = new dqxl("SELECT COUNT(*) FROM $V AS parts_1 WHERE $V{J:bugle_parts} = $V{X:parts_1}", new Object[]{"parts", bsgsVar, bsgsVar});
        String[] strArr2 = azns.a;
        azmp azmpVar = azns.c;
        azmq azmqVar = azmpVar.b;
        b = new dqxl("SELECT COUNT(*) FROM $V AS backup_parts_1 WHERE $V = $V{X:backup_parts_1}", new Object[]{"parts_backup", azmqVar, azmqVar});
        bsgr bsgrVar = PartsTable.d;
        bsgs bsgsVar2 = bsgrVar.a;
        bsgs bsgsVar3 = bsgrVar.f;
        bsgs bsgsVar4 = bsgrVar.b;
        c = new dqxl("SELECT part_order FROM (SELECT $V{X:parts_2} AS pid, (ROW_NUMBER() OVER(ORDER BY $V{X:parts_2}, $V{X:parts_2})) AS part_order FROM $V AS parts_2 WHERE $V{J:bugle_parts} = $V{X:parts_2}) WHERE pid = $V{J:bugle_parts}", new Object[]{bsgsVar2, bsgsVar3, bsgsVar2, "parts", bsgsVar4, bsgsVar4, bsgsVar2});
        azmq azmqVar2 = azmpVar.a;
        d = new dqxl("SELECT part_order FROM (SELECT $V{X:backup_parts_2} AS pid, (ROW_NUMBER() OVER(ORDER BY $V{X:backup_parts_2}, $V{X:backup_parts_2})) AS part_order FROM $V AS backup_parts_2 WHERE $V = $V{X:backup_parts_2}) WHERE pid = $V", new Object[]{azmqVar2, azmpVar.c, azmqVar2, "parts_backup", azmqVar, azmqVar, azmqVar2});
    }
}
