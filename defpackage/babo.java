package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babo {
    public static final dqxe a;
    public static final dqxe b;
    public static final dqxe c;

    static {
        dqxl dqxlVar = new dqxl("(CASE $V WHEN $V THEN $V ELSE ($V + $V) END)", new Object[]{azut.c.h, 0, -2, azut.c.a, 1073745920});
        a = dqxlVar;
        brzh brzhVar = ParticipantsTable.c;
        b = new dqxl("$V{J:bugle_participants} = $V", new Object[]{brzhVar.d, dqxlVar});
        c = new dqxl("($V{J:bugle_participants} IS NULL AND $V IS NULL)", new Object[]{brzhVar.f, azut.c.c});
    }
}
