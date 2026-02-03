package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baba {
    public static final Map a;
    public static final Set b;
    public static final Map c;

    static {
        azld azldVar = azld.a;
        Map map = azld.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!fdbq.f(entry.getKey(), azlc.c.a) && !fdbq.f(entry.getKey(), azlc.c.g) && !fdbq.f(entry.getKey(), azlc.c.h) && !fdbq.f(entry.getKey(), azlc.c.k) && !fdbq.f(entry.getKey(), azlc.c.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = fcwa.l(linkedHashMap);
        b = fcwm.d(new azwa(azlc.c.g, MessagesTable.c.b, azvt.a), new azwa(azlc.c.h, MessagesTable.c.c, azvt.c), new azwa(azlc.c.k, MessagesTable.c.y, azvt.c));
        azji azjiVar = azlc.c;
        azjj azjjVar = azjiVar.i;
        bran branVar = MessagesTable.c;
        c = fcwa.g(new fcti(azjjVar, branVar.d), new fcti(azjiVar.j, branVar.e), new fcti(azjiVar.l, branVar.r), new fcti(azjiVar.o, branVar.j), new fcti(azjiVar.q, branVar.D), new fcti(azjiVar.t, branVar.J), new fcti(azjiVar.u, branVar.K), new fcti(azjiVar.x, branVar.G), new fcti(azjiVar.z, branVar.W));
    }
}
