package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekrk extends ekrz {
    public ekrk(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.ekrz
    public final /* bridge */ /* synthetic */ void a(Object obj, ekry ekryVar) {
        ekwe ekweVar = (ekwe) obj;
        if (ekweVar == null) {
            return;
        }
        ekwa ekwaVar = new ekwa((ekwb) ekweVar.c.d);
        while (ekwaVar.hasNext()) {
            Map.Entry entry = (Map.Entry) ekwaVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                ekryVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ekryVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
