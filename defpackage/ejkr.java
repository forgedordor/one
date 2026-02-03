package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkr {
    public static boolean a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.matches((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next(), list2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(List list, ejkh ejkhVar) {
        if (ejkhVar == null || list.isEmpty()) {
            return false;
        }
        return a((String) ekis.j(list), ejkhVar.c) || b(list, ejkhVar.d);
    }
}
