package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekvx implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ekwd ekwdVarA = ekwd.a(obj);
        ekwd ekwdVarA2 = ekwd.a(obj2);
        if (ekwdVarA != ekwdVarA2) {
            return ekwdVarA.compareTo(ekwdVarA2);
        }
        int iOrdinal = ekwdVarA.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
