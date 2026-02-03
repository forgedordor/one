package defpackage;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etar {
    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return etaq.b.a(accessibleObject, obj);
    }

    public static int b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = ((esys) it.next()).a();
            if (iA != 2) {
                return iA;
            }
        }
        return 1;
    }
}
