package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babt {
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
        azuv azuvVar = azuv.a;
        Map map = azuv.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!fdbq.f(entry.getKey(), azut.c.a) && !fdbq.f(entry.getKey(), azut.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = fcwa.l(linkedHashMap);
        b = fcwa.c(new fcti(ParticipantsTable.c.d, babo.a));
        aztn aztnVar = azut.c;
        azto aztoVar = aztnVar.f;
        brzh brzhVar = ParticipantsTable.c;
        c = fcwa.g(new fcti(aztoVar, brzhVar.n), new fcti(aztnVar.g, brzhVar.m), new fcti(aztnVar.i, brzhVar.v), new fcti(aztnVar.j, brzhVar.z), new fcti(aztnVar.k, brzhVar.C), new fcti(aztnVar.l, brzhVar.D), new fcti(aztnVar.m, brzhVar.j), new fcti(aztnVar.p, brzhVar.u));
    }
}
