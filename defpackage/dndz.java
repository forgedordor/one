package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndz {
    private final Map a;

    public dndz(Map map) {
        this.a = map;
    }

    public final boolean a(wv wvVar, int i, List list) {
        if (true == list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        for (Object obj : list) {
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Map map = this.a;
                int i2 = fdcj.a;
                Object obj2 = map.get(new fdbi(obj.getClass()));
                dndy dndyVar = obj2 instanceof dndy ? (dndy) obj2 : null;
                if (dndyVar == null || !dndyVar.a(wvVar, i, obj)) {
                }
            }
            return false;
        }
        return true;
    }
}
