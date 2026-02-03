package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxe {
    public static final azvz a;
    private static final Map b;
    private static final dqxe c;
    private static final dqxe d;
    private static final Map e;
    private static final Map f;

    static {
        ayzi ayziVar = ayzi.a;
        Map map = ayzi.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ayya ayyaVar = (ayya) entry.getKey();
            if (!fdbq.f(ayyaVar, ayzh.c.a) && !fdbq.f(ayyaVar, ayzh.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        brzh brzhVar = ParticipantsTable.c;
        dqxl dqxlVar = new dqxl("SELECT IFNULL((SELECT $V FROM $V WHERE $V = $V LIMIT 1), \"\" )", new Object[]{brzhVar.a, "participants", brzhVar.d, -1});
        c = dqxlVar;
        dqxl dqxlVar2 = new dqxl("$V", new Object[]{-1L});
        d = dqxlVar2;
        bopp boppVar = botm.c;
        Map mapG = fcwa.g(new fcti(boppVar.A, dqxlVar), new fcti(boppVar.b, dqxlVar2));
        e = mapG;
        ayxz ayxzVar = ayzh.c;
        ayya ayyaVar2 = ayxzVar.d;
        bopp boppVar2 = botm.c;
        Map mapG2 = fcwa.g(new fcti(ayyaVar2, boppVar2.q), new fcti(ayxzVar.i, boppVar2.R), new fcti(ayxzVar.j, boppVar2.am), new fcti(ayxzVar.m, boppVar2.ag), new fcti(ayxzVar.n, boppVar2.ak), new fcti(ayxzVar.o, boppVar2.ae));
        f = mapG2;
        a = new azvz(azwj.a, azwq.a, azxd.b, linkedHashMap, mapG, fcvq.a, 0, mapG2, 64);
    }
}
