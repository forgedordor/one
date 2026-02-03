package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
@fdac
/* loaded from: classes6.dex */
public final class fdyp {
    public static final Object a(Object obj, Object obj2) {
        boolean z = fdkb.a;
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
