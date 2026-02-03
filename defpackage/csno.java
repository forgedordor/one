package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csno {
    public static final Integer a(int i, Integer num) {
        int iIntValue = num != null ? num.intValue() + 1 : 0;
        if (i != 0 && (i == 4 || i == 13)) {
            return null;
        }
        cczv cczvVar = csnv.b;
        if (((ewtm) cczvVar.e()).b.size() <= iIntValue) {
            return null;
        }
        return Integer.valueOf(((ewtm) cczvVar.e()).b.d(iIntValue));
    }

    static /* synthetic */ Integer b(Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        return a(0, num);
    }
}
