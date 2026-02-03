package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ono {
    public static final boolean a(ojx ojxVar, int i) {
        Iterator itA = ojv.b(ojxVar).a();
        while (itA.hasNext()) {
            if (((ojx) itA.next()).c() == i) {
                return true;
            }
        }
        return false;
    }
}
